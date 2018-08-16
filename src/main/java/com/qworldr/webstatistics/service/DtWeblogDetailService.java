package com.qworldr.webstatistics.service;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.bean.query.QueryParam;
import com.qworldr.webstatistics.bean.vo.DtWeblogDetailVo;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetail;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/2.
 */
public interface DtWeblogDetailService {

    List<DtWeblogDetail> selectWebLogDetail(QueryExample queryExample);

    DtWeblogDetail selectSumWebLogDetail(QueryExample queryExample);

    List<DtWeblogDetail> selectWebLogDetailGroupByOriginType(QueryExample queryExample);

    List<DtWeblogDetail> selectWebLogDetailGroupByOriginTypeAndDateTime(QueryExample queryExample);

    List<DtWeblogDetail> selectWebLogDetailGroupByOriginDomainAndDateTime(QueryExample queryExample);

    List<DtWeblogDetail> selectWebLogDetailGroupByOriginDomain(QueryExample queryExample);

    List<DtWeblogDetail> selectWebLogDetailGroupByOriginPageAndDateTime(QueryExample queryExample);

    List<DtWeblogDetail> selectWebLogDetailGroupByOriginPage(QueryExample queryExample);

    List<DtWeblogDetail> selectWebLogDetailGroupByOriginSEAndDateTime(QueryExample queryExample);

    List<DtWeblogDetail> selectWebLogDetailGroupByOriginSE(QueryExample queryExample);

    List<DtWeblogDetail> selectWeblogDetailTopDomain(QueryExample queryExample);

    List<DtWeblogDetail> selectWeblogDetailTopPage(QueryExample queryExample);
}
