package com.bridgeLabz.SpringJdbc.Dto;

public class Customer {
	private int id;
	private String name;
	private String country;

	public int getId() {
		return id;
	}

	public Customer(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public Customer() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

}
