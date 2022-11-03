package edu.tamtam.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class JsTreeItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String text;

    private String icon;

    private String parentId;

    @Builder
    public JsTreeItem(Long id, String text, String icon, String parentId) {
        this.id = id;
        this.text = text;
        this.icon = icon;
        this.parentId = parentId;
    }

    public void changeText(String text) {
        this.text = text;
    }

    public void changeIcon(String icon) {
        this.icon = icon;
    }

    public void changeParentId(String parentId) {
        this.parentId = parentId;
    }
}
