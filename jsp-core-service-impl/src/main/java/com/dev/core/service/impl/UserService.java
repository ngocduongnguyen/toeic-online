package com.dev.core.service.impl;

import com.dev.core.dao.IUserDAO;
import com.dev.core.dao.impl.UserDAO;
import com.dev.core.dto.UserDTO;
import com.dev.core.service.IUserService;
import com.dev.core.utils.UserBeanUtil;

public class UserService implements IUserService {
    IUserDAO iUserDAO = new UserDAO();
    @Override
    public UserDTO isUserExist(UserDTO userDTO) {
        if (userDTO!=null){
            return UserBeanUtil.entityToDTO(iUserDAO.isUserExist(userDTO.getName(),userDTO.getPassword()));
        }else {
            return null;
        }
    }
}