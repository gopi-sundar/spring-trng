package com.arizon.trng.spring.springtrng;

public class MainClass {

	public static void main(String[] args) {

		SortAlgorithm sortAlgorithm = new QuickSortAlgorithm(); // BubbleSortAlgorithm();

		ComplexBusinessService complexBusinessService = new ComplexBusinessService(sortAlgorithm);

	}

}
