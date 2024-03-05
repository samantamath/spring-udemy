package com.springdemo.cruddemo.dao;

import com.springdemo.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDao {

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);

    }

    @Override
    public Student findByID(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student order by lastname asc", Student.class);
        return theQuery.getResultList();

    }

    @Override
    public List<Student> findByLastname(String lastname) {
        TypedQuery<Student> theQuery1= entityManager.createQuery("From Student Where lastname=:theData", Student.class);
        theQuery1.setParameter("theData",lastname);
        return theQuery1.getResultList();
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Student studtodel=entityManager.find(Student.class,id);
        entityManager.remove(studtodel);
    }
}






