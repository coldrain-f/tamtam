package edu.tamtam.service;

import edu.tamtam.dto.JsTreeItemModifyRequestDTO;
import edu.tamtam.dto.JsTreeItemRegisterRequestDTO;
import edu.tamtam.entity.JsTreeItem;
import edu.tamtam.repository.JsTreeItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JsTreeItemService {

    private final JsTreeItemRepository jsTreeItemRepository;

    public Long register(JsTreeItemRegisterRequestDTO jsTreeItemRegisterRequestDTO) {
        final Long jsTreeItemParentId = jsTreeItemRegisterRequestDTO.getParentId();

        JsTreeItem jsTreeItemParent = null;
        if (!jsTreeItemParentId.equals(-1L)) {
            jsTreeItemParent = jsTreeItemRepository.findById(jsTreeItemParentId)
                    .orElseThrow(() -> new IllegalArgumentException("JsTreeItem not found."));
        }

        final JsTreeItem jsTreeItem = jsTreeItemRegisterRequestDTO.toEntity(jsTreeItemParent);
        final JsTreeItem savedJsTreeItem = jsTreeItemRepository.save(jsTreeItem);

        return savedJsTreeItem.getId();
    }

    public List<JsTreeItem> findAll() {
        return jsTreeItemRepository.findAllByParentIsNull();
    }

    public void modify(Long jsTreeItemId, JsTreeItemModifyRequestDTO jsTreeItemModifyRequestDTO) {
        final JsTreeItem jsTreeItem = jsTreeItemRepository.findById(jsTreeItemId)
                .orElseThrow(() -> new IllegalArgumentException("JsTreeItem not found."));

        jsTreeItem.changeText(jsTreeItemModifyRequestDTO.getText());
    }
}
