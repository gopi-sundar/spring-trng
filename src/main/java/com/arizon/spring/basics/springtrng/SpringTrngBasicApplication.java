package com.arizon.spring.basics.springtrng;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.arizon.spring.basics.springtrng.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.arizon.spring.basics.springtrng")
public class SpringTrngBasicApplication {

	public static void main(String[] args) {

		// Application Context
		// ApplicationContext applicationContext =
		// SpringApplication.run(SpringTrngBasicApplication.class, args);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringTrngBasicApplication.class)) {
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
			System.out.println(result);

		}

	}
}
