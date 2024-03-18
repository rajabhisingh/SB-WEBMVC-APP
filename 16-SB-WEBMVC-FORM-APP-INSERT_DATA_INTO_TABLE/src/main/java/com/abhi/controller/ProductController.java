package com.abhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.abhi.entity.Product;
import com.abhi.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public String getAllProduct(Model model) {
		List<Product> products = productService.findAllProduct();
		model.addAttribute("products", products);
		return "products";
		
	}

}
