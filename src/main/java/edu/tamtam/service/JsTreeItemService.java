package edu.tamtam.service;

import edu.tamtam.repository.JsTreeItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsTreeItemService {

    private final JsTreeItemRepository jsTreeItemRepository;
}
