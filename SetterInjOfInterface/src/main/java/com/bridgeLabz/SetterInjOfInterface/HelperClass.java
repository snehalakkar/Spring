package com.bridgeLabz.SetterInjOfInterface;

public class HelperClass {
	Language lang;

	public void helperMethod() {
		lang.learning();
	}

	public HelperClass(Language lang) {
		super();
		this.lang = lang;
	}

	/*//DI using setters
	public void setLang(Language lang) {
		this.lang = lang;
	}*/
	
	

}
