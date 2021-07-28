package com.example.student.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Course;
import com.example.student.service.CourseService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getCourses(){
		return courseService.getCourses();
	}
	
	
	@PostMapping("/courses")
	public ResponseEntity<Course> saveCourse(@Valid @RequestBody Course course) {
		return courseService.saveCourse(course);
	}

}
