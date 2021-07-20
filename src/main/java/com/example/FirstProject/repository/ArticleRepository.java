package com.example.FirstProject.repository;

import com.example.FirstProject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// 우리가 ArticleRepository(레포지토리)를 직접 구현할 수도 있지만
// JPA 에서 제공하는 CrudRepository 인터페이스를 활용해 쉽게 만들어 보겠다.
// CrudRepository 를 상속받는다
public interface ArticleRepository extends CrudRepository<Article, Long> {  // <관리대상 entity, 대표값 타입>

}
