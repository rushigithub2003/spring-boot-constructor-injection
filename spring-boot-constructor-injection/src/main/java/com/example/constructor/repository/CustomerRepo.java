package com.example.constructor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.constructor.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
