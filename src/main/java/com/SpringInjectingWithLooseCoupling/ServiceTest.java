package com.SpringInjectingWithLooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Airtle airtleservices=context.getBean("airtle",Airtle.class);
		airtleservices.activateService();
		
	}

}
