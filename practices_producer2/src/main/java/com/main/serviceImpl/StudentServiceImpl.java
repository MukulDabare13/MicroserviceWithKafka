package com.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.main.model.KafkaConstants;
import com.main.model.Student;
import com.main.repository.StudentRepository;
import com.main.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;
	
	@Override
	public Student saveStudent(Student s) {
		
		return sr.save(s);
	}

	
	@KafkaListener (topics = KafkaConstants.TOPIC, groupId = KafkaConstants.GROUP_ID)
	public Student listener(Student s) {
		System.out.println("*****MSG Recieved******" + s );
		sr.save(s);
		return s;
	}

}
