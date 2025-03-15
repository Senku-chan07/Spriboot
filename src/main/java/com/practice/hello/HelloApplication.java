package com.practice.hello;

import org.apache.http.HttpStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;

@SpringBootApplication
@RestController

public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

    @GetMapping("/hello")
    public String getMethodName(@RequestParam(value = "name") String name){
        return String.format("Hello %s!", name);
    }

	public static final String SID = "";
	public static final String TOKEN = "";

	Public String sender = "";
	Public String receiver = "";
	Public String message = "";

	@GetMapping("/sendsms")
	public ResponseEntity<String> Sendsms(){
		Twilio.init(SID, TOKEN);
		com.twilio.rest.api.v2010.account.message.creator(
			new PhoneNumber(sender),
			new PhoneNumber(receiver),
			message);

			return new ResponseEntity<>("SMS Sent", org.springframework.http.HttpStatus.OK);
	}

}
