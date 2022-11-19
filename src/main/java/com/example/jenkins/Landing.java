package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class Landing {
	
	@GetMapping("/welcome")
	public String helloMessage() {
		return "Welcome to the Jenkins Server from TJ Raje";
	}

}

