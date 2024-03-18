package com.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Author;

public interface AuthorRepo extends  JpaRepository<Author, Integer>{

}
