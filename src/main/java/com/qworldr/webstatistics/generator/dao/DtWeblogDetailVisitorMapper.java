package com.qworldr.webstatistics.generator.dao;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitor;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtWeblogDetailVisitorMapper {
    int countByExample(DtWeblogDetailVisitorExample example);

    int deleteByExample(DtWeblogDetailVisitorExample example);

    int deleteByPrimaryKey(String id);

    int insert(DtWeblogDetailVisitor record);

    int insertSelective(DtWeblogDetailVisitor record);

    List<DtWeblogDetailVisitor> selectByExample(DtWeblogDetailVisitorExample example);

    DtWeblogDetailVisitor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DtWeblogDetailVisitor record, @Param("example") DtWeblogDetailVisitorExample example);

    int updateByExample(@Param("record") DtWeblogDetailVisitor record, @Param("example") DtWeblogDetailVisitorExample example);

    int updateByPrimaryKeySelective(DtWeblogDetailVisitor record);

    int updateByPrimaryKey(DtWeblogDetailVisitor record);
}