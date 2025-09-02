package com.gmit.onlinejob.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmit.onlinejob.model.company;

public interface CompanyRepository extends JpaRepository<company, Long> {
    // Long is the primary key type (id)
    // JpaRepository gives you built-in methods like:
    // save(), findById(), findAll(), deleteById(), etc.
}

