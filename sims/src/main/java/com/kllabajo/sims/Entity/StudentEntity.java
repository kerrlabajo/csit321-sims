package com.kllabajo.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_students")
public class StudentEntity {
	
	//KERR LABAJO
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String course;
	private int yearlevel;
	
	public StudentEntity() {}
	
	//define constructor
	public StudentEntity(int id, String firstname, String lastname, String course, int yearlevel) {
		super();
		setId(id);
		setFirstName(firstname);
		setLastName(lastname);
		setCourse(course);
		setYearLevel(yearlevel);
	}

	//define getter and setter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYearLevel() {
		return yearlevel;
	}

	public void setYearLevel(int yearlevel) {
		this.yearlevel = yearlevel;
	}
	
}
