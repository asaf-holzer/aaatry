package com.exampleagain.aaa.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	private long id;
	private String name;
	private double salary;
	@OneToMany (cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Job> jobs;
	
	
	
}
