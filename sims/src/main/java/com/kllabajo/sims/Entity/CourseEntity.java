package com.kllabajo.sims.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	public CourseEntity() {}
	
	//define constructor
	public CourseEntity(int id, String code, String description, int unit) {
		super();
		//this.id = id;
		//this.code = code;
		setDescription(description);
		setUnit(unit);
	}

	public int getId() {
		return id;
	}

	/*
	 * public void setId(int id) { this.id = id; }
	 */

	public String getCode() {
		return code;
	}

	/*
	 * public void setCode(String code) { this.code = code; }
	 */

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

	//define getter and setter methods
	
	
}
