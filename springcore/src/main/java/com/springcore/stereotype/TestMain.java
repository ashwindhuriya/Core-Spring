package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml");
		Student student1 = context.getBean("student", Student.class);
		Student student2 = context.getBean("student", Student.class);
		/*
		 * System.out.println(student); System.out.println(student.getAddress());
		 */
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}

}
