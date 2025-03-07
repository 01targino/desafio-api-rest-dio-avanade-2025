package com.estoque.service;

import com.estoque.domain.model.Product;

public interface ProductService {
	
	Product findById(Long id);
	
	Product create(Product productToCreate);

}
