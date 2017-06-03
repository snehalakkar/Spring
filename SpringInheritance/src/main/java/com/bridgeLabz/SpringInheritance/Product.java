package com.bridgeLabz.SpringInheritance;

public class Product {
private int id;
private String name;
private double prize;
public int getId() {
	return id;
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
public double getPrize() {
	return prize;
}
public void setPrize(double prize) {
	this.prize = prize;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", prize=" + prize + "]";
}

}
