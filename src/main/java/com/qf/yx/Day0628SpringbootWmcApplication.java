package com.qf.yx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Day0628SpringbootWmcApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day0628SpringbootWmcApplication.class, args);
	}

}
