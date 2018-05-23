	//Naming Conventions
	//http://www.oracle.com/technetwork/java/codeconventions-135099.html

package com.niit.cruddemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeId;
	
	@NonNull
	private String employeeName;
	private String employeeGender;
	private String employeeDob;
	
	@NonNull
	@Column(name="employeeMailId",unique=true)
	private String employeeMailId;
	
	@NonNull
	private String employeePassword;
	private String employeeAddress;
	private String employeeContactNo;
	private String employeeCurrentLocation;
	private String employeeDepartment;
	private String employeeDesignation;
	private String employeeRole;
	private String employeeQualification;
	private String employeeCertification;
	private String employeeSkills;
	private int employeeExperience;
	private int employeeHourBatchTaken;
	private int employeeViewed;
	private String employeeSupervisorName;
	private String employeeImagePath;
	private String EmployeeIsApproved;

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public String getEmployeeDob() {
		return employeeDob;
	}
	public void setEmployeeDob(String employeeDob) {
		this.employeeDob = employeeDob;
	}
	public String getEmployeeMailId() {
		return employeeMailId;
	}
	public void setEmployeeMailId(String employeeMailId) {
		this.employeeMailId = employeeMailId;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeContactNo() {
		return employeeContactNo;
	}
	public void setEmployeeContactNo(String employeeContactNo) {
		this.employeeContactNo = employeeContactNo;
	}
	public String getEmployeeCurrentLocation() {
		return employeeCurrentLocation;
	}
	public void setEmployeeCurrentLocation(String employeeCurrentLocation) {
		this.employeeCurrentLocation = employeeCurrentLocation;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public String getEmployeeRole() {
		return employeeRole;
	}
	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}
	public String getEmployeeQualification() {
		return employeeQualification;
	}
	public void setEmployeeQualification(String employeeQualification) {
		this.employeeQualification = employeeQualification;
	}
	public String getEmployeeCertification() {
		return employeeCertification;
	}
	public void setEmployeeCertification(String employeeCertification) {
		this.employeeCertification = employeeCertification;
	}
	public String getEmployeeSkills() {
		return employeeSkills;
	}
	public void setEmployeeSkills(String employeeSkills) {
		this.employeeSkills = employeeSkills;
	}
	public int getEmployeeExperience() {
		return employeeExperience;
	}
	public void setEmployeeExperience(int employeeExperience) {
		this.employeeExperience = employeeExperience;
	}
	public int getEmployeeHourBatchTaken() {
		return employeeHourBatchTaken;
	}
	public void setEmployeeHourBatchTaken(int employeeHourBatchTaken) {
		this.employeeHourBatchTaken = employeeHourBatchTaken;
	}
	public int getEmployeeViewed() {
		return employeeViewed;
	}
	public void setEmployeeViewed(int employeeViewed) {
		this.employeeViewed = employeeViewed;
	}
	public String getEmployeeSupervisorName() {
		return employeeSupervisorName;
	}
	public void setEmployeeSupervisorName(String employeeSupervisorName) {
		this.employeeSupervisorName = employeeSupervisorName;
	}
	public String getEmployeeImagePath() {
		return employeeImagePath;
	}
	public void setEmployeeImagePath(String employeeImagePath) {
		this.employeeImagePath = employeeImagePath;
	}
	public String getEmployeeIsApproved() {
		return EmployeeIsApproved;
	}
	public void setEmployeeIsApproved(String employeeIsApproved) {
		EmployeeIsApproved = employeeIsApproved;
	}
}
