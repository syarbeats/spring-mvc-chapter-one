package com.spring.learning.mvc.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;
import com.spring.learning.mvc.dao.EmployeeDaoImpl;
import com.spring.learning.mvc.model.Employee;

@Transactional
@Service
public class EmployeeServicesImpl implements EmployeeService{
	
	private EmployeeDaoImpl employeeDaoImpl;

	@Override
	@Transactional(readOnly=true)
	public List<Employee> getAllEmployee() {
		List<Employee> empList = employeeDaoImpl.getEmployeeList();
		System.out.println("Data Size: "+empList.size());
		return empList;
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Employee> getEmployeeByPage(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmployeeDaoImpl getEmployeeDaoImpl() {
		return employeeDaoImpl;
	}

	public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
		this.employeeDaoImpl = employeeDaoImpl;
	}

}
