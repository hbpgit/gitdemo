package com.example.mygit.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class GitdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitdemoApplication.class, args);
    }

}
