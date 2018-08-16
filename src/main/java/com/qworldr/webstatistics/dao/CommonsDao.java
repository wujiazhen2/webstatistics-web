package com.qworldr.webstatistics.dao;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetail;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailDay;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

public interface CommonsDao {
    List<DtWeblogDetailDay> selectSummaryGroupByDateAndType(Date date);

    List<DtWeblogDetail> selectDtWebLog(@Param("param") QueryExample queryExample);

    DtWeblogDetail selectSumDtWebLog(@Param("param") QueryExample queryExample);

    List<DtWeblogDetail> selectDtWebLogGroupByOriginType(@Param("param") QueryExample queryExample);

    List<DtWeblogDetail> selectDtWebLogGroupByOriginTypeAndDateTime(@Param("param") QueryExample queryExample);

    List<DtWeblogDetail> selectDtWebLogGroupByOriginDomain(@Param("param") QueryExample queryExample);

    List<DtWeblogDetail> selectDtWebLogGroupByOriginDomainAndDateTime(@Param("param") QueryExample queryExample);

    List<DtWeblogDetail> selectDtWebLogGroupByOriginPage(@Param("param") QueryExample queryExample);

    List<DtWeblogDetail> selectDtWebLogGroupByOriginPageAndDateTime(@Param("param") QueryExample queryExample);

    List<DtWeblogDetail> selectDtWebLogGroupByOriginSE(@Param("param") QueryExample queryExample);

    List<DtWeblogDetail> selectDtWebLogGroupByOriginSEAndDateTime(@Param("param") QueryExample queryExample);

    List<DtWeblogDetail> selectTopDtWebLogOriginDomain(@Param("param") QueryExample queryExample);

    List<DtWeblogDetail> selectTopDtWebLogOriginPage(@Param("param") QueryExample queryExample);
}