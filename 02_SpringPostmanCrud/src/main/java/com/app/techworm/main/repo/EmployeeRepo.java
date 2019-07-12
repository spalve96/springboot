package com.app.techworm.main.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.techworm.main.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
