package edu.tamtam.controller;

import edu.tamtam.dto.WordModifyRequestDTO;
import edu.tamtam.dto.WordRegisterRequestDTO;
import edu.tamtam.dto.WordResponseDTO;
import edu.tamtam.entity.Word;
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

    // Todo: ControllerAdvice, ExceptionHandler 예외처리 필요
    // Todo: Static Method 를 사용해서 Entity -> DTO 변환하는 방법이 적절한지 추가조사 필요
    // Todo: Bean Validation 처리 필요

    private final WordService wordService;

    @GetMapping()
    public List<WordResponseDTO> findAll() {
        return wordService.findAll()
                .stream()
                .map(WordResponseDTO::of)
                .collect(toList());
    }

    @GetMapping("/{id}")
    public WordResponseDTO findById(@PathVariable("id") Long wordId) {
        final Word wordEntity = wordService.findById(wordId);
        return WordResponseDTO.of(wordEntity);
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
