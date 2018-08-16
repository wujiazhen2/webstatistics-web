package com.qworldr.webstatistics.bean.query;

import com.qworldr.webstatistics.bean.example.QueryExample;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetail;
import com.qworldr.webstatistics.generator.bean.DtWeblogDetailExample;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by wujiazhen on 2018/4/2.
 */
public class QueryParam {
   @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date start_time;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date end_time;
    private String originDomain;
    private Integer isNewVisitor;

    private Integer limit;
    private Integer offset;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Date getStart_time() {
    return start_time;
   }

   public void setStart_time(Date start_time) {
    this.start_time = start_time;
   }

   public Date getEnd_time() {
    return end_time;
   }

   public void setEnd_time(Date end_time) {
    this.end_time = end_time;
   }


    public String getOriginDomain() {
        return originDomain;
    }

    public void setOriginDomain(String originDomain) {
        this.originDomain = originDomain;
    }


   public Integer getIsNewVisitor() {
    return isNewVisitor;
   }

   public void setIsNewVisitor(Integer isNewVisitor) {
    this.isNewVisitor = isNewVisitor;
   }

    public QueryExample  createQueryExample(){
       QueryExample queryExample  = new QueryExample();
       if(this.start_time!=null) {
           queryExample.setStart_time(new java.sql.Date(this.getStart_time().getTime()));
       }
       if(this.end_time!=null) {
           queryExample.setEnd_time(new java.sql.Date(this.getEnd_time().getTime()));
       }
       queryExample.setIsNewVisitor(this.getIsNewVisitor());
       queryExample.setOriginDomain(this.getOriginDomain());
       queryExample.setLimit(this.getLimit());
       queryExample.setOffset(this.getOffset());
       return  queryExample;
    }


}
