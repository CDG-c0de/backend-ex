package com.itvitae.banaan.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.itvitae.banaan.model.Company;
import com.itvitae.banaan.model.User;
import com.itvitae.banaan.repository.CompanyRepository;
import com.itvitae.banaan.repository.UserRepository;

@Component
public class Setup implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void run(String... args) {
        seedCompanies();
        seedUsers();
    }

    private void seedCompanies() {
        long count = companyRepository.count();
        if (count == 0) {
            System.out.println("Seeding companies");
            companyRepository.save(new Company("Fruit bedrijfv", 69420L));
            companyRepository.save(new Company("BioBV", 12344321L));
            count = companyRepository.count();
        }
        System.out.println(count + " companies in the database.");
    }

    private void seedUsers() {
        long count = userRepository.count();
        if (count == 0) {
            System.out.println("Seeding users");
            userRepository.save(new User("gert", "wachwoord", "ROLE_USER"));
            userRepository.save(new User("samson", "stommehond", "ROLE_USER"));
            count = userRepository.count();
        }
        System.out.println(count + " users in the database.");
    }
}
