package com.example.student.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "course_id")
	private String courseId;
	@Column(name = "course_name")
	private String courseName;
	@Column(name = "course_desc")
	private String courseDesc;
	@Column(name = "course_fee")
	private int courseFee;
	@Column(name = "course_resource")
	private String courseResource;
	
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	public String getCourseResource() {
		return courseResource;
	}
	public void setCourseResource(String courseResource) {
		this.courseResource = courseResource;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
