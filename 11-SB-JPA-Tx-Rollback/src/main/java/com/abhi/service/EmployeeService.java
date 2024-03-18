package com.abhi.service;

import org.springframework.stereotype.Service;

import com.abhi.entity.Address;
import com.abhi.entity.Employee;
import com.abhi.repo.AddressRepo;
import com.abhi.repo.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
private EmployeeRepo empRepo;
private AddressRepo addrRepo;
public EmployeeService(EmployeeRepo empRepo, AddressRepo addrRepo) {
	this.empRepo = empRepo;
	this.addrRepo = addrRepo;
}
@Transactional(rollbackOn = Exception.class )
public void saveData() {
	Employee emp = new Employee();
	emp.setEmpId(205);
	emp.setEmpName("Abhi");
	emp.setEmpSalary(2000.0);
	empRepo.save(emp);
	
	int i = 10/0;
	Address addr = new Address();
	addr.setAddrId(505);
	addr.setEmpid(205);
	addr.setCity("Pune");
	addr.setState("MH");
	addr.setCountry("India");
	addrRepo.save(addr); 
}


}