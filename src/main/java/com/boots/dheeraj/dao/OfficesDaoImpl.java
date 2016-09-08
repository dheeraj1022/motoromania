package com.boots.dheeraj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.boots.dheeraj.model.Offices;


@Component
@Transactional
public class OfficesDaoImpl implements OfficesDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Offices> getOffices() {
		// TODO Auto-generated method stub
		Session session = null;
		List<Offices> offices = null;
		
		try {
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			offices = session.createQuery("from offices").list();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("in finally ");
			//System.out.println(offices);
			//session.close();
			
		}
		
		return offices;
	}
	
	

}
