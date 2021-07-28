package com.exampleagain.aaa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.exampleagain.aaa.beans.Employee;
import com.exampleagain.aaa.service.Company;

@RestController
@RequestMapping("manager")
public class ManageController {

	@Autowired
	private Company company;
	
	
	@PostMapping("add")
	@ResponseStatus(value = HttpStatus.CREATED)
	public void addEmployee(@RequestBody Employee employee) {
		company.addEmployee(employee);
	}
	
	@GetMapping("get-employee/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable int id) {
		return new ResponseEntity<Employee>(company.getEmployeeById(id),HttpStatus.OK);
	}
	
	
	
	
}
