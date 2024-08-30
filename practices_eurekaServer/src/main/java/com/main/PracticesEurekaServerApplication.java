package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class PracticesEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticesEurekaServerApplication.class, args);
	}

}
