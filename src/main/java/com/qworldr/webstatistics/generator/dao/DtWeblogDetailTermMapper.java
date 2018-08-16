package com.qworldr.webstatistics.generator.dao;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerm;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTermExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtWeblogDetailTermMapper {
    int countByExample(DtWeblogDetailTermExample example);

    int deleteByExample(DtWeblogDetailTermExample example);

    int deleteByPrimaryKey(String id);

    int insert(DtWeblogDetailTerm record);

    int insertSelective(DtWeblogDetailTerm record);

    List<DtWeblogDetailTerm> selectByExample(DtWeblogDetailTermExample example);

    DtWeblogDetailTerm selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DtWeblogDetailTerm record, @Param("example") DtWeblogDetailTermExample example);

    int updateByExample(@Param("record") DtWeblogDetailTerm record, @Param("example") DtWeblogDetailTermExample example);

    int updateByPrimaryKeySelective(DtWeblogDetailTerm record);

    int updateByPrimaryKey(DtWeblogDetailTerm record);
}