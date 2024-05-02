package com.manytomany;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			Properties properties = new Properties();
			properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate");
			properties.put(Environment.USER, "root");
			properties.put(Environment.PASS, "root");
			properties.put(Environment.HBM2DDL_AUTO, "create");
			properties.put(Environment.SHOW_SQL, true);
			properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");

			cfg.setProperties(properties);
			cfg.addAnnotatedClass(Student.class);
			cfg.addAnnotatedClass(Course.class);

			ServiceRegistry serviceRegisty = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
					.build();
			sessionFactory = cfg.buildSessionFactory(serviceRegisty);
		}
		return sessionFactory;
	}

}
