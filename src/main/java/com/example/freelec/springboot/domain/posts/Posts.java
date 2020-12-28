package com.example.freelec.springboot.domain.posts;

import com.example.freelec.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity // 테이블과 링크될 클래스이다.카멜케이스 이름을 언더스코어 네이밍(_)으로 테이블 이름 매칭한다.
public class Posts extends BaseTimeEntity {
    @Id // 해당 테이블의 PK 필드르 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pk 생성규칙
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스를 생성 . 단 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

/*
* 빌더 패턴 클래스를 이용하여 생성자를 통해 전달받은 필드를 매핑한다.
* */