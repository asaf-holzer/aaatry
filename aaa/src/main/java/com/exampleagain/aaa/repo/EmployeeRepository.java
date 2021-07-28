package com.exampleagain.aaa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleagain.aaa.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee> findByName(String name);
	
}
