package com.oocl.springbootemployee.repository;

import com.oocl.springbootemployee.model.Company;
import com.oocl.springbootemployee.model.Employee;
import com.oocl.springbootemployee.model.Gender;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class CompanyRepository {
    private List<Company> companies = new ArrayList<>();

    public CompanyRepository() {
        companies.add(new Company(1,"OOCL"));
        companies.add(new Company(2,"CargoSmart"));
    }

    public void resetRepository() {
        companies.clear();
        companies.add(new Company(1,"OOCL"));
        companies.add(new Company(2,"CargoSmart"));
    }

    public List<Company> getAll() {
        return companies;
    }

}
