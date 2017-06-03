package com.bridgeLabz.ComponentScanDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
private int custId;
private String custName;

@Autowired
private CustomerService service;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public CustomerService getService() {
	return service;
}
public void setService(CustomerService service) {
	this.service = service;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", service=" + service + "]";
}

}
