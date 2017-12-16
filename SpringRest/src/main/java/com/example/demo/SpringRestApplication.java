package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class SpringRestApplication {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getHello() {

		String helloe = "Hai hello...";
		return helloe;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}
}
