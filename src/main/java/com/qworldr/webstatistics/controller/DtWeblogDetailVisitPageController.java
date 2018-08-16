package com.qworldr.webstatistics.controller;

import com.qworldr.webstatistics.bean.query.QueryParam;
import com.qworldr.webstatistics.bean.vo.DtWeblogDetailVisitPageVo;
import com.qworldr.webstatistics.bean.vo.DtWeblogDetailVisitorVo;
import com.qworldr.webstatistics.bean.vo.DtWeblogDetailVo;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetail;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitPage;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailVisitor;
import com.qworldr.webstatistics.service.DictionaryService;
import com.qworldr.webstatistics.service.DtWeblogDetailService;
import com.qworldr.webstatistics.service.DtWeblogDetailVisitPageService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wujiazhen on 2018/4/2.
 */
@RestController
@RequestMapping("/weblog/visitPage")
public class DtWeblogDetailVisitPageController {
    @Autowired
    private DtWeblogDetailVisitPageService dtWeblogDetailVisitPageService;
    @RequestMapping("/visitPage")
    public ResponseEntity<List<DtWeblogDetailVisitPageVo>> visitPage(QueryParam queryParam){
        List<DtWeblogDetailVisitPage> dtWeblogDetailVisitPages =dtWeblogDetailVisitPageService.selectDtWeblogVisitPage(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(dtWeblogDetailVisitPages));
    }
    @RequestMapping("/outPage")
    public ResponseEntity<List<DtWeblogDetailVisitPageVo>> outPage(QueryParam queryParam){
        List<DtWeblogDetailVisitPage> dtWeblogDetailVisitPages =dtWeblogDetailVisitPageService.selectDtWeblogVisitPageOrderByOutCount(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(dtWeblogDetailVisitPages));
    }
    @RequestMapping("/inPage")
    public ResponseEntity<List<DtWeblogDetailVisitPageVo>> inPage(QueryParam queryParam){
        List<DtWeblogDetailVisitPage> dtWeblogDetailVisitPages =dtWeblogDetailVisitPageService.selectDtWeblogVisitPageOrderByIntoCount(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(dtWeblogDetailVisitPages));
    }

    @RequestMapping("/summary")
    public ResponseEntity<DtWeblogDetailVisitPageVo> summary(QueryParam queryParam){
        DtWeblogDetailVisitPage dtWeblogDetailVisitPages =dtWeblogDetailVisitPageService.selectDtWeblogVisitPageSummary(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(dtWeblogDetailVisitPages));
    }

    public List<DtWeblogDetailVisitPageVo> vo(List<DtWeblogDetailVisitPage> dtWeblogDetailVisitPages){
        List<DtWeblogDetailVisitPageVo> dtWeblogDetailVisitPageVos= new ArrayList<>();
        for(DtWeblogDetailVisitPage dtWeblogDetailVisitPage: dtWeblogDetailVisitPages){
            dtWeblogDetailVisitPageVos.add(vo(dtWeblogDetailVisitPage));
        }
        return  dtWeblogDetailVisitPageVos;
    }
    public DtWeblogDetailVisitPageVo vo(DtWeblogDetailVisitPage dtWeblogDetailVisitPages){
        DtWeblogDetailVisitPageVo dtWeblogDetailVisitPageVo = new DtWeblogDetailVisitPageVo();
        if(dtWeblogDetailVisitPages!=null) {
            BeanUtils.copyProperties(dtWeblogDetailVisitPages, dtWeblogDetailVisitPageVo);
            dtWeblogDetailVisitPageVo.setAvgVisitTime_str(DateUtils.foramtMillisecond(dtWeblogDetailVisitPageVo.getAvgVisitTime()));
        }
        return dtWeblogDetailVisitPageVo;
    }
}
