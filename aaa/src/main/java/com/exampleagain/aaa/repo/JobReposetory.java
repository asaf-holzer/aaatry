package com.exampleagain.aaa.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleagain.aaa.beans.Job;


public interface JobReposetory extends JpaRepository<Job, Long> {

	List<Job> findByEndDate(Date date);
	List<Job> findByEndDateBetween(Date fromDate, Date to);
}
