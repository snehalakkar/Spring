package com.bridgeLabz.ConsInjectionOfMap;

public class classA {
	private int id;
	private String name;
	private String address;

	public classA(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "classA [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

//	/*public classA(){}*/
}
