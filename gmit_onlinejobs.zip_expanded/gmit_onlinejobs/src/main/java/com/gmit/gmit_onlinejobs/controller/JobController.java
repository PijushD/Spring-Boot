package com.gmit.gmit_onlinejobs.controller;

import com.gmit.gmit_onlinejobs.model.Job;
import com.gmit.gmit_onlinejobs.services.JobServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobServices jobService;

    @PostMapping("/addJob")
    public Job addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }

    @PutMapping("updateJob/{id}")
    public Job updateJob(@PathVariable Long id, @RequestBody Job job) {
        return jobService.updateJob(id, job);
    }

    @DeleteMapping("deleteJob/{id}")
    public String deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
        return "Job deleted successfully";
    }

    @GetMapping("getJob/{id}")
    public Job getJob(@PathVariable Long id) {
        return jobService.getJobById(id);
    }

    @GetMapping("/getAllJobs")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/getAllJobsByCompanyId/{companyId}")
    public List<Job> getJobsByCompany(@PathVariable Long companyId) {
        return jobService.getJobsByCompany(companyId);
    }
}
