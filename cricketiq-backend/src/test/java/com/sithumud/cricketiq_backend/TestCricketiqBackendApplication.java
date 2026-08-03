package com.sithumud.cricketiq_backend;

import org.springframework.boot.SpringApplication;

public class TestCricketiqBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(CricketiqBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
