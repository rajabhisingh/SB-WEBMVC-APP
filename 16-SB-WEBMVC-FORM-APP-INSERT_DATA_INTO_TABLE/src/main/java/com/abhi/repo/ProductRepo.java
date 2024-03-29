package com.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
