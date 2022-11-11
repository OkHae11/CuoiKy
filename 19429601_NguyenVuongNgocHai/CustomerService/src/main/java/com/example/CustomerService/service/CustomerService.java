package com.example.CustomerService.service;

import java.util.List;
import java.util.Optional;

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
	
	
//	public Customer getCustomerById(int id) {
////		Logger logger = Logger.getLogger(CustomerService.class.getName());
////		logger.info("lấy dữ liệu từ db");
////		Optional<Customer> customer = customerRepository.findById(id);
//		Optional<Customer> customer = null;
//		
//		
//////		 if(customer.isPresent())
////		
//		if(customer != null){
//			return customer.get();
//		}else {
//			System.out.println("Đang đợi server phản hồi ....");
//			throw new RuntimeException("Server không phản hồi");
//		}			
//	}

}
