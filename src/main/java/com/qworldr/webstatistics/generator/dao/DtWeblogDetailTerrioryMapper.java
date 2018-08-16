package com.qworldr.webstatistics.generator.dao;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerriory;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerrioryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtWeblogDetailTerrioryMapper {
    int countByExample(DtWeblogDetailTerrioryExample example);

    int deleteByExample(DtWeblogDetailTerrioryExample example);

    int deleteByPrimaryKey(String id);

    int insert(DtWeblogDetailTerriory record);

    int insertSelective(DtWeblogDetailTerriory record);

    List<DtWeblogDetailTerriory> selectByExample(DtWeblogDetailTerrioryExample example);

    DtWeblogDetailTerriory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DtWeblogDetailTerriory record, @Param("example") DtWeblogDetailTerrioryExample example);

    int updateByExample(@Param("record") DtWeblogDetailTerriory record, @Param("example") DtWeblogDetailTerrioryExample example);

    int updateByPrimaryKeySelective(DtWeblogDetailTerriory record);

    int updateByPrimaryKey(DtWeblogDetailTerriory record);
}