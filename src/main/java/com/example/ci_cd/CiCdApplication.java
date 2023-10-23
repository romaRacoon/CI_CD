package com.example.ci_cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@EnableR2dbcRepositories
@SpringBootApplication
public class CiCdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CiCdApplication.class, args);
    }

}
