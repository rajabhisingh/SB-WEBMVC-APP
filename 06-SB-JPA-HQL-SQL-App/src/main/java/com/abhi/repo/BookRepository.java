package com.abhi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.abhi.entit.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	
	@Query(value ="From Book")
	public List<Book> getAllBookHql();
	
	@Query(value ="select *from Book",nativeQuery = true)
	public List<Book> getAllBookSql();
	
	@Query(value = "From Book where bookPrice=:bookPrice")
	public List<Book> getBookByBookPrice(Double bookPrice);

}
