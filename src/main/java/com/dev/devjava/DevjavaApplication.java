package com.dev.devjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class DevjavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevjavaApplication.class, args);
    }
//    @Bean
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.dev.devjava.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
}
