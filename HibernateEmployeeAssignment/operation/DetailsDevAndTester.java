package HibernateEmployeeAssignment.operation;

import HibernateEmployeeAssignment.common.hibernateConfig1;
import HibernateEmployeeAssignment.entity.Employee1;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.Arrays;
import java.util.List;

public class DetailsDevAndTester {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig1.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee1.class);
        List<String> dept = Arrays.asList("tester","developer");
        criteria.add(Restrictions.in("department",dept));
        List<Employee1> list = criteria.list();
        for (Employee1 emp:list) {
            System.out.println(emp);
        }
    }
}
