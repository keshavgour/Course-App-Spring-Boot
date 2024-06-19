package com.springrest.courseSpringRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.courseSpringRest.entity.Course;
import com.springrest.courseSpringRest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable long courseId)
	{
		return courseService.getCourse(courseId);
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return courseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course saveOrUpdateCourse(@RequestBody Course course)
	{
		return courseService.saveOrUpdateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public String deleteCourse(@PathVariable long courseId)
	{
		courseService.deleteCourse(courseId);
		return "deleted";
	}
}
