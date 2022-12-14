package com.kllabajo.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kllabajo.sims.Entity.CourseEntity;
import com.kllabajo.sims.Repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepo;
	
	public List<CourseEntity> getAllCourses(){
		return courseRepo.findAll();
	}
	
    public CourseEntity insertCourse(CourseEntity course) {
        return courseRepo.save(course);
    }
    
    public CourseEntity findByCode(String course) {
        if (courseRepo.findByCode(course) != null)
            return courseRepo.findByCode(course);
        else
            return null;
    }
    
  //update course record
    public CourseEntity putCourse(int id, CourseEntity newCourseDetails) throws Exception {
        CourseEntity course = new CourseEntity();
        
        try {
            course = courseRepo.findById(id).get();
            
            course.setCode(newCourseDetails.getCode());
            course.setDescription(newCourseDetails.getDescription());
            course.setUnit(newCourseDetails.getUnit());
            
            return courseRepo.save(course);
        }catch(NoSuchElementException nex) {
            //throws an error if the id does not exist
            throw new Exception("ID Number "+ id + " does not exist!");
        }
    }
    
    public String deleteCourse(int id) {
        if(courseRepo.findById(id) != null) {
        	courseRepo.deleteById(id);
            return "Course ID Number " + id + " was successfully deleted!";
        }
        return "Course ID Number " + id + " was NOT found!";
    }
}
