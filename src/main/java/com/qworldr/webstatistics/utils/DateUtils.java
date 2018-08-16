package com.qworldr.webstatistics.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by wujiazhen on 2018/3/29.
 */

public class DateUtils {
    public static  String formatDate(Date date){
        return new SimpleDateFormat("yyyy-MM-dd").format(date);
    }

    public static Date getDate(){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTime();
    }
    public static Date getDate(int add_day){
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,add_day);
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
       /* return calendar.getTime();*/
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse("2018-03-31");
        } catch (ParseException e) {
            e.printStackTrace();
            return calendar.getTime();
        }
    }
    public static  String foramtMillisecond(int millisecond){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        String hms = formatter.format(millisecond*1000);
        return hms;
    }


}
