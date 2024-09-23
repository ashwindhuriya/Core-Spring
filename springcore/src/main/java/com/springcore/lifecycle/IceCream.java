package com.springcore.lifecycle;

public class IceCream {
	private double price;

	public IceCream() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "IceCream [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside Initialisation method");
	}
	
	public void destroy() {
		System.out.println("Inside Clean Up Method");
	}
}
