package com.abhi.repo;

import org.springframework.data.repository.CrudRepository;

import com.abhi.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer> {

}
