package com.qworldr.webstatistics.dao;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerriory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wujiazhen on 2018/4/11.
 */
public interface DtWeblogDetailTerrioryDao {

    public List<DtWeblogDetailTerriory> selectDtWebLogTerriory(@Param("param") QueryExample example);
}
