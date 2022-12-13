package com.example.springcurdexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springcurdexample.Entity.Product;
import com.example.springcurdexample.repository.ProductRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	public List<Product> getProdtct(){
		return repository.findAll();
	}
	
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Product getProductByName(String name) {
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product reoved !!"+id;
	}
	
	public Product updateProduct(Product product) {
		Product exisitingProduct=repository.findById(product.getId()).orElse(null);
		exisitingProduct.setName(product.getName());
		exisitingProduct.setQuantity(product.getQuantity());
		exisitingProduct.setPrice(product.getPrice());
		return repository.save(exisitingProduct);
		
	//hi
	}
}
