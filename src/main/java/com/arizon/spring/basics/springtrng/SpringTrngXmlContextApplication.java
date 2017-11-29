package com.arizon.spring.basics.springtrng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arizon.spring.basics.springtrng.xml.XmlPersonDAO;

public class SpringTrngXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger("SpringTrngXmlContextApplication.class");

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			LOGGER.info("Beans loaded are > {}", (Object) applicationContext.getBeanDefinitionNames());
			// Beans loaded are > [xmlJdbcConnection, xmlPearsonDAO]

			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(xmlPersonDAO);

		}

	}
}
