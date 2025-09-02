package com.gmit.onlinejob.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmit.onlinejob.model.company;
import com.gmit.onlinejob.repo.CompanyRepository;



@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository repository; // Repository object

    @Override
    public company save(company company) {
        return repository.save(company);
    }

    @Override
    public List<company> getAllCompanies() {
        return repository.findAll();
    }

    @Override
    public company getCompanyById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Company not found with id: " + id));
    }

    @Override
    public String deleteCompany(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Company deleted successfully";
        } else {
            return "Company not found";
        }
    }
}

