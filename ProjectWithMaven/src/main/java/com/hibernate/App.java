package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       UserDetails user = new UserDetails();
       user.setUsername("Kri$na");
       
       Address addr= new Address();
       addr.setStreet("Lahore");
       addr.setState("Pakistan");
       addr.setCity("Aslamabaad");
       addr.setPincode("4202015");
       user.setAddress(addr);
       
       Address addr2= new Address();
       addr2.setStreet("Brahmanpipla");
       addr2.setState("India");
       addr2.setCity("nagpur");
       addr2.setPincode("480108");
       user.setOfficeAddress(addr2);
       
       
       
       SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
       Session session = sessionFactory.openSession();
       session.beginTransaction();
       session.save(user);
       session.getTransaction().commit();
       session.close();
     
    }
}
