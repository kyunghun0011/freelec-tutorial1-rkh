package com.example.freelec.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing // JPA Auditing 활성화 삭제
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

/*
* @SpringBootApplication
* 스프링 부트의 자동 설정, 스프링 Bean읽기와 생성을 모두 자동으로 설정한다
* 이 클래스는 항상 프로젝트의 최상단에 위치해야만 한다.
*
* 내장 WAS 사용한다.(톰캣)
* => 장점?
* */