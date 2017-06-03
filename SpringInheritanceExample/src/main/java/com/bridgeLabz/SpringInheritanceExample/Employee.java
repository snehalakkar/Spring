package com.bridgeLabz.SpringInheritanceExample;

public class Employee {
private String ename;
private int sal;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [ename=" + ename + ", sal=" + sal + "]";
}

public void show(){
	System.out.println("emp running...");
}

}
