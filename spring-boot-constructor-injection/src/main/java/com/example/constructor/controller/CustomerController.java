package com.example.constructor.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.constructor.entity.Customer;
import com.example.constructor.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CustomerController {

	CustomerService cs;
	/*
	 * There three ways to inject a bean of an specific implementation 1. @primary
	 * 2.@Qualifier 3. We can keep the name of variable exactly same as its
	 * implementation name.
	 */

	// Constructor Injection
	public CustomerController(CustomerService customerServiceImpl) {
		this.cs = customerServiceImpl;
	}

	@PostMapping("customer")
	String addCustomer(@RequestBody Customer c) {
		cs.addCustomer(c);
		return "Customer Added";
	}

	@GetMapping("customer")
	Customer getCustomerById(@PathVariable int id) {
		return cs.getCustomerById(id);
	}

}
