package edu.tamtam.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String meaning;

    @Lob
    private String description;

    @Builder
    public Word(Long id, String name, String meaning, String description) {
        this.id = id;
        this.name = name;
        this.meaning = meaning;
        this.description = description;
    }
}
