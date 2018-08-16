package com.qworldr.webstatistics.bean.vo;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerm;

/**
 * Created by wujiazhen on 2018/4/7.
 */
public class DtWeblogDetailTermVo extends DtWeblogDetailTerm {
    private String avgVisitTime_str;

    public String getAvgVisitTime_str() {
        return avgVisitTime_str;
    }

    public void setAvgVisitTime_str(String avgVisitTime_str) {
        this.avgVisitTime_str = avgVisitTime_str;
    }
}
