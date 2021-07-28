package com.exampleagain.aaa.clr;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.exampleagain.aaa.beans.Employee;
import com.exampleagain.aaa.beans.Job;
import com.exampleagain.aaa.service.Company;


@Component
public class test implements CommandLineRunner{
	
	public Date realDate(int dd,int mm,int yyyy) {
		return new Date(yyyy-1900,mm-1,dd+1);
	}

	@Autowired
    private Company company;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Employee e1 = new Employee();
		e1.setId(111);
		e1.setName("Moshe");
		e1.setSalary(10000);
		
		Employee e2 = new Employee();
		e2.setId(222);
		e2.setName("David");
		e2.setSalary(15000);
		
		Job j1 = new Job();
		j1.setId(1);
		j1.setDescription("aaa");
		j1.setEndDate(realDate(20, 8, 2020));
		
		Job j2 = new Job();
		j2.setId(2);
		j2.setDescription("bbb");
		j2.setEndDate(realDate(21, 8, 2020));
		
		Job j3 = new Job();
		j3.setId(3);
		j3.setDescription("ccc");
		j3.setEndDate(realDate(22, 8, 2020));
		
		Job j4 = new Job();
		j4.setId(4);
		j4.setDescription("ddd");
		j4.setEndDate(realDate(23, 8, 2020));
				
		e1.setJobs(Arrays.asList(j1,j2));
		e2.setJobs(Arrays.asList(j3,j4));
		
		company.addEmployee(e1);
		company.addEmployee(e2);

		System.out.println(company.getEmployeeById(111));
		System.out.println(company.getEmployeesByName("Moshe"));
		System.out.println(company.getAllEmployees());
		System.out.println(company.getAllJobs());
		System.out.println(company.getJobsByDate(realDate(21, 8, 2020)));
		System.out.println(company.getJobsByDateBetweenDates(realDate(21, 8, 2020), realDate(23, 8, 2020)));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
