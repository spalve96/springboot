package com.app.techworm.main.serviceinterface;

import java.util.List;

import com.app.techworm.main.model.Employee;

public interface EmployeeInterface {
	public void saveEmp(Employee employee);
	public Employee updateEmp(Employee employee);
	public void deleteEmp(int id);
	public List<Employee> getAllEmp();

}
