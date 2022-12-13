package com.example.springcurdexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springcurdexample.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

	

}
