package com.example.blog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.blog.Articles2;

// ArticleRepository 介面繼承自 JpaRepository，用於執行 Article 實體的數據存取操作
@Repository
public interface ArticleRepository extends JpaRepository <Articles2, Long> {
    // 不需要額外定義方法，JpaRepository 已經提供了基本的 CRUD 操作方法
    Articles2 findByArticle_id(Long article_id);
}

