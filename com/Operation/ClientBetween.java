package com.Operation;

import com.common.hibernateConfig;
import com.entity.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class ClientBetween {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.between("id",2,10));
        List<Employee> employees = criteria.list();
        for (Employee e:employees) {
            System.out.println(e.getId()+" -> "+e.getName()+" -> "+e.getSalary());
        }
        tr.commit();
    }
}
