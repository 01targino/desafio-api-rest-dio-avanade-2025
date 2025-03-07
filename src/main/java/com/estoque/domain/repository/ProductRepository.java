package com.estoque.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.domain.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	boolean existsBySku(String sku);
	
}
