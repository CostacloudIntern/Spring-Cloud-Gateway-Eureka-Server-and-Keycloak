package com.microservice.musicCloudGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MusicCloudGatewayApplication {

	public static void main(String[] musicCloudGateway) {
		SpringApplication.run(MusicCloudGatewayApplication.class, musicCloudGateway);
	}

}
