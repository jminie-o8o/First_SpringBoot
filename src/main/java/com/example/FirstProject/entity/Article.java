package com.example.FirstProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // @Entity 를 붙여주어야 DB가 해당객체를 인식가능
public class Article {

    @Id //DB가 해당 객체를 인식 가능!
    @GeneratedValue // 1,2,3... 자동생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
