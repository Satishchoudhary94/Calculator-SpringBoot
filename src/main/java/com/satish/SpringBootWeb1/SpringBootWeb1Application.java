package com.satish.SpringBootWeb1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class SpringBootWeb1Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringBootWeb1Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "9090"));
		app.run(args);
		System.out.println("satish");
		System.out.println("Application started at: http://localhost:9090");



	}

}
