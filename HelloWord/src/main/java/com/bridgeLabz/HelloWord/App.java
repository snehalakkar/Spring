package com.bridgeLabz.HelloWord;

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
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Demo d1=(Demo) context.getBean("demo");
        System.out.println(d1);
        d1.display();
        
        Demo d2=(Demo) context.getBean("demo");
        System.out.println(d2);
        d2.display();
    }
}
