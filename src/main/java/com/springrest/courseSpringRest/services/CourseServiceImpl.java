package com.springrest.courseSpringRest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.courseSpringRest.dao.CourseDao;
import com.springrest.courseSpringRest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {

		return courseDao.findById(courseId).orElse(null);
	}

	@Override
	public Course addCourse(Course course) {

		return courseDao.save(course);
		  
	}
	
	@Override
	public Course saveOrUpdateCourse(Course course) {
		return courseDao.save(course);
	}

	@Override
	public void deleteCourse(long courseId) {
		Course entity = courseDao.findById(courseId).orElse(null);
			courseDao.delete(entity);
	}

}
