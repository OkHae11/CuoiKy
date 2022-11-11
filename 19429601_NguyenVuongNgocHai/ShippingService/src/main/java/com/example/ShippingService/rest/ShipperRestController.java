package com.example.ShippingService.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.ShippingService.entity.Shiper;
import com.example.ShippingService.model.ShipperOfCustomer;
import com.example.ShippingService.service.ShipperService;

@RestController
public class ShipperRestController {
	@Autowired
	private ShipperService shipperService;
	@GetMapping("/shiper")
    public List<Shiper> getShipers() {
        return shipperService.findAll();
    }
    @PostMapping("/shiper")
    public Shiper save(@RequestBody Shiper shiper) {
        return shipperService.themshiper(shiper);
    }
    @GetMapping("/shipers/{id}")
	public Shiper findOne(@PathVariable int id) {
		List<Shiper> ls= getShipers();
		for (Shiper shiper : ls) {
			if(shiper.getCustomerId()== id)
				return shiper;
		}
		return null;
	}
    
    @GetMapping("/shiper/{id}")
	public ShipperOfCustomer getshiOfCustomer(@PathVariable int id) {
		return shipperService.getShipperOfCustomer(id);
	}
    
}
