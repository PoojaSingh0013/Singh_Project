package com.singh.mgmtservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MgmtServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MgmtServiceApplication.class, args);
	}

}
