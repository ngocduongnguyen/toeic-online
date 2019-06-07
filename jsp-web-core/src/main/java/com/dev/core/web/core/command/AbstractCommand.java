package com.dev.core.web.core.command;

import java.util.List;

public class AbstractCommand<T> {
    private Integer maxPageItems = 20;
    private Integer firstItem = 0;
    private Integer totalItems = 0;
    private String sortExpression;
    private String sortDirection;
    private String[] checkList;
    private List<T> listResult;
    private String crudaction;
    private String tableId = "tableList";
    protected T pojo;
    private String messageResponse;
    private Integer page = 1;

    public T getPojo() {
        return pojo;
    }

    public void setPojo(T pojo) {
        this.pojo = pojo;
    }

    public String getCrudaction() {
        return crudaction;
    }

    public void setCrudaction(String crudaction) {
        this.crudaction = crudaction;
    }
}
