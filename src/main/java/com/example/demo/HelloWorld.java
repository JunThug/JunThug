package com.example.demo;

import org.apache.tomcat.util.http.parser.HttpParser;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/HelloWorld")
	public String testMettod() {
		return "HelloWorld!!!!!";
	}
	
	//HttpHeaders responseHeaders = new HttpHeaders();

}
