package com.dev.core.utils;

import com.dev.core.dto.UserDTO;
import com.dev.persistence.data.UserEntity;

public class UserBeanUtil {
    public static UserDTO entityToDTO(UserEntity userEntity){
        UserDTO userDTO = new UserDTO();

        if (userEntity.getId()>0){
            userDTO.setId(userEntity.getId());
            userDTO.setName(userEntity.getName());
            userDTO.setFullname(userEntity.getFullname());
            userDTO.setPassword(userEntity.getPassword());
            userDTO.setCreateddate(userEntity.getCreateddate());
            userDTO.setCreatedby(userEntity.getCreatedby());
            userDTO.setModifiedby(userEntity.getModifiedby());
            userDTO.setModifieddate(userEntity.getModifieddate());
            userDTO.setRoleDTO(RoleBeanUtil.entityToDTO(userEntity.getRoleByRoleid()));
        }

        return userDTO;
    }

    public static UserEntity dtoToEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();

        if (userDTO.getId()>0){
            userEntity.setId(userDTO.getId());
            userEntity.setName(userDTO.getName());
            userEntity.setFullname(userDTO.getFullname());
            userEntity.setPassword(userDTO.getPassword());
            userEntity.setCreateddate(userDTO.getCreateddate());
            userEntity.setCreatedby(userDTO.getCreatedby());
            userEntity.setModifiedby(userDTO.getModifiedby());
            userEntity.setModifieddate(userDTO.getModifieddate());
            userEntity.setRoleByRoleid(RoleBeanUtil.dtoToEntity(userDTO.getRoleDTO()));
        }

        return userEntity;
    }
}