package com.exampleagain.aaa.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleagain.aaa.beans.Employee;
import com.exampleagain.aaa.beans.Job;
import com.exampleagain.aaa.repo.EmployeeRepository;
import com.exampleagain.aaa.repo.JobReposetory;

@Service
public class Company {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private JobReposetory jobReposetory;

	public void addEmployee(Employee employee) {
				
		jobReposetory.saveAll(employee.getJobs());
		employeeRepository.save(employee);
	}

	public Employee getEmployeeById(long id) {
		return employeeRepository.getOne(id);
	}

	public List<Employee> getEmployeesByName(String name) {
		return employeeRepository.findByName(name);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public List<Job> getAllJobs() {
		return jobReposetory.findAll();
	}

	public List<Job> getJobsByDate(Date date) {
		return jobReposetory.findByEndDate(date);
	}

	public List<Job> getJobsByDateBetweenDates(Date from, Date to) {
		return jobReposetory.findByEndDateBetween(from, to);
	}

}
