package com.maple.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResumeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPeradvIsNull() {
            addCriterion("peradv is null");
            return (Criteria) this;
        }

        public Criteria andPeradvIsNotNull() {
            addCriterion("peradv is not null");
            return (Criteria) this;
        }

        public Criteria andPeradvEqualTo(String value) {
            addCriterion("peradv =", value, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvNotEqualTo(String value) {
            addCriterion("peradv <>", value, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvGreaterThan(String value) {
            addCriterion("peradv >", value, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvGreaterThanOrEqualTo(String value) {
            addCriterion("peradv >=", value, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvLessThan(String value) {
            addCriterion("peradv <", value, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvLessThanOrEqualTo(String value) {
            addCriterion("peradv <=", value, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvLike(String value) {
            addCriterion("peradv like", value, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvNotLike(String value) {
            addCriterion("peradv not like", value, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvIn(List<String> values) {
            addCriterion("peradv in", values, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvNotIn(List<String> values) {
            addCriterion("peradv not in", values, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvBetween(String value1, String value2) {
            addCriterion("peradv between", value1, value2, "peradv");
            return (Criteria) this;
        }

        public Criteria andPeradvNotBetween(String value1, String value2) {
            addCriterion("peradv not between", value1, value2, "peradv");
            return (Criteria) this;
        }

        public Criteria andStartpdIsNull() {
            addCriterion("startpd is null");
            return (Criteria) this;
        }

        public Criteria andStartpdIsNotNull() {
            addCriterion("startpd is not null");
            return (Criteria) this;
        }

        public Criteria andStartpdEqualTo(String value) {
            addCriterion("startpd =", value, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdNotEqualTo(String value) {
            addCriterion("startpd <>", value, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdGreaterThan(String value) {
            addCriterion("startpd >", value, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdGreaterThanOrEqualTo(String value) {
            addCriterion("startpd >=", value, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdLessThan(String value) {
            addCriterion("startpd <", value, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdLessThanOrEqualTo(String value) {
            addCriterion("startpd <=", value, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdLike(String value) {
            addCriterion("startpd like", value, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdNotLike(String value) {
            addCriterion("startpd not like", value, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdIn(List<String> values) {
            addCriterion("startpd in", values, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdNotIn(List<String> values) {
            addCriterion("startpd not in", values, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdBetween(String value1, String value2) {
            addCriterion("startpd between", value1, value2, "startpd");
            return (Criteria) this;
        }

        public Criteria andStartpdNotBetween(String value1, String value2) {
            addCriterion("startpd not between", value1, value2, "startpd");
            return (Criteria) this;
        }

        public Criteria andEndpdIsNull() {
            addCriterion("endpd is null");
            return (Criteria) this;
        }

        public Criteria andEndpdIsNotNull() {
            addCriterion("endpd is not null");
            return (Criteria) this;
        }

        public Criteria andEndpdEqualTo(String value) {
            addCriterion("endpd =", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdNotEqualTo(String value) {
            addCriterion("endpd <>", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdGreaterThan(String value) {
            addCriterion("endpd >", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdGreaterThanOrEqualTo(String value) {
            addCriterion("endpd >=", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdLessThan(String value) {
            addCriterion("endpd <", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdLessThanOrEqualTo(String value) {
            addCriterion("endpd <=", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdLike(String value) {
            addCriterion("endpd like", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdNotLike(String value) {
            addCriterion("endpd not like", value, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdIn(List<String> values) {
            addCriterion("endpd in", values, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdNotIn(List<String> values) {
            addCriterion("endpd not in", values, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdBetween(String value1, String value2) {
            addCriterion("endpd between", value1, value2, "endpd");
            return (Criteria) this;
        }

        public Criteria andEndpdNotBetween(String value1, String value2) {
            addCriterion("endpd not between", value1, value2, "endpd");
            return (Criteria) this;
        }

        public Criteria andIndustryidIsNull() {
            addCriterion("industryid is null");
            return (Criteria) this;
        }

        public Criteria andIndustryidIsNotNull() {
            addCriterion("industryid is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryidEqualTo(String value) {
            addCriterion("industryid =", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotEqualTo(String value) {
            addCriterion("industryid <>", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidGreaterThan(String value) {
            addCriterion("industryid >", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidGreaterThanOrEqualTo(String value) {
            addCriterion("industryid >=", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLessThan(String value) {
            addCriterion("industryid <", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLessThanOrEqualTo(String value) {
            addCriterion("industryid <=", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidLike(String value) {
            addCriterion("industryid like", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotLike(String value) {
            addCriterion("industryid not like", value, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidIn(List<String> values) {
            addCriterion("industryid in", values, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotIn(List<String> values) {
            addCriterion("industryid not in", values, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidBetween(String value1, String value2) {
            addCriterion("industryid between", value1, value2, "industryid");
            return (Criteria) this;
        }

        public Criteria andIndustryidNotBetween(String value1, String value2) {
            addCriterion("industryid not between", value1, value2, "industryid");
            return (Criteria) this;
        }

        public Criteria andSocialurlIsNull() {
            addCriterion("socialurl is null");
            return (Criteria) this;
        }

        public Criteria andSocialurlIsNotNull() {
            addCriterion("socialurl is not null");
            return (Criteria) this;
        }

        public Criteria andSocialurlEqualTo(String value) {
            addCriterion("socialurl =", value, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlNotEqualTo(String value) {
            addCriterion("socialurl <>", value, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlGreaterThan(String value) {
            addCriterion("socialurl >", value, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlGreaterThanOrEqualTo(String value) {
            addCriterion("socialurl >=", value, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlLessThan(String value) {
            addCriterion("socialurl <", value, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlLessThanOrEqualTo(String value) {
            addCriterion("socialurl <=", value, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlLike(String value) {
            addCriterion("socialurl like", value, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlNotLike(String value) {
            addCriterion("socialurl not like", value, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlIn(List<String> values) {
            addCriterion("socialurl in", values, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlNotIn(List<String> values) {
            addCriterion("socialurl not in", values, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlBetween(String value1, String value2) {
            addCriterion("socialurl between", value1, value2, "socialurl");
            return (Criteria) this;
        }

        public Criteria andSocialurlNotBetween(String value1, String value2) {
            addCriterion("socialurl not between", value1, value2, "socialurl");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("provinceid is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceid is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Integer value) {
            addCriterion("provinceid =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Integer value) {
            addCriterion("provinceid <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Integer value) {
            addCriterion("provinceid >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("provinceid >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Integer value) {
            addCriterion("provinceid <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Integer value) {
            addCriterion("provinceid <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Integer> values) {
            addCriterion("provinceid in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Integer> values) {
            addCriterion("provinceid not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Integer value1, Integer value2) {
            addCriterion("provinceid between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("provinceid not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityid is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityid is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(String value) {
            addCriterion("cityid =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(String value) {
            addCriterion("cityid <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(String value) {
            addCriterion("cityid >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(String value) {
            addCriterion("cityid >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(String value) {
            addCriterion("cityid <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(String value) {
            addCriterion("cityid <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLike(String value) {
            addCriterion("cityid like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotLike(String value) {
            addCriterion("cityid not like", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<String> values) {
            addCriterion("cityid in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<String> values) {
            addCriterion("cityid not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(String value1, String value2) {
            addCriterion("cityid between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(String value1, String value2) {
            addCriterion("cityid not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andPostionidIsNull() {
            addCriterion("postionid is null");
            return (Criteria) this;
        }

        public Criteria andPostionidIsNotNull() {
            addCriterion("postionid is not null");
            return (Criteria) this;
        }

        public Criteria andPostionidEqualTo(String value) {
            addCriterion("postionid =", value, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidNotEqualTo(String value) {
            addCriterion("postionid <>", value, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidGreaterThan(String value) {
            addCriterion("postionid >", value, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidGreaterThanOrEqualTo(String value) {
            addCriterion("postionid >=", value, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidLessThan(String value) {
            addCriterion("postionid <", value, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidLessThanOrEqualTo(String value) {
            addCriterion("postionid <=", value, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidLike(String value) {
            addCriterion("postionid like", value, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidNotLike(String value) {
            addCriterion("postionid not like", value, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidIn(List<String> values) {
            addCriterion("postionid in", values, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidNotIn(List<String> values) {
            addCriterion("postionid not in", values, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidBetween(String value1, String value2) {
            addCriterion("postionid between", value1, value2, "postionid");
            return (Criteria) this;
        }

        public Criteria andPostionidNotBetween(String value1, String value2) {
            addCriterion("postionid not between", value1, value2, "postionid");
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