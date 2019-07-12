package com.app.techworm.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.techworm.main.model.Employee;
import com.app.techworm.main.serviceimpl.EmployeeImplementation;

@RestController
@CrossOrigin("*")
public class HomeController {
	
	@Autowired
	private EmployeeImplementation empImpl;
	@PostMapping(value = "saveEmp")
	public String addNewEmp(@RequestBody Employee employee) {
		System.out.println("At Controller Add");
		empImpl.saveEmp(employee);
		return "Added Successfully";
	}
	@PutMapping(value = "updateEmp")
	public Employee updateEmp(@RequestBody Employee employee) {
		return empImpl.updateEmp(employee);
	}
	@DeleteMapping(value = "deleteEmp")
	public String deleteEmp(@RequestParam Integer id) {
		System.out.println("At delete employee");
		empImpl.deleteEmp(id);
		
		return "Employee Deleted";
	}
	
	@GetMapping(value = "findAllEmp")
	public List<Employee> findAllEmployee(){
		return empImpl.getAllEmp();
	}

}
