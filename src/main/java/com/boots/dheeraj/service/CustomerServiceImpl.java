package com.boots.dheeraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boots.dheeraj.dao.CustomerDao;
import com.boots.dheeraj.model.Customers;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public List<Customers> getCustomers() {
		// TODO Auto-generated method stub
		
		List<Customers> customers = customerDao.getCustomers();
		
		return customers;
	}
	
	

}
