package edu.tamtam.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class JsTreeItemResponseDTO {

    private String data;
    private List<JsTreeItemResponseDTO> children;

    @Builder
    public JsTreeItemResponseDTO(String data, List<JsTreeItemResponseDTO> children) {
        this.data = data;
        this.children = children;
    }
}
