package edu.tamtam.dto;

import edu.tamtam.entity.JsTreeItem;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JsTreeItemRegisterRequestDTO {

    private String text;

    private Long parentId;

    private String icon;

    public JsTreeItem toEntity(JsTreeItem parent) {
        return JsTreeItem.builder()
                .text(this.text)
                .parent(parent)
                .icon(this.icon)
                .build();
    }
}
