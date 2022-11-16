package com.rtaylor02.cardatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CardatabaseApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CardatabaseApplication.class, args);
	}

}
