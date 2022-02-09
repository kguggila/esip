package com.service.sourceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SourceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SourceProjectApplication.class, args);
	}

}
