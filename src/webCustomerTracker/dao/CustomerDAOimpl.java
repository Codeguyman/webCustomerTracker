package webCustomerTracker.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import webCustomerTracker.entity.Customer;


@Repository
public class CustomerDAOimpl implements CustomerDAO {
	
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer order by lastName", Customer.class);
		
		List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
	  Session currentSession = sessionFactory.getCurrentSession();
	  
	  currentSession.saveOrUpdate(theCustomer);
	}

	@Override
	public Customer getCustomer(int theid) {
		  Session currentSession = sessionFactory.getCurrentSession();
		  
		Customer dcustomer =  currentSession.get(Customer.class, theid);
		
		return dcustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Customer> theQuery = 
				currentSession.createQuery("delete from Customer where id=:customerId");
		
		theQuery.setParameter("customerId", theId);
		
		theQuery.executeUpdate();
	}

}
