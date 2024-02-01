package com.itvitae.banaan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itvitae.banaan.model.Company;
import com.itvitae.banaan.repository.CompanyRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/company")
public class CompanyController {
    @Autowired
    CompanyRepository companyRepository;

    @GetMapping("/findAll")
    public Iterable<Company> findAll() {
        return companyRepository.findAll();
    }

    @PostMapping("/make")
    public Company make(@RequestBody Company company) {
        return companyRepository.save(company);
    }
}
