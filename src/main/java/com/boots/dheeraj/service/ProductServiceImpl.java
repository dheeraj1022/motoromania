package com.boots.dheeraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boots.dheeraj.dao.ProductDao;
import com.boots.dheeraj.model.Products;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		
		List<Products> products = productDao.getaProducts();
		
		return products;
	}

}
