package com.coding;

public class Employee {
	

	
	  private String lastName;

	  private String firstName;

	  private Integer salary;


	  public Employee(String lastName, String firstName,int salary ) {
	    this.lastName = lastName;
	    this.firstName = firstName;
	    this.salary=salary;

	  }

	  public String getLastName() {
	    return this.lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }

	  public String getFirstName() {
	    return this.firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public double getSalary() {
	    return this.salary;
	  }

	  public void setSalary(int salary) {
	    this.salary = salary;
	  }
	
	
	}




