package com.kllabajo.sims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kllabajo.sims.Entity.StudentEntity;
import com.kllabajo.sims.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	//printHelloStudent
	@GetMapping("/print")
	public String printHelloStudent() {
		return "Hello, Student!";
	}
	
	//Read
	@GetMapping("/getAllStudents")
	public List<StudentEntity> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	  //Create or insert a student record
    @PostMapping("/postStudent")
    public StudentEntity insertStudent(@RequestBody StudentEntity student) {
        return studentService.insertStudent(student);
    }
  
    //Read a record by Firstname
    @GetMapping("/getByFirstname")
    public StudentEntity findByFirstname(@RequestParam String firstname) {
        return studentService.findByFirstname(firstname);
    }
    
    @PutMapping("/putStudent")
    public StudentEntity putStudent(@RequestParam int id, @RequestBody StudentEntity newStudentDetails) throws Exception {
        return studentService.putStudent(id, newStudentDetails);
    }
    
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}
