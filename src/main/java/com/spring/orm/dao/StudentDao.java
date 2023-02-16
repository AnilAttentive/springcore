package com.spring.orm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.spring.orm.Student;

import jakarta.persistence.PersistenceUnit;

@Service
public class StudentDao {

    @Autowired
    @PersistenceUnit
	private HibernateTemplate hibernateTemplate;
	public int insert(Student student) {
       Integer r=(Integer)  this.hibernateTemplate.save(student);
         System.out.print("added");
         return r ;
    }
	
	public StudentDao() {
		// TODO Auto-generated constructor stub
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}
	

 
	
	
}

