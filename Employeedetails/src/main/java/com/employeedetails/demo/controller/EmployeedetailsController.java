package com.employeedetails.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeedetails.demo.model.Employeedetails;
import com.employeedetails.demo.service.EmployeedetailsService;

@RestController
public class EmployeedetailsController {
	
	@Autowired
	EmployeedetailsService EmployeedetailsController;
	
	@GetMapping("fetchemployeedetails")
	public List<Employeedetails> getAllEmployeedetails()
	{
		List<Employeedetails>employeedetailsList=EmployeedetailsController.getAllEmployeedetails();
		return employeedetailsList;
	}
	
	@PostMapping("save-employeedetails")
	public Employeedetails saveEmployeedetails(@RequestBody Employeedetails e) {
		return EmployeedetailsController.saveEmployeedetails(e);
	}
	
	@PutMapping("update-employeedetails")
	public Employeedetails update(@RequestBody Employeedetails e) {
		return EmployeedetailsController.saveEmployeedetails(e);
	}
	
	@DeleteMapping("delete-employeedetails/{id}")  
	public void deleteEmployeedetails(@PathVariable("id") int id) {
		EmployeedetailsController.deleteEmployeedetails(id);
	}
}
