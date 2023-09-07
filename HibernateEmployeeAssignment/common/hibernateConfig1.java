package HibernateEmployeeAssignment.common;
import HibernateEmployeeAssignment.entity.Employee1;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class hibernateConfig1 {
    private hibernateConfig1(){}
    public static SessionFactory getSessionFactory(){
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Employee1.class);
        SessionFactory sf = cfg.buildSessionFactory();
        return sf;
    }
}
