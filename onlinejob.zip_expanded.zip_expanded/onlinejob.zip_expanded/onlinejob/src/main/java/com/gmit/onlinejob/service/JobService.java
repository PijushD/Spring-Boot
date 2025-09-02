package com.gmit.onlinejob.service;

import java.util.List;
import com.gmit.onlinejob.model.Job;

public interface JobService {

    // Register or Update Job
    Job save(Job job);

    // Get all Jobs
    List<Job> getAllJobs();

    // Get Job by id
    Job getJobById(Long id);

    // Delete Job
    String deleteJob(Long id);
}
