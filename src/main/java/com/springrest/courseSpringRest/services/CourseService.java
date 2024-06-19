package com.springrest.courseSpringRest.services;

import java.util.List;

import com.springrest.courseSpringRest.entity.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course saveOrUpdateCourse(Course course);
	public void deleteCourse(long courseId);
}
