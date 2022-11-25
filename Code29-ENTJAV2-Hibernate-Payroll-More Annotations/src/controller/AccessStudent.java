package controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class AccessStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student("1001", "Gosling", "James", 3, "BSCS");
			student1.setAmbition("To create a mighty powerful programming language. The objective"
					+ "is to set the standard as the primary language for OOP and for"
					+ "someone to become a better person.");
			student1.setExecDate(new java.util.Date());
		
		Student student2 = new Student("1002", "Bryant", "Kobe", 2, "BSIT");
			student2.setAmbition("To become a professional NBA basketball player.");
			student2.setExecDate(new java.util.Date());
		
		Student student3 = new Student("1003", "Rada", "John Leonard", 3, "BSCS");
			student3.setAmbition("To become rich.");
			student3.setExecDate(new java.util.Date());
		
		SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
			
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		
		try {
			if(session != null) {
				transaction = session.beginTransaction();
				session.save(student1);
				session.save(student2);
				session.save(student3);
				transaction.commit();
			}else {
				System.err.println("Session is Null");
			}
			
		} catch (HibernateException he) {
			if(transaction != null) {
				transaction.rollback();	
			}
		}
		
	}

}
