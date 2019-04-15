package com.wangwei.order2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
@EnableFeignClients(basePackages = "com.wangwei")
@SpringCloudApplication
public class Order2Application {

	public static void main(String[] args) {
		SpringApplication.run(Order2Application.class, args);
	}
}
