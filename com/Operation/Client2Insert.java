package com.Operation;

import com.common.hibernateConfig;
import com.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client2Insert {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Employee e = new Employee();
        e.setId(8);
        e.setProfile("devops");
        e.setSalary("45000");
        e.setName("samuel");
        session.save(e);
        System.out.println("Inserted.");
        tr.commit();

    }
}
