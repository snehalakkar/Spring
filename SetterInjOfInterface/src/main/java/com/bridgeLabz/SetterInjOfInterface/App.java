package com.bridgeLabz.SetterInjOfInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelperClass help1 = (HelperClass) context.getBean("help");
		help1.helperMethod();
	}
}
