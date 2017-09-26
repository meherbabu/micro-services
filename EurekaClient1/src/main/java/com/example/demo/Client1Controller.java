package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1Controller {

	@GetMapping("/{name}")
	public String sayHello(@PathVariable String name) {
		return "hello " + name;
	}
}
