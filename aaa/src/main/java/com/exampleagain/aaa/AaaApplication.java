package com.exampleagain.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AaaApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(AaaApplication.class, args);
		System.out.println("end");
	}

}
