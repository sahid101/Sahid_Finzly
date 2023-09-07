package HibernateEmployeeAssignment.operation;

import HibernateEmployeeAssignment.common.hibernateConfig1;
import HibernateEmployeeAssignment.entity.Employee1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddingEmp {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig1.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();

        Employee1 rahul = new Employee1(6,"rahul","das","21-09-2000","rahuldas@gmail.com","developer",30000);
        Employee1 sam = new Employee1(7,"sam","kumar","23-10-2000","samkumar@gmail.com","tester",25000);
        Employee1 urus = new Employee1(8,"urus","kumbakar","11-10-2000","urus@gmail.com","tester",34000);
        Employee1 dude = new Employee1(9,"dude","damn","22-03-2000","damn@gmail.com","developer",38000);

        session.save(rahul);
        session.save(sam);
        session.save(urus);
        session.save(dude);
        System.out.println("Employee Inserted.");

        tr.commit();
        session.close();
    }
}
