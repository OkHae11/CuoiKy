package com.example.CustomerService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerService.entity.Customer;
import com.example.CustomerService.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	public Customer them(Customer customer) {
		return customerRepository.save(customer);
	}
	
}
