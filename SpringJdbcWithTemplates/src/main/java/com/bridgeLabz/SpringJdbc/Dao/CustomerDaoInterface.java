package com.bridgeLabz.SpringJdbc.Dao;

import java.util.List;

import com.bridgeLabz.SpringJdbc.Dto.Customer;

public interface CustomerDaoInterface {
	public void insert(Customer cust);

	public List<Customer> displayAll();

	public String getcustomerNameById(int id);

	public Customer getCustomer(Integer id);
}
