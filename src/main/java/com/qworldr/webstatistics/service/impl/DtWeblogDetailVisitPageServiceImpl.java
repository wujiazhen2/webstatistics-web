package com.qworldr.webstatistics.service.impl;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.bean.query.QueryParam;
import com.qworldr.webstatistics.dao.DtWeblogDetailVisitPageDao;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitPage;
import com.qworldr.webstatistics.service.DtWeblogDetailVisitPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/7.
 */
@Service
public class DtWeblogDetailVisitPageServiceImpl implements DtWeblogDetailVisitPageService {
    @Autowired
    private DtWeblogDetailVisitPageDao dtWeblogDetailVisitPageDao;


    @Override
    public List<DtWeblogDetailVisitPage> selectDtWeblogVisitPage(QueryExample queryExample) {
        return dtWeblogDetailVisitPageDao.selectDtWebLogVisitPage(queryExample);
    }

    @Override
    public List<DtWeblogDetailVisitPage> selectDtWeblogVisitPageOrderByIntoCount(QueryExample queryExample) {
        return dtWeblogDetailVisitPageDao.selectDtWebLogVisitPageOrderByIntoCount(queryExample);
    }

    @Override
    public List<DtWeblogDetailVisitPage> selectDtWeblogVisitPageOrderByOutCount(QueryExample queryExample) {
        return dtWeblogDetailVisitPageDao.selectDtWebLogVisitPageOrderByOutCount(queryExample);
    }

    @Override
    public DtWeblogDetailVisitPage selectDtWeblogVisitPageSummary(QueryExample queryExample) {
        return dtWeblogDetailVisitPageDao.selectDtWebLogVisitPageSummary(queryExample);
    }
}
