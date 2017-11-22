package com.arizon.trng.spring.springtrng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTrngApplication {

	public static void main(String[] args) {

		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringTrngApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);

	}
}
