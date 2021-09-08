package com.csi.hibernatebasic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service {
	public static SessionFactory factory = new Configuration().configure().buildSessionFactory();
public static void main(String[] args) {
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	Employee e1 = new Employee();
	e1.setEmpName("MAHESH");
	e1.setEmpSalary(60000.00);
	session.save(e1);
	transaction.commit();
}
}


