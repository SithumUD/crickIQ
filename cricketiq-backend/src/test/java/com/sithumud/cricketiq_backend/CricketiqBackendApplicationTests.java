package com.sithumud.cricketiq_backend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
@EnabledIf("dockerAvailable")
class CricketiqBackendApplicationTests {

	@Test
	void contextLoads() {
	}

	static boolean dockerAvailable() {
		try {
			org.testcontainers.DockerClientFactory.instance().client();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
