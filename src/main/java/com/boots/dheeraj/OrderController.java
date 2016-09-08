package com.boots.dheeraj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boots.dheeraj.model.Orders;
import com.boots.dheeraj.service.OrdersService;

@RestController
@RequestMapping(value="/Motordom")
public class OrderController {
	
	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping(value="/getOrders",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public ResponseEntity<List<Orders>> getOrders(){
		
		List<Orders> orders= ordersService.getOrders();
		
		return new ResponseEntity(orders,HttpStatus.OK);
	}

	@RequestMapping(value="/getOrderDetails/{orderNumber}",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public ResponseEntity<List> getOrderDetails(@PathVariable int orderNumber){
		
		List orderDetails = ordersService.getOrderDetails(orderNumber);
		
		return new ResponseEntity(orderDetails,HttpStatus.OK);
	}
	
}
