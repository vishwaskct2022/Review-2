package com.employeedetails.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeedetails.demo.model.Employeedetails;
import com.employeedetails.demo.repository.EmployeedetailsRepository;

@Service
public class EmployeedetailsService {
	
	@Autowired
	EmployeedetailsRepository employeedetailsservice;
	
	public List<Employeedetails> getAllEmployeedetails()
	{
		List<Employeedetails>employeedetailsList=employeedetailsservice.findAll();
		return employeedetailsList;
	}
	
	public Employeedetails saveEmployeedetails(Employeedetails e) {
		return employeedetailsservice.save(e);
	}
	
	public void deleteEmployeedetails(int e) {
		employeedetailsservice.deleteById(e);
	}
}
