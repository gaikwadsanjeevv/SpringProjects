package com.example.demoapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

@RequestMapping("/")
	public String greet() {
		return "Hello World my spring project";
	}
}
