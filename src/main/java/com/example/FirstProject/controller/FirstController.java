package com.example.FirstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "정현우");
        return "greetings";  //templates 안에 greetings.mustache 찾아서 브라우저로 전송!
    }
}
