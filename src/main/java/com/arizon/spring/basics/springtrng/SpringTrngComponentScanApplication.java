package com.arizon.spring.basics.springtrng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.arizon.spring.basics.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.arizon.spring.basics.componentscan")
public class SpringTrngComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTrngComponentScanApplication.class);

	public static void main(String[] args) {

		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringTrngComponentScanApplication.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getJdbcConnection());

	}
}
