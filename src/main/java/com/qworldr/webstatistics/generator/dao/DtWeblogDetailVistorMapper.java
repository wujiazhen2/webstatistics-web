package com.qworldr.webstatistics.generator.dao;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVistor;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVistorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtWeblogDetailVistorMapper {
    int countByExample(DtWeblogDetailVistorExample example);

    int deleteByExample(DtWeblogDetailVistorExample example);

    int deleteByPrimaryKey(String id);

    int insert(DtWeblogDetailVistor record);

    int insertSelective(DtWeblogDetailVistor record);

    List<DtWeblogDetailVistor> selectByExample(DtWeblogDetailVistorExample example);

    DtWeblogDetailVistor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DtWeblogDetailVistor record, @Param("example") DtWeblogDetailVistorExample example);

    int updateByExample(@Param("record") DtWeblogDetailVistor record, @Param("example") DtWeblogDetailVistorExample example);

    int updateByPrimaryKeySelective(DtWeblogDetailVistor record);

    int updateByPrimaryKey(DtWeblogDetailVistor record);
}