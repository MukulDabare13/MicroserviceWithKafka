package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.main.model.Student;
import com.main.service.StudentService;

@RestController
public class HomeController {

	@Autowired
	RestTemplate rt;
	@Autowired
	StudentService ss;

	@Autowired
	KafkaTemplate<String, Student> kafkaTemplate;

	@GetMapping("/getAllStudent")
	public ResponseEntity<Iterable> getAllStudent() {
		String url = "http://zuul/get/getAllStudent";
		return rt.getForEntity(url, Iterable.class);
	}

	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student s) {
		String url = "http://zuul/save/saveStudent";
		ResponseEntity<Student> stu = rt.postForEntity(url, s, Student.class);
		return stu;
	}

	@PostMapping("/kafkaSave")
	public ResponseEntity<Student> kafkaSaveStudent(@RequestBody Student s) {
		
             ss.add(s);
		return new ResponseEntity<Student>(s, HttpStatus.OK);
	}

}
