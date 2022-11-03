package edu.tamtam.controller;

import edu.tamtam.dto.JsTreeItemModifyRequestDTO;
import edu.tamtam.dto.JsTreeItemRegisterRequestDTO;
import edu.tamtam.entity.JsTreeItem;
import edu.tamtam.service.JsTreeItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/js_tree_items")
@RequiredArgsConstructor
public class JsTreeItemApiController {

    // Todo: 드래그 앤 드롭을 했을 경우 어떻게 DB에 반영할 것인지 고민 필요
    // Todo: 목록 조회 Response 로 응답하는 방법 고민 필요
    // Todo: JsTreeItem Soft Delete 적용 필요

    private final JsTreeItemService jsTreeItemService;

    @GetMapping
    public List<JsTreeItem> findAll() {
        return jsTreeItemService.findAll();
    }

    @PostMapping
    public Long register(@RequestBody() JsTreeItemRegisterRequestDTO jsTreeItemRegisterRequestDTO) {
        return jsTreeItemService.register(jsTreeItemRegisterRequestDTO);
    }

    @PatchMapping("/{id}")
    public void modify(@PathVariable("id") Long jsTreeItemId,
                       @RequestBody() JsTreeItemModifyRequestDTO jsTreeItemModifyRequestDTO) {
        jsTreeItemService.modify(jsTreeItemId, jsTreeItemModifyRequestDTO);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Long jsTreeItemId) {
        jsTreeItemService.remove(jsTreeItemId);
    }
}
