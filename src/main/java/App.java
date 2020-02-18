import dev4money.entities.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;

import dev4money.dao.*;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import dev4money.interfaces.*;

public class App {
	public static void main(String[] args) {
		
//		#####  Hibernate util
		Country c = new Country("Uganda", "Africa","UGS","William Ruto", 256);
		CountryDao country = new CountryDao();
		country.Create(c);
		country.Update(c, Long.valueOf(20));
		country.FindAll().forEach(items -> System.out.println(items.getId() + " | " + items.getContinent()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Play p = new Play();
//		Activity p = new Eat();
//		p.Start();
//		p.Continue();
//		p.End();
//######Spring IoC
//		ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
//		Play p = a.getBean(Play.class);
//		p.Start();
//		p.Continue();
//		p.End();
//##### Spring IOC with Interface
//		ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
//		Activity ac = a.getBean("activity", Activity.class);
//		ac.Start();
//		ac.Continue();
//		ac.End();
	}
}
