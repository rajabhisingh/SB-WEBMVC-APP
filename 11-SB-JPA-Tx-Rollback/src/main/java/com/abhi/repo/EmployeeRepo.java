package com.abhi.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Serializable> {

}
