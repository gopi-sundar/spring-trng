package com.arizon.spring.basics.springtrng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.arizon.spring.basics.springtrng.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringTrngScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTrngScopeApplication.class);

	public static void main(String[] args) {

		// Application Context
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringTrngScopeApplication.class)) {

			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO.getJdbcConnection());

			LOGGER.info("{}", personDAO1);
			LOGGER.info("{}", personDAO1.getJdbcConnection());
		}

	}
}
