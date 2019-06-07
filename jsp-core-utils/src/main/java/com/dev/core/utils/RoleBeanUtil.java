package com.dev.core.utils;

import com.dev.core.dto.RoleDTO;
import com.dev.persistence.data.RoleEntity;

public class RoleBeanUtil {
    public static RoleDTO entityToDTO(RoleEntity roleEntity){
        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId(roleEntity.getId());
        roleDTO.setName(roleEntity.getName());
        roleDTO.setCreatedby(roleEntity.getCreatedby());
        roleDTO.setCreateddate(roleEntity.getCreateddate());
        roleDTO.setModifieddate(roleEntity.getModifieddate());
        roleDTO.setModifiedby(roleEntity.getModifiedby());

        return roleDTO;
    }


    public static RoleEntity dtoToEntity(RoleDTO roleDTO){
        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setId(roleDTO.getId());
        roleEntity.setName(roleDTO.getName());
        roleEntity.setCreatedby(roleDTO.getCreatedby());
        roleEntity.setCreateddate(roleDTO.getCreateddate());
        roleEntity.setModifiedby(roleDTO.getModifiedby());
        roleEntity.setModifieddate(roleDTO.getModifieddate());

        return roleEntity;
    }
}
