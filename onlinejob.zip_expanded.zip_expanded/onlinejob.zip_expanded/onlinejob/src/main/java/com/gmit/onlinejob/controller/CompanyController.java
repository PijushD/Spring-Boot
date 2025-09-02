package com.gmit.onlinejob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gmit.onlinejob.model.company;
import com.gmit.onlinejob.service.CompanyService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService services;

    // Create or Update company
    @PostMapping("/save")
    public company save(@RequestBody company company) {
        return services.save(company);
    }

    // Get all companies
    @GetMapping("/getAllCompanies")
    public List<company> getAllCompanies() {
        return services.getAllCompanies();
    }

    // Get company by ID
    @GetMapping("/getCompanyById/{id}")
    public company getCompanyById(@PathVariable(value = "id") Long id) {
        return services.getCompanyById(id);
    }

    // Delete company by ID
    @DeleteMapping("/deleteCompanyById/{id}")
    public String deleteCompanyById(@PathVariable(value = "id") Long id) {
        return services.deleteCompany(id);
    }
}
