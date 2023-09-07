package HibernateEmployeeAssignment.operation;

import HibernateEmployeeAssignment.common.hibernateConfig1;
import HibernateEmployeeAssignment.entity.Employee1;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DetailsByID {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig1.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee1.class);
        criteria.add(Restrictions.eq("id",3));
        System.out.println(criteria.list());
    }
}
