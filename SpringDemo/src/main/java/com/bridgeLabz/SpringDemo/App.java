package com.bridgeLabz.SpringDemo;


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
       
         ApplicationContext context=new ClassPathXmlApplicationContext("applicatinContext.xml");
        Student student=(Student)context.getBean("studentbean"); 
        student.setName("snehal");
        student.displayInfo();  
    }
}
