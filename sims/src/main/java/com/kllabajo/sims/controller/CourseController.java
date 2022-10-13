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

import com.kllabajo.sims.Entity.CourseEntity;
import com.kllabajo.sims.Service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	//printHelloStudent
	@GetMapping("/print")
	public String printHelloStudent() {
		return "Hello, Student!";
	}
	
	//Read
	@GetMapping("/getAllCourses")
	public List<CourseEntity> getAllCourses(){
		return courseService.getAllCourses();
	}
	
	  //Create or insert a student record
    @PostMapping("/postCourse")
    public CourseEntity insertCourse(@RequestBody CourseEntity student) {
        return courseService.insertCourse(student);
    }
  
    //Read a record by Firstname
    @GetMapping("/getByCourse")
    public CourseEntity findByCode(@RequestParam String course) {
        return courseService.findByCode(course);
    }
    
    @PutMapping("/putCourse")
    public CourseEntity putCourse(@RequestParam int id, @RequestBody CourseEntity newCourseDetails) throws Exception {
        return courseService.putCourse(id, newCourseDetails);
    }
    
    @DeleteMapping("/deleteCourse/{id}")
    public String deleteCourse(@PathVariable int id) {
        return courseService.deleteCourse(id);
    }
}
