package com.qworldr.webstatistics.service;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitPage;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/7.
 */
public interface DtWeblogDetailVisitPageService {
    List<DtWeblogDetailVisitPage> selectDtWeblogVisitPage(QueryExample queryExample);
    List<DtWeblogDetailVisitPage> selectDtWeblogVisitPageOrderByIntoCount(QueryExample queryExample);
    List<DtWeblogDetailVisitPage> selectDtWeblogVisitPageOrderByOutCount(QueryExample queryExample);

    DtWeblogDetailVisitPage selectDtWeblogVisitPageSummary(QueryExample queryExample);
}
