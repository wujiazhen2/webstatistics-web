package com.qworldr.webstatistics.service.impl;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.dao.DtWeblogDetailTerrioryDao;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerriory;
import com.qworldr.webstatistics.service.DtWeblogDetailTerrioryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/11.
 */
@Service
public class DtWeblogDetailTerrioryServiceImpl implements DtWeblogDetailTerrioryService {
    @Autowired
    private DtWeblogDetailTerrioryDao dtWeblogDetailTerrioryDao;
    @Override
    public List<DtWeblogDetailTerriory> selectListGroupByTerriory(QueryExample queryExample) {
        return dtWeblogDetailTerrioryDao.selectDtWebLogTerriory(queryExample);
    }
}
