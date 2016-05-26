package ar.com.softtek.bo;

import java.util.List;

import ar.com.softtek.model.Customer;
 
public interface CustomerBo{
	
	void addCustomer(Customer customer);
	
	List<Customer> listCustomer();
	
}