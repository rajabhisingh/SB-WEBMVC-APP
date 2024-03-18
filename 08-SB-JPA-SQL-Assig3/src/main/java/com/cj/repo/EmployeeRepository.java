package com.cj.repo;

	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cj.entity.Employee;
@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	    @Query("SELECT e.empName, e.empSalary FROM Employee e")
	    List<Object[]> findEmpNameAndSalary();
	}


