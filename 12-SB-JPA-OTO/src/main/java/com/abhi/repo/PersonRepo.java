package com.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
