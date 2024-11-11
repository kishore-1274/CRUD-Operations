package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable")
public class Student {
@Id
private Long rollno;
private String name;
private String section;
private String email;
private double percentage;
public Long getRollno() {
	return rollno;
}
public void setRollno(Long rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", section=" + section + ", email=" + email
			+ ", percentage=" + percentage + "]";
}

}
