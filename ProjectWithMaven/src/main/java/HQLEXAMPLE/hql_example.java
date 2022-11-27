package HQLEXAMPLE;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mysql.cj.xdevapi.Statement;

import ManyToMany_Mapping.Emp;

public class hql_example {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		//HQL
		//SYYNTAX:
		String query="from Emp";
		Query q = s.createQuery(query);
		
		//single-(unique)
		//multiple-List
		List <Emp> list = q.list(); 
		
		for(Emp e:list){
			System.out.println(e.getEname());
			
		}
		
		s.close();
		factory.close();
	}
}
