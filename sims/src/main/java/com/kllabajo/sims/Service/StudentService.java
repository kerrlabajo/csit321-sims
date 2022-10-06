package com.kllabajo.sims.Service;

import java.util.List;

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
    
}
