package com.abhi.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.entity.Author;
import com.abhi.entity.Book;
import com.abhi.repo.AuthorRepo;
import com.abhi.repo.BookRepo;

@Service
public class Bookservice {
	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private AuthorRepo authorRepo;
	
//	public void deleteBook() {
//	  bookRepo.deleteById(1);
//	}
	
	public void getAuthor() {
		authorRepo.findById(1);
	}
	
//	public void getBook() {
//		Optional<Book> byId = bookRepo.findById(1);
//		if(byId.isPresent()) {
//			Book book = byId.get();
//			List<Author> authorList = book.getAuthorList();
//			
//		}
//	}
//	
	public void saveBook() {
		Book book = new Book();
		
		book.setBookName("Java");
		book.setBookPrice(200.0);
		
		Author au = new Author();
		au.setAuthorName("Jemas Gosling");
		au.setBookType("Programming");
		
		Author au2 = new Author();
		au2.setAuthorName("Jhone");
		au2.setBookType("ProgrammingCodeing");
		
		au.setBook(book);
		au2.setBook(book);
		book.setAuthorList(Arrays.asList(au,au2));
		
		bookRepo.save(book);
	}
}