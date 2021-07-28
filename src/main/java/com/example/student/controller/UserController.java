package com.example.student.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.student.model.User;
import com.example.student.repository.UserRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(){
		List<User> users= userRepository.findAll();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		Date date=new Date();
		user.setRegDate(date);
		user=userRepository.save(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}


}
