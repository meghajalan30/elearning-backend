package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.model.Course;
import com.example.student.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
