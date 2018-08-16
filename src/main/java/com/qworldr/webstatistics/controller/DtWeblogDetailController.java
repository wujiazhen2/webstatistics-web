package com.qworldr.webstatistics.controller;

import com.qworldr.webstatistics.bean.query.QueryParam;
import com.qworldr.webstatistics.bean.vo.DtWeblogDetailVo;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetail;
import com.qworldr.webstatistics.service.DictionaryService;
import com.qworldr.webstatistics.service.DtWeblogDetailService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wujiazhen on 2018/4/2.
 */
@RestController
@RequestMapping("/weblog/detail")
public class DtWeblogDetailController {
    @Autowired
    private DtWeblogDetailService dtWeblogDetailService;
    @Autowired
    private DictionaryService dictService;
    @RequestMapping("/summary")
    public ResponseEntity<DtWeblogDetailVo> summary(QueryParam queryParam){
        DtWeblogDetail dtWeblogDetail= dtWeblogDetailService.selectSumWebLogDetail(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(dtWeblogDetail));
    }

    @RequestMapping("/trend")
    public ResponseEntity<List<DtWeblogDetailVo>> trend(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWebLogDetail(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }
    @RequestMapping("/originClassifyGroupByDateTime")
    public ResponseEntity<List<DtWeblogDetailVo>> originClassifyGroupByDateTime(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWebLogDetailGroupByOriginTypeAndDateTime(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }
    @RequestMapping("/originClassify")
    public ResponseEntity<List<DtWeblogDetailVo>> originClassify(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWebLogDetailGroupByOriginType(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }

    @RequestMapping("/originDomainGroupByDateTime")
    public ResponseEntity<List<DtWeblogDetailVo>> originDomainGroupByDateTime(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWebLogDetailGroupByOriginDomainAndDateTime(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }
    @RequestMapping("/originDomain")
    public ResponseEntity<List<DtWeblogDetailVo>> originDomain(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWebLogDetailGroupByOriginDomain(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }
    @RequestMapping("/originPageGroupByDateTime")
    public ResponseEntity<List<DtWeblogDetailVo>> originPageGroupByDateTime(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWebLogDetailGroupByOriginPageAndDateTime(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }
    @RequestMapping("/originPage")
    public ResponseEntity<List<DtWeblogDetailVo>> originPage(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWebLogDetailGroupByOriginPage(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }
    @RequestMapping("/originSEGroupByDateTime")
    public ResponseEntity<List<DtWeblogDetailVo>> originSEGroupByDateTime(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWebLogDetailGroupByOriginSEAndDateTime(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }
    @RequestMapping("/originSE")
    public ResponseEntity<List<DtWeblogDetailVo>> originSE(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWebLogDetailGroupByOriginSE(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }
    @RequestMapping("/topDomain")
    public ResponseEntity<List<DtWeblogDetailVo>> topDomain(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWeblogDetailTopDomain(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }
    @RequestMapping("/topPage")
    public ResponseEntity<List<DtWeblogDetailVo>> topPage(QueryParam queryParam){
        List<DtWeblogDetail>  list =dtWeblogDetailService.selectWeblogDetailTopPage(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(list));
    }


    public List<DtWeblogDetailVo>  vo(List<DtWeblogDetail> dtWeblogDetails){
        List<DtWeblogDetailVo> list = new ArrayList<>();
        for(DtWeblogDetail dtWeblogDetail:dtWeblogDetails){
            list.add(vo(dtWeblogDetail));
        }
        return list;
    }
    public DtWeblogDetailVo  vo(DtWeblogDetail dtWeblogDetail){
        if(dtWeblogDetail==null)
            return null;
        DtWeblogDetailVo dtWeblogDetailVo = new DtWeblogDetailVo();
        BeanUtils.copyProperties(dtWeblogDetail,dtWeblogDetailVo);
        if(dtWeblogDetailVo.getOriginType()!=null) {
            dtWeblogDetailVo.setOriginType_cn(dictService.getDetial("origin_type", dtWeblogDetailVo.getOriginType()));
        }
        dtWeblogDetailVo.setAvgVisitTime_str(DateUtils.foramtMillisecond(dtWeblogDetailVo.getAvgVisitTime()));
        dtWeblogDetailVo.setDateStr(DateUtils.formatDate(dtWeblogDetailVo.getAnalyzeDate())+" "+dtWeblogDetailVo.getHour()+":00:00~"+dtWeblogDetailVo.getHour()+":59:59");
        return dtWeblogDetailVo;
    }
}
