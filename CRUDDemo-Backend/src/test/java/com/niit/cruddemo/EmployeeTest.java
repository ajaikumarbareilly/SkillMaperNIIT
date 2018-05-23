package com.niit.cruddemo;

import static org.junit.Assert.*;

import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import com.niit.cruddemo.config.AppContext;
import com.niit.cruddemo.model.Employee;
import com.niit.cruddemo.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppContext.class)

public class EmployeeTest {

	@Autowired
	private EmployeeService employeeService;
	
	@Before
	public void setup() {
		if(employeeService.findEmployeesByName("Imran Khan")!=null) {
			employeeService.deleteEmployee(employeeService.findEmployeesByName("Imran Khan").getEmployeeId());
		}
		
		Employee emp1=new Employee();
		emp1.setEmployeeName("Imran Khan");
		emp1.setEmployeeMailId("imran@gmail.com");
		emp1.setEmployeePassword("abcd");
		employeeService.addEmployee(emp1);
		
	}
	
	@After
	public void teardown() 
	{
		if(employeeService.findEmployeesByName("Imran Khan")!=null) 
		{
			employeeService.deleteEmployee(employeeService.findEmployeesByName("Imran Khan Singh").getEmployeeId());
		}
		
	}
	@Test
	public void testAddEmployee() {
		
		Employee emp=new Employee();
		emp.setEmployeeName("Sanjeev Kumar");
		emp.setEmployeeMailId("sanjeev@gmail.com");
		emp.setEmployeePassword("abc123");
		assertEquals(true, employeeService.addEmployee(emp));
	}

	/*
	@Test(expected=ConstraintViolationException.class)
	public void testAddEmployeeFailure() {
		Employee emp=new Employee();
		emp.setEmployeeName("Sanjeev Kumar");
		emp.setEmployeeMailId("sanjeev@gmail.com");
		emp.setEmployeePassword("abc123");
		assertEquals(true, employeeService.addEmployee(emp));
	}*/
}
