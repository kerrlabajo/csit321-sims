package com.kllabajo.sims.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kllabajo.sims.Entity.StudentEntity;
import com.kllabajo.sims.Repository.StudentRepository;

@Service
public class StudentService {

	/* this class contains all the business logic of your system
	 * Create a student record
	 * Read student record/s by id or firstName
	 * Update a student record
	 * Delete a student
	 */

	@Autowired
	StudentRepository studentRepo;
	
	public List<StudentEntity> getAllStudents(){
		return studentRepo.findAll();
	}
	
    //C - Create or insert a student record
    public StudentEntity insertStudent(StudentEntity student) {
        return studentRepo.save(student);
    }
    
    //R - Read or search student record by Firstname
    public StudentEntity findByFirstname(String firstname) {
        if (studentRepo.findByFirstname(firstname) != null)
            return studentRepo.findByFirstname(firstname);
        else
            return null;
    }
    
  //update student record
    public StudentEntity putStudent(int id, StudentEntity newStudentDetails) throws Exception {
        StudentEntity student = new StudentEntity(); //creating an instance of student
        
        try {
            //Search the ID number of the student
            student = studentRepo.findById(id).get();
            
            //update the record
            student.setCourse(newStudentDetails.getCourse());
            student.setYearLevel(newStudentDetails.getYearLevel());
            
            //Save the information and return the value
            return studentRepo.save(student);
        }catch(NoSuchElementException nex) {
            //throws an error if the id does not exist
            throw new Exception("ID Number "+ id + " does not exist!");
        }
    }
    
    public String deleteStudent(int id) {
        if(studentRepo.findById(id) != null) {
        	studentRepo.deleteById(id); //find the id number of the student to be deleted
            return "Student ID Number " + id + " was successfully deleted!";
        }
        return "Student ID Number " + id + " was NOT found!";
    }
}
