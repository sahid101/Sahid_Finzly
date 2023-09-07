package packageHN.login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientGet {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Login.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Login user = session.get(Login.class,1);
        System.out.println(user);
        session.close();
    }
}
