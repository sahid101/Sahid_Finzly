package com.common;

import com.entity.com.Library;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public final class hibernateConfig {
    private hibernateConfig(){}
    public static SessionFactory getSessionFactory(){
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Library.class);
        SessionFactory sf = cfg.buildSessionFactory();
        return sf;
    }
}
