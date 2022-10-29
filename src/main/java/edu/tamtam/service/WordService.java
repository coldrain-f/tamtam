package edu.tamtam.service;

import edu.tamtam.entity.Word;
import edu.tamtam.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WordService {

    private final WordRepository wordRepository;

    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }
}
