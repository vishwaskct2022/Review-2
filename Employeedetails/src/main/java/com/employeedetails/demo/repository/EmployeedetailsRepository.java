package com.employeedetails.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeedetails.demo.model.Employeedetails;

public interface EmployeedetailsRepository extends JpaRepository <Employeedetails,Integer> {

}
