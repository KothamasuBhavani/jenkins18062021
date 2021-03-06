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
	
	@RequestMapping("/bye")
	public String sayBye() {
		return "<h1>Good Bye  jenkins</h1>";
	}
	@RequestMapping("/gm")
	public String sayGm() {
		return "<h1>GoodMorning jenkins</h1>";
	}

}
