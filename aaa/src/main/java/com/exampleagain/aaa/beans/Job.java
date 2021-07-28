package com.exampleagain.aaa.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Job {

	@Id
	private long id;
	private String description;
	private Date endDate;
	
	
}
