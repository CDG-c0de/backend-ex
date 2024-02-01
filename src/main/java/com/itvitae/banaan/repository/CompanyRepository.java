package com.itvitae.banaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itvitae.banaan.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
