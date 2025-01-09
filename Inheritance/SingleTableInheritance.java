package com.inheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SingleTableInheritance {
    public static void main(String[] args) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setName("Shobhit");

        RegularEmployee regularEmployee = new RegularEmployee();
        regularEmployee.setName("Veer");
        regularEmployee.setSalary(10000000);
        regularEmployee.setBonus(100000);

        ContractEmployee contractEmployee = new ContractEmployee();
        contractEmployee.setName("Arjun");
        contractEmployee.setPayPerHour(5000);
        contractEmployee.setDuration("6 months");

        session.save(employee);
        session.save(regularEmployee);
        session.save(contractEmployee);

        transaction.commit();
        session.close();
    }
}
