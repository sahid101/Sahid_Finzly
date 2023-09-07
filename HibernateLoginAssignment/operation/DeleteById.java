package com.operation;

import com.common.hibernateConfig;
import com.entity.com.Library;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteById {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Library book = new Library();
        book.setIsbn("978-2-234231");
        session.delete(book);
        tr.commit();
        session.close();
    }
}
