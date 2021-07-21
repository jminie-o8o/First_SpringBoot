package com.example.FirstProject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ToString //toString을 만들어주는 코드
@AllArgsConstructor //생성자를 만들어주는 코드
@Entity // @Entity 를 붙여주어야 DB가 해당객체를 인식가능
public class Article {

    @Id //DB가 해당 객체를 인식 가능!
    @GeneratedValue // 1,2,3... 자동생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;


}
