package com.bridgeLabz.SpringInheritance;

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
		Product prod = (Product) context.getBean("child");
		System.out.println(prod);

	}
}
