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
}
