package edu.tamtam.controller;

import edu.tamtam.entity.Word;
import edu.tamtam.repository.WordRepository;
import edu.tamtam.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/words")
@RestController
public class WordApiController {

    private final WordService wordService;
    private final WordRepository wordRepository;

    @GetMapping()
    public List<Word> getAllWords() {
        // Warn: 동작 확인용 임시 데이터 추후에 지울 예정
        final Word word = Word.builder()
                .id(1L)
                .name("delicious")
                .meaning("맛있는")
                .build();

        wordRepository.save(word);

        return wordService.getAllWords();
    }
}
