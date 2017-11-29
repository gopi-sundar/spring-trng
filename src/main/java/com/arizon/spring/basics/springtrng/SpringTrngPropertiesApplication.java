package com.arizon.spring.basics.springtrng;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.arizon.spring.basics.springtrng.properties.SomeExternalService;

@Configuration
@ComponentScan("com.arizon.spring.basics.springtrng")
@PropertySource("classpath:app.properties")
public class SpringTrngPropertiesApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringTrngPropertiesApplication.class)) {
			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
			System.out.println(someExternalService.returnServiceUrl());

		}

	}
}
