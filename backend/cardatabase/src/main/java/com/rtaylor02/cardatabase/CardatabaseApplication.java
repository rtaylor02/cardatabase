package com.rtaylor02.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CardatabaseApplication {
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("\t==============================");
		logger.info("\tApplication started...");
		logger.info("\t==============================");

	}

}
