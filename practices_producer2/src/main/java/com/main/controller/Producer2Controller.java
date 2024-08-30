package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.KafkaConstants;
import com.main.model.Student;
import com.main.service.StudentService;

@RestController
public class Producer2Controller {

	@Autowired
	StudentService ss;
	
	@PostMapping(value = "/saveStudent")
    public ResponseEntity<Student> saveStudent(@RequestBody Student s){
		System.out.println("In Producer2SaveMethod");
		Student student = ss.saveStudent(s);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
	
//	@GetMapping("/kafkaListener")
//	@KafkaListener (topics = KafkaConstants.TOPIC, groupId = KafkaConstants.GROUP_ID)
//	public ResponseEntity<Student> kafkaSaveStudent(Student s){
//		System.out.println("In Producer2SaveMethod");
//		System.out.println("*****MSG Recieved******"+s);
//		//Student student = ss.saveStudent(s);
//		return new ResponseEntity<Student>(s, HttpStatus.OK);
//		
//	}
	
	
}
