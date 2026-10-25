package com.example.constructor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.constructor.entity.Customer;
import com.example.constructor.repository.CustomerRepo;

@Service
public class PremiumCustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepo cr;

	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		cr.save(c);
	}
	
	

}
