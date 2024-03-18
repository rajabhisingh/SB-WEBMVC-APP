package com.abhi.service;

import org.springframework.stereotype.Service;

import com.abhi.entity.Employee;
import com.abhi.repo.EmpRepository;

@Service
public class EmpService {
private EmpRepository empRepo;

public EmpService(EmpRepository empRepo) {
	this.empRepo = empRepo;
}

public void saveEmployee() {
	System.out.println("Imp class:+empRepo");
	Employee e = new Employee();
	e.setId(102);
	e.setName("Aman");
	e.setSalary(11000);
	
	empRepo.save(e);
	System.out.println("Record is saved successfully...");
}

}
