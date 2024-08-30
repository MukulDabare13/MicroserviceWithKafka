package com.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Student;
import com.main.repository.StudentRepository;
import com.main.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository sr;
	
	@Override
	public Iterable<Student> getAllStudent() {
		
		return sr.findAll();
	}

}
