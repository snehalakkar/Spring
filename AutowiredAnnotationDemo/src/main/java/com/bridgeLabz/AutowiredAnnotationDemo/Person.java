package com.bridgeLabz.AutowiredAnnotationDemo;

public class Person {

	private int id;
	private String pname;

	public Person(int id, String pname) {
		super();
		this.id = id;
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + "]";
	}
}
