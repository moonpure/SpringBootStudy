package com.boot.spring.dubbo_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
		try {
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
