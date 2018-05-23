/*package com.niit.cruddemo.controller;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.niit.cruddemo.service.EmployeeService;

import com.niit.cruddemo.dao.EmployeeDAO;
import com.niit.cruddemo.model.Employee;



@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@GetMapping("/employees")
	public ResponseEntity<?> findAll()
	{
		//return new ResponseEntity<List<Employee>>(employeeDAO.findAll(), HttpStatus.CREATED);
		List<Employee> list=Employee.findAll();
		if(list!=null)
		{
			return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("No Employee Found",HttpStatus.NO_CONTENT);
		}
	}

	@PostMapping("/save")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee)
	{
		boolean status=employeeDAO.addEmployee(employee);
		if(status)
			return new ResponseEntity<String>("Employee Save Successfully",HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("Unable to Save Employee Record",HttpStatus.INSUFFICIENT_STORAGE);
			
	}

	@PostMapping("/delete/{employeeId)")
	public ResponseEntity<?> deleteEmployee(@PathVariable("employeeId") int employeeId)
	{
		boolean status=employeeDAO.deleteEmployee(employeeId);
		if(status)
			return new ResponseEntity<String>("Record Deleted Successfully",HttpStatus.OK);
		else
			return new ResponseEntity<String>("Unable to Delete Record",HttpStatus.OK);
		 
	}
	@GetMapping("/employee/{employeeName}")
	public ResponseEntity<?> employeeByName(@PathVariable("employeeName") String employeeName)
	{
		Employee employee=employeeDAO.findByName(employeeName);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}

	@PostMapping("/update")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee)
	{
		employeeDAO.updateEmployee(employee);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginEmployee(@RequestBody Employee employee,HttpSession session)
	{
		boolean status=employeeDAO.validateEmployee(employee.getEmployeeMailId(),employee.getEmployeePassword());
		if(status)	
		{
	
			session.setAttribute("loggedInUser",employee.getEmployeeMailId());
			
			return new ResponseEntity<String>("LoggedIn Successfully",HttpStatus.OK);
	 }
		else
		{
			return new ResponseEntity<String>("Invalid User Details",HttpStatus.OK);
			
		}
	}
	
	/*
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> listAllEmployees() {
		
		return new ResponseEntity<List<Employee>>(employeeService.findAllEmployees(), HttpStatus.CREATED);
	}
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("employeeId") int employeeId) {
		
		if(employeeService.findEmployeesById(employeeId)!=null) {
			return new ResponseEntity<Employee>(employeeService.findEmployeesById(employeeId), HttpStatus.OK);
		}
		else 
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND); 
	}
	
	@DeleteMapping("/{employeeId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("employeeId") int employeeId) {
		
		if(employeeService.findEmployeesById(employeeId)!=null) {
			employeeService.deleteEmployee(employeeId);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else 
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); 
	}
	
	@PostMapping
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
		
		if(employeeService.findEmployeesByName(employee.getEmployeeName())!=null) {
			
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		else {
			employeeService.addEmployee(employee);
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
	}
	
	@PutMapping
	public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee) {
		
		if(employeeService.findEmployeesById(employee.getEmployeeId())!=null) {
			employeeService.updateEmployee(employee);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		else {
			
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
}*/