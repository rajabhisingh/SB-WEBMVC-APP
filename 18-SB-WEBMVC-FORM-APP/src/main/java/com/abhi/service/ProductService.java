package com.abhi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abhi.entity.Product;

@Service
public interface ProductService{	

public boolean saveProduct(Product p);
public List<Product> getProducts();
public void deleteProduct(Integer id);
public Product getProductById(Integer id);
public void updateProduct(Product product);


}
