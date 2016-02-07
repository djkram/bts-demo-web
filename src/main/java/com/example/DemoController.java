package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/")
	String helloWorld() {
		return "Hello World!";
	}

	@RequestMapping("/hello/{name}")
	String helloName(@PathVariable String name) {
		return "Hello, " + name + "!";
	}

}
