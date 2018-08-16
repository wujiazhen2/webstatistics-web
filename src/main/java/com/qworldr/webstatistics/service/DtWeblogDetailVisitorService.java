package com.qworldr.webstatistics.service;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitor;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/1.
 */
public interface DtWeblogDetailVisitorService {
    List<DtWeblogDetailVisitor> getToday();

    List<DtWeblogDetailVisitor>  selectDtWeblogDetailVisitorOrderBy(QueryExample queryExample);
}
