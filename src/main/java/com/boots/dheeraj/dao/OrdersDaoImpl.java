package com.boots.dheeraj.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.boots.dheeraj.model.Orders;



@Component
@Transactional
public class OrdersDaoImpl implements OrdersDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Orders> getOrders() {
		// TODO Auto-generated method stub
		Session session = null;
		List<Orders> orders = null;
		
		try{
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
	orders	= session.createQuery("from orders").list();
				
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return orders;
	}

	@Override
	public List getOrderDetails(int orderNum) {
		// TODO Auto-generated method stub
		Session session = null;
		List orderDetails = null;
		Orders order= null;
		try{
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
		Query query	=session.createQuery("SELECT o.orderDate,o.shippedDate,o.status from orders o where o.orderNumber=:orderNum");
			query.setParameter("orderNum",orderNum);
			orderDetails = query.list();

			// order = (Orders) session.get(Orders.class, orderNum);
		//	System.out.println(orderDetails);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return orderDetails;
	}
	
	

}
