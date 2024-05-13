package com.spring.hibernate.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.hibernate.entities.Student;

public class StudentDao {
	
	
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	private HibernateTemplate hibernateTemplate;
	
	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	//save student
	public int insert(Student student) {
		
		//insert 
		Integer i=(Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	
	
	
}
