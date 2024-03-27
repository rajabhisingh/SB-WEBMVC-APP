package com.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Contact;

public interface ContectRepository extends JpaRepository<Contact, Integer>{
	

}
