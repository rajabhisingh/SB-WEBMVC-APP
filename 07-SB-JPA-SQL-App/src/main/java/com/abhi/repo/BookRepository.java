package com.abhi.repo;

import java.util.List;

import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	

	

}
