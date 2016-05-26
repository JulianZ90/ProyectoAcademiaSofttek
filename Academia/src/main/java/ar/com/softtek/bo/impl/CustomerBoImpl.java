package ar.com.softtek.bo.impl;

import java.util.List;

import ar.com.softtek.bo.CustomerBo;
import ar.com.softtek.dao.CustomerDAO;
import ar.com.softtek.model.Customer;
 
public class CustomerBoImpl implements CustomerBo{
	
	CustomerDAO customerDAO;

	//DI via Spring
	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	//call DAO to save customer
	public void addCustomer(Customer customer){
		
		customerDAO.addCustomer(customer);
		
	}
	
	//call DAO to return customers
	public List<Customer> listCustomer(){
		
		return customerDAO.listCustomer();
		
	}
	
}