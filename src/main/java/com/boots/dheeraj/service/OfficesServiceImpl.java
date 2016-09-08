package com.boots.dheeraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boots.dheeraj.dao.OfficesDao;
import com.boots.dheeraj.model.Offices;


@Service
public class OfficesServiceImpl implements OfficesService {

	@Autowired
	private OfficesDao officesDao;
	
	public List<Offices> getOffices() {
		// TODO Auto-generated method stub
		List<Offices> offices = officesDao.getOffices();
		return offices;
	}
	
	

}
