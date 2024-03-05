package com.jdbc.student.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
 @Repository
public class StudDAOImpl implements StudentDAO {
	
	private EntityManager entitymanager;
	@Autowired
	public StudDAOImpl(EntityManager theEntity) {
		 entitymanager=theEntity;
		
	}

	@Override
	@Transactional
	public void save(Student thestudent) {
		entitymanager.persist(thestudent);
		
	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return entitymanager.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<Student> thequery = entitymanager.createQuery("FROM Student",Student.class);
		
		return thequery.getResultList();
	}

	@Override
	public List<Student> findByLn(String lastName) {
		// TODO Auto-generated method stub
		TypedQuery<Student> queryLn=entitymanager.createQuery("FROM Student WHERE lastName=:LN",Student.class);
		queryLn.setParameter("LN",lastName);
		return queryLn.getResultList();
	}

	@Override
	@Transactional
	public void update(Student thestudent) {
		entitymanager.merge(thestudent);
	}
    @Transactional
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Student students=entitymanager.find(Student.class, id);
		entitymanager.remove(students);
	}

	@Override
	@Transactional
	public int deleteall() {
		int querydel=entitymanager.createQuery("DELETE FROM Student").executeUpdate();
		return querydel;
		// TODO Auto-generated method stub
		
	}
;
	

	
}
