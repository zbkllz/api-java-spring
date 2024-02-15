package com.example.apimaventest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class APISpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(APISpringApplication.class, args);
	}

}
