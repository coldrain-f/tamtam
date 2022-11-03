package edu.tamtam.repository;

import edu.tamtam.entity.JsTreeItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JsTreeItemRepository extends JpaRepository<JsTreeItem, Long> {

    List<JsTreeItem> findAllByParentIsNull();
}
