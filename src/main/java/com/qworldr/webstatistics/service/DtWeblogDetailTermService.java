package com.qworldr.webstatistics.service;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.bean.query.QueryParam;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerm;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/7.
 */
public interface DtWeblogDetailTermService {
    List<DtWeblogDetailTerm> selectList(QueryExample queryExample);
}
