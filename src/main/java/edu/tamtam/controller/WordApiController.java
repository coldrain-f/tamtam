package edu.tamtam.controller;

import edu.tamtam.dto.WordRegisterRequestDTO;
import edu.tamtam.entity.Word;
import edu.tamtam.repository.WordRepository;
import edu.tamtam.service.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RequiredArgsConstructor
@RequestMapping("/words")
@RestController
public class WordApiController {

    private final WordService wordService;
    private final WordRepository wordRepository;

    @GetMapping()
    public List<Word> getAllWords() {
        // Todo: 응답 값을 Entity -> DTO 로 하도록 변경 필요
        return wordService.getAllWords();
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
}
