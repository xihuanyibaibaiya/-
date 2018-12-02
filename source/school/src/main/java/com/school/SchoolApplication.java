package com.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@SpringBootApplication
@MapperScan("com.school.dao")
public class SchoolApplication {

    public static void main(String[] args) {

        SpringApplication.run(SchoolApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){

        return "index";
    }
}
