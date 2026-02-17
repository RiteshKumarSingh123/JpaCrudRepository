package com.example.demo.service;
import java.util.Map;
import java.util.Optional;

import com.example.demo.entity.Company;
import com.example.demo.entity.Customers;
import com.example.demo.entity.Workers;
import com.example.demo.pojo.CompanyDetails;

public interface CompanyService {

public Company saveCompanyInfo(Company company);
	
	public CompanyDetails getCompanyList(int page, int size);
	
	public CompanyDetails getCompanyDetailsList(int page, int size);
	
	public Optional<Company> getCompanyById(long companyId);
	
	public Map<String,String> deleteCompanyById(long companyId);
	
	public Map<String,String> updateCompany(Company company);
	
	public Map<String,String> getDuplicateCompany(long companyId);
	
	public Workers saveWorkersData(Workers worker); 
	
	public CompanyDetails getWorkersList(int page, int size);

	public Optional<Workers> getWorkersById(long workerId);
	
	public Map<String,String> deleteWorkerById(long workerId);
	
	public Map<String,String> updateWorkers(Workers worker);
	
	public Customers saveCustomersData(Customers customers);
	
	public CompanyDetails getCustomersList(int page ,int size);
	
	public  Optional<Customers> getCustomerById(long customerId);
	
	public Map<String,String> deleteCustomerById(long customerId);
	
	public Map<String,String> updateCustomers(Customers customers);
	
}
