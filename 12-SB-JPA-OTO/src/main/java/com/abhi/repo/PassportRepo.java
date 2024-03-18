package com.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

}
