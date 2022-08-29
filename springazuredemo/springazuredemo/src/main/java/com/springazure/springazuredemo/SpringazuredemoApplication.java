package com.springazure.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringazuredemoApplication {
	
	@GetMapping("/message")
	public String message() {
		return "Hi Azure bro how r u?";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringazuredemoApplication.class, args);
	}

}
