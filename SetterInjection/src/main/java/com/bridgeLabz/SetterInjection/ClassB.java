package com.bridgeLabz.SetterInjection;

public class ClassB {
	private String pencil;
	private String rubber;
	private String scale;
	private classA a;

	public String getPencil() {
		return pencil;
	}

	public void setPencil(String pencil) {
		this.pencil = pencil;
	}

	public String getRubber() {
		return rubber;
	}

	public void setRubber(String rubber) {
		this.rubber = rubber;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public classA getA() {
		return a;
	}

	public void setA(classA a) {
		this.a = a;
	}
	
	public void display(){
		System.out.println("running class b content");
	}

	@Override
	public String toString() {
		return "ClassB [pencil=" + pencil + ", rubber=" + rubber + ", scale=" + scale + ", a=" + a + "]";
	}
}
