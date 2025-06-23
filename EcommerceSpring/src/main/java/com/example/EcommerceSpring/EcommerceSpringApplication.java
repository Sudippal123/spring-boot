package com.example.EcommerceSpring;


import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringApplication {

	public static void main(String[] args) {
		// The below line is used to load .env properties
		Dotenv dotenv = Dotenv.configure().load();
		// The below line is used to set the env variables system property
		dotenv.entries().forEach(e -> System.setProperty(e.getKey(), e.getValue()));

		SpringApplication.run(EcommerceSpringApplication.class, args);
	}

}
