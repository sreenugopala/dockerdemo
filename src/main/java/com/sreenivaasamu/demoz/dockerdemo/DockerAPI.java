package com.sreenivaasamu.demoz.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerAPI {

	@GetMapping("/")
	public String home() {
		return "Dockerizing Spring Boot Application";
	}

}
