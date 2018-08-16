package com.qworldr.webstatistics.generator.dao;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailOrigin;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailOriginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtWeblogDetailOriginMapper {
    int countByExample(DtWeblogDetailOriginExample example);

    int deleteByExample(DtWeblogDetailOriginExample example);

    int deleteByPrimaryKey(String id);

    int insert(DtWeblogDetailOrigin record);

    int insertSelective(DtWeblogDetailOrigin record);

    List<DtWeblogDetailOrigin> selectByExample(DtWeblogDetailOriginExample example);

    DtWeblogDetailOrigin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DtWeblogDetailOrigin record, @Param("example") DtWeblogDetailOriginExample example);

    int updateByExample(@Param("record") DtWeblogDetailOrigin record, @Param("example") DtWeblogDetailOriginExample example);

    int updateByPrimaryKeySelective(DtWeblogDetailOrigin record);

    int updateByPrimaryKey(DtWeblogDetailOrigin record);
}