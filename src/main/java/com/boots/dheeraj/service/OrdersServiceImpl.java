package com.boots.dheeraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boots.dheeraj.dao.OrdersDao;
import com.boots.dheeraj.model.Orders;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersDao orderDao;
	
	@Override
	public List<Orders> getOrders() {
		// TODO Auto-generated method stub
		List<Orders> orders = orderDao.getOrders();
		return orders;
	}

	@Override
	public List getOrderDetails(int orderNumber) {
		// TODO Auto-generated method stub
		List orderDetails = orderDao.getOrderDetails(orderNumber);
		System.out.println(orderDetails);
		
		return orderDetails;
	}
	
	

}
