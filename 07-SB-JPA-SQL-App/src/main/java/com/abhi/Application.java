package com.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.service.BookService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookService service = context.getBean(BookService.class);
		//service.getAllBook();
		//service.getAllBookSort();
		//service.getAllBookByPagination();
		service.getAllBooksByFilter();
	}

}
