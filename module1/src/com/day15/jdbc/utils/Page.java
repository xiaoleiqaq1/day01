package com.day15.jdbc.utils;

public class Page {
    private Integer page;
    private Integer pageSize=3;
    private Integer totalPage;

    public Page() {
    }

    public Page(Integer page, Integer pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }

    public Page(Integer page, Integer pageSize, Integer totalPage) {
        this.page = page;
        this.pageSize = pageSize;
        this.totalPage = totalPage;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
