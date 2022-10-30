package edu.tamtam.dto;


import edu.tamtam.entity.Word;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WordModifyRequestDTO {
    private final String name;
    private final String meaning;
    private final String description;

}
