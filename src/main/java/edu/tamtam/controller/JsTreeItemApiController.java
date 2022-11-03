package edu.tamtam.controller;

import edu.tamtam.dto.JsTreeItemRegisterRequestDTO;
import edu.tamtam.service.JsTreeItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/js_tree_items")
@RequiredArgsConstructor
public class JsTreeItemApiController {

    private final JsTreeItemService jsTreeItemService;

    @PostMapping
    public Long register(JsTreeItemRegisterRequestDTO jsTreeItemRegisterRequestDTO) {
        return jsTreeItemService.register(jsTreeItemRegisterRequestDTO);
    }
}
