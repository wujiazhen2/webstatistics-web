package com.qworldr.webstatistics.generator.dao;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailDay;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailDayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtWeblogDetailDayMapper {
    int countByExample(DtWeblogDetailDayExample example);

    int deleteByExample(DtWeblogDetailDayExample example);

    int deleteByPrimaryKey(String id);

    int insert(DtWeblogDetailDay record);

    int insertSelective(DtWeblogDetailDay record);

    List<DtWeblogDetailDay> selectByExample(DtWeblogDetailDayExample example);

    DtWeblogDetailDay selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DtWeblogDetailDay record, @Param("example") DtWeblogDetailDayExample example);

    int updateByExample(@Param("record") DtWeblogDetailDay record, @Param("example") DtWeblogDetailDayExample example);

    int updateByPrimaryKeySelective(DtWeblogDetailDay record);

    int updateByPrimaryKey(DtWeblogDetailDay record);
}