package com.bridgeLabz.SpringJdbc.Dao;

import com.bridgeLabz.SpringJdbc.Dto.Customer;

public interface CustomerDaoInterface {
	public void insert(Customer cust);

	public Customer getCustomerById(int id);
}
