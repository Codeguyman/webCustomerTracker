package webCustomerTracker.CustomerService;

import java.util.List;

import webCustomerTracker.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theid);

	public void deleteCustomer(int theId);

}
