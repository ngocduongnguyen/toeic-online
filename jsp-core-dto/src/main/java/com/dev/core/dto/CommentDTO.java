package com.dev.core.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class CommentDTO implements Serializable {
    private long id;
    private String content;
    private Timestamp createddate;
    private String createdby;
    private Timestamp modifieddate;
    private String modifiedby;
    private UserDTO userDTO;
    private ListenguidelineDTO listenguidelineDTO;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Timestamp getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Timestamp modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public ListenguidelineDTO getListenguidelineDTO() {
        return listenguidelineDTO;
    }

    public void setListenguidelineDTO(ListenguidelineDTO listenguidelineDTO) {
        this.listenguidelineDTO = listenguidelineDTO;
    }
}
