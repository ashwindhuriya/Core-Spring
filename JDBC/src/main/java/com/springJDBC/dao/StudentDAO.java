package com.springJDBC.dao;

import java.util.List;

import com.springJDBC.entities.Student;

public interface StudentDAO {
	public int insert(Student student);
	public int update(Student student);
	public int delete(int studentId);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
}
