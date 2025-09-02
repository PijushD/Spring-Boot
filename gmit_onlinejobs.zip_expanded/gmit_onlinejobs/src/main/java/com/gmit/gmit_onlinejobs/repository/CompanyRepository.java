package com.gmit.gmit_onlinejobs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmit.gmit_onlinejobs.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>
{
	Optional<Company> findByEmail(String email); // for login
}
