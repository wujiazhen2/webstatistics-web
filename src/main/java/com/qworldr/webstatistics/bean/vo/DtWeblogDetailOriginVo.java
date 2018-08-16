package com.qworldr.webstatistics.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailOrigin;

import java.util.Date;

/**
 * Created by wujiazhen on 2018/3/31.
 */
public class DtWeblogDetailOriginVo extends DtWeblogDetailOrigin {
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+08")
    private Date analyzeDate;
    private  String pvPercent_cn;
    private String avgVisitTime_str;
    public String getPvPercent_cn() {
        return pvPercent_cn;
    }

    public void setPvPercent_cn(String pvPercent_cn) {
        this.pvPercent_cn = pvPercent_cn;
    }

    public String getAvgVisitTime_str() {
        return avgVisitTime_str;
    }

    public void setAvgVisitTime_str(String avgVisitTime_str) {
        this.avgVisitTime_str = avgVisitTime_str;
    }
}
