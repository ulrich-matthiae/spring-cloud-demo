package com.ulrich.matthiae.spring.clouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.ulrich.matthiae.spring.clouddemo.workout")
@EnableDiscoveryClient
public class WorkoutServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkoutServiceApplication.class, args);
	}
}
