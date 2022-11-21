package edu.tamtam.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/dashboard")
@Slf4j
public class DashboardController {

    @GetMapping("/home")
    public String home(Model model) {
        log.info("/dashboard/home");
        model.addAttribute("greeting", "Hello, World!");
        return "dashboard/home";
    }

    @GetMapping
    public String dashboard() {
        log.info("/dashboard/index");
        return "dashboard/index";
    }

}
