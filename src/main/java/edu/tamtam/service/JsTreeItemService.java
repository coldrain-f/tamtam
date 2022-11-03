package edu.tamtam.service;

import edu.tamtam.dto.JsTreeItemRegisterRequestDTO;
import edu.tamtam.entity.JsTreeItem;
import edu.tamtam.repository.JsTreeItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsTreeItemService {

    private final JsTreeItemRepository jsTreeItemRepository;

    public Long register(JsTreeItemRegisterRequestDTO jsTreeItemRegisterRequestDTO) {
        final JsTreeItem jsTreeItem = jsTreeItemRegisterRequestDTO.toEntity();
        final JsTreeItem savedJsTreeItem = jsTreeItemRepository.save(jsTreeItem);
        return savedJsTreeItem.getId();
    }

}
