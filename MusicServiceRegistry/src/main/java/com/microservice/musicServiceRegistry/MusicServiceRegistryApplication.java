package com.microservice.musicServiceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MusicServiceRegistryApplication {

	public static void main(String[] musicRegistry) {
		SpringApplication.run(MusicServiceRegistryApplication.class, musicRegistry);
	}

}
