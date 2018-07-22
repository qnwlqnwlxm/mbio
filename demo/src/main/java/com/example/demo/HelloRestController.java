package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	@RequestMapping("/")
	public String index() {
		return "상준 테스트트트트트트트";
	}
	
	@RequestMapping("Hello")
	public String Hello() {
		return "Hello!!!!";
	}
	
}
