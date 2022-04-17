package com.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinIntegrationApplication {

	static Logger logger = LoggerFactory.getLogger(SpringJenkinIntegrationApplication.class);

	@RequestMapping("/message")
	public String displayMessage() {
		return "Congratulation, you have successfully deployed your application to k8s !!";
	}

	@PostConstruct
	public void init() {
		logger.info("App started");
	}

	public static void main(String[] args) {
		logger.info("App executed!");
		SpringApplication.run(SpringJenkinIntegrationApplication.class, args);
	}

}
