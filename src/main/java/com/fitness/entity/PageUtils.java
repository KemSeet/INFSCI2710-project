package com.fitness.entity;

import java.util.List;

public class PageUtils {
    private Integer pageNum;
    private Integer pageSize;

    private Integer total;
    private List list;

    private Integer pages;
    private Integer prePage;
    private Integer nextPage;

    public PageUtils(Integer pageNum, Integer pageSize, List list, Integer total) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;

        this.list = list;
        this.total = total;

        this.pages = Double.valueOf(Math.ceil(total * 1.0 / pageSize)).intValue();
        this.prePage = this.pageNum == 1 ? this.pages : pageNum - 1;
        this.nextPage = this.pageNum == this.pages ? 1 : this.pageNum + 1;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPrePage() {
        return prePage;
    }

    public void setPrePage(Integer prePage) {
        this.prePage = prePage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }
}
