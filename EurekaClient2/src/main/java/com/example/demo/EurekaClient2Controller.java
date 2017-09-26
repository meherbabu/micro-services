package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClient2Controller {

	@Autowired
	private FeignInterface eurekaClient1;

	@GetMapping
	public void makeCall() {
		System.out.println("hello.." + eurekaClient1);
		System.out.println(eurekaClient1.sayHello("meher"));
	}

}
