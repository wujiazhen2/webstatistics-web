package com.qworldr.webstatistics.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetail;

import java.util.Date;

/**
 * Created by wujiazhen on 2018/4/2.
 */
public class DtWeblogDetailVo extends DtWeblogDetail {
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+08")
    private Date analyzeDate;

    private String dateStr;
    private String originType_cn;
    private String avgVisitTime_str;
    public String getOriginType_cn() {
        return originType_cn;
    }



    public void setOriginType_cn(String originType_cn) {
        this.originType_cn = originType_cn;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getAvgVisitTime_str() {
        return avgVisitTime_str;
    }

    public void setAvgVisitTime_str(String avgVisitTime_str) {
        this.avgVisitTime_str = avgVisitTime_str;
    }
}
