package com.bridgeLabz.AutowiredAnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer cust = (Customer) context.getBean("customerBean");
		System.out.println(cust);
		cust.show();
    }
}
