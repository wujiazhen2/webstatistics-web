package com.qworldr.webstatistics.controller;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailHour;
import com.qworldr.webstatistics.service.DictionaryService;
import com.qworldr.webstatistics.service.DtWeblogDetailHourService;
import com.qworldr.webstatistics.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wujiazhen on 2018/3/29.
 */
@RestController
@RequestMapping("/weblog/hour")
public class DtWeblogDetailHourController {
    @Autowired
    private  DtWeblogDetailHourService dtWeblogDetailHourService;
    @Autowired
    private DictionaryService dictService;
    @RequestMapping("/today")
    public ResponseEntity<List<DtWeblogDetailHour>>  todayWeblogDetail(){
        List<DtWeblogDetailHour> today = dtWeblogDetailHourService.getToday();
        return ResponseEntity.ok(today);
    }

}
