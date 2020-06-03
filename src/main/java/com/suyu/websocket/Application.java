package com.suyu.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class,args);

        ClassPathResource resource=new ClassPathResource("");
        BufferedReader reader=new BufferedReader(new InputStreamReader(resource.getInputStream()));
        String result=reader.lines().collect(Collectors.joining("\n"));
        reader.close();
    }
}
