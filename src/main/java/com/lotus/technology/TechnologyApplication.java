package com.lotus.technology;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lotus.technology.mapper")
public class TechnologyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechnologyApplication.class, args);
    }

}

