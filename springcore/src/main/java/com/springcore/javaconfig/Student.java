package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	private Drink drink;
		
	public Student(Drink drink) {
		super();
		this.drink = drink;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}
	
	public void study() {
		this.drink.display();
		System.out.println("Student is studying !");
	}
}
