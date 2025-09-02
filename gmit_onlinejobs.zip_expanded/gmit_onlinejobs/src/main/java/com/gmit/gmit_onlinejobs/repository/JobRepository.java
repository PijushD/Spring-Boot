package com.gmit.gmit_onlinejobs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmit.gmit_onlinejobs.model.Job;

public interface JobRepository extends JpaRepository<Job, Long>{
	List<Job> findByCompanyId(Long companyId); // fetch jobs by company
}
