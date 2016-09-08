package com.boots.dheeraj;

import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boots.dheeraj.model.Customers;
import com.boots.dheeraj.model.Offices;
import com.boots.dheeraj.model.Orders;
import com.boots.dheeraj.model.Products;
import com.boots.dheeraj.service.CustomerService;
import com.boots.dheeraj.service.OfficesService;
import com.boots.dheeraj.service.OrdersService;
import com.boots.dheeraj.service.ProductService;

@RestController
@RequestMapping(value="/Motordom")
public class MotorController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OfficesService officesService;
	
	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping(value="/index",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> index(){
		
		
		
		return new ResponseEntity<String>("Hello Boss!",HttpStatus.OK);
	}
	
	@RequestMapping(value="/getProducts",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public ResponseEntity<List<Products>> getProducts(){
		
		List<Products> products= productService.getProducts();
		
		return new ResponseEntity(products,HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/getCustomers",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public ResponseEntity<List<Customers>> getCustomers(){
		
		List<Customers> customers= customerService.getCustomers();
		
		return new ResponseEntity(customers,HttpStatus.OK);
	}
	
	@RequestMapping(value="/getOffices",produces=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.GET)
	public ResponseEntity<List<Offices>> getOffices(){
		
		List<Offices> offices= officesService.getOffices();
		
		return new ResponseEntity(offices,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	

}
