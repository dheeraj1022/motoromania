package com.boots.dheeraj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.boots.dheeraj.model.Customers;

@Component
@Transactional
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customers> getCustomers() {
		// TODO Auto-generated method stub
		Session session = null;
		List<Customers> customers=null;
		try{
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
		 customers = session.createQuery("from customers").list();
		
			
		}catch(Exception e){
		e.printStackTrace();	
		}finally{
			//System.out.println(customers);
		}
		
		return customers;
	}
	
	

}
