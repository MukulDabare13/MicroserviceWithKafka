package com.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.main.model.KafkaConstants;
import com.main.model.Student;

@Service("studentService")
public class StudentService {

	@Autowired
	KafkaTemplate<String, Student> kafkaTemplate;
	
	public String add(Student s) {
		
		kafkaTemplate.send(KafkaConstants.TOPIC, s);
		System.out.println("****MSG Published******");
		return "Student record added to kafka";
	}
}
