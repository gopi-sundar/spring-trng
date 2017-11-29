package com.arizon.spring.basics.springtrng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.arizon.spring.basics.springtrng.cdi.SomeCdi;

@Configuration
@ComponentScan
public class SpringTrngCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTrngCdiApplication.class);

	public static void main(String[] args) {

		// Application Context
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringTrngCdiApplication.class)) {

			SomeCdi someCdi = applicationContext.getBean(SomeCdi.class);

			LOGGER.info("{}", someCdi);
		}
	}
}
