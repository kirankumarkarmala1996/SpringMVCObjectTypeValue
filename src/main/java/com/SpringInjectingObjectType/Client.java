package com.SpringInjectingObjectType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
//		This configuration in bean.xml file is loose coupling
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		NewStudent studnt = context.getBean("newstu", NewStudent.class);
		studnt.cheatexam();
	}

}
