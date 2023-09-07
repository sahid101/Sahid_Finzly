package HibernateEmployeeAssignment.operation;

import HibernateEmployeeAssignment.common.hibernateConfig1;
import HibernateEmployeeAssignment.entity.Employee1;
import org.hibernate.*;

public class UpdateById {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig1.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Employee1 emp = new Employee1();
        emp.setId(3);
        emp.setFirstName("saravana");
        emp.setLastName("kumar");
        emp.setDepartment("sales");
        emp.setEmail("saravanakumar@gmail.com");
        emp.setSalary(50000);
        session.update(emp);
        tr.commit();
        session.close();

    }
}
