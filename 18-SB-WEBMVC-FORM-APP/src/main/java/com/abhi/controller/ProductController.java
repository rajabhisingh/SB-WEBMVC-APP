package com.abhi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.entity.Product;
import com.abhi.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/index")
	public ModelAndView loadPrduct() {
	
	    return new ModelAndView("index","product", new Product());
	}
	@PostMapping("/save")
    public ModelAndView saveProduct(@ModelAttribute("product") Product p) {
        productService.saveProduct(p);
        return new ModelAndView("redirect:/index");
    }

    @GetMapping("/data")
    public ModelAndView getAllProducts() {
        List<Product> productList = productService.getProducts();
        return new ModelAndView("data", "products", productList);
    }
}