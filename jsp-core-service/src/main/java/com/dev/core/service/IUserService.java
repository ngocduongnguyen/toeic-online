package com.dev.core.service;

import com.dev.core.dto.UserDTO;
import com.dev.persistence.data.UserEntity;

public interface IUserService {
    UserDTO isUserExist(UserDTO userDTO);
}