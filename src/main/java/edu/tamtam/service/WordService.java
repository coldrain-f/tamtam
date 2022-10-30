package edu.tamtam.service;

import edu.tamtam.dto.WordModifyRequestDTO;
import edu.tamtam.dto.WordRegisterRequestDTO;
import edu.tamtam.entity.Word;
import edu.tamtam.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        wordRepository.findById(wordId)
                .orElseThrow(() -> new IllegalArgumentException("Word not found."));
        wordRepository.deleteById(wordId);
    }

    @Transactional
    public void modify(Long wordId, WordModifyRequestDTO wordModifyRequestDTO) {
        // findById()를 통해서 조회한 Entity 는 영속 상태이다.
        // 영속성 컨텍스트에 이미 있으면 있는 Entity 조회
        // 없으면 DB 에서 조회 후 영속성 컨텍스트에 집어 넣고, 영속 상태로 변경
        final Word wordEntity = wordRepository.findById(wordId)
                .orElseThrow(() -> new IllegalArgumentException("Word not found."));

        // JPA - 변경 감지
        // 영속 상태인 Entity 는 트랜잭션이 commit 되는 시점에 변경된 값이 update 된다.
        wordEntity.changeName(wordModifyRequestDTO.getName());
        wordEntity.changeMeaning(wordModifyRequestDTO.getMeaning());
        wordEntity.changeDescription(wordModifyRequestDTO.getDescription());
    }
}
