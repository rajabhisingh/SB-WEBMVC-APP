package com.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}

