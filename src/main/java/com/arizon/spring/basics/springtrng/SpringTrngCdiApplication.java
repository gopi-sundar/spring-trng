package com.arizon.spring.basics.springtrng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arizon.spring.basics.springtrng.cdi.SomeCdi;

@SpringBootApplication
public class SpringTrngCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTrngCdiApplication.class);

	public static void main(String[] args) {

		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringTrngCdiApplication.class, args);

		SomeCdi someCdi = applicationContext.getBean(SomeCdi.class);


		LOGGER.info("{}", someCdi);
	}
}
