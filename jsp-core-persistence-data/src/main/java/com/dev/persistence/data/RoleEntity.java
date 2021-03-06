package com.dev.persistence.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "role", schema = "toeic_online", catalog = "")
public class RoleEntity {
    private long id;
    private String name;
    private Timestamp createddate;
    private String createdby;
    private Timestamp modifieddate;
    private String modifiedby;
    private Collection<UserEntity> usersById;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "createddate")
    public Timestamp getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    @Basic
    @Column(name = "createdby")
    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    @Basic
    @Column(name = "modifieddate")
    public Timestamp getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Timestamp modifieddate) {
        this.modifieddate = modifieddate;
    }

    @Basic
    @Column(name = "modifiedby")
    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleEntity that = (RoleEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(createddate, that.createddate) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(modifieddate, that.modifieddate) &&
                Objects.equals(modifiedby, that.modifiedby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, createddate, createdby, modifieddate, modifiedby);
    }

    @OneToMany(mappedBy = "roleByRoleid")
    public Collection<UserEntity> getUsersById() {
        return usersById;
    }

    public void setUsersById(Collection<UserEntity> usersById) {
        this.usersById = usersById;
    }
}
