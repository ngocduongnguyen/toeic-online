package com.dev.persistence.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "comment", schema = "toeic_online", catalog = "")
public class CommentEntity {
    private long id;
    private String content;
    private Timestamp createddate;
    private String createdby;
    private Timestamp modifieddate;
    private String modifiedby;
    private UserEntity userByUserid;
    private ListenguidelineEntity listenguidelineByListenguidelineid;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        CommentEntity that = (CommentEntity) o;
        return id == that.id &&
                Objects.equals(content, that.content) &&
                Objects.equals(createddate, that.createddate) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(modifieddate, that.modifieddate) &&
                Objects.equals(modifiedby, that.modifiedby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, createddate, createdby, modifieddate, modifiedby);
    }

    @ManyToOne
    @JoinColumn(name = "userid", referencedColumnName = "id")
    public UserEntity getUserByUserid() {
        return userByUserid;
    }

    public void setUserByUserid(UserEntity userByUserid) {
        this.userByUserid = userByUserid;
    }

    @ManyToOne
    @JoinColumn(name = "listenguidelineid", referencedColumnName = "id")
    public ListenguidelineEntity getListenguidelineByListenguidelineid() {
        return listenguidelineByListenguidelineid;
    }

    public void setListenguidelineByListenguidelineid(ListenguidelineEntity listenguidelineByListenguidelineid) {
        this.listenguidelineByListenguidelineid = listenguidelineByListenguidelineid;
    }
}
