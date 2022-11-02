package edu.tamtam.controller;

import edu.tamtam.dto.WordModifyRequestDTO;
import edu.tamtam.dto.WordRegisterRequestDTO;
import edu.tamtam.dto.WordResponseDTO;
import edu.tamtam.repository.WordRepository;
import edu.tamtam.service.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Log4j2
@RequiredArgsConstructor
@RequestMapping("/words")
@RestController
public class WordApiController {

    private final WordService wordService;
    private final WordRepository wordRepository;

    @GetMapping()
    public List<WordResponseDTO> getAllWords() {
        return wordService.getAllWords()
                .stream()
                .map(WordResponseDTO::of)
                .collect(toList());
    }

    @PostMapping()
    public Long register(@RequestBody() WordRegisterRequestDTO wordRegisterRequestDTO) {
        // Todo: DTO Validation 처리 필요
        return wordService.register(wordRegisterRequestDTO);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") Long wordId) {
        wordService.remove(wordId);
    }

    @PatchMapping("/{id}")
    public void modify(@PathVariable("id") Long wordId, @RequestBody() WordModifyRequestDTO wordModifyRequestDTO) {
        wordService.modify(wordId, wordModifyRequestDTO);
    }
}
