package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();

		Question q1 = new Question();
		q1.setId(1);
		q1.setQuestion("What is Java?");

		Answer a1 = new Answer();
		a1.setId(1);
		a1.setAnswer("Java is a programming Language.");
		q1.setAnswer(a1);
		
		a1.setQuestion(q1);
		

		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		session.save(a1);
		
		tx.commit();
		
		Question q=session.get(Question.class, 1);
		System.out.println(q.getId());
		System.out.println(q.getAnswer().getAnswer());
		System.out.println(q.getQuestion());
		

		session.close();
		factory.close();
	}
}
