package com.qworldr.webstatistics.service.impl;

import com.qworldr.webstatistics.generator.bean.Dictionary;
import com.qworldr.webstatistics.generator.bean.DictionaryExample;
import com.qworldr.webstatistics.generator.dao.DictionaryMapper;
import com.qworldr.webstatistics.service.DictionaryService;
import com.qworldr.webstatistics.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wujiazhen on 2018/3/29.
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Override
    public String getDetial(String type, String code) {
        DictionaryExample example = new DictionaryExample();
        dictionaryMapper.selectByExample(example);
        example.createCriteria().andTypeEqualTo(type).andCodeEqualTo(code);
        Dictionary one = CollectionUtils.getOne(dictionaryMapper.selectByExample(example));
        return one==null?code:one.getDetail();
    }
}
