package com.example.jpacruddemostudent.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpacruddemostudent.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class StudentDAOImpl implements StudentDAO {

//	 define field for EntityManager
	private EntityManager entityManager;

//	inject entity manager using constructor injection
	public StudentDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

// implement save method
	@Override
	@Transactional
	public void save(Student theStudent) {
		entityManager.persist(theStudent);
	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName desc", Student.class);
		return theQuery.getResultList();
	}

	@Override
	public List<Student> findByLastName(String theLastName) {
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student where lastName=:theData", Student.class);
		theQuery.setParameter("theData", theLastName);
		return theQuery.getResultList();
	}

	@Override
	@Transactional
	public void update(Student theStudent) {
		entityManager.merge(theStudent);
	}
}
