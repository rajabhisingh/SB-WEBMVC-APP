package com.abhi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.entity.Product;
import com.abhi.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo productRepo;

	@Override
	public boolean saveProduct(Product p) {
		productRepo.save(p);
		return true;
	}


	@Override
	public List<Product> getProducts() {
		return productRepo.findAll();
	}


}
