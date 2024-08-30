package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Student;
import com.main.service.StudentService;

@RestController
public class ProducerController {
	@Autowired
	StudentService ss;
	

	@GetMapping ("/get")
	public String get() {
		return "Hello";
	}
	@GetMapping("/getAllStudent")
	public ResponseEntity<Iterable<Student>>  getAllStudent(){
		Iterable<Student> allStudent = ss.getAllStudent();
		return  new ResponseEntity<Iterable<Student>>(allStudent, HttpStatus.OK);
	}
}
