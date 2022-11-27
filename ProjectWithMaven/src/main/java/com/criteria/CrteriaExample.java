package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;



import ManyToMany_Mapping.Emp;

public class CrteriaExample {
 public static void main(String[] args) {
	
	 Session s = new Configuration().configure().buildSessionFactory().openSession();
	 
	Criteria c= s.createCriteria(Emp.class);
	
	List<Emp> emp=c.list();
	for(Emp u:emp)
	{
		System.out.println(u);
	}
	 
	 
	 s.close();
}
}
