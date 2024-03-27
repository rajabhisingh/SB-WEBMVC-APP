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
	
	@GetMapping("/product")
	public ModelAndView loadForm() {
	ModelAndView mav = new ModelAndView(); 
	mav.addObject("pobj", new Product());
	mav.setViewName("index");
	return mav;
	   
	}
	@PostMapping("/product")
    public ModelAndView saveProduct(Product pobj) {
		ModelAndView mav = new ModelAndView();
        
		boolean status = productService.saveProduct(pobj);
		if(status) {
			mav.addObject("smsg", "Product saved");
		}else {
			mav.addObject("emsg", "Failed to save");
		}
		mav.addObject("pobj", new Product());
		mav.setViewName("index");
		return mav;
        
    }
	

    @GetMapping("/products")
    public ModelAndView getAllProducts() {
        List<Product> productList = productService.getProducts();
        ModelAndView mav = new ModelAndView();
        mav.addObject("plist", productList);
        mav.setViewName("data");
        return mav;
    }
    @GetMapping("/product/delete")
    public ModelAndView deleteProduct(Integer id) {
        productService.deleteProduct(id);
        List<Product> productsList = productService.getProducts();
        ModelAndView mav = new ModelAndView();
        mav.addObject("plist",productsList);
        mav.setViewName("data");
        return mav;
    }

    @GetMapping("/product/edit")
    public ModelAndView loadUpdateForm(Integer id) {
        ModelAndView mav = new ModelAndView();
        Product product = productService.getProductById(id);
        mav.addObject("pobj", product);
        mav.setViewName("editForm");
        return mav;
    }

    @PostMapping("/product/update")
    public ModelAndView updateProduct(Product pobj) {
        ModelAndView mav = new ModelAndView();
        productService.updateProduct(pobj);
        List<Product> productsList = productService.getProducts();
        mav.addObject("plist", productsList);
        mav.setViewName("data");
        return mav;
        
        
    }
}