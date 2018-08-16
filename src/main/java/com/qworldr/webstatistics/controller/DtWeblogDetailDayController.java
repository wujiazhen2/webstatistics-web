package com.qworldr.webstatistics.controller;

import com.qworldr.webstatistics.bean.vo.DtWeblogDetailDayVo;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailDay;
import com.qworldr.webstatistics.service.DictionaryService;
import com.qworldr.webstatistics.service.DtWeblogDetailDayService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wujiazhen on 2018/3/29.
 */
@RestController
@RequestMapping("/weblog/day")
public class DtWeblogDetailDayController {
    @Autowired
    private DtWeblogDetailDayService dtWeblogDetailDayService;
    @Autowired
    private DictionaryService dictService;

    @RequestMapping("/summary")
    public ResponseEntity<List<DtWeblogDetailDayVo>>  summary(){
        List<DtWeblogDetailDay> summaryWeblogDetail = dtWeblogDetailDayService.getSummaryWeblogDetail();
        return ResponseEntity.ok(vo(summaryWeblogDetail));
    }

    public List<DtWeblogDetailDayVo>  vo(List<DtWeblogDetailDay> dtWeblogDetailDays){
        List<DtWeblogDetailDayVo> dtWeblogDetailDayVos = new ArrayList<>();
        for(DtWeblogDetailDay dtWeblogDetailDay:dtWeblogDetailDays){
            dtWeblogDetailDayVos.add(vo(dtWeblogDetailDay));
        }
        return dtWeblogDetailDayVos;
    }
    public DtWeblogDetailDayVo  vo(DtWeblogDetailDay dtWeblogDetailDay){
        DtWeblogDetailDayVo dtweblogdetailvo=new DtWeblogDetailDayVo();
        BeanUtils.copyProperties(dtWeblogDetailDay,dtweblogdetailvo);
        if(dtweblogdetailvo.getType().equals("0")) {
            dtweblogdetailvo.setType_cn(DateUtils.formatDate(dtWeblogDetailDay.getAnalyzeDate()));
        }else{
            dtweblogdetailvo.setType_cn(dictService.getDetial("summary", dtweblogdetailvo.getType()));
        }
        dtweblogdetailvo.setAvgVisitTime_str(DateUtils.foramtMillisecond(dtweblogdetailvo.getAvgVisitTime()));
        return dtweblogdetailvo;
    }
}
