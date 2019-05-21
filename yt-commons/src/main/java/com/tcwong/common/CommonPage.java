package com.tcwong.common;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 分页数据封装
 */
public class CommonPage<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> list;


    /**
     * 将PageHelper分页后的list转为分页信息
     * @param list
     * @param <T>
     * @return
     */
    public static <T> CommonPage<T> restPage(List<T> list){
        CommonPage<T> result = new CommonPage<>();
        PageInfo<T> pageInfo = new PageInfo<>();
        result.setPageNum(pageInfo.getPageNum());
        result.setPageSize(pageInfo.getPageSize());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());

        return result;
    }

    public static <T> CommonPage<T> resePage(Page<T> pageInfo){
        CommonPage<T> result = new CommonPage<T>();
        result.setTotal(pageInfo.getTotal());
        result.setPageSize(pageInfo.getPageSize());
        result.setPageNum(pageInfo.getPageNum());
        result.setTotalPage(pageInfo.getPages());
        return result;

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

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
