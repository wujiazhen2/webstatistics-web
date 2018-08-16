package com.qworldr.webstatistics.service;

import com.qworldr.webstatistics.generator.bean.DtWeblogDetailOrigin;

import java.util.List;

/**
 * Created by wujiazhen on 2018/3/31.
 */
public interface DtWeblogDetailOriginService {

    List<DtWeblogDetailOrigin> getTopTen();
}
