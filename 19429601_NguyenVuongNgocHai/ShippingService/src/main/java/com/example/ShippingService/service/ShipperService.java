package com.example.ShippingService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.ShippingService.entity.Shiper;
import com.example.ShippingService.model.Customer;
import com.example.ShippingService.model.ShipperOfCustomer;
import com.example.ShippingService.repository.ShipperRepository;

@Service
public class ShipperService {
	@Autowired
	private ShipperRepository shipperRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Shiper> findAll() {
		return shipperRepository.findAll();
	}
	
	public Shiper themshiper(Shiper shiper) {
		return shipperRepository.save(shiper);
	}
	public ShipperOfCustomer getShipperOfCustomer(int shipperId) {
		Shiper ship = shipperRepository.findById(shipperId).get();
		Customer cut = restTemplate.getForObject("http://localhost:8002/customer/" + ship.getCustomerId(), Customer.class);
		ShipperOfCustomer shipperOfCustomer = new ShipperOfCustomer(ship,cut);
		return shipperOfCustomer;
	}
	public Optional<Shiper> findById(Integer id) {
		return shipperRepository.findById(id);
	}
	
}
