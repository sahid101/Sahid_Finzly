package com.operation;

import com.common.hibernateConfig;
import com.entity.com.Library;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class DisplayAll {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Library.class);

        List<Library> list = criteria.list();
        for (Library l:list) {
            System.out.println(l);
        }
        tr.commit();
        session.close();
    }
}
