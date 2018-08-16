package com.qworldr.webstatistics.dao;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/7.
 */
public interface DtWeblogDetailVisitPageDao {
    public List<DtWeblogDetailVisitPage> selectDtWebLogVisitPage(@Param("param") QueryExample queryExample);
    public List<DtWeblogDetailVisitPage> selectDtWebLogVisitPageOrderByOutCount(@Param("param") QueryExample queryExample);
    public List<DtWeblogDetailVisitPage> selectDtWebLogVisitPageOrderByIntoCount(@Param("param") QueryExample queryExample);
    public  DtWeblogDetailVisitPage selectDtWebLogVisitPageSummary(@Param("param") QueryExample queryExample);
}
