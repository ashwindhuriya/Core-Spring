package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/springcollection.xml");
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee.getEmpName());
		System.out.println(employee.getPhones());
		System.out.println(employee.getAddress());
		System.out.println(employee.getCourses());
	}

}
