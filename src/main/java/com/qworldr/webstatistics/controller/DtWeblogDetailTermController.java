package com.qworldr.webstatistics.controller;

import com.qworldr.webstatistics.bean.query.QueryParam;
import com.qworldr.webstatistics.bean.vo.DtWeblogDetailTermVo;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerm;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerm;
import com.qworldr.webstatistics.service.DtWeblogDetailTermService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wujiazhen on 2018/4/7.
 */
@Controller
@RequestMapping("/weblog/term")
public class DtWeblogDetailTermController {

    @Autowired
    private DtWeblogDetailTermService dtWeblogDetailTermService;

    @RequestMapping("/list")
    public ResponseEntity<List<DtWeblogDetailTermVo>> list(QueryParam queryParam){
        List<DtWeblogDetailTerm> dtWeblogDetailTerms=  dtWeblogDetailTermService.selectList(queryParam.createQueryExample());return ResponseEntity.ok(vo(dtWeblogDetailTerms));
    }

    public List<DtWeblogDetailTermVo> vo(List<DtWeblogDetailTerm> DtWeblogDetailTerms){
        List<DtWeblogDetailTermVo> DtWeblogDetailTermVos = new ArrayList<>();
        for(DtWeblogDetailTerm dtWeblogDetailTerm: DtWeblogDetailTerms){
            DtWeblogDetailTermVos.add(vo(dtWeblogDetailTerm));
        }
        return DtWeblogDetailTermVos;
    }
    public DtWeblogDetailTermVo  vo(DtWeblogDetailTerm dtWeblogDetailTerm){
        DtWeblogDetailTermVo dtWeblogDetailTermVo = new DtWeblogDetailTermVo();
        BeanUtils.copyProperties(dtWeblogDetailTerm,dtWeblogDetailTermVo);
        dtWeblogDetailTermVo.setAvgVisitTime_str(DateUtils.foramtMillisecond(dtWeblogDetailTermVo.getAvgVisitTime()));
        return dtWeblogDetailTermVo;
    }
}
