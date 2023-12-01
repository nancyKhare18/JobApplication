package com.Application.JobApplication.Comapny;

import com.Application.JobApplication.job.Job;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);
    boolean deleteCompanyById(Long id);

    Company getCompanyById(Long id);
}
