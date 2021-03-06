package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {

	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int studentId);
	public Student getStudent(int studentId);
	public Student getStudent(int studentId, String coursename);
	public Student getStudent(int studentId, String coursename, String university);
	public List getAllStudent();
}
