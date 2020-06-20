package com.example.venka.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        String[] realArgs = new String[] { "test", "--arg=arg_test", "--arg2=arg_test2" };
        log.info("[MAIN] Args: " + Arrays.toString(realArgs));
        SpringApplication.run(DemoApplication.class, realArgs);
    }
}
