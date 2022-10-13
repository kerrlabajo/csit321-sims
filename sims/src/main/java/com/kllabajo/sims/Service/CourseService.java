package com.kllabajo.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kllabajo.sims.Entity.CourseEntity;
import com.kllabajo.sims.Repository.CourseRepository;

@Service
public class CourseService {

	/* this class contains all the business logic of your system
	 * Create a course record
	 * Read course record/s by id or firstName
	 * Update a course record
	 * Delete a course
	 */

	@Autowired
	CourseRepository courseRepo;
	
	public List<CourseEntity> getAllCourses(){
		return courseRepo.findAll();
	}
	
    //C - Create or insert a course record
    public CourseEntity insertCourse(CourseEntity course) {
        return courseRepo.save(course);
    }
    
    //R - Read or search course record by Firstname
    public CourseEntity findByCode(String course) {
        if (courseRepo.findByCode(course) != null)
            return courseRepo.findByCode(course);
        else
            return null;
    }
    
  //update course record
    public CourseEntity putCourse(int id, CourseEntity newCourseDetails) throws Exception {
        CourseEntity course = new CourseEntity(); //creating an instance of course
        
        try {
            //Search the ID number of the course
            course = courseRepo.findById(id).get();
            
            //update the record
            course.setDescription(newCourseDetails.getDescription());
            course.setUnit(newCourseDetails.getUnit());
            
            //Save the information and return the value
            return courseRepo.save(course);
        }catch(NoSuchElementException nex) {
            //throws an error if the id does not exist
            throw new Exception("ID Number "+ id + " does not exist!");
        }
    }
    
    public String deleteCourse(int id) {
        if(courseRepo.findById(id) != null) {
        	courseRepo.deleteById(id); //find the id number of the course to be deleted
            return "Course ID Number " + id + " was successfully deleted!";
        }
        return "Course ID Number " + id + " was NOT found!";
    }
}
