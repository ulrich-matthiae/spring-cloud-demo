package com.ulrich.matthiae.spring.clouddemo.weatherservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class WeatherServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherServiceApplication.class, args);
	}
}
