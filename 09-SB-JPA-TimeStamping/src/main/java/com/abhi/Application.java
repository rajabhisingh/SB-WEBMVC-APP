package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.entity.Product;
import com.abhi.repo.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository repo = context.getBean(ProductRepository.class);
		Product p = new Product();
		p.setProductName("Mouse");
		p.setProuctPrice(100.0);
		repo.save(p);
	}

}
