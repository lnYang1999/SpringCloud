package com.ysd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StartApp {
	public static void main(String[] args) {
		SpringApplication.run(StartApp.class, args);
	}
}