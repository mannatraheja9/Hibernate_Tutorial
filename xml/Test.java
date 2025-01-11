package com.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration(). configure().buildSessionFactory();

        Person person1 = new Person(1, "Shobhit");

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(person1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
