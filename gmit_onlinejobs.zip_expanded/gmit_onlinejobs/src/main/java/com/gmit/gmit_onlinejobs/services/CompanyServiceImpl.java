package com.gmit.gmit_onlinejobs.services;

import com.gmit.gmit_onlinejobs.model.Company;
import com.gmit.gmit_onlinejobs.repository.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyServices {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company registerCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company updateCompany(Long id, Company company) {
        Company existing = companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found"));
        existing.setName(company.getName());
        existing.setEmail(company.getEmail());
        existing.setPassword(company.getPassword());
        existing.setWebsite(company.getWebsite());
        existing.setContact(company.getContact());
        existing.setLocation(company.getLocation());
        return companyRepository.save(existing);
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found"));
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company login(String email, String password) {
        return companyRepository.findByEmail(email)
                .filter(c -> c.getPassword().equals(password)) // for demo (plain text)
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));
    }
}
