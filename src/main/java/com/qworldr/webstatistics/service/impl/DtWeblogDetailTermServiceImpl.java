package com.qworldr.webstatistics.service.impl;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.bean.query.QueryParam;
import com.qworldr.webstatistics.dao.DtWeblogDetailTermDao;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerm;
import com.qworldr.webstatistics.service.DtWeblogDetailTermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/7.
 */
@Service
public class DtWeblogDetailTermServiceImpl implements DtWeblogDetailTermService{
    @Autowired
    private DtWeblogDetailTermDao dtWeblogDetailTermDao;


    @Override
    public List<DtWeblogDetailTerm> selectList(QueryExample queryExample) {
        return dtWeblogDetailTermDao.selectDtWebLogTerm(queryExample);
    }
}
