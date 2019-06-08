package com.dev.core.test;

import com.dev.core.common.HibernateUtil;
import com.dev.persistence.data.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class TestAPILogin {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            StringBuilder stringBuilder = new StringBuilder("from UserEntity where name= :name and password= :password");
            Query query = session.createQuery(stringBuilder.toString());
            query.setParameter("name", "admin");
            query.setParameter("password", "admin");
            if (query.list().size() > 0) {
                userEntity = (UserEntity) query.list().get(0);
                transaction.commit();
            }
            } catch (HibernateException e) {
                transaction.rollback();
                e.printStackTrace();
         }
    }
}
