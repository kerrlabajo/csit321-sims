package com.kllabajo.sims.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_courses")
public class CourseEntity {
	
	//KERR LABAJO
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String description;
	private int unit;
	
	@OneToMany(cascade = CascadeType.MERGE)
	private Set<StudentEntity> student;
	
	public CourseEntity() {}

	public CourseEntity(int id, String code, String description, int unit, Set<StudentEntity> student) {
		super();
		setId(id);
		setCode(code);
		setDescription(description);
		setUnit(unit);
		setStudent(student);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public Set<StudentEntity> getStudent() {
		return student;
	}

	public void setStudent(Set<StudentEntity> student) {
		this.student = student;
	}
	
	
	
	
}
