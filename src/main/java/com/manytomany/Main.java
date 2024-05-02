package com.manytomany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Main {
public static void main(String[] args) {
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Transaction tx = null;
	Session session = factory.openSession();
	
	List<Student> studentList = new ArrayList<Student>();
	
	List<Course> courseList = new ArrayList<Course>();
	
	Student s1 = new Student();
	s1.setId(1);
	s1.setName("Prabhu");
	
	Student s2 = new Student();
	s2.setId(2);
	s2.setName("Aryan");
	
	Course c1 = new Course();
	c1.setCourseId(101);
	c1.setCourseName("Java");
	
	
	Course c2 = new Course();
	c2.setCourseId(201);
	c2.setCourseName("Python");
	
	
	studentList.add(s1);
	studentList.add(s2);
	
	courseList.add(c1);
	courseList.add(c2);
	c1.setStudents(studentList);
	c2.setStudents(studentList);
	
	s1.setCourses(courseList);
	s2.setCourses(courseList);
	
	tx=session.beginTransaction();
	
	session.save(s1);
	session.save(s2);
	session.save(c1);
	session.save(c2);
	
	tx.commit();
	
	
	session.close();
	factory.close();
	
}
}
