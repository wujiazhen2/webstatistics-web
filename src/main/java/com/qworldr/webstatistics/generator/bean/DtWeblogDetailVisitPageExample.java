package com.qworldr.webstatistics.generator.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DtWeblogDetailVisitPageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DtWeblogDetailVisitPageExample() {
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

        public Criteria andIsNewVisitorIsNull() {
            addCriterion("is_new_visitor is null");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorIsNotNull() {
            addCriterion("is_new_visitor is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorEqualTo(Boolean value) {
            addCriterion("is_new_visitor =", value, "isNewVisitor");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorNotEqualTo(Boolean value) {
            addCriterion("is_new_visitor <>", value, "isNewVisitor");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorGreaterThan(Boolean value) {
            addCriterion("is_new_visitor >", value, "isNewVisitor");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_new_visitor >=", value, "isNewVisitor");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorLessThan(Boolean value) {
            addCriterion("is_new_visitor <", value, "isNewVisitor");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorLessThanOrEqualTo(Boolean value) {
            addCriterion("is_new_visitor <=", value, "isNewVisitor");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorIn(List<Boolean> values) {
            addCriterion("is_new_visitor in", values, "isNewVisitor");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorNotIn(List<Boolean> values) {
            addCriterion("is_new_visitor not in", values, "isNewVisitor");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new_visitor between", value1, value2, "isNewVisitor");
            return (Criteria) this;
        }

        public Criteria andIsNewVisitorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new_visitor not between", value1, value2, "isNewVisitor");
            return (Criteria) this;
        }

        public Criteria andVisitPageIsNull() {
            addCriterion("visit_page is null");
            return (Criteria) this;
        }

        public Criteria andVisitPageIsNotNull() {
            addCriterion("visit_page is not null");
            return (Criteria) this;
        }

        public Criteria andVisitPageEqualTo(String value) {
            addCriterion("visit_page =", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageNotEqualTo(String value) {
            addCriterion("visit_page <>", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageGreaterThan(String value) {
            addCriterion("visit_page >", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageGreaterThanOrEqualTo(String value) {
            addCriterion("visit_page >=", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageLessThan(String value) {
            addCriterion("visit_page <", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageLessThanOrEqualTo(String value) {
            addCriterion("visit_page <=", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageLike(String value) {
            addCriterion("visit_page like", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageNotLike(String value) {
            addCriterion("visit_page not like", value, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageIn(List<String> values) {
            addCriterion("visit_page in", values, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageNotIn(List<String> values) {
            addCriterion("visit_page not in", values, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageBetween(String value1, String value2) {
            addCriterion("visit_page between", value1, value2, "visitPage");
            return (Criteria) this;
        }

        public Criteria andVisitPageNotBetween(String value1, String value2) {
            addCriterion("visit_page not between", value1, value2, "visitPage");
            return (Criteria) this;
        }

        public Criteria andOriginDomainIsNull() {
            addCriterion("origin_domain is null");
            return (Criteria) this;
        }

        public Criteria andOriginDomainIsNotNull() {
            addCriterion("origin_domain is not null");
            return (Criteria) this;
        }

        public Criteria andOriginDomainEqualTo(String value) {
            addCriterion("origin_domain =", value, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainNotEqualTo(String value) {
            addCriterion("origin_domain <>", value, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainGreaterThan(String value) {
            addCriterion("origin_domain >", value, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainGreaterThanOrEqualTo(String value) {
            addCriterion("origin_domain >=", value, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainLessThan(String value) {
            addCriterion("origin_domain <", value, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainLessThanOrEqualTo(String value) {
            addCriterion("origin_domain <=", value, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainLike(String value) {
            addCriterion("origin_domain like", value, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainNotLike(String value) {
            addCriterion("origin_domain not like", value, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainIn(List<String> values) {
            addCriterion("origin_domain in", values, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainNotIn(List<String> values) {
            addCriterion("origin_domain not in", values, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainBetween(String value1, String value2) {
            addCriterion("origin_domain between", value1, value2, "originDomain");
            return (Criteria) this;
        }

        public Criteria andOriginDomainNotBetween(String value1, String value2) {
            addCriterion("origin_domain not between", value1, value2, "originDomain");
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

        public Criteria andAvgDeepthIsNull() {
            addCriterion("avg_deepth is null");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthIsNotNull() {
            addCriterion("avg_deepth is not null");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthEqualTo(Integer value) {
            addCriterion("avg_deepth =", value, "avgDeepth");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthNotEqualTo(Integer value) {
            addCriterion("avg_deepth <>", value, "avgDeepth");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthGreaterThan(Integer value) {
            addCriterion("avg_deepth >", value, "avgDeepth");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("avg_deepth >=", value, "avgDeepth");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthLessThan(Integer value) {
            addCriterion("avg_deepth <", value, "avgDeepth");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthLessThanOrEqualTo(Integer value) {
            addCriterion("avg_deepth <=", value, "avgDeepth");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthIn(List<Integer> values) {
            addCriterion("avg_deepth in", values, "avgDeepth");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthNotIn(List<Integer> values) {
            addCriterion("avg_deepth not in", values, "avgDeepth");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthBetween(Integer value1, Integer value2) {
            addCriterion("avg_deepth between", value1, value2, "avgDeepth");
            return (Criteria) this;
        }

        public Criteria andAvgDeepthNotBetween(Integer value1, Integer value2) {
            addCriterion("avg_deepth not between", value1, value2, "avgDeepth");
            return (Criteria) this;
        }

        public Criteria andOutcountIsNull() {
            addCriterion("outcount is null");
            return (Criteria) this;
        }

        public Criteria andOutcountIsNotNull() {
            addCriterion("outcount is not null");
            return (Criteria) this;
        }

        public Criteria andOutcountEqualTo(Integer value) {
            addCriterion("outcount =", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountNotEqualTo(Integer value) {
            addCriterion("outcount <>", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountGreaterThan(Integer value) {
            addCriterion("outcount >", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("outcount >=", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountLessThan(Integer value) {
            addCriterion("outcount <", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountLessThanOrEqualTo(Integer value) {
            addCriterion("outcount <=", value, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountIn(List<Integer> values) {
            addCriterion("outcount in", values, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountNotIn(List<Integer> values) {
            addCriterion("outcount not in", values, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountBetween(Integer value1, Integer value2) {
            addCriterion("outcount between", value1, value2, "outcount");
            return (Criteria) this;
        }

        public Criteria andOutcountNotBetween(Integer value1, Integer value2) {
            addCriterion("outcount not between", value1, value2, "outcount");
            return (Criteria) this;
        }

        public Criteria andIntocountIsNull() {
            addCriterion("intocount is null");
            return (Criteria) this;
        }

        public Criteria andIntocountIsNotNull() {
            addCriterion("intocount is not null");
            return (Criteria) this;
        }

        public Criteria andIntocountEqualTo(Integer value) {
            addCriterion("intocount =", value, "intocount");
            return (Criteria) this;
        }

        public Criteria andIntocountNotEqualTo(Integer value) {
            addCriterion("intocount <>", value, "intocount");
            return (Criteria) this;
        }

        public Criteria andIntocountGreaterThan(Integer value) {
            addCriterion("intocount >", value, "intocount");
            return (Criteria) this;
        }

        public Criteria andIntocountGreaterThanOrEqualTo(Integer value) {
            addCriterion("intocount >=", value, "intocount");
            return (Criteria) this;
        }

        public Criteria andIntocountLessThan(Integer value) {
            addCriterion("intocount <", value, "intocount");
            return (Criteria) this;
        }

        public Criteria andIntocountLessThanOrEqualTo(Integer value) {
            addCriterion("intocount <=", value, "intocount");
            return (Criteria) this;
        }

        public Criteria andIntocountIn(List<Integer> values) {
            addCriterion("intocount in", values, "intocount");
            return (Criteria) this;
        }

        public Criteria andIntocountNotIn(List<Integer> values) {
            addCriterion("intocount not in", values, "intocount");
            return (Criteria) this;
        }

        public Criteria andIntocountBetween(Integer value1, Integer value2) {
            addCriterion("intocount between", value1, value2, "intocount");
            return (Criteria) this;
        }

        public Criteria andIntocountNotBetween(Integer value1, Integer value2) {
            addCriterion("intocount not between", value1, value2, "intocount");
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