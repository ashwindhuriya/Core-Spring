package com.springcore.reference;

public class FirstRef {
	private int x;
	private SecondRef secRef;
	
	public FirstRef() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FirstRef(int x, SecondRef secRef) {
		super();
		this.x = x;
		this.secRef = secRef;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public SecondRef getSecRef() {
		return secRef;
	}

	public void setSecRef(SecondRef secRef) {
		this.secRef = secRef;
	}

	@Override
	public String toString() {
		return "FirstRef [x=" + x + ", secRef=" + secRef + "]";
	}
	
	
}
