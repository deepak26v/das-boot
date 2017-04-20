package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Scans spring components and auto-wires most of the Spring libraries we want to use by enabling auto-configuration
@SpringBootApplication
public class DasBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(DasBootApplication.class, args);
	}
}
