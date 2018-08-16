package com.qworldr.webstatistics.bean.example;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

/**
 * Created by wujiazhen on 2018/4/2.
 */
public class QueryExample {
    private java.util.Date start_time;
    private java.util.Date end_time;
    private String originDomain;
    private Integer isNewVisitor;
    private Integer limit;

    private Integer offset;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public java.util.Date getStart_time() {
        return start_time;
    }

    public void setStart_time(java.util.Date start_time) {
        this.start_time = start_time;
    }

    public java.util.Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(java.util.Date end_time) {
        this.end_time = end_time;
    }

    public String getOriginDomain() {
        return originDomain;
    }

    public void setOriginDomain(String originDomain) {
        this.originDomain = originDomain;
    }

    public Integer getIsNewVisitor() {
        return isNewVisitor;
    }

    public void setIsNewVisitor(Integer isNewVisitor) {
        this.isNewVisitor = isNewVisitor;
    }
}
