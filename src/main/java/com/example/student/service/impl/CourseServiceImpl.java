package com.example.student.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.student.model.Course;
import com.example.student.repository.CourseRepository;
import com.example.student.service.CourseService;


@Service
@Transactional
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public ResponseEntity<Course> saveCourse(Course course) {
		Course result=courseRepository.save(course);
		return new ResponseEntity<Course>(result,HttpStatus.OK);
	}

	
	@Override
	public ResponseEntity<List<Course>> getCourses() {
		List<Course> courseList=new ArrayList<Course>();
		System.out.println("list="+courseRepository.findAll());
		courseList=courseRepository.findAll();
		System.out.println("size= "+courseList.size());
		return new ResponseEntity<List<Course>>(courseList,HttpStatus.OK);
	}

}
