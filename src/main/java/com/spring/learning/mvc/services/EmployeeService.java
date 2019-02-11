package com.spring.learning.mvc.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.spring.learning.mvc.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();
	Employee getEmployeeById(Long id);
	Employee addEmployee(Employee emp);
	Page<Employee> getEmployeeByPage(Pageable pageable);
}
