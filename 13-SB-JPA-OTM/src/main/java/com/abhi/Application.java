package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.service.Bookservice;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Bookservice bookservice = context.getBean(Bookservice.class);
		//bookservice.saveBook();
		//bookservice.getBook();
		bookservice.getAuthor();
	}

}
