package com.operation;

import com.common.hibernateConfig;
import com.entity.com.Library;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddBook {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Library.class);
        addBooks(session);
        tr.commit();
        session.close();
    }

    public static void addBooks(Session session){
        Library book1 = new Library("Garden","Frances","978-1-234567",1911);
        Library book2 = new Library("Pure","Daniel","978-2-234231",2001);
        Library book3 = new Library("Alien","Elvish","978-7-2343232",1981);
        Library book4 = new Library("USA","Fedro","823-6-234567",2021);
        Library book5 = new Library("Hamburger","Micheal","231-4-234567",1951);
        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(book4);
        session.save(book5);
        System.out.println("Book Inserted/Added.");
    }
}
