package com.example.student.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.student.model.Course;

public interface CourseService {
	
	public ResponseEntity<Course> saveCourse(Course course);
	public ResponseEntity<List<Course>> getCourses();

}
