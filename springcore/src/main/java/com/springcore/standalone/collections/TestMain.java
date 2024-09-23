package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneConfig.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("---------------------------------------------");
		System.out.println(person.getFeeStructure());
		System.out.println(person.getProperties());
	}

}
