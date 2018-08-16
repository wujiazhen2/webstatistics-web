package com.qworldr.webstatistics.generator.dao;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailHour;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailHourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtWeblogDetailHourMapper {
    int countByExample(DtWeblogDetailHourExample example);

    int deleteByExample(DtWeblogDetailHourExample example);

    int deleteByPrimaryKey(String id);

    int insert(DtWeblogDetailHour record);

    int insertSelective(DtWeblogDetailHour record);

    List<DtWeblogDetailHour> selectByExample(DtWeblogDetailHourExample example);

    DtWeblogDetailHour selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DtWeblogDetailHour record, @Param("example") DtWeblogDetailHourExample example);

    int updateByExample(@Param("record") DtWeblogDetailHour record, @Param("example") DtWeblogDetailHourExample example);

    int updateByPrimaryKeySelective(DtWeblogDetailHour record);

    int updateByPrimaryKey(DtWeblogDetailHour record);
}