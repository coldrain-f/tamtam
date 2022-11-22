package edu.tamtam.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/dashboard")
@Slf4j
public class DashboardController {

    @GetMapping
    public String dashboard() {
        log.info("/dashboard/index");
        return "dashboard/index";
    }

}
