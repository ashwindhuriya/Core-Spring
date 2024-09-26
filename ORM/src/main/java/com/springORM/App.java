package com.springORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.dao.StudentDAO;
import com.springORM.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDAO student = context.getBean("student", StudentDAO.class);
        
//        Student stud = new Student(24533, "Pranav C", "Goa");
//        int result = student.insertStudent(stud);
//        
//        System.out.println("Student Inserted..." + result);
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean flag = true;
        
        while(flag) {
        	System.out.println("PRESS 1 to add new student");
            System.out.println("PRESS 2 to display all students");
            System.out.println("PRESS 3 to get details of single student");
            System.out.println("PRESS 4 to delete students");
            System.out.println("PRESS 5 to update student");
            System.out.println("PRESS 6 for exit");
            
            try {
            	
            	int input = Integer.parseInt(br.readLine());
            	
            	switch (input) {
				case 1:
					// add new student
					System.out.println("Enter user Id");
					int uId = Integer.parseInt(br.readLine());
					
					System.out.println("Enter user name");
					String userName = br.readLine();
					
					System.out.println("Enter user city");
					String userCity = br.readLine();
					
					Student st = new Student();
					st.setStudentId(uId);
					st.setStudentName(userName);
					st.setStudentCity(userCity);
					
					int studId = student.insertStudent(st);
					System.out.println(studId + " student added!");
					System.out.println("----------------------------------");
					System.out.println();
					
					break;
				case 2:
					// display all student
					System.out.println("++++++++++++++++++++++++++++++++++");
					List<Student> students = student.getAllStudents();
					for(Student stud: students) {
						System.out.println("Id " + stud.getStudentId());
						System.out.println("Name " + stud.getStudentName());
						System.out.println("City " + stud.getStudentCity());
						System.out.println("--------------------------------");
					}
					System.out.println("++++++++++++++++++++++++++++++++++");
					break;
					
				case 3:
					// get details of single student
					System.out.println("Enter user Id");
					int userId = Integer.parseInt(br.readLine());
					
					Student studDetails = student.getStudent(userId);
					
					System.out.println("--------------------------------");
					System.out.println("Id " + studDetails.getStudentId());
					System.out.println("Name " + studDetails.getStudentName());
					System.out.println("City " + studDetails.getStudentCity());
					System.out.println("--------------------------------");
					break;
				
				case 4:
					// delete students
					// get details of single student
					System.out.println("Enter user Id");
					int usersId = Integer.parseInt(br.readLine());
					student.deleteStudent(usersId);
					System.out.println("Student deleted ... ");
					break;
				
				case 5:
					// update student
					break;
					
				case 6:
					// exit
					flag = false;
					break;
					
				default:
					break;
				}
            	
            } catch(Exception e) {
            	System.out.println("Invalid Input!");
            	System.out.println(e.getMessage());
            }
        }
        
        System.out.println("Thank you! See you soon");
    }
}
