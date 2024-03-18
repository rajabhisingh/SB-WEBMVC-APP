package com.abhi;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.abhi.entit.Book;
import com.abhi.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) { 
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository repository = context.getBean(BookRepository.class);
		
//		Book b1 = new Book(101,"Java",200.0,"James gosling");
//		Book b2 = new Book(102,"Math",1000.0,"Neutan");
//		Book b3 = new Book(103,"English",600.0,"SkPandy");
//		Book b4 = new Book(104,"Hindi",500.0,"KabirDas");
//		
//		repository.saveAll(Arrays.asList(b1,b2,b3,b4));
		
		List<Book> allBookSql = repository.getAllBookSql();
		allBookSql.forEach(book ->{
			System.out.println(book);
		});
		
		System.out.println("============================================================================================================================================");
		List<Book> allBookHql = repository.getAllBookHql();
		allBookHql.forEach(book ->{
			System.out.println(book);
		});
		
		System.out.println("===============================================================================================================================================");
		List<Book> bookByBookPrice = repository.getBookByBookPrice(600.0);
		bookByBookPrice.forEach(book ->{
			System.out.println(book);
		});
		
		
	}

}
