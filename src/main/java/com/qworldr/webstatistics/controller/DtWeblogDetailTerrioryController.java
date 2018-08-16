package com.qworldr.webstatistics.controller;

import com.qworldr.webstatistics.bean.vo.DtWeblogDetailTerrioryVo;
import com.qworldr.webstatistics.bean.query.QueryParam;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailTerriory;
import com.qworldr.webstatistics.service.DtWeblogDetailTerrioryService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wujiazhen on 2018/4/7.
 */
@Controller
@RequestMapping("/weblog/terriory")
public class DtWeblogDetailTerrioryController {

    @Autowired
    private DtWeblogDetailTerrioryService dtWeblogDetailTerrioryService;

    @RequestMapping("/list")
    public ResponseEntity<List<DtWeblogDetailTerrioryVo>> list(QueryParam queryParam){
        List<DtWeblogDetailTerriory> dtWeblogDetailTerriorys=  dtWeblogDetailTerrioryService.selectListGroupByTerriory(queryParam.createQueryExample());
        return ResponseEntity.ok(vo(dtWeblogDetailTerriorys));
    }

    public List<DtWeblogDetailTerrioryVo> vo(List<DtWeblogDetailTerriory> DtWeblogDetailTerriorys){
        List<DtWeblogDetailTerrioryVo> DtWeblogDetailTerrioryVos = new ArrayList<>();
        for(DtWeblogDetailTerriory dtWeblogDetailTerriory: DtWeblogDetailTerriorys){
            DtWeblogDetailTerrioryVos.add(vo(dtWeblogDetailTerriory));
        }
        return DtWeblogDetailTerrioryVos;
    }
    public DtWeblogDetailTerrioryVo  vo(DtWeblogDetailTerriory dtWeblogDetailTerriory){
        DtWeblogDetailTerrioryVo dtWeblogDetailTerrioryVo = new DtWeblogDetailTerrioryVo();
        BeanUtils.copyProperties(dtWeblogDetailTerriory,dtWeblogDetailTerrioryVo);
        return dtWeblogDetailTerrioryVo;
    }
}
