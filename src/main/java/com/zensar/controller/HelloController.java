package com.zensar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "<h1>Welcome jenkins</h1>";
	}
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "<h1>Say Hi to jenkins</h1>";
	}

}
