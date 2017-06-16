package com.bridgeLabz.SpringJdbc;

import java.util.List;

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
        Customer customer = new Customer(18, "snelanunew","india");
        custImp.insert(customer);

        List<Customer>  cust= custImp.displayAll();
        for (Object o1 : cust) {
			System.out.println(o1);
		}
       
        System.out.println("\nselect particular name from Customer Table by passing id ");
        String cu=custImp.getcustomerNameById(3);
        System.out.println(cu);
        
        System.out.println("\nselect particular record from Customer Table");
        Customer cust1 = custImp.getCustomer(5);
        System.out.print("ID : " + cust1.getId() );
        System.out.print(", Name : " + cust1.getName() );
        System.out.println(", Country : " + cust1.getCountry());
    }
}
