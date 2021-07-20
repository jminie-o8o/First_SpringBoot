package com.example.FirstProject.controller;

import com.example.FirstProject.dto.ArticleForm;
import com.example.FirstProject.entity.Article;
import com.example.FirstProject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다가 자동연결!
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new"; //templates 를 기준으로 경로를 적어준다.
    }

    @PostMapping("/articles/create")  //post 방식으로 /articles/create 요청이 들어오면, 아래의 메소드 실행
    public String createArticle(ArticleForm form){  //폼 태그의 데이터가 ArticleForm 객체로 만들어 진다
        System.out.println(form.toString()); // ArticleForm 객체 정보를 확인!

        // 1. DTO 를 Entity 로 변환!
        Article article = form.toEntity();
        System.out.println(article.toString());

        // 2. Repository 에게 Entity 를 DB 안에 저장하게 함!
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
