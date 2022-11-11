package com.example.ShippingService.model;

import com.example.ShippingService.entity.Shiper;

public class ShipperOfCustomer {
	private Shiper shiper;
	private Customer customer;
	public Shiper getShiper() {
		return shiper;
	}
	public void setShiper(Shiper shiper) {
		this.shiper = shiper;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ShipperOfCustomer(Shiper shiper, Customer customer) {
		super();
		this.shiper = shiper;
		this.customer = customer;
	}
	public ShipperOfCustomer() {
		super();
	}
	
}
