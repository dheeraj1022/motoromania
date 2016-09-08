package com.boots.dheeraj.service;

import java.util.List;

import com.boots.dheeraj.model.Orders;

public interface OrdersService {
	
	public List<Orders> getOrders();
	public List getOrderDetails(int orderNumber);

}
