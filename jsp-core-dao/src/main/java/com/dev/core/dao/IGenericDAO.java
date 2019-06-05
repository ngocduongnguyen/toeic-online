package com.dev.core.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDAO<ID extends Serializable, T> {
    List<T> findAll();
    T update(T entity);
    void save(T entity);
    Integer delete(List<ID> list);
    T findById(ID var);
    Object[] findByProperty(String property, Object value, String sortExpresstion, String sortDirection);
}