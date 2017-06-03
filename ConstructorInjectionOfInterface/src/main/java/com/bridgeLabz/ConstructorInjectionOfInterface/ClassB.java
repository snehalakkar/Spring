package com.bridgeLabz.ConstructorInjectionOfInterface;

import java.util.Iterator;
import java.util.List;

import com.bridgeLabz.ConstructorInjectionOfInterface.classA;

public class ClassB {
	@Override
	public String toString() {
		return "ClassB [pencil=" + pencil + ", rubber=" + rubber + ", scale=" + scale + ", list=" + list + "]";
	}

	private String pencil;
	private String rubber;
	private String scale;
	private List<classA> list;

	public ClassB(String pencil, String rubber, String scale, List<classA> list) {
		super();
		this.pencil = pencil;
		this.rubber = rubber;
		this.scale = scale;
		this.list = list;
	}

	public void show() {
		System.out.println(pencil + " " + rubber + " " + scale);
		System.out.println("class A details are :");
		Iterator<classA> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public ClassB(){
	}
}
