package com.gmit.onlinejob.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gmit.onlinejob.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
    // Long is the primary key type (jobId)
    // JpaRepository provides built-in CRUD methods:
    // save(), findById(), findAll(), deleteById(), etc.
}

