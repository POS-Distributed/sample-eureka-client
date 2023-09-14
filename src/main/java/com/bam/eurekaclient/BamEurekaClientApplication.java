package com.bam.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BamEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BamEurekaClientApplication.class, args);
	}

}
