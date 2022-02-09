package com.service.sourceproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.sourceproject.dto.Employee;

@RestController
public class MainController {
	
	@GetMapping("/retrieveSourceData")
	public String retrieveSourceData() {
		return "Returning Data from Source";
	}
	@GetMapping("/retrieveSourceDetails")
	public String retrieveSourceDetails(@RequestParam("accountnumber") String accountNumber,
									@RequestParam("policynumber") String policynumber,
									@RequestHeader("targetsystem") String targetsystem,
									@RequestHeader("language") String language
									) {
		return "Returning Data from Source Account Number : "+accountNumber + " Policy Number : "+policynumber 
				+ " Target System : "+targetsystem + " Language : "+ language;
	}
	@GetMapping("/retrieveEmployeeDetails")
	public List<Employee> retrieveEmployeeDetails(@RequestParam("accountnumber") String accountNumber,
									@RequestParam("policynumber") String policynumber,
									@RequestParam("basestate") String basestate,
									@RequestParam("licensestate") String licensestate,
									@RequestHeader("targetsystem") String targetsystem,
									@RequestHeader("language") String language
									) {
		System.out.println("Returning Data from Source Account Number : "+accountNumber + " Policy Number : "+policynumber 
				+ " Target System : "+targetsystem + " Language : "+ language + " Base State : "+basestate + " License State : "+licensestate);
		List<Employee> employeeList = new ArrayList();
		Employee employee1 = new Employee();
		employee1.setName("John");
		employee1.setDept("IT");
		employee1.setSalary(100);
		employeeList.add(employee1);
		Employee employee2 = new Employee();
		employee2.setName("Jen");
		employee2.setDept("IT");
		employee2.setSalary(200);
		employeeList.add(employee2);
		Employee employee3 = new Employee();
		employee3.setName("Joe");
		employee3.setDept("IT");
		employee3.setSalary(300);
		employeeList.add(employee3);
		return employeeList;
	}
	
	
}
