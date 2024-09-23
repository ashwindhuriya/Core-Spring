package com.springcore.consinjection;

import java.util.List;

public class Person {
	private int personId;
	private String personName;
	private Certificate certificate;
	private List<String> courses;
	
	public Person(int personId, String personName, Certificate certificate, List<String> courses) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.certificate = certificate;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", certificate=" + certificate
				+ ", courses=" + courses + "]";
	}
	
}
