package com.microservice.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MusicServiceApplication {

	public static void main(String[] music) {
		SpringApplication.run(MusicServiceApplication.class, music);
	}
}