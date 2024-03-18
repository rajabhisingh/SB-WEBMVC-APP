package com.abhi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.entity.Product;
import com.abhi.repo.ProductRepo;

@Service
//@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
private	ProductRepo productRepo;

	@Override
	public List<Product> findAllProduct() {
		return (List<Product>) productRepo.findAll();
	}
	
	

}
