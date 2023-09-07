package HibernateEmployeeAssignment.operation;

import HibernateEmployeeAssignment.common.hibernateConfig1;
import HibernateEmployeeAssignment.entity.Employee1;
import org.hibernate.*;

public class DeleteDetails {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig1.getSessionFactory();
        Session session = sf.openSession();
        Transaction  tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee1.class);
        Employee1 emp = new Employee1();
        emp.setId(4);
        session.delete(emp);
        System.out.println("deleted.");
        tr.commit();
        session.close();
    }
}
