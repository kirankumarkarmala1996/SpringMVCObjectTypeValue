package com.SpringInjectingWithLooseCoupling;

public class Airtle {

	private Service service;

	public void setService(Service service) {
		this.service = service;
	}

	public void activateService() {
		service.service();
	}

}
