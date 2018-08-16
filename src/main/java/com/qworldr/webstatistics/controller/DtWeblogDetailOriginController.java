package com.qworldr.webstatistics.controller;

import com.qworldr.webstatistics.bean.vo.DtWeblogDetailOriginVo;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailOrigin;
import com.qworldr.webstatistics.service.DtWeblogDetailOriginService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wujiazhen on 2018/3/31.
 */
@RestController
@RequestMapping("/weblog/origin")
public class DtWeblogDetailOriginController {
    @Autowired
    private DtWeblogDetailOriginService dtWeblogDetailOriginService;

    @RequestMapping("/topTen")
    public ResponseEntity<List<DtWeblogDetailOriginVo>>  topTen(){
        List<DtWeblogDetailOrigin>  dtWeblogDetailOrigins =dtWeblogDetailOriginService.getTopTen();
        return ResponseEntity.ok(vo(dtWeblogDetailOrigins));
    }

    public List<DtWeblogDetailOriginVo>  vo(List<DtWeblogDetailOrigin> dtWeblogDetailOrigins){
        List<DtWeblogDetailOriginVo> dtWeblogDetailOriginVos = new ArrayList<>();
        for(DtWeblogDetailOrigin dtWeblogDetailOrigin: dtWeblogDetailOrigins){
            dtWeblogDetailOriginVos.add(vo(dtWeblogDetailOrigin));
        }
        return dtWeblogDetailOriginVos;
    }
    public DtWeblogDetailOriginVo  vo(DtWeblogDetailOrigin dtWeblogDetailOrigin){
        DtWeblogDetailOriginVo dtWeblogDetailOriginVo = new DtWeblogDetailOriginVo();
        BeanUtils.copyProperties(dtWeblogDetailOrigin,dtWeblogDetailOriginVo);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits( 2 );
        dtWeblogDetailOriginVo.setPvPercent_cn(percentInstance.format(dtWeblogDetailOriginVo.getPvPercent()));
        dtWeblogDetailOriginVo.setAvgVisitTime_str(DateUtils.foramtMillisecond(dtWeblogDetailOriginVo.getAvgVisitTime()));
        return dtWeblogDetailOriginVo;
    }
}
