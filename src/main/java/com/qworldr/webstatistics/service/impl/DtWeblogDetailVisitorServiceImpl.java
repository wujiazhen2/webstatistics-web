package com.qworldr.webstatistics.service.impl;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.dao.DtWeblogDetailVisitorDao;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitor;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitorExample;
import com.qworldr.webstatistics.generator.dao.DtWeblogDetailVisitorMapper;
import com.qworldr.webstatistics.service.DtWeblogDetailVisitorService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/1.
 */
@Service
public class DtWeblogDetailVisitorServiceImpl implements DtWeblogDetailVisitorService {
    @Autowired
    private DtWeblogDetailVisitorMapper dtWeblogDetailVisitorMapper;
    @Autowired
    private DtWeblogDetailVisitorDao dtWeblogDetailVisitorDao;
    @Override
    public List<DtWeblogDetailVisitor> getToday() {
        DtWeblogDetailVisitorExample example = new DtWeblogDetailVisitorExample();
        example.createCriteria().andAnalyzeDateEqualTo(DateUtils.getDate(-1));
        List<DtWeblogDetailVisitor> dtWeblogDetailVisitors = dtWeblogDetailVisitorMapper.selectByExample(example);
        return dtWeblogDetailVisitors;
    }

    @Override
    public List<DtWeblogDetailVisitor>  selectDtWeblogDetailVisitorOrderBy(QueryExample queryExample){
        return dtWeblogDetailVisitorDao.selectDtWebLogVisitorOrderByIsNewVisitor(queryExample);
    }
}
