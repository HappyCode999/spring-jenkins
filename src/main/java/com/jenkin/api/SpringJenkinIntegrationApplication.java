package com.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringJenkinIntegrationApplication {
	
	static Logger logger = LoggerFactory.getLogger(SpringJenkinIntegrationApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("App started");
		logger.info("App started second time");
	}

	public static void main(String[] args) {
		logger.info("App executed!");
		SpringApplication.run(SpringJenkinIntegrationApplication.class, args);
	}
	
	

}
