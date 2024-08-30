package com.main.service;

import org.springframework.stereotype.Service;

import com.main.model.Student;
@Service
public interface StudentService {

	public Student saveStudent(Student s);
	
	
}
