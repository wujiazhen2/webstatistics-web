package com.qworldr.webstatistics.utils;

import java.util.Collection;
import java.util.List;

/**
 * Created by wujiazhen on 2018/3/29.
 */
public class CollectionUtils {

    public  static  <T> T getOne(List<T> list){
        if(list!=null && list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
