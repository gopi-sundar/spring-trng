package com.arizon.spring.basics.springtrng.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

	@Autowired
	@Qualifier("quick")
	private SortAlgorithm bubbleSortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		// Search the array
		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		LOGGER.info("inside post construct");
	}

	@PreDestroy
	public void preDestroy() {
		LOGGER.info("inside pre destroy");
	}

}
