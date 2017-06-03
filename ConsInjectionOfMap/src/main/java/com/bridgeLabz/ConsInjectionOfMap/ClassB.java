package com.bridgeLabz.ConsInjectionOfMap;

public class ClassB {
	private String pencil;
	private String rubber;
	private String scale;
	
	
	public ClassB(String pencil, String rubber, String scale) {
		super();
		this.pencil = pencil;
		this.rubber = rubber;
		this.scale = scale;
	}

	@Override
	public String toString() {
		return "ClassB [pencil=" + pencil + ", rubber=" + rubber + ", scale=" + scale + "]";
	}
}
