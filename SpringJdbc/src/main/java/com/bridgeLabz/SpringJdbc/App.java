package com.bridgeLabz.SpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeLabz.SpringJdbc.Dao.CustomerImpl;
import com.bridgeLabz.SpringJdbc.Dto.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-Module.xml");
        CustomerImpl custImp=(CustomerImpl) context.getBean("customerDAOImpl");
        Customer customer = new Customer(1, "snehal","india");
        custImp.insert(customer);

        Customer customer1 = custImp.getCustomerById(1);
        System.out.println(customer1);
        
    }
}
