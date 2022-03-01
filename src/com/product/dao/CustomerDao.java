package com.product.dao;

import java.util.List;

import com.product.pojo.Customer;
import com.product.pojo.*;

public interface CustomerDao {
	boolean AddCustomer(Customer c);
	boolean UpdateCustomer(Customer c);
	boolean deleteCustomer(int Customerid);
	List<Customer> showAllCustomer();
	Customer searchCustomerById(int Customerid);
	List<Customer> searchCustomerByName(String Customername);
	Customer searchCustomerByEmail(String Customeremail);
	
}
