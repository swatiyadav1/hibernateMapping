package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
	
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		
		Session session=factory.getCurrentSession();
		
		try {
			Student tempStudent=new Student("paul","wall","palu@uni.com");
			session.beginTransaction();
			session.save(tempStudent);
			session.getTransaction().commit();
			System.out.println("done!!!");
			
			
			
			
		}
		finally {
			factory.close();
		}
		
	}

}
