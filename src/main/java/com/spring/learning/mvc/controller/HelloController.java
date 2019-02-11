package com.spring.learning.mvc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.learning.mvc.model.Employee;
import com.spring.learning.mvc.services.EmployeeService;

@Controller
public class HelloController {
	
	private final Logger logger = LoggerFactory.getLogger(HelloController.class);
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Welcoming home in company self service application");
		return "home";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String submitEmployee(@Validated Employee employee, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("name", employee.getName());
		return "employee";
	}
	
	@RequestMapping(value = "/employeeList", method = RequestMethod.GET)
	public String getEmployeeList(Model model){
		logger.info("Get Employee List....");
		List<Employee> empList = getEmployeeService().getAllEmployee();
		model.addAttribute("empList", empList);
		logger.info("No. of Employee: "+ empList.size());
		return "employee_list";
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
}

