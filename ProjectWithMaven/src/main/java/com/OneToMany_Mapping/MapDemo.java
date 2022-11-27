package com.OneToMany_Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class MapDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// creating question;
		Question q1 = new Question();
		q1.setQuestionId(1234);
		q1.setQuestion("Who is Indal?");

		// creating Answer;
		Answer a1 = new Answer();
		a1.setAnswerId(161);
		a1.setAnswer("He is a JAVA DEVELOPER");
		a1.setQuestion(q1);
		
		// creating Answer;
				Answer a2 = new Answer();
				a2.setAnswerId(123);
				a2.setAnswer("As well as good in communiation");
				a2.setQuestion(q1);
				
				// creating Answer;
				Answer a3 = new Answer();
				a3.setAnswerId(145);
				a3.setAnswer("handling tough sceneriod");
				a3.setQuestion(q1);
				
				
				
				List<Answer> list=new ArrayList<Answer>();
				list.add(a1);
				list.add(a2);
				list.add(a3);
				
				
				q1.setAnswers(list);			
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(q1);
		
		Question q= session.get(Question.class,1234);
		
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswers().size());
		
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
