package com.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  public  User findByEmailAndPwd(String email, String pwd);
  
  
public User findByEmail(String email);
}
