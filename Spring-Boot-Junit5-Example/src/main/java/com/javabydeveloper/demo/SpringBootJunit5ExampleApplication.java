package com.javabydeveloper.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = 
{"com.javabydeveloper.controller", "com.javabydeveloper.service"})
public class SpringBootJunit5ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJunit5ExampleApplication.class, args);
	}

}
