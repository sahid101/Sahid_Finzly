package com.operation;

import com.common.hibernateConfig;
import com.entity.com.Library;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class UpdateTheDetailsOfBook {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();

        Library book = new Library();
        book.setIsbn("2314565");
        book.setTitle("USA");
        book.setAuthor("Praveen");
        book.setPubyear(2019);
        session.update(book);
        tr.commit();
        session.close();
    }
}
