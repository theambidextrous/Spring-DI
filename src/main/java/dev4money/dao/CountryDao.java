package dev4money.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dev4money.entities.Country;
import dev4money.utility.HibernateUtil;

public class CountryDao {
	public boolean Create(Country country) {
		try( Session s = new HibernateUtil().getSessionFactory().openSession()){
			Transaction t = s.beginTransaction();
			s.save(country);
			t.commit();
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean Update(Country country, Long Id) {
		try( Session s = new HibernateUtil().getSessionFactory().openSession()){
			country.setId(Id);
			Transaction t = s.beginTransaction();
			s.update(country);
			t.commit();
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public List <Country> FindAll() {
		try( Session s = new HibernateUtil().getSessionFactory().openSession()){
			return s.createQuery("from Country", Country.class).list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
