package com.operation;

import com.common.hibernateConfig;
import com.entity.com.Library;
import org.hibernate.*;

public class Client {
    public static void main(String[] args) {
        SessionFactory sf = hibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Criteria criteria = session.createCriteria(Library.class);

        tr.commit();
        session.close();
    }

}
