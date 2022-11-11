package com.example.ShippingService.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipers")
public class Shiper implements Serializable{
	@Id
	private int shipperId;
	private String name;
	private double price;
	private double km;
	private int customerId;
	public int getShipperId() {
		return shipperId;
	}
	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Shiper(int shipperId, String name, double price, double km, int customerId) {
		super();
		this.shipperId = shipperId;
		this.name = name;
		this.price = price;
		this.km = km;
		this.customerId = customerId;
	}
	public Shiper() {
		super();
	}
	@Override
	public String toString() {
		return "Shiper [shipperId=" + shipperId + ", name=" + name + ", price=" + price + ", km=" + km + ", customerId="
				+ customerId + "]";
	}
	
}
