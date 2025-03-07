package com.desafio_api_rest_dio_avanade_2025.api_rest_dio_avanade_2025.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.desafio_api_rest_dio_avanade_2025.api_rest_dio_avanade_2025.domain.model.Product;
import com.desafio_api_rest_dio_avanade_2025.api_rest_dio_avanade_2025.domain.repository.ProductRepository;
import com.desafio_api_rest_dio_avanade_2025.api_rest_dio_avanade_2025.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	private final ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product findById(Long id) {
		return productRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Product create(Product productToCreate) {
		if(productRepository.existsById(productToCreate.getId())) {
			throw new IllegalArgumentException("This product id already exists.");
		}
		
		return productRepository.save(productToCreate);
	}
	
}
