package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Drink getDrink() {
		return new Drink();
	}
	
	@Bean(name = {"student"})
	public Student getStudent() {
		Student stud = new Student(getDrink());
		return stud;
	}
}
