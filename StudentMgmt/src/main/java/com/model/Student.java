package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int sId;
	@Column
	private String firstname;
	@Column
	private String lastname;
	
	@Column
	private String coursename;
	@Column
	private String university;
	
	public Student(){}
	public Student(int studentId, String firstname, String lastname,
			int yearLevel,String coursename, String university) {
		super();
		this.sId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.coursename = coursename;
		this.university = university;
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
