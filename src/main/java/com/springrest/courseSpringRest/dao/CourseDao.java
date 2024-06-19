package com.springrest.courseSpringRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.courseSpringRest.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
