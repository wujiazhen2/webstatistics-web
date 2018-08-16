package com.qworldr.webstatistics.controller;

import com.qworldr.webstatistics.bean.query.QueryParam;
import com.qworldr.webstatistics.bean.vo.DtWeblogDetailOriginVo;
import com.qworldr.webstatistics.bean.vo.DtWeblogDetailVisitorVo;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitor;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVistor;
import com.qworldr.webstatistics.generator.dao.DtWeblogDetailVistorMapper;
import com.qworldr.webstatistics.service.DtWeblogDetailVisitorService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wujiazhen on 2018/4/1.
 */
@RestController
@RequestMapping("/weblog/visitor")
public class DtWeblogDetailVisitorController {
    @Autowired
    private DtWeblogDetailVisitorService dtWeblogDetailVisitorService;
    @RequestMapping("/today")
    public ResponseEntity<List<DtWeblogDetailVisitorVo>> getToday(){
            List<DtWeblogDetailVisitor> dtWeblogDetailVisitors=dtWeblogDetailVisitorService.getToday();
            return ResponseEntity.ok(vo(dtWeblogDetailVisitors));
    }
    @RequestMapping("/oldAndNewVisitor")
    public ResponseEntity<List<DtWeblogDetailVisitorVo>>  oldAndNewVisitor(QueryParam param){
        List<DtWeblogDetailVisitor> dtWeblogDetailVisitors = dtWeblogDetailVisitorService.selectDtWeblogDetailVisitorOrderBy(param.createQueryExample());
        return ResponseEntity.ok(vo(dtWeblogDetailVisitors));
    }
    public List<DtWeblogDetailVisitorVo> vo(List<DtWeblogDetailVisitor> dtWeblogDetailVisitors){
        List<DtWeblogDetailVisitorVo> dtWeblogDetailVisitorVos= new ArrayList<>();
        for(DtWeblogDetailVisitor dtWeblogDetailVisitor: dtWeblogDetailVisitors){
            dtWeblogDetailVisitorVos.add(vo(dtWeblogDetailVisitor));
        }
        return  dtWeblogDetailVisitorVos;
    }
    public DtWeblogDetailVisitorVo vo(DtWeblogDetailVisitor dtWeblogDetailVisitors){
            DtWeblogDetailVisitorVo dtWeblogDetailVisitorVo = new DtWeblogDetailVisitorVo();
            BeanUtils.copyProperties(dtWeblogDetailVisitors,dtWeblogDetailVisitorVo);
            dtWeblogDetailVisitorVo.setAvgVisitTime_str(DateUtils.foramtMillisecond(dtWeblogDetailVisitorVo.getAvgVisitTime()));
            return dtWeblogDetailVisitorVo;
    }
}
