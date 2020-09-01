package com.zhayujie.javatoolkit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class JavaToolkitApplication {

    public static void main(String[] args) {
        log.info("Hello init!");
        SpringApplication.run(JavaToolkitApplication.class, args);
    }
}
