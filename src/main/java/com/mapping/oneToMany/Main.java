package com.mapping.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
	public static void main(String[] args) {
		System.out.println("One to Many Mapping using Hibernate!");
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("Prabhu");
		p1.setEmail("prabhukumar@gmail.com");
		p1.setColor("White");
		
		Address a1 = new Address();
		a1.setId(1);
		a1.setAddress("C-20 New Ashok Nagar");
		a1.setPerson(p1);
		p1.setAddress_Id(a1);
		session.save(p1);
		session.save(a1);
		
		tx.commit();
		
		
		session.close();
		factory.close();
		
		
	}
}
