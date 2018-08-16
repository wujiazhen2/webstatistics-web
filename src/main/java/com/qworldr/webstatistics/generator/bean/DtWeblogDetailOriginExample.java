package com.qworldr.webstatistics.generator.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DtWeblogDetailOriginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DtWeblogDetailOriginExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateIsNull() {
            addCriterion("analyze_date is null");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateIsNotNull() {
            addCriterion("analyze_date is not null");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateEqualTo(Date value) {
            addCriterionForJDBCDate("analyze_date =", value, "analyzeDate");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("analyze_date <>", value, "analyzeDate");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("analyze_date >", value, "analyzeDate");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("analyze_date >=", value, "analyzeDate");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateLessThan(Date value) {
            addCriterionForJDBCDate("analyze_date <", value, "analyzeDate");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("analyze_date <=", value, "analyzeDate");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateIn(List<Date> values) {
            addCriterionForJDBCDate("analyze_date in", values, "analyzeDate");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("analyze_date not in", values, "analyzeDate");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("analyze_date between", value1, value2, "analyzeDate");
            return (Criteria) this;
        }

        public Criteria andAnalyzeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("analyze_date not between", value1, value2, "analyzeDate");
            return (Criteria) this;
        }

        public Criteria andOriginUrlIsNull() {
            addCriterion("origin_url is null");
            return (Criteria) this;
        }

        public Criteria andOriginUrlIsNotNull() {
            addCriterion("origin_url is not null");
            return (Criteria) this;
        }

        public Criteria andOriginUrlEqualTo(String value) {
            addCriterion("origin_url =", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotEqualTo(String value) {
            addCriterion("origin_url <>", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlGreaterThan(String value) {
            addCriterion("origin_url >", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlGreaterThanOrEqualTo(String value) {
            addCriterion("origin_url >=", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlLessThan(String value) {
            addCriterion("origin_url <", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlLessThanOrEqualTo(String value) {
            addCriterion("origin_url <=", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlLike(String value) {
            addCriterion("origin_url like", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotLike(String value) {
            addCriterion("origin_url not like", value, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlIn(List<String> values) {
            addCriterion("origin_url in", values, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotIn(List<String> values) {
            addCriterion("origin_url not in", values, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlBetween(String value1, String value2) {
            addCriterion("origin_url between", value1, value2, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginUrlNotBetween(String value1, String value2) {
            addCriterion("origin_url not between", value1, value2, "originUrl");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andPvIsNull() {
            addCriterion("pv is null");
            return (Criteria) this;
        }

        public Criteria andPvIsNotNull() {
            addCriterion("pv is not null");
            return (Criteria) this;
        }

        public Criteria andPvEqualTo(Integer value) {
            addCriterion("pv =", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotEqualTo(Integer value) {
            addCriterion("pv <>", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThan(Integer value) {
            addCriterion("pv >", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvGreaterThanOrEqualTo(Integer value) {
            addCriterion("pv >=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThan(Integer value) {
            addCriterion("pv <", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvLessThanOrEqualTo(Integer value) {
            addCriterion("pv <=", value, "pv");
            return (Criteria) this;
        }

        public Criteria andPvIn(List<Integer> values) {
            addCriterion("pv in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotIn(List<Integer> values) {
            addCriterion("pv not in", values, "pv");
            return (Criteria) this;
        }

        public Criteria andPvBetween(Integer value1, Integer value2) {
            addCriterion("pv between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvNotBetween(Integer value1, Integer value2) {
            addCriterion("pv not between", value1, value2, "pv");
            return (Criteria) this;
        }

        public Criteria andPvPercentIsNull() {
            addCriterion("pv_percent is null");
            return (Criteria) this;
        }

        public Criteria andPvPercentIsNotNull() {
            addCriterion("pv_percent is not null");
            return (Criteria) this;
        }

        public Criteria andPvPercentEqualTo(BigDecimal value) {
            addCriterion("pv_percent =", value, "pvPercent");
            return (Criteria) this;
        }

        public Criteria andPvPercentNotEqualTo(BigDecimal value) {
            addCriterion("pv_percent <>", value, "pvPercent");
            return (Criteria) this;
        }

        public Criteria andPvPercentGreaterThan(BigDecimal value) {
            addCriterion("pv_percent >", value, "pvPercent");
            return (Criteria) this;
        }

        public Criteria andPvPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pv_percent >=", value, "pvPercent");
            return (Criteria) this;
        }

        public Criteria andPvPercentLessThan(BigDecimal value) {
            addCriterion("pv_percent <", value, "pvPercent");
            return (Criteria) this;
        }

        public Criteria andPvPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pv_percent <=", value, "pvPercent");
            return (Criteria) this;
        }

        public Criteria andPvPercentIn(List<BigDecimal> values) {
            addCriterion("pv_percent in", values, "pvPercent");
            return (Criteria) this;
        }

        public Criteria andPvPercentNotIn(List<BigDecimal> values) {
            addCriterion("pv_percent not in", values, "pvPercent");
            return (Criteria) this;
        }

        public Criteria andPvPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pv_percent between", value1, value2, "pvPercent");
            return (Criteria) this;
        }

        public Criteria andPvPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pv_percent not between", value1, value2, "pvPercent");
            return (Criteria) this;
        }

        public Criteria andUvIsNull() {
            addCriterion("uv is null");
            return (Criteria) this;
        }

        public Criteria andUvIsNotNull() {
            addCriterion("uv is not null");
            return (Criteria) this;
        }

        public Criteria andUvEqualTo(Integer value) {
            addCriterion("uv =", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotEqualTo(Integer value) {
            addCriterion("uv <>", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThan(Integer value) {
            addCriterion("uv >", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThanOrEqualTo(Integer value) {
            addCriterion("uv >=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThan(Integer value) {
            addCriterion("uv <", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThanOrEqualTo(Integer value) {
            addCriterion("uv <=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvIn(List<Integer> values) {
            addCriterion("uv in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotIn(List<Integer> values) {
            addCriterion("uv not in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvBetween(Integer value1, Integer value2) {
            addCriterion("uv between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotBetween(Integer value1, Integer value2) {
            addCriterion("uv not between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andUvPercentIsNull() {
            addCriterion("uv_percent is null");
            return (Criteria) this;
        }

        public Criteria andUvPercentIsNotNull() {
            addCriterion("uv_percent is not null");
            return (Criteria) this;
        }

        public Criteria andUvPercentEqualTo(BigDecimal value) {
            addCriterion("uv_percent =", value, "uvPercent");
            return (Criteria) this;
        }

        public Criteria andUvPercentNotEqualTo(BigDecimal value) {
            addCriterion("uv_percent <>", value, "uvPercent");
            return (Criteria) this;
        }

        public Criteria andUvPercentGreaterThan(BigDecimal value) {
            addCriterion("uv_percent >", value, "uvPercent");
            return (Criteria) this;
        }

        public Criteria andUvPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("uv_percent >=", value, "uvPercent");
            return (Criteria) this;
        }

        public Criteria andUvPercentLessThan(BigDecimal value) {
            addCriterion("uv_percent <", value, "uvPercent");
            return (Criteria) this;
        }

        public Criteria andUvPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("uv_percent <=", value, "uvPercent");
            return (Criteria) this;
        }

        public Criteria andUvPercentIn(List<BigDecimal> values) {
            addCriterion("uv_percent in", values, "uvPercent");
            return (Criteria) this;
        }

        public Criteria andUvPercentNotIn(List<BigDecimal> values) {
            addCriterion("uv_percent not in", values, "uvPercent");
            return (Criteria) this;
        }

        public Criteria andUvPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("uv_percent between", value1, value2, "uvPercent");
            return (Criteria) this;
        }

        public Criteria andUvPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("uv_percent not between", value1, value2, "uvPercent");
            return (Criteria) this;
        }

        public Criteria andIpNumIsNull() {
            addCriterion("ip_num is null");
            return (Criteria) this;
        }

        public Criteria andIpNumIsNotNull() {
            addCriterion("ip_num is not null");
            return (Criteria) this;
        }

        public Criteria andIpNumEqualTo(Integer value) {
            addCriterion("ip_num =", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumNotEqualTo(Integer value) {
            addCriterion("ip_num <>", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumGreaterThan(Integer value) {
            addCriterion("ip_num >", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ip_num >=", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumLessThan(Integer value) {
            addCriterion("ip_num <", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumLessThanOrEqualTo(Integer value) {
            addCriterion("ip_num <=", value, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumIn(List<Integer> values) {
            addCriterion("ip_num in", values, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumNotIn(List<Integer> values) {
            addCriterion("ip_num not in", values, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumBetween(Integer value1, Integer value2) {
            addCriterion("ip_num between", value1, value2, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ip_num not between", value1, value2, "ipNum");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentIsNull() {
            addCriterion("ip_num_percent is null");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentIsNotNull() {
            addCriterion("ip_num_percent is not null");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentEqualTo(BigDecimal value) {
            addCriterion("ip_num_percent =", value, "ipNumPercent");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentNotEqualTo(BigDecimal value) {
            addCriterion("ip_num_percent <>", value, "ipNumPercent");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentGreaterThan(BigDecimal value) {
            addCriterion("ip_num_percent >", value, "ipNumPercent");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ip_num_percent >=", value, "ipNumPercent");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentLessThan(BigDecimal value) {
            addCriterion("ip_num_percent <", value, "ipNumPercent");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ip_num_percent <=", value, "ipNumPercent");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentIn(List<BigDecimal> values) {
            addCriterion("ip_num_percent in", values, "ipNumPercent");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentNotIn(List<BigDecimal> values) {
            addCriterion("ip_num_percent not in", values, "ipNumPercent");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ip_num_percent between", value1, value2, "ipNumPercent");
            return (Criteria) this;
        }

        public Criteria andIpNumPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ip_num_percent not between", value1, value2, "ipNumPercent");
            return (Criteria) this;
        }

        public Criteria andNewVisitorIsNull() {
            addCriterion("new_visitor is null");
            return (Criteria) this;
        }

        public Criteria andNewVisitorIsNotNull() {
            addCriterion("new_visitor is not null");
            return (Criteria) this;
        }

        public Criteria andNewVisitorEqualTo(Integer value) {
            addCriterion("new_visitor =", value, "newVisitor");
            return (Criteria) this;
        }

        public Criteria andNewVisitorNotEqualTo(Integer value) {
            addCriterion("new_visitor <>", value, "newVisitor");
            return (Criteria) this;
        }

        public Criteria andNewVisitorGreaterThan(Integer value) {
            addCriterion("new_visitor >", value, "newVisitor");
            return (Criteria) this;
        }

        public Criteria andNewVisitorGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_visitor >=", value, "newVisitor");
            return (Criteria) this;
        }

        public Criteria andNewVisitorLessThan(Integer value) {
            addCriterion("new_visitor <", value, "newVisitor");
            return (Criteria) this;
        }

        public Criteria andNewVisitorLessThanOrEqualTo(Integer value) {
            addCriterion("new_visitor <=", value, "newVisitor");
            return (Criteria) this;
        }

        public Criteria andNewVisitorIn(List<Integer> values) {
            addCriterion("new_visitor in", values, "newVisitor");
            return (Criteria) this;
        }

        public Criteria andNewVisitorNotIn(List<Integer> values) {
            addCriterion("new_visitor not in", values, "newVisitor");
            return (Criteria) this;
        }

        public Criteria andNewVisitorBetween(Integer value1, Integer value2) {
            addCriterion("new_visitor between", value1, value2, "newVisitor");
            return (Criteria) this;
        }

        public Criteria andNewVisitorNotBetween(Integer value1, Integer value2) {
            addCriterion("new_visitor not between", value1, value2, "newVisitor");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentIsNull() {
            addCriterion("new_visitor_percent is null");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentIsNotNull() {
            addCriterion("new_visitor_percent is not null");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentEqualTo(BigDecimal value) {
            addCriterion("new_visitor_percent =", value, "newVisitorPercent");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentNotEqualTo(BigDecimal value) {
            addCriterion("new_visitor_percent <>", value, "newVisitorPercent");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentGreaterThan(BigDecimal value) {
            addCriterion("new_visitor_percent >", value, "newVisitorPercent");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_visitor_percent >=", value, "newVisitorPercent");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentLessThan(BigDecimal value) {
            addCriterion("new_visitor_percent <", value, "newVisitorPercent");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_visitor_percent <=", value, "newVisitorPercent");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentIn(List<BigDecimal> values) {
            addCriterion("new_visitor_percent in", values, "newVisitorPercent");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentNotIn(List<BigDecimal> values) {
            addCriterion("new_visitor_percent not in", values, "newVisitorPercent");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_visitor_percent between", value1, value2, "newVisitorPercent");
            return (Criteria) this;
        }

        public Criteria andNewVisitorPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_visitor_percent not between", value1, value2, "newVisitorPercent");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeIsNull() {
            addCriterion("avg_visit_time is null");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeIsNotNull() {
            addCriterion("avg_visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeEqualTo(Integer value) {
            addCriterion("avg_visit_time =", value, "avgVisitTime");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeNotEqualTo(Integer value) {
            addCriterion("avg_visit_time <>", value, "avgVisitTime");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeGreaterThan(Integer value) {
            addCriterion("avg_visit_time >", value, "avgVisitTime");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_visit_time >=", value, "avgVisitTime");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeLessThan(Integer value) {
            addCriterion("avg_visit_time <", value, "avgVisitTime");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("avg_visit_time <=", value, "avgVisitTime");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeIn(List<Integer> values) {
            addCriterion("avg_visit_time in", values, "avgVisitTime");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeNotIn(List<Integer> values) {
            addCriterion("avg_visit_time not in", values, "avgVisitTime");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeBetween(Integer value1, Integer value2) {
            addCriterion("avg_visit_time between", value1, value2, "avgVisitTime");
            return (Criteria) this;
        }

        public Criteria andAvgVisitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_visit_time not between", value1, value2, "avgVisitTime");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsIsNull() {
            addCriterion("avg_conversions is null");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsIsNotNull() {
            addCriterion("avg_conversions is not null");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsEqualTo(Integer value) {
            addCriterion("avg_conversions =", value, "avgConversions");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsNotEqualTo(Integer value) {
            addCriterion("avg_conversions <>", value, "avgConversions");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsGreaterThan(Integer value) {
            addCriterion("avg_conversions >", value, "avgConversions");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_conversions >=", value, "avgConversions");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsLessThan(Integer value) {
            addCriterion("avg_conversions <", value, "avgConversions");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsLessThanOrEqualTo(Integer value) {
            addCriterion("avg_conversions <=", value, "avgConversions");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsIn(List<Integer> values) {
            addCriterion("avg_conversions in", values, "avgConversions");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsNotIn(List<Integer> values) {
            addCriterion("avg_conversions not in", values, "avgConversions");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsBetween(Integer value1, Integer value2) {
            addCriterion("avg_conversions between", value1, value2, "avgConversions");
            return (Criteria) this;
        }

        public Criteria andAvgConversionsNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_conversions not between", value1, value2, "avgConversions");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentIsNull() {
            addCriterion("jump_out_percent is null");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentIsNotNull() {
            addCriterion("jump_out_percent is not null");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentEqualTo(BigDecimal value) {
            addCriterion("jump_out_percent =", value, "jumpOutPercent");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentNotEqualTo(BigDecimal value) {
            addCriterion("jump_out_percent <>", value, "jumpOutPercent");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentGreaterThan(BigDecimal value) {
            addCriterion("jump_out_percent >", value, "jumpOutPercent");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jump_out_percent >=", value, "jumpOutPercent");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentLessThan(BigDecimal value) {
            addCriterion("jump_out_percent <", value, "jumpOutPercent");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jump_out_percent <=", value, "jumpOutPercent");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentIn(List<BigDecimal> values) {
            addCriterion("jump_out_percent in", values, "jumpOutPercent");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentNotIn(List<BigDecimal> values) {
            addCriterion("jump_out_percent not in", values, "jumpOutPercent");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jump_out_percent between", value1, value2, "jumpOutPercent");
            return (Criteria) this;
        }

        public Criteria andJumpOutPercentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jump_out_percent not between", value1, value2, "jumpOutPercent");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}