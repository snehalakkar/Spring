package com.bridgeLabz.AutowiredAnnotationDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String type;
	private int number;
	@Autowired
	private Person person;

	public Customer(String type, int number, Person person) {
		super();
		this.type = type;
		this.number = number;
		this.person = person;
	}

	public void show() {
		System.out.println("cust type: " + type + ",number of customer :" + number + " person details: " + person);
	}

	@Override
	public String toString() {
		return "Customer [type=" + type + ", number=" + number + ", person=" + person + "]";
	}
}
