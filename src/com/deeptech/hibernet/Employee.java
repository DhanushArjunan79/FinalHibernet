package com.deeptech.hibernet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="empid")
private int id;
@Column(name="firstname")
private String Firstname;
@Column(name="lastname")
private String Lastname;
@Column(name="designation")
private String designation;
@Column(name="salary")
private double salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


}
