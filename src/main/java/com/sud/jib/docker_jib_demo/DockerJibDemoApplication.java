package com.sud.jib.docker_jib_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJibDemoApplication {

	@GetMapping("/message")
	public String message() {
		return "Hello, Welcome to Docker Jib Demo !!";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(DockerJibDemoApplication.class, args);
	}

}
