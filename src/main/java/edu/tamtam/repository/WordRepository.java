package edu.tamtam.repository;

import edu.tamtam.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
    
}
