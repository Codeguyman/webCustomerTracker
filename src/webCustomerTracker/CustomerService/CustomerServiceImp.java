package webCustomerTracker.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import webCustomerTracker.dao.CustomerDAO;
import webCustomerTracker.entity.Customer;


@Service
public class CustomerServiceImp implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
	      customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theid) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(theid);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(theId);
	}

}
