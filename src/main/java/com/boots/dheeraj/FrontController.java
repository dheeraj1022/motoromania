package com.boots.dheeraj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {
	
	@RequestMapping("/products")
	public String productsPage(){
		
		return "products";
	}
	
	
	@RequestMapping("/customers")
	public String customersPage(){
		
		return "customers";
	}
	@RequestMapping("/orders")
	public String ordersPage(){
		
		return "orders";
	}

}
