package com.springJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.dao.StudentDAO;
import com.springJDBC.dao.StudentDAOImpl;
import com.springJDBC.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program is Running ! ..." );
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDAO studentImpl = context.getBean("studentDao", StudentDAO.class);
        
        // Insert
        
//        Student stud = new Student();
//        stud.setId(2342);
//        stud.setName("Harsh");
//        stud.setCity("Mumbai");
//        
//        int result = studentImpl.insert(stud);
//        
//        System.out.println("Number of record inserted ... " + result);
        
        // Update
        
//        Student stud = new Student();
//        stud.setId(2342);
//        stud.setName("Harsh T");
//        stud.setCity("New Mumbai");
//        
//        int result = studentImpl.update(stud);
//        
//        System.out.println("Number of record updated ... " + result);
        
        // Delete
        
//        int result = studentImpl.delete(2342);
        
        // Select
        
//        Student st = studentImpl.getStudent(23452);
        
        // Select all students
        
        List<Student> students = studentImpl.getAllStudents();
        for(Student stud: students) {
        	System.out.println(stud);
        }
        
//        System.out.println("Student Data ... " + st);
    }
}
