package com.qworldr.webstatistics.service.impl;

import com.qworldr.webstatistics.dao.CommonsDao;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailDay;
import com.qworldr.webstatistics.generator.dao.DtWeblogDetailDayMapper;
import com.qworldr.webstatistics.service.DtWeblogDetailDayService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wujiazhen on 2018/3/31.
 */
@Service
public class DtWeblogDetailDayServiceImpl implements DtWeblogDetailDayService {
    @Autowired
    private DtWeblogDetailDayMapper dtWeblogDetailDayMapper;
    @Autowired
    private CommonsDao commonsDao;
    @Override
    public List<DtWeblogDetailDay> getSummaryWeblogDetail() {
        List<DtWeblogDetailDay> dtWeblogDetail= commonsDao.selectSummaryGroupByDateAndType(new java.sql.Date(DateUtils.getDate(-1).getTime()));
        return dtWeblogDetail;
    }
}
