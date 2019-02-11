package com.spring.learning.mvc.dao;

import java.util.List;

import com.spring.learning.mvc.model.Employee;

public interface IEmployeeDao {
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public Employee getEmployee(int id);
	public List<Employee> getEmployeeList();

}
