package com.gmit.onlinejob.service;

import java.util.List;

import com.gmit.onlinejob.model.company;

public interface CompanyService {

    // Register or Update
    company save(company company);

    // Get all Companies
    List<company> getAllCompanies();

    // Get Company by id
    company getCompanyById(Long id);

    // Delete Company
    String deleteCompany(Long id);
}

