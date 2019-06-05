package com.dev.core.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static SessionFactory getSessionFactory(){
        try {
            return new Configuration().configure().buildSessionFactory();
        }catch (ExceptionInInitializerError exception){
            exception.printStackTrace();
            return null;
        }
    }

}