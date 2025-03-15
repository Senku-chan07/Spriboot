package com.practice.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import com.twilio.Twilio;


@SpringBootApplication
@RestController

public class HelloController{

public static void main(String[] args) {
    SpringApplication.run(HelloController.class, args);
}

}