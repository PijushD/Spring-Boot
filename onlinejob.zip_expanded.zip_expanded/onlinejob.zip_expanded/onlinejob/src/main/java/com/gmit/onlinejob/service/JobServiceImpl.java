package com.gmit.onlinejob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmit.onlinejob.model.Job;
import com.gmit.onlinejob.repo.JobRepository;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository repository; // Repository object

    @Override
    public Job save(Job job) {
        return repository.save(job);
    }

    @Override
    public List<Job> getAllJobs() {
        return repository.findAll();
    }

    @Override
    public Job getJobById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found with id: " + id));
    }

    @Override
    public String deleteJob(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Job deleted successfully";
        } else {
            return "Job not found";
        }
    }
}
