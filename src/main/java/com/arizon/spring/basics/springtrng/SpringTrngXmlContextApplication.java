package com.arizon.spring.basics.springtrng;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arizon.spring.basics.springtrng.xml.XmlPersonDAO;

public class SpringTrngXmlContextApplication {

	public static void main(String[] args) {

		// Application Context
		// ApplicationContext applicationContext =
		// SpringApplication.run(SpringTrngBasicApplication.class, args);
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);
			System.out.println(xmlPersonDAO);

		}

	}
}
