package com.collectionMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.*;

public class Main {
public static void main(String[] args) {
	System.out.println("Collection Mapping");
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	
	Student student = new Student();
	Student student2 = new Student();
	
	String[] courses = {"Java Full Stack","FrontEnd Development","MERN Stack","Backend Development"};
	String[] courses2 = {"FrontEnd Development","MERN Stack","Backend Development"};
	List<String> skills = new ArrayList<String>();
	skills.add("Java");
	skills.add("ReactJS");
	skills.add("Python");
	skills.add("C++");
	
	List<Integer> marks = new ArrayList<Integer>();
	
	marks.add(55);
	marks.add(78);
	marks.add(45);
	marks.add(95);
	
	student.setName("Prabhu");
	student.setEmail("prabhukumar@gmail.com");
	student.setSkills(skills);
	student.setCourses(courses);
	student.setMarks(marks);
	
	student2.setName("Aryan");
	student2.setEmail("aryan@gmail.com");
	student2.setSkills(skills);
	student2.setCourses(courses2);
	student2.setMarks(marks);
	
	session.save(student);
	session.save(student2);
	
	tx.commit();
	System.out.println("Data Saved!");
	session.close();
	factory.close();
}
}
