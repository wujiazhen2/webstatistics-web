package com.qworldr.webstatistics.service.impl;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.dao.CommonsDao;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetail;
import com.qworldr.webstatistics.service.DtWeblogDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/2.
 */
@Service
public class DtWeblogDetailServiceImpl implements DtWeblogDetailService {
    @Autowired
    private CommonsDao commonsDao;


    @Override
    public List<DtWeblogDetail> selectWebLogDetail(QueryExample queryExample) {
        return commonsDao.selectDtWebLog(queryExample);
    }

    @Override
    public DtWeblogDetail selectSumWebLogDetail(QueryExample queryExample) {
        return commonsDao.selectSumDtWebLog(queryExample);
    }

    @Override
    public List<DtWeblogDetail> selectWebLogDetailGroupByOriginType(QueryExample queryExample) {
        return commonsDao.selectDtWebLogGroupByOriginType(queryExample);
    }

    @Override
    public List<DtWeblogDetail> selectWebLogDetailGroupByOriginTypeAndDateTime(QueryExample queryExample) {
        return commonsDao.selectDtWebLogGroupByOriginTypeAndDateTime(queryExample);
    }

    @Override
    public List<DtWeblogDetail> selectWebLogDetailGroupByOriginDomainAndDateTime(QueryExample queryExample) {
        return commonsDao.selectDtWebLogGroupByOriginDomainAndDateTime(queryExample);
    }

    @Override
    public List<DtWeblogDetail> selectWebLogDetailGroupByOriginDomain(QueryExample queryExample) {
        return commonsDao.selectDtWebLogGroupByOriginDomain(queryExample);
    }

    @Override
    public List<DtWeblogDetail> selectWebLogDetailGroupByOriginPageAndDateTime(QueryExample queryExample) {
        return commonsDao.selectDtWebLogGroupByOriginPageAndDateTime(queryExample);
    }

    @Override
    public List<DtWeblogDetail> selectWebLogDetailGroupByOriginPage(QueryExample queryExample) {
        return commonsDao.selectDtWebLogGroupByOriginPage(queryExample);
    }

    @Override
    public List<DtWeblogDetail> selectWebLogDetailGroupByOriginSEAndDateTime(QueryExample queryExample) {
        return commonsDao.selectDtWebLogGroupByOriginSEAndDateTime(queryExample);
    }

    @Override
    public List<DtWeblogDetail> selectWebLogDetailGroupByOriginSE(QueryExample queryExample) {
        return commonsDao.selectDtWebLogGroupByOriginSE(queryExample);
    }

    @Override
    public List<DtWeblogDetail> selectWeblogDetailTopDomain(QueryExample queryExample) {
        return commonsDao.selectTopDtWebLogOriginDomain(queryExample);
    }

    @Override
    public List<DtWeblogDetail> selectWeblogDetailTopPage(QueryExample queryExample) {
        return commonsDao.selectTopDtWebLogOriginPage(queryExample);
    }
}
