package com.xml.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xml.demo.model.Employee;


@RestController
public class EmployeeController
{
	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public Employee getEmployeeInfo()
	{
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Rupa");
		employee.setAge(24);
		employee.setSalary(30000);
		return employee;
	}
}