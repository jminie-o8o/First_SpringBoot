package com.example.FirstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //컨트롤러라고 선언!
public class FirstController {

    @GetMapping("/hi") //URL 요청 연결
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "홍길동"); //username을 키 "홍길동"을 value로 생각하면 편하다
        return "greetings";  //templates 안에 greetings.mustache 찾아서 브라우저로 전송!
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname","홍길동");
        return "goodbye";
    }
}
