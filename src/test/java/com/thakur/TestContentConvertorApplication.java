package com.thakur;

import org.springframework.boot.SpringApplication;

public class TestContentConvertorApplication {

	public static void main(String[] args) {
		SpringApplication.from(ContentConvertorApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
