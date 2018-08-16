package com.qworldr.webstatistics.generator.dao;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetail;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtWeblogDetailMapper {
    int countByExample(DtWeblogDetailExample example);

    int deleteByExample(DtWeblogDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(DtWeblogDetail record);

    int insertSelective(DtWeblogDetail record);

    List<DtWeblogDetail> selectByExample(DtWeblogDetailExample example);

    DtWeblogDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DtWeblogDetail record, @Param("example") DtWeblogDetailExample example);

    int updateByExample(@Param("record") DtWeblogDetail record, @Param("example") DtWeblogDetailExample example);

    int updateByPrimaryKeySelective(DtWeblogDetail record);

    int updateByPrimaryKey(DtWeblogDetail record);
}