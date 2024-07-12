package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
		
	// expose "/" that return "Hello World"
	@Value("${key}")
	String key;
	
	@Value("${arr}")
	String[] arr;
	
	@Value("${list}")
	List<String> list;
	
	@Value("#{${mapper}}")
	Map<String,Integer> mapper;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello "+ arr[0] +" "+ list.get(1) + "! Time on server is " + LocalDateTime.now() + " " 
	+ mapper.get("k2");
	}
	
}












