package com.boots.dheeraj.dao;

import java.util.List;

import com.boots.dheeraj.model.Orders;

public interface OrdersDao {
	
	public List<Orders> getOrders();
	public List getOrderDetails(int orderNumber);

}
