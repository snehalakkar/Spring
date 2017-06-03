package com.bridgeLabz.ComponentScanDemo;

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
		Customer cust = (Customer) context.getBean("customer");
		cust.setCustId(1);
		cust.setCustName("prachi");
		System.out.println(cust);
    }
}
