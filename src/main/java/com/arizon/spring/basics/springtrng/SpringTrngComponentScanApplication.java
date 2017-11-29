package com.arizon.spring.basics.springtrng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.arizon.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.arizon.spring.basics.componentscan")
public class SpringTrngComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTrngComponentScanApplication.class);

	public static void main(String[] args) {

		// Application Context
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringTrngComponentScanApplication.class)) {

			ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

			LOGGER.info("{}", componentDAO);
			LOGGER.info("{}", componentDAO.getJdbcConnection());
		}

	}
}
