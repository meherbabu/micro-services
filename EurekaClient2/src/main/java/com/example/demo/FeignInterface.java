package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("http://eurekaclient1")
public interface FeignInterface {

	@GetMapping("/{name}")
	public String sayHello(@PathVariable(value="name") String name);
}
