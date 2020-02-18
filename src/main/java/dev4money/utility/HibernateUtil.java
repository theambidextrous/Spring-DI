package dev4money.utility;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import dev4money.classes.*;
import dev4money.entities.*;

public class HibernateUtil {
	private static SessionFactory sf;
	public SessionFactory getSessionFactory() {
		if(sf == null ) {
			try {
				Configuration c = new Configuration();
				Properties p = new Properties();
				p.put(Environment.DRIVER, "org.postgresql.Driver");
				p.put(Environment.URL, "jdbc:postgresql://localhost:5432/javalearn");
				p.put(Environment.USER, "postgres");
				p.put(Environment.PASS, "postgres");
				p.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
				p.put(Environment.SHOW_SQL, "true");
				p.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				p.put(Environment.HBM2DDL_AUTO, "update");
				c.setProperties(p);
				c.addAnnotatedClass(Play.class);
				c.addAnnotatedClass(Eat.class);
				c.addAnnotatedClass(Dig.class);
				c.addAnnotatedClass(Country.class);
				ServiceRegistry s = new StandardServiceRegistryBuilder().applySettings(c.getProperties()).build();
				sf = c.buildSessionFactory(s);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sf;
	}
}
