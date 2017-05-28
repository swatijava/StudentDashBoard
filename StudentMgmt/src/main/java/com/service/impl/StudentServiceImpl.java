package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDAO;
import com.model.Student;
import com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired 
	private StudentDAO studentDao;
	@Transactional
	public void addStudent(Student student) {
		studentDao.addStudent(student);

	}

	@Transactional
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);

	}

	@Transactional
	public void deleteStudent(int studentId) {
		studentDao.deleteStudent(studentId);

	}

	@Transactional
	public Student getStudent(int studentId) {
		return studentDao.getStudent(studentId);
	}

	@Transactional
	public Student getStudent(int studentId, String coursename) {
		return studentDao.getStudent(studentId, coursename);
	}

	@Transactional
	public Student getStudent(int studentId, String coursename,
			String university) {
		return studentDao.getStudent(studentId, coursename, university);
	}

	@Transactional
	public List getAllStudent() {
		
		return studentDao.getAllStudent();
	}

}
