package com.cjc.main;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class MicroServiceZuulProxyApplication {

	public static void main(String[] args) {
		System.out.println("Zuul Proxy");
		SpringApplication.run(MicroServiceZuulProxyApplication.class, args);
	}

}
