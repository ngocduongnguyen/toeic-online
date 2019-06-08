package com.dev.core.dao;

import com.dev.persistence.data.UserEntity;

public interface IUserDAO extends IGenericDAO<Long, UserEntity>{
    UserEntity isUserExist(String username, String password);
}