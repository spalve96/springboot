package com.app.techworm.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.techworm.main.model.Employee;
import com.app.techworm.main.repo.EmployeeRepo;
import com.app.techworm.main.serviceinterface.EmployeeInterface;
@Service
public class EmployeeImplementation implements EmployeeInterface{

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public void saveEmp(Employee employee) {
		employeeRepo.save(employee);
		
	}

	@Override
	public Employee updateEmp(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public void deleteEmp(int id) {
		employeeRepo.deleteById(id);
		
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepo.findAll();
	}
	

}
