package com.arizon.trng.spring.springtrng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexBusinessService {

	// This is called dependency injection
	@Autowired
	private SortAlgorithm sortAlgorithm;


}
