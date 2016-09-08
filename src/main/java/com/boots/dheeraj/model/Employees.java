package com.boots.dheeraj.model;

import java.util.ArrayList;
import java.util.List;
import com.boots.dheeraj.model.Offices;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="employees")
public class Employees {
	
	@Id
	@GeneratedValue
	private int employeeNumber;
	private String lastName;
	private String firstName;
	private String extension;
	private String email;
	
	
	private Integer reportsTo;
	private String jobTitle;
	
	@ManyToOne
	@JoinColumn(name="officeCode",nullable=false)
	@JsonManagedReference
	private Offices offices;
	
	@OneToMany(mappedBy="employees")
	@JsonBackReference
	private List<Customers> customers  = new ArrayList<>();
	
	@OneToMany(mappedBy="employees1")
	@JsonBackReference
	private List<Employees> employees = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name="reportsTo",insertable=false,updatable=false)
	@JsonManagedReference
	private Employees employees1;

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(Integer reportsTo) {
		this.reportsTo = reportsTo;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Offices getOffices() {
		return offices;
	}

	public void setOffices(Offices offices) {
		this.offices = offices;
	}

	public List<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}

	public Employees getEmployees1() {
		return employees1;
	}

	public void setEmployees1(Employees employees1) {
		this.employees1 = employees1;
	}

	

}
