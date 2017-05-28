package com.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.StudentDAO;
import com.model.Student;

@Repository
public class StudentDAOImple implements StudentDAO {

	@Autowired
	private SessionFactory session ;
	@Override
	public void addStudent(Student student) {
		session.getCurrentSession().save(student);

	}

	@Override
	public void updateStudent(Student student) {
		session.getCurrentSession().update(student);

	}

	@Override
	public void deleteStudent(int studentId) {
		session.getCurrentSession().delete(getStudent(studentId));

	}

	@Override
	public Student getStudent(int studentId) {
		return (Student)session.getCurrentSession().get(Student.class, studentId);
		
	}

	@Override
	public Student getStudent(int studentId, String coursename) {
		
		return (Student) session.getCurrentSession().createQuery("from Student where sId="+studentId+ " and coursename ='"+coursename+"'");
	}

	@Override
	public Student getStudent(int studentId, String coursename,
			String university) {
		return (Student) session.getCurrentSession().createQuery("from Student where sId="+studentId+ " and coursename ='"+coursename+"' and university='"+university+"'");
	}

	@Override
	public List getAllStudent() {
		return session.getCurrentSession().createCriteria("from Student").list();
	}

}
