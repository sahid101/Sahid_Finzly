package com.Operation;

import com.common.hibernateConfig;
import com.entity.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class ClientEq {
    public static void main(String[] args) {
//        Configuration cfg = new Configuration();
//        cfg.configure();
//        cfg.addAnnotatedClass(Employee.class);
//        SessionFactory sf = hibernateConfig.getSessionFactory();

        SessionFactory sf = hibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.eq("profile","Developer"));
        List<Employee> employee = criteria.list();
        for (Employee e: employee) {
            System.out.println(e.getName()+" "+e.getSalary());
        }
        tr.commit();
    }
}
