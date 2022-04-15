package com.jenkin.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinIntegrationApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(SpringJenkinIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing");
		assertEquals(true, true);
	}

}
