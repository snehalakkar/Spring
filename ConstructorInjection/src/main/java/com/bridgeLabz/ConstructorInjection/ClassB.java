package com.bridgeLabz.ConstructorInjection;

import com.bridgeLabz.ConstructorInjection.classA;

public class ClassB {
	private String pencil;
	private String rubber;
	private String scale;
	private classA a;

	public ClassB(String pencil, String rubber, String scale, com.bridgeLabz.ConstructorInjection.classA a) {
		super();
		this.pencil = pencil;
		this.rubber = rubber;
		this.scale = scale;
		this.a = a;
	}
	
	public ClassB(){
	}
	
	public void show(){
		System.out.println(pencil+" "+rubber+" "+scale);
		System.out.println("class a "+a.toString());
	}
}
