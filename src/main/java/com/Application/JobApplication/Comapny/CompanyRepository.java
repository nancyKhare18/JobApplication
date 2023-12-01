package com.Application.JobApplication.Comapny;

import com.Application.JobApplication.job.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<Company, Long> {

}
