package edu.tamtam.service;

import edu.tamtam.dto.WordRegisterRequestDTO;
import edu.tamtam.entity.Word;
import edu.tamtam.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WordService {

    private final WordRepository wordRepository;

    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }

    public Long register(WordRegisterRequestDTO wordRegisterRequestDTO) {
        final Word wordEntity = wordRegisterRequestDTO.toEntity();
        final Word savedWordEntity = wordRepository.save(wordEntity);
        return savedWordEntity.getId();
    }

    public void remove(Long wordId) {
        final Optional<Word> optional = wordRepository.findById(wordId);
        if (optional.isEmpty()) {
            throw new IllegalArgumentException("Word not found.");
        }
        wordRepository.deleteById(wordId);
    }
}
