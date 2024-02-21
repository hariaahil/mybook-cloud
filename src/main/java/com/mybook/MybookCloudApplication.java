package com.mybook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class MybookCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybookCloudApplication.class, args);
	}

}
