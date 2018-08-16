package com.qworldr.webstatistics.dao;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerm;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/7.
 */
public interface DtWeblogDetailTermDao {

    public List<DtWeblogDetailTerm> selectDtWebLogTerm(@Param("param") QueryExample queryExample);
}
