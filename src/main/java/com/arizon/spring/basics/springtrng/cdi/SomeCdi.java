package com.arizon.spring.basics.springtrng.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdi {

	@Inject
	private SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}

}
