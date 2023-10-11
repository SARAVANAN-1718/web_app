package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ones {

	@GetMapping(value = "/getsar")
	public String getone() {
		return "hello world";

	}
}
