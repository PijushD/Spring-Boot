package com.gmit.onlinejob.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;




@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "companyid", referencedColumnName = "id", nullable = false)
    private company company;  
   
    private String jobName;
    private String description;
    private Double salary;
    private String startDate;
    private String endDate;
    private String status;

    // Constructors
    public Job() {
        super();
    }

    public Job(Long jobId, String jobName, String description, 
               Double salary, String startDate, String endDate, String status,company company) {
        super();
        this.jobId = jobId;
        this.company = company;
        this.jobName = jobName;
        this.description = description;
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Job(company company, String jobName, String description, 
               Double salary, String startDate, String endDate, String status) {
        super();
        this.company = company;
        this.jobName = jobName;
        this.description = description;
        this.salary = salary;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public company getCompany() {
		return company;
	}

	public void setCompany(company company) {
		this.company = company;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

   
}
