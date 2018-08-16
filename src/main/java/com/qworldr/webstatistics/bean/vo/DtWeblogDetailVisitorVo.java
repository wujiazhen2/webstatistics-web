package com.qworldr.webstatistics.bean.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailOrigin;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitor;

import java.util.Date;

/**
 * Created by wujiazhen on 2018/4/1.
 */
public class DtWeblogDetailVisitorVo extends DtWeblogDetailVisitor {
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+08")
    private Date analyzeDate;
    private String avgVisitTime_str;

    public String getAvgVisitTime_str() {
        return avgVisitTime_str;
    }

    public void setAvgVisitTime_str(String avgVisitTime_str) {
        this.avgVisitTime_str = avgVisitTime_str;
    }
}
