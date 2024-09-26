package com.springORM.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springORM.entities.Student;

public class StudentDAO {
	
	private HibernateTemplate hbTemplate;
	
	public StudentDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentDAO(HibernateTemplate hbTemplate) {
		super();
		this.hbTemplate = hbTemplate;
	}
	
	public HibernateTemplate getHbTemplate() {
		return hbTemplate;
	}
	
	public void setHbTemplate(HibernateTemplate hbTemplate) {
		this.hbTemplate = hbTemplate;
	}

	// Insertion
	@Transactional
	public int insertStudent(Student student) {
		return (Integer) this.hbTemplate.save(student);
	}
	
	// get single entity data
	public Student getStudent(int studentId) {
		return this.hbTemplate.get(Student.class, studentId);
	}
	
	// get all entity data
	public List<Student> getAllStudents() {
		return this.hbTemplate.loadAll(Student.class);
	}
	
	// update entity data
	@Transactional
	public void updateStudent(Student student) {
		this.hbTemplate.update(student);
	}
	
	//delete entity data
	@Transactional
	public void deleteStudent(int studentId) {
		Student stud = this.getStudent(studentId);
		this.hbTemplate.delete(stud);
	}
}
