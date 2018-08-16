package com.qworldr.webstatistics.service;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerriory;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/11.
 */
public interface DtWeblogDetailTerrioryService {
    List<DtWeblogDetailTerriory> selectListGroupByTerriory(QueryExample queryExample);
}
