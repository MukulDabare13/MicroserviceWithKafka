package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id")
	@GenericGenerator(name = "student_id", strategy = "com.main.model.StringPrefixSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = StringPrefixSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "STU"),
			@Parameter(name = StringPrefixSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d"),

	})
	private String rollno;
	private String name;
	private String username;
	private String password;

	public String getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
