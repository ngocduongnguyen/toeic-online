package com.dev.core.testng;

import com.dev.core.dao.impl.RoleDAO;
import com.dev.core.dao.impl.UserDAO;
import com.dev.persistence.data.RoleEntity;
import com.dev.persistence.data.UserEntity;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoleTest {
    @Test
    public void testFindAll(){
        UserDAO userDAO = new UserDAO();
        List<UserEntity> list = userDAO.findAll();
    }
    @Test
    public void testUpdate(){
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setId(1);
        roleEntity.setName("ADMIN");
        new RoleDAO().update(roleEntity);
    }

    @Test
    public void testSave(){
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setId(1L);
        roleEntity.setName("ADMIN");

        RoleEntity roleEntity1 = new RoleEntity();
        roleEntity1.setId(2L);
        roleEntity1.setName("USER");

        RoleDAO roleDAO = new RoleDAO();
        roleDAO.save(roleEntity);
        roleDAO.save(roleEntity1);
    }

    @Test
    public void testDelete(){
        List<Long> list = new ArrayList<>();
        Collections.addAll(list,1L,2L);
        new RoleDAO().delete(list);
    }

    @Test
    public void testFindById(){
        new RoleDAO().findById(5L);
        System.out.println("OK");
    }
    @Test
    public void checkFindByProperty(){
        RoleDAO roleDAO = new RoleDAO();
        Object[] list = roleDAO.findByProperty("id",1L,null,null);
        for (RoleEntity item:(List<RoleEntity>)(list[0])) {
            System.out.println(item.getName());
        }
    }
}