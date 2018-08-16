package com.qworldr.webstatistics.generator.dao;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitPage;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtWeblogDetailVisitPageMapper {
    int countByExample(DtWeblogDetailVisitPageExample example);

    int deleteByExample(DtWeblogDetailVisitPageExample example);

    int deleteByPrimaryKey(String id);

    int insert(DtWeblogDetailVisitPage record);

    int insertSelective(DtWeblogDetailVisitPage record);

    List<DtWeblogDetailVisitPage> selectByExample(DtWeblogDetailVisitPageExample example);

    DtWeblogDetailVisitPage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DtWeblogDetailVisitPage record, @Param("example") DtWeblogDetailVisitPageExample example);

    int updateByExample(@Param("record") DtWeblogDetailVisitPage record, @Param("example") DtWeblogDetailVisitPageExample example);

    int updateByPrimaryKeySelective(DtWeblogDetailVisitPage record);

    int updateByPrimaryKey(DtWeblogDetailVisitPage record);
}