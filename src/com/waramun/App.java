package com.waramun;

import java.util.Date;

import org.hibernate.Session;

import com.waramun.FootballPlayer;
import com.waramun.Country;
import com.waramun.HibernateUtil;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Hibernate one to many process start.");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		FootballPlayer player = new FootballPlayer();
		player.setPlayerFname("เวนย์");
		player.setPlayerLname("รูนีย์");
		Date date = java.sql.Date.valueOf("1985-10-24");
		player.setPlayerBirthdate(date);
		
		
//		For set new Country
//		Country country = new Country();
//		country.setCountryName("จีน");
//		session.save(country);
		
//		For set existing Country
		Country country = session.get(Country.class, 1);
		
		
		player.setCountry(country);
		country.getFootballPlayer().add(player);
		
		session.save(player);
		
		session.getTransaction().commit();
		System.out.println("Process end.");
	}

}
