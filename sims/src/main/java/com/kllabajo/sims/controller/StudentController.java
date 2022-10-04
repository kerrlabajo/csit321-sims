package com.kllabajo.sims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kllabajo.sims.Entity.StudentEntity;
import com.kllabajo.sims.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	//printHelloStudent
	@GetMapping("/print")
	public String printHelloStudent() {
		return "Hello, Student!";
	}
	
	//Read
	@GetMapping("/displayAllStudents")
	public List<StudentEntity> getAllStudents(){
		return studentService.getAllStudents();
	}
}
