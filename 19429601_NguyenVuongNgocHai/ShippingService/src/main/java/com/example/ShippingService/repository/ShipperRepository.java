package com.example.ShippingService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ShippingService.entity.Shiper;

@Repository
public interface ShipperRepository extends JpaRepository<Shiper, Integer>{

}
