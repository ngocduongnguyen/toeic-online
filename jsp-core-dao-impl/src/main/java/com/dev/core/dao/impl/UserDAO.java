package com.dev.core.dao.impl;

import com.dev.core.common.HibernateUtil;
import com.dev.core.dao.IUserDAO;
import com.dev.persistence.data.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDAO extends AbstractDAO<Long, UserEntity> implements IUserDAO {
    @Override
    public UserEntity isUserExist(String username, String password) {
        UserEntity userEntity = new UserEntity();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            StringBuilder stringBuilder = new StringBuilder("FROM UserEntity WHERE name= :name AND password= :password");
            Query query = session.createQuery(stringBuilder.toString());
            query.setParameter("name",username);
            query.setParameter("password",password);
            if (query.list().size()>0){
                userEntity= (UserEntity) query.list().get(0);
                transaction.commit();
            }
        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        }

        return userEntity;
    }
}
