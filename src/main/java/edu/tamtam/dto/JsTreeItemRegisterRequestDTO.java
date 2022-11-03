package edu.tamtam.dto;

import edu.tamtam.entity.JsTreeItem;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JsTreeItemRegisterRequestDTO {

    private String text;

    private String parentId;

    private String icon;

    public JsTreeItem toEntity() {
        return JsTreeItem.builder()
                .text(this.text)
                .parentId(this.parentId)
                .icon(this.icon)
                .build();
    }
}
