package com.dev.core.dao.impl;

import com.dev.core.common.HibernateUtil;
import com.dev.core.dao.IGenericDAO;
import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public class AbstractDAO<ID extends Serializable, T> implements IGenericDAO<ID, T> {

    protected Class<T> tClass;

    public AbstractDAO(){
        tClass = (Class<T>)(((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1]);
    }

    protected String getTClassName(){
        return tClass.getSimpleName();
    }

    @Override
    public List<T> findAll() {
        List<T> list = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            Query query = session.createQuery("from "+getTClassName());
            list = query.list();
        }catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public T update(T entity) {
        T model = null;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            model = (T) session.merge(entity);
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return model;
    }

    @Override
    public void save(T entity) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public Integer delete(List<ID> list) {
        Integer count = 0;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
//            session.delete(entity);
            for (ID item : list){
                T t = (T) session.get(tClass,item);
                session.delete(t);
                count++;
            }
            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return count;
    }

    @Override
    public T findById(ID var) {
        T result = null;
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            result = session.get(tClass,var);
            if (result==null){
                throw new ObjectNotFoundException("Not found! "+var,null);
            }
        }catch (HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    @Override
    public Object[] findByProperty(String property, Object value, String sortExpresstion, String sortDirection) {
        List<T> resultList = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            StringBuilder builder = new StringBuilder("from ");
            builder.append(getTClassName());

            if (property!=null && value!=null){
                builder.append(" where "+property+"= :value");
            }

            if (sortExpresstion!=null && sortDirection!=null){
                builder.append(" order by "+sortExpresstion+" "+(sortDirection.equalsIgnoreCase("asc") ? "asc" : "desc"));
            }

            Query query = session.createQuery(builder.toString());
            query.setParameter("value",value);
            resultList = query.list();

            transaction.commit();
        }catch (HibernateException e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return new Object[]{resultList,resultList.size()};
    }
}