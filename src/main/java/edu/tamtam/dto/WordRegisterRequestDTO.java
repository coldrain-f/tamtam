package edu.tamtam.dto;

import edu.tamtam.entity.Word;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WordRegisterRequestDTO {

    private final String name;
    private final String meaning;
    private final String description;

    public Word toEntity() {
        return Word.builder()
                .name(this.name)
                .meaning(this.meaning)
                .description(this.description)
                .build();
    }
}