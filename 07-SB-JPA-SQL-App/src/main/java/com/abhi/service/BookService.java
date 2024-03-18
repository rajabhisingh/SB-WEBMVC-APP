package com.abhi.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.abhi.entity.Book;
import com.abhi.repo.BookRepository;

@Service
public class BookService {
	BookRepository repository;
	public BookService(BookRepository repository) {
		this.repository = repository;
	}

//	public void getAllBook() {
//		List<Book> book = repository.findAll();
//		book.forEach(b -> System.out.println(b));
//	}

//	public void getAllBookSort() {
//		Sort sort = Sort.by("bookId").descending();
//		List<Book> list = repository.findAll(sort);
//		list.forEach(s -> System.out.println(s));
//	}
	
//	public void getAllBookByPagination() {
//		int pageSize=3;
//		int pageNumber=1;
//		PageRequest pa = PageRequest.of(pageNumber-1, pageSize);
//		   Page<Book> page = repository.findAll(pa);
//		   List<Book> book = page.getContent();
//		   book.forEach(b -> System.out.println(b));
	
	public void getAllBooksByFilter() {
		Book entity = new Book();
//		entity.setBookId(101);
//		entity.setBookName("Java");
		
//		Example<Book> example = Example.of(entity);
//		List<Book> book = repository.findAll(example);
//		book.forEach(b -> System.out.println(b));
//		
		
		
			
	     
	}

}
