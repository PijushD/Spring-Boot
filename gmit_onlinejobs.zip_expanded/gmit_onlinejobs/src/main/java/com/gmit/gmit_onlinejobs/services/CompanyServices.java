package com.gmit.gmit_onlinejobs.services;

import java.util.List;

import com.gmit.gmit_onlinejobs.model.Company;

public interface CompanyServices {
	Company registerCompany(Company company);
    Company updateCompany(Long id, Company company);
    void deleteCompany(Long id);
    Company getCompanyById(Long id);
    List<Company> getAllCompanies();
    Company login(String email, String password);
}
