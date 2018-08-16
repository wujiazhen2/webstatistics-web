package com.qworldr.webstatistics.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailDay;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailHour;

import java.io.Serializable;
import java.util.Date;

public class DtWeblogDetailDayVo extends DtWeblogDetailDay{
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+08")
    private Date analyzeDate;
    private String type_cn;
    private String avgVisitTime_str;
    public String getType_cn() {
        return type_cn;
    }
    public void setType_cn(String type_cn) {
        this.type_cn = type_cn;
    }

    public String getAvgVisitTime_str() {
        return avgVisitTime_str;
    }

    public void setAvgVisitTime_str(String avgVisitTime_str) {
        this.avgVisitTime_str = avgVisitTime_str;
    }
}