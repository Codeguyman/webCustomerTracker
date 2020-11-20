package webCustomerTracker.dao;

import java.util.List;

import webCustomerTracker.entity.Customer;

public interface CustomerDAO {
	
	public List <Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theid);

	public void deleteCustomer(int theId);

	

}
