package com.dev.persistence.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "listenguideline", schema = "toeic_online", catalog = "")
public class ListenguidelineEntity {
    private long id;
    private String title;
    private String image;
    private String content;
    private Timestamp createddate;
    private String createdby;
    private Timestamp modifieddate;
    private String modifiedby;
    private Collection<CommentEntity> commentsById;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
        ListenguidelineEntity that = (ListenguidelineEntity) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(image, that.image) &&
                Objects.equals(content, that.content) &&
                Objects.equals(createddate, that.createddate) &&
                Objects.equals(createdby, that.createdby) &&
                Objects.equals(modifieddate, that.modifieddate) &&
                Objects.equals(modifiedby, that.modifiedby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, image, content, createddate, createdby, modifieddate, modifiedby);
    }

    @OneToMany(mappedBy = "listenguidelineByListenguidelineid")
    public Collection<CommentEntity> getCommentsById() {
        return commentsById;
    }

    public void setCommentsById(Collection<CommentEntity> commentsById) {
        this.commentsById = commentsById;
    }
}
