package com.boots.dheeraj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.boots.dheeraj.model.Products;

@Component
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Products> getaProducts() {
		// TODO Auto-generated method stub
		List<Products> products=null;
		try{
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
	 products = session.createQuery("from products").list();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return products;
	}

}
