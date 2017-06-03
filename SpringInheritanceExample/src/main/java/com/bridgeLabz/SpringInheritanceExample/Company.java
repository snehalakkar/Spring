package com.bridgeLabz.SpringInheritanceExample;

public class Company {
	private int id;
	private String cname;
	private Employee emp;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void display() {
		System.out.println("comp running...");
		System.out.println("employee details: "+emp);
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", cname=" + cname + "]";
	}

}
