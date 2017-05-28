package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("index")
	public String setupForm (Map<String, Object> map){
		Student student = new Student();
		map.put("student", student);
		map.put("studentList", studentService.getAllStudent());
		return "student";
	}
	
	@RequestMapping (value="student.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Student student, BindingResult result, @RequestParam String action, Map<String, Object> map){
		Student studentResult = new Student();
		switch(action.toLowerCase()){
		case "add" :
			studentService.addStudent(student);
			studentResult = student;
			break;
		case "update" :
			studentService.updateStudent(student);
			studentResult = student;
			break;
		case "delete" :
			studentService.deleteStudent(student.getsId());
			studentResult = student;
			break;
		case "search" :
			Student searchedStud = studentService.getStudent(student.getsId());
			studentResult = searchedStud!=null? searchedStud:new Student();
			break;
		case "searchByStdCourse" :
			Student searchedCourseStud = studentService.getStudent(student.getsId(),student.getCoursename());
			studentResult = searchedCourseStud!=null? searchedCourseStud:new Student();
			break;
		case "searchByStdCourseUni" :
			Student searchedUniStud = studentService.getStudent(student.getsId(),student.getCoursename(), student.getUniversity());
			studentResult = searchedUniStud!=null? searchedUniStud:new Student();
			break;
			
		}
		map.put("student", studentResult);
		map.put("studentList", studentService.getAllStudent());
		return "student";
	}
}
