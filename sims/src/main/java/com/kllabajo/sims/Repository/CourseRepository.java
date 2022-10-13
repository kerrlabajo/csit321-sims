package com.kllabajo.sims.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kllabajo.sims.Entity.CourseEntity;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer>{

	//user-defined query
	CourseEntity findByCoursename(String course);
}
