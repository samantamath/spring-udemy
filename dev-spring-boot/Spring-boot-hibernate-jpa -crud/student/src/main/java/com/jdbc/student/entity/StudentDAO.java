package com.jdbc.student.entity;

import java.util.List;

import jakarta.persistence.Id;

public interface StudentDAO {
	 void save(Student thestudent);
Student findById(Integer id);
List<Student> findAll();
List<Student> findByLn(String lastName);
void update(Student thestudent);
void delete(Integer id);
int deleteall();
}
