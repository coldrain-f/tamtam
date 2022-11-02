package edu.tamtam.dto;

import edu.tamtam.entity.Word;
import lombok.Builder;
import lombok.Data;

@Data
public class WordResponseDTO {

    private Long id;

    private String name;

    private String meaning;

    private String description;

    @Builder
    public WordResponseDTO(Long id, String name, String meaning, String description) {
        this.id = id;
        this.name = name;
        this.meaning = meaning;
        this.description = description;
    }

    public static WordResponseDTO of(Word wordEntity) {
        return WordResponseDTO.builder()
                .id(wordEntity.getId())
                .name(wordEntity.getName())
                .meaning(wordEntity.getMeaning())
                .description(wordEntity.getDescription())
                .build();
    }
}
