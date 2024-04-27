package com.hibernate5;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = HibernateUtil.getSessionFactory();
        System.out.println(factory);
    }
}
