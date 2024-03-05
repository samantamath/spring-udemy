package com.springdemo.cruddemo.dao;

import com.springdemo.cruddemo.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student theStudent);
    Student findByID(Integer id);

    List<Student> findAll();

    List<Student> findByLastname(String lastname);

    void delete(Integer id);

}
