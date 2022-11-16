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

    public void dfs(JsTreeItem vertex, int[] visited) {
        for (JsTreeItem currVertex : vertex.getChildren()) {
            if (visited[currVertex.getId().intValue()] == 1) continue;
            visited[currVertex.getId().intValue()] = 1;
            System.out.println("current = " + currVertex.getId());
            dfs(currVertex, visited);
        }
    }

    public JsTreeItem findById(Long jsTreeItemId) {
        return jsTreeItemRepository.findById(jsTreeItemId)
                .orElseThrow(() -> new IllegalArgumentException("JsTreeItem not found."));
    }


    public List<JsTreeItem> findAll() {
        // DFS 를 돌리는 방법은?

        return jsTreeItemRepository.findAllByParentIsNull();
    }

    public void modify(Long jsTreeItemId, JsTreeItemModifyRequestDTO jsTreeItemModifyRequestDTO) {
        final JsTreeItem jsTreeItem = this.findById(jsTreeItemId);
        jsTreeItem.changeText(jsTreeItemModifyRequestDTO.getText());
    }

    public void remove(Long jsTreeItemId) {
        // Todo: 나중에 Soft Delete 로 변경 필요
        jsTreeItemRepository.deleteById(jsTreeItemId);
    }
}
