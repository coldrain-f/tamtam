package edu.tamtam.controller;

import edu.tamtam.dto.JsTreeItemModifyRequestDTO;
import edu.tamtam.dto.JsTreeItemRegisterRequestDTO;
import edu.tamtam.dto.JsTreeItemResponseDTO;
import edu.tamtam.entity.JsTreeItem;
import edu.tamtam.service.JsTreeItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/js_tree_items")
@RequiredArgsConstructor
public class JsTreeItemApiController {

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
    public void modify(@PathVariable("id") Long jsTreeItemId, JsTreeItemModifyRequestDTO jsTreeItemModifyRequestDTO) {
        jsTreeItemService.modify(jsTreeItemId, jsTreeItemModifyRequestDTO);
    }
}
