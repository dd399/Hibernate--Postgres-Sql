package com.viome.interview.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.viome.interview.models.Customer;

public class Customer_Imp {
	
	SessionFactory sessionFactory = null;
	public Session session = null;
	
	
	public Customer_Imp() {
		
		 this.sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		 this.session = sessionFactory.openSession();
		 
		// TODO Auto-generated constructor stub
		
		
	}

	public Boolean check(String firstName) {
		
		Query q = session.createQuery("select _customer from Customer _customer where first_name = '"+firstName+"'  ");
		
		List<Customer> customers = q.list();
		
		if(customers.size() >= 1) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public int update() {
		session.beginTransaction();
		Query q = session.createQuery("update City set city = 'New York'"+
										" where city = 'Vancouver'");
		int return_value = q.executeUpdate();
		session.getTransaction().commit();
		return return_value;
	}

}
