package com.openapi.com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.openapi.com.Exception.StudentException;
import com.openapi.com.Exception.UserException;
import com.openapi.com.Model.Student;

import com.openapi.com.Service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
@Slf4j
public class StudentController {
    @Autowired  
	private StudentService uService;
   
	@PostMapping(value = "/users")
	public ResponseEntity<Student> addUser(@RequestBody Student user) throws UserException {
		return new ResponseEntity<Student>(uService.addUser(user),HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateUserHandler(@RequestBody Student user,@RequestParam String key) throws UserException {
		Student u=uService.updateUser(user,key);
		return new ResponseEntity<Student>(u,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("delete/{userId}")
	public ResponseEntity<Student> deleteUserHandler(@PathVariable("userId") Integer userId,@RequestParam String key) throws UserException {
		Student u=uService.deleteUser(userId, key);
		return new ResponseEntity<Student>(u,HttpStatus.ACCEPTED);
	}
	@GetMapping("/view/{userId}/{key}")
	public ResponseEntity<Student> viewUserHandler(@PathVariable("userId") Integer userId,@RequestParam String key) throws UserException {
		Student u=uService.viewUser(userId,key);
		return new ResponseEntity<Student>(u,HttpStatus.FOUND);
	}
	
	@GetMapping("/viewall")
	public ResponseEntity<List<Student>> viewAllUsersHandler(@RequestParam String key) throws UserException {
		List<Student> users=uService.viewAllUsers(key);
		return new ResponseEntity<List<Student>>(users,HttpStatus.FOUND);
	}
}
