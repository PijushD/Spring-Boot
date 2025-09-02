package com.gmit.gmit_onlinejobs.controller;

import com.gmit.gmit_onlinejobs.model.Company;
import com.gmit.gmit_onlinejobs.services.CompanyServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyServices companyService;

    @PostMapping("/register")
    public Company register(@RequestBody Company company) {
        return companyService.registerCompany(company);
    }

    @PostMapping("/login")
    public Company login(@RequestBody Company company) {
        return companyService.login(company.getEmail(), company.getPassword());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> update(@PathVariable Long id, @RequestBody Company company) {
        Map<String, Object> response = new HashMap<>();
        try {
            Company updated = companyService.updateCompany(id, company);
            response.put("status", true);
            response.put("data", updated);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            response.put("status", false);
            response.put("message", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            companyService.deleteCompany(id);
            response.put("status", true);
            response.put("message", "Company deleted successfully");
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            response.put("status", false);
            response.put("message", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getCompany(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            Company company = companyService.getCompanyById(id);
            response.put("status", true);
            response.put("data", company);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            response.put("status", false);
            response.put("message", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
    }

    @GetMapping
    public List<Company> getAll() {
        return companyService.getAllCompanies();
    }
}
