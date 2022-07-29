package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetails;


public class CreateDemo {

	public static void main(String[] args) {
	
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			
			
			
			session.beginTransaction();
			
			
			int theid=1;
			
			Instructor tInst = session.get(Instructor.class, theid);
			
			Course tC1 = new Course("Fundamentals of C");
			Course tC2 = new Course("Fundamentals of C++");
			
			tInst.add(tC1);
			tInst.add(tC2);
			
			session.save(tC1);

			session.save(tC2);
			
			

			session.getTransaction().commit();
			
			
			
			System.out.println("done!!!");
			
			
			
			
		}
		finally {
			factory.close();
		}
		
	}

}
