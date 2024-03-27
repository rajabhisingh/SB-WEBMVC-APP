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
		Product saveProduct = productRepo.save(p);
		
		return saveProduct.getProductId() != null;
	}


	@Override
	public List<Product> getProducts() {
		return productRepo.findAll();
	}


	 @Override
	    public void deleteProduct(Integer id) {
	        productRepo.deleteById(id);
	    }

	    @Override
	    public Product getProductById(Integer id) {
	        return productRepo.findById(id).orElse(null);
	    }

	    @Override
	    public void updateProduct(Product product) {
	        productRepo.save(product);
	    }
	}


