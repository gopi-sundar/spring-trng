package com.arizon.trng.spring.springtrng.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTrngBasicApplication {

	public static void main(String[] args) {

		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringTrngBasicApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);

	}
}
