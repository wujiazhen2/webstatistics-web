package com.qworldr.webstatistics.generator.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DtWeblogDetailOrigin implements Serializable {
    private String id;

    private Date analyzeDate;

    private String originUrl;

    private String origin;

    private Integer pv;

    private BigDecimal pvPercent;

    private Integer uv;

    private BigDecimal uvPercent;

    private Integer ipNum;

    private BigDecimal ipNumPercent;

    private Integer newVisitor;

    private BigDecimal newVisitorPercent;

    private Integer avgVisitTime;

    private Integer avgConversions;

    private BigDecimal jumpOutPercent;

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

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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

    public Integer getAvgVisitTime() {
        return avgVisitTime;
    }

    public void setAvgVisitTime(Integer avgVisitTime) {
        this.avgVisitTime = avgVisitTime;
    }

    public Integer getAvgConversions() {
        return avgConversions;
    }

    public void setAvgConversions(Integer avgConversions) {
        this.avgConversions = avgConversions;
    }

    public BigDecimal getJumpOutPercent() {
        return jumpOutPercent;
    }

    public void setJumpOutPercent(BigDecimal jumpOutPercent) {
        this.jumpOutPercent = jumpOutPercent;
    }
}