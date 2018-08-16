package com.qworldr.webstatistics.dao;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerm;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/10.
 */
public interface DtWeblogDetailVisitorDao {
    public List<DtWeblogDetailVisitor> selectDtWebLogVisitorOrderByIsNewVisitor(@Param("param") QueryExample queryExample);
}
