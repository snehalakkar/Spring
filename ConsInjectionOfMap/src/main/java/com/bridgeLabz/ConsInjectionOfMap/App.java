package com.bridgeLabz.ConsInjectionOfMap;

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
		MapImplementation map1 = (MapImplementation) context.getBean("mp");
		map1.show();
	}
}
