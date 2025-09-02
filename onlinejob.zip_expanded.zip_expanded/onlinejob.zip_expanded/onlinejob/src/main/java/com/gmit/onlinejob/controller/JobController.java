package com.gmit.onlinejob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gmit.onlinejob.model.Job;
import com.gmit.onlinejob.service.JobService;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController  {

    @Autowired
    private JobService jobService;

    // Create or Update a job
    @PostMapping("/save")
    public Job save(@RequestBody Job job) {
        return jobService.save(job);
    }

    // Get all jobs
    @GetMapping("/getalljobs")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    // Get job by ID
    @GetMapping("/getJobById/{id}")
    public Job getJobById(@PathVariable(value = "id") Long id) {
        return jobService.getJobById(id);
    }

    // Delete job by ID
    @DeleteMapping("/deleteJobById/{id}")
    public String deleteJobById(@PathVariable(value = "id") Long id) {
        return jobService.deleteJob(id);
    }
}
