package com.functionalPrograming.Predefinedfunction;

import java.util.jar.Attributes.Name;

public class Employee {
  private int Employee_id;
  private String name;
  private String city;
  private double marks;
  public Employee(int employee_id, String name, String city, double marks) {
	super();
	Employee_id = employee_id;
	this.name = name;
	this.city = city;
	this.marks = marks;
  }
  public int getEmployee_id() {
	return Employee_id;
  }
  public void setEmployee_id(int employee_id) {
	Employee_id = employee_id;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getCity() {
	return city;
  }
  public void setCity(String city) {
	this.city = city;
  }
  public double getMarks() {
	return marks;
  }
  public void setMarks(double marks) {
	this.marks = marks;
  }
  
  
  
	
	
}
