package com.kllabajo.sims.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloLabajo {
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello, Kerr Labajo!";
	}
}