package com.gome.sample.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/sample")
public class HelloController {
	
	@RequestMapping(value="run")
	public String sayHello() {
		
		return "HelloWorld!";
		
	}

}
