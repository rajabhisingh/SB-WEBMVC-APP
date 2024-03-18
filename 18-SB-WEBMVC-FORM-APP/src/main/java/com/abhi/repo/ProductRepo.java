package com.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
