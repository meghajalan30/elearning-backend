package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.student.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{

}
