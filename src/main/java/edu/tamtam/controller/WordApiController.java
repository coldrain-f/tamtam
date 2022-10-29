package edu.tamtam.controller;

import edu.tamtam.repository.WordRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j
@RequiredArgsConstructor
@Controller("/words")
public class WordApiController {



    @GetMapping()
    public void getAllWords() {

    }
}
