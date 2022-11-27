package ManyToMany_Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		e1.setEid(1);
		e1.setEname("RAM");
		
		e2.setEid(2);
		e2.setEname("LAKSHMAN");
		
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setPid(12345);
		p1.setPname("JAVA DEVP");
		
		p2.setPid(54321);
		p2.setPname("PYTHON DEVELOPER");
		
		List<Emp> list1=new ArrayList<Emp>();
		List<Project> list2=new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.setEmp(list1);
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}