package com.qworldr.webstatistics.generator.bean;

import java.io.Serializable;
import java.util.Date;

public class DtWeblogDetailTerriory implements Serializable {
    private String id;

    private Date analyzeDate;

    private Boolean isNewVisitor;

    private String territoryCode;

    private String territoryName;

    private String originDomain;

    private Integer pv;

    private Integer uv;

    private Integer ipNum;

    private Integer newVisitor;

    private Integer avgVisitTime;

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

    public Boolean getIsNewVisitor() {
        return isNewVisitor;
    }

    public void setIsNewVisitor(Boolean isNewVisitor) {
        this.isNewVisitor = isNewVisitor;
    }

    public String getTerritoryCode() {
        return territoryCode;
    }

    public void setTerritoryCode(String territoryCode) {
        this.territoryCode = territoryCode;
    }

    public String getTerritoryName() {
        return territoryName;
    }

    public void setTerritoryName(String territoryName) {
        this.territoryName = territoryName;
    }

    public String getOriginDomain() {
        return originDomain;
    }

    public void setOriginDomain(String originDomain) {
        this.originDomain = originDomain;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public Integer getIpNum() {
        return ipNum;
    }

    public void setIpNum(Integer ipNum) {
        this.ipNum = ipNum;
    }

    public Integer getNewVisitor() {
        return newVisitor;
    }

    public void setNewVisitor(Integer newVisitor) {
        this.newVisitor = newVisitor;
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
}