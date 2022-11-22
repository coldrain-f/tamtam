package edu.tamtam.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class JsTreeItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "js_tree_item_id")
    private Long id;

    @Column(nullable = false)
    private String text;

    private String icon;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "parentId")
    private JsTreeItem parent;

    @OneToMany(mappedBy = "parent") // 위에 parent 랑 연관관계
    private final List<JsTreeItem> children = new ArrayList<>();

    @Builder
    public JsTreeItem(Long id, String text, String icon, JsTreeItem parent, Long depth) {
        this.id = id;
        this.text = text;
        this.icon = icon;
        this.parent = parent;
    }

    public void changeText(String text) {
        this.text = text;
    }

    public void changeIcon(String icon) {
        this.icon = icon;
    }

    public void changeParent(JsTreeItem parent) {
        this.parent = parent;
    }
}
