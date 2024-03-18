package com.abhi.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abhi.intity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
public List<User> findByCountry(String name);
public List<User> findByAge(Integer age);

public List<User> findByAgeGreaterThan(Integer age);
public List<User> findByCountryIn(List<String> countrys);

public List<User> findByCountryAndAge(String cname, Integer age);
public List<User> findByCountryAndGender(String country, String gender);

public List<User> findByCountryAndAgeAndGender(String country, Integer age, String gender);
 }

