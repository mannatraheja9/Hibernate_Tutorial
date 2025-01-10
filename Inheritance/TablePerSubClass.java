package com.inheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TablePerSubClass {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("Shobhit");

        RegularEmployee e2 = new RegularEmployee();
        e2.setName("Veer");
        e2.setSalary(10000000);
        e2.setBonus(100000);

        ContractEmployee e3 = new ContractEmployee();
        e3.setName("Arjun");
        e3.setPayPerHour(5000);
        e3.setDuration("6 months");

        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(e3);

        transaction.commit();
        session.close();
    }
}
