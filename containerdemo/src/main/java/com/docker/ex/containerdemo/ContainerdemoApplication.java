package com.docker.ex.containerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ContainerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContainerdemoApplication.class, args);
	}
	
	@RestController
	static class DemoContainer{
		@GetMapping("/{name}")
		public ResponseEntity<String> askQuestion(@PathVariable(value="name") String name){
			return ResponseEntity.ok("Hey "+name+", do you like mango juice?");
		}
	}

}
