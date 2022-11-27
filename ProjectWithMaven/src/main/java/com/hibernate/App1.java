package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App1 {

	public static void main(String[] args) throws IOException {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Address1 ad= new Address1();
		ad.setStreet("street 1");
		ad.setCity("Delhi");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.456);
		
		FileInputStream f1= new FileInputStream("src/main/java/car.png");
		byte[] data=new byte[f1.available()];
		f1.read(data);
		ad.setImage(data);
		
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(ad);
		session.getTransaction().commit();
		session.close();
		System.out.println("DONE");
		



}
}