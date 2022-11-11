package com.example.CustomerService.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerService.entity.Customer;
import com.example.CustomerService.service.CustomerService;

@RestController
public class CustomerRestController {
	@Autowired
	 private CustomerService customerService;

	@GetMapping("/customer")
    public List<Customer> getCustomers() {
        return customerService.findAll();
    }
//	@GetMapping("/customer/{id}")
//    public Customer getCustomer(@PathVariable int id) {
//        return customerService.getCustomerById(id);
//    }
	@GetMapping("/customer/{id}")
	public Customer findOne(@PathVariable int id) {
		List<Customer> ls= getCustomers();
		for (Customer customer : ls) {
			if(customer.getCustomerId()== id)
				return customer;
		}
		return null;
	}
	@PostMapping("/customer")
    public Customer save(@RequestBody Customer customer) {
        return customerService.them(customer);
    }
}
