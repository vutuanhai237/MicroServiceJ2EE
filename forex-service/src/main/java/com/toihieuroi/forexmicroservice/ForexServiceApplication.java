package com.toihieuroi.forexmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = ForexController.class)
@SpringBootApplication
public class ForexServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexServiceApplication.class, args);
	}
}
