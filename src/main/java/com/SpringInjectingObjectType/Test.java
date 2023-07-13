package com.SpringInjectingObjectType;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

//		Student stu  =new Student();;
//		MathCheat math = new MathCheat();
//		stu.setMathcheat(math);
//		stu.Exams();

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student studnt = context.getBean("stu", Student.class);
		studnt.Exams();

		AnotherStudent anotherstudent = context.getBean("another", AnotherStudent.class);
		anotherstudent.test();

//Instead of creating  mathCheat object two time we have to modify
//This is to way to create the object this is an heavy weight

//		<bean id="stu" class="com.SpringInjectingObjectType.Student">
//		<property name="mathcheat">
//			<!-- instead of creating like this two times -->
//			<bean class="com.SpringInjectingObjectType.MathCheat"></bean>
//		</property>
//	</bean>
//	<bean id="another"
//		class="com.SpringInjectingObjectType.AnotherStudent">
//		<property name="cheat">
//			<!-- instead of creating the like this two time -->
//			<bean class="com.SpringInjectingObjectType.MathCheat"></bean>
//		</property>
//	</bean>

//	This is the out-put for this configurations
//		mathcheatconstructor called  
//		mathcheatconstructor called
//		math exam was started
//		math exam was started

// instead of creating the object two times we have introduced the "ref"=>attribute" in bean.xml file
//		this is the best way to create the object and it is an light weight

//		<bean id="mathCheatObject" class="com.SpringInjectingObjectType.MathCheat"></bean>
//		<bean id="stu" class="com.SpringInjectingObjectType.Student">
//			<property name="mathcheat" ref="mathCheatObject" />
//		</bean>
//		<bean id="another"
//			class="com.SpringInjectingObjectType.AnotherStudent">
//			<property name="cheat" ref="mathCheatObject" />
//		</bean>

//this is the out put for this bean configuration	
//		mathcheatconstructor called // here the obj created only one time.
//		math exam was started		//So this obj can use any no of times
//		math exam was started

	}

}
