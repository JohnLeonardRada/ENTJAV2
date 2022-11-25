package controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Address;
import model.Student;

public class AccessStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student("1001", "Fulgar", "Christian", 3, "BS CS");
		student1.setAmbition("To graduate and have a very good future");
		student1.setExecDate(new java.util.Date());
		student1.setAddress(new Address("Eastwood greenview, phase 1 blk 7 lot 34 ", "rizal", "NCR", 0001));
		
		Student student2 = new Student("1002", "Hall", "Marty", 2, "BS IT");
		student2.setAmbition("To be the lead Java Evangelist.");
		student2.setExecDate(new java.util.Date());
		student2.setAddress(new Address("Coltsfoot Terraces","Ashburn","VA", 100123));
		
		SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
			
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		
		try {
			if (session != null) {
				transaction = session.beginTransaction();
				session.save(student1);
				session.save(student2);
				transaction.commit();
			} else {
				System.err.println("session is null");
			}
		} catch (HibernateException he) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
}


