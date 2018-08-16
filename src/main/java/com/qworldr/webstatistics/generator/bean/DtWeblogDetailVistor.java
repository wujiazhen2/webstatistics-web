package com.qworldr.webstatistics.generator.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DtWeblogDetailVistor implements Serializable {
    private String id;

    private Date analyzeDate;

    private Integer isNewVisitor;

    private Integer pv;

    private BigDecimal pvPercent;

    private Integer uv;

    private BigDecimal uvPercent;

    private Integer ipNum;

    private BigDecimal ipNumPercent;

    private Integer newVisitor;

    private BigDecimal newVisitorPercent;

    private String avgVisitTime;

    private Integer avgConversions;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getAnalyzeDate() {
        return analyzeDate;
    }

    public void setAnalyzeDate(Date analyzeDate) {
        this.analyzeDate = analyzeDate;
    }

    public Integer getIsNewVisitor() {
        return isNewVisitor;
    }

    public void setIsNewVisitor(Integer isNewVisitor) {
        this.isNewVisitor = isNewVisitor;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public BigDecimal getPvPercent() {
        return pvPercent;
    }

    public void setPvPercent(BigDecimal pvPercent) {
        this.pvPercent = pvPercent;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public BigDecimal getUvPercent() {
        return uvPercent;
    }

    public void setUvPercent(BigDecimal uvPercent) {
        this.uvPercent = uvPercent;
    }

    public Integer getIpNum() {
        return ipNum;
    }

    public void setIpNum(Integer ipNum) {
        this.ipNum = ipNum;
    }

    public BigDecimal getIpNumPercent() {
        return ipNumPercent;
    }

    public void setIpNumPercent(BigDecimal ipNumPercent) {
        this.ipNumPercent = ipNumPercent;
    }

    public Integer getNewVisitor() {
        return newVisitor;
    }

    public void setNewVisitor(Integer newVisitor) {
        this.newVisitor = newVisitor;
    }

    public BigDecimal getNewVisitorPercent() {
        return newVisitorPercent;
    }

    public void setNewVisitorPercent(BigDecimal newVisitorPercent) {
        this.newVisitorPercent = newVisitorPercent;
    }

    public String getAvgVisitTime() {
        return avgVisitTime;
    }

    public void setAvgVisitTime(String avgVisitTime) {
        this.avgVisitTime = avgVisitTime;
    }

    public Integer getAvgConversions() {
        return avgConversions;
    }

    public void setAvgConversions(Integer avgConversions) {
        this.avgConversions = avgConversions;
    }
}