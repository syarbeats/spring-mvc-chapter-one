package com.spring.learning.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.learning.mvc.model.Employee;

@Controller
public class HelloController {
	
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
}
