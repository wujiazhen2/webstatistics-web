package com.qworldr.webstatistics.service.impl;

import com.qworldr.webstatistics.dao.CommonsDao;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailHour;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailHourExample;
import com.qworldr.webstatistics.generator.dao.DtWeblogDetailHourMapper;
import com.qworldr.webstatistics.service.DtWeblogDetailHourService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wujiazhen on 2018/3/31.
 */
@Service
public class DtWeblogDetailHourServiceImpl implements DtWeblogDetailHourService {
    @Autowired
    private DtWeblogDetailHourMapper dtWeblogDetailHourMapper;
    @Autowired
    private CommonsDao commonsDao;
    @Override
    public List<DtWeblogDetailHour> getToday() {
        DtWeblogDetailHourExample example = new DtWeblogDetailHourExample();
        example.createCriteria().andAnalyzeDateEqualTo(DateUtils.getDate(-1));
        example.setOrderByClause("hour");
        List<DtWeblogDetailHour> dtWeblogDetail= dtWeblogDetailHourMapper.selectByExample(example);
        return dtWeblogDetail;
    }
}
