package com.qworldr.webstatistics.service.impl;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailOrigin;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailOriginExample;
import com.qworldr.webstatistics.generator.dao.DtWeblogDetailOriginMapper;
import com.qworldr.webstatistics.service.DtWeblogDetailOriginService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wujiazhen on 2018/3/31.
 */
@Service
public class DtWeblogDetailOriginServiceImpl implements DtWeblogDetailOriginService{
    @Autowired
    private DtWeblogDetailOriginMapper dtWeblogDetailOriginMapper;
    @Override
    public List<DtWeblogDetailOrigin> getTopTen() {
        DtWeblogDetailOriginExample example = new DtWeblogDetailOriginExample();
        example.createCriteria().andAnalyzeDateEqualTo(DateUtils.getDate(-1));
        example.setOffset(0);
        example.setLimit(10);
        example.setOrderByClause("pv desc");
        List<DtWeblogDetailOrigin>  weblogDetailOrigins=dtWeblogDetailOriginMapper.selectByExample(example);
        return weblogDetailOrigins;
    }
}
