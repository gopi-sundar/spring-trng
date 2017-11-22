package com.arizon.trng.spring.springtrng;

public class ComplexBusinessService {

	// ComplexBusinessService is now loosely coupled with SortAlgorithm
	private SortAlgorithm sortAlgorithm = null;// = new BubbleSortAlgorithm();

	public ComplexBusinessService(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

}
