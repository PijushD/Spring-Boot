package com.gmit.gmit_onlinejobs.services;

import java.util.List;

import com.gmit.gmit_onlinejobs.model.Job;

public interface JobServices {
	Job addJob(Job job);
    Job updateJob(Long id, Job job);
    void deleteJob(Long id);
    Job getJobById(Long id);
    List<Job> getAllJobs();
    List<Job> getJobsByCompany(Long companyId);
}
