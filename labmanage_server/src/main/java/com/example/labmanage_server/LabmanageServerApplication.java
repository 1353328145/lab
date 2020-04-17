package com.example.labmanage_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.labmanage_server")
public class LabmanageServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabmanageServerApplication.class, args);
    }

}
