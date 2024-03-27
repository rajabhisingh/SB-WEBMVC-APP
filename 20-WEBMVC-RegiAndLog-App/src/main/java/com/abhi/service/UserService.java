package com.abhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.entity.User;
import com.abhi.repo.UserRepository;

@Service
public interface UserService {


    public boolean saveUser(User user);
    public User getUser(String email,String pwd);
    public boolean resetPassword(String email);
}
