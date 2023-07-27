package com.example.simpleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApp {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApp.class, args);
		// Create a runtime error
		try {
			String nullString = null;
			System.out.println(nullString.length());
		} catch (NullPointerException e) {
			System.err.println("An error occurred: " + e.getMessage());
			System.exit(1); // Terminate the application with a non-zero status code
		}
	}
}