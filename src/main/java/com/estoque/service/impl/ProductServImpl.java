package com.estoque.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.estoque.domain.model.Product;
import com.estoque.domain.repository.ProductRepository;
import com.estoque.service.ProductService;

@Service
public class ProductServImpl implements ProductService {

	private final ProductRepository productRepository;
	
	public ProductServImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product findById(Long id) {
		return productRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Product create(Product productToCreate) {
		if(productRepository.existsBySku(productToCreate.getSku())) {
			throw new IllegalArgumentException("This SKU already exists.");
		}
		
		return productRepository.save(productToCreate);
	}
	
	
	
}
