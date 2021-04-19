package com.maple.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EduExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EduExample() {
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

        public Criteria andEdunameIsNull() {
            addCriterion("eduname is null");
            return (Criteria) this;
        }

        public Criteria andEdunameIsNotNull() {
            addCriterion("eduname is not null");
            return (Criteria) this;
        }

        public Criteria andEdunameEqualTo(String value) {
            addCriterion("eduname =", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotEqualTo(String value) {
            addCriterion("eduname <>", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameGreaterThan(String value) {
            addCriterion("eduname >", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameGreaterThanOrEqualTo(String value) {
            addCriterion("eduname >=", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameLessThan(String value) {
            addCriterion("eduname <", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameLessThanOrEqualTo(String value) {
            addCriterion("eduname <=", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameLike(String value) {
            addCriterion("eduname like", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotLike(String value) {
            addCriterion("eduname not like", value, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameIn(List<String> values) {
            addCriterion("eduname in", values, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotIn(List<String> values) {
            addCriterion("eduname not in", values, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameBetween(String value1, String value2) {
            addCriterion("eduname between", value1, value2, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdunameNotBetween(String value1, String value2) {
            addCriterion("eduname not between", value1, value2, "eduname");
            return (Criteria) this;
        }

        public Criteria andEdulevelIsNull() {
            addCriterion("edulevel is null");
            return (Criteria) this;
        }

        public Criteria andEdulevelIsNotNull() {
            addCriterion("edulevel is not null");
            return (Criteria) this;
        }

        public Criteria andEdulevelEqualTo(String value) {
            addCriterion("edulevel =", value, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelNotEqualTo(String value) {
            addCriterion("edulevel <>", value, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelGreaterThan(String value) {
            addCriterion("edulevel >", value, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelGreaterThanOrEqualTo(String value) {
            addCriterion("edulevel >=", value, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelLessThan(String value) {
            addCriterion("edulevel <", value, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelLessThanOrEqualTo(String value) {
            addCriterion("edulevel <=", value, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelLike(String value) {
            addCriterion("edulevel like", value, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelNotLike(String value) {
            addCriterion("edulevel not like", value, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelIn(List<String> values) {
            addCriterion("edulevel in", values, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelNotIn(List<String> values) {
            addCriterion("edulevel not in", values, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelBetween(String value1, String value2) {
            addCriterion("edulevel between", value1, value2, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEdulevelNotBetween(String value1, String value2) {
            addCriterion("edulevel not between", value1, value2, "edulevel");
            return (Criteria) this;
        }

        public Criteria andEduproIsNull() {
            addCriterion("edupro is null");
            return (Criteria) this;
        }

        public Criteria andEduproIsNotNull() {
            addCriterion("edupro is not null");
            return (Criteria) this;
        }

        public Criteria andEduproEqualTo(String value) {
            addCriterion("edupro =", value, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproNotEqualTo(String value) {
            addCriterion("edupro <>", value, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproGreaterThan(String value) {
            addCriterion("edupro >", value, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproGreaterThanOrEqualTo(String value) {
            addCriterion("edupro >=", value, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproLessThan(String value) {
            addCriterion("edupro <", value, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproLessThanOrEqualTo(String value) {
            addCriterion("edupro <=", value, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproLike(String value) {
            addCriterion("edupro like", value, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproNotLike(String value) {
            addCriterion("edupro not like", value, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproIn(List<String> values) {
            addCriterion("edupro in", values, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproNotIn(List<String> values) {
            addCriterion("edupro not in", values, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproBetween(String value1, String value2) {
            addCriterion("edupro between", value1, value2, "edupro");
            return (Criteria) this;
        }

        public Criteria andEduproNotBetween(String value1, String value2) {
            addCriterion("edupro not between", value1, value2, "edupro");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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