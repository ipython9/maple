package com.maple.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProducExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProducExample() {
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

        public Criteria andCompyidIsNull() {
            addCriterion("compyid is null");
            return (Criteria) this;
        }

        public Criteria andCompyidIsNotNull() {
            addCriterion("compyid is not null");
            return (Criteria) this;
        }

        public Criteria andCompyidEqualTo(String value) {
            addCriterion("compyid =", value, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidNotEqualTo(String value) {
            addCriterion("compyid <>", value, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidGreaterThan(String value) {
            addCriterion("compyid >", value, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidGreaterThanOrEqualTo(String value) {
            addCriterion("compyid >=", value, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidLessThan(String value) {
            addCriterion("compyid <", value, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidLessThanOrEqualTo(String value) {
            addCriterion("compyid <=", value, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidLike(String value) {
            addCriterion("compyid like", value, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidNotLike(String value) {
            addCriterion("compyid not like", value, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidIn(List<String> values) {
            addCriterion("compyid in", values, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidNotIn(List<String> values) {
            addCriterion("compyid not in", values, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidBetween(String value1, String value2) {
            addCriterion("compyid between", value1, value2, "compyid");
            return (Criteria) this;
        }

        public Criteria andCompyidNotBetween(String value1, String value2) {
            addCriterion("compyid not between", value1, value2, "compyid");
            return (Criteria) this;
        }

        public Criteria andProdunameIsNull() {
            addCriterion("produname is null");
            return (Criteria) this;
        }

        public Criteria andProdunameIsNotNull() {
            addCriterion("produname is not null");
            return (Criteria) this;
        }

        public Criteria andProdunameEqualTo(String value) {
            addCriterion("produname =", value, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameNotEqualTo(String value) {
            addCriterion("produname <>", value, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameGreaterThan(String value) {
            addCriterion("produname >", value, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameGreaterThanOrEqualTo(String value) {
            addCriterion("produname >=", value, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameLessThan(String value) {
            addCriterion("produname <", value, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameLessThanOrEqualTo(String value) {
            addCriterion("produname <=", value, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameLike(String value) {
            addCriterion("produname like", value, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameNotLike(String value) {
            addCriterion("produname not like", value, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameIn(List<String> values) {
            addCriterion("produname in", values, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameNotIn(List<String> values) {
            addCriterion("produname not in", values, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameBetween(String value1, String value2) {
            addCriterion("produname between", value1, value2, "produname");
            return (Criteria) this;
        }

        public Criteria andProdunameNotBetween(String value1, String value2) {
            addCriterion("produname not between", value1, value2, "produname");
            return (Criteria) this;
        }

        public Criteria andProducontentIsNull() {
            addCriterion("producontent is null");
            return (Criteria) this;
        }

        public Criteria andProducontentIsNotNull() {
            addCriterion("producontent is not null");
            return (Criteria) this;
        }

        public Criteria andProducontentEqualTo(String value) {
            addCriterion("producontent =", value, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentNotEqualTo(String value) {
            addCriterion("producontent <>", value, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentGreaterThan(String value) {
            addCriterion("producontent >", value, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentGreaterThanOrEqualTo(String value) {
            addCriterion("producontent >=", value, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentLessThan(String value) {
            addCriterion("producontent <", value, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentLessThanOrEqualTo(String value) {
            addCriterion("producontent <=", value, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentLike(String value) {
            addCriterion("producontent like", value, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentNotLike(String value) {
            addCriterion("producontent not like", value, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentIn(List<String> values) {
            addCriterion("producontent in", values, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentNotIn(List<String> values) {
            addCriterion("producontent not in", values, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentBetween(String value1, String value2) {
            addCriterion("producontent between", value1, value2, "producontent");
            return (Criteria) this;
        }

        public Criteria andProducontentNotBetween(String value1, String value2) {
            addCriterion("producontent not between", value1, value2, "producontent");
            return (Criteria) this;
        }

        public Criteria andProduurlIsNull() {
            addCriterion("produurl is null");
            return (Criteria) this;
        }

        public Criteria andProduurlIsNotNull() {
            addCriterion("produurl is not null");
            return (Criteria) this;
        }

        public Criteria andProduurlEqualTo(String value) {
            addCriterion("produurl =", value, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlNotEqualTo(String value) {
            addCriterion("produurl <>", value, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlGreaterThan(String value) {
            addCriterion("produurl >", value, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlGreaterThanOrEqualTo(String value) {
            addCriterion("produurl >=", value, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlLessThan(String value) {
            addCriterion("produurl <", value, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlLessThanOrEqualTo(String value) {
            addCriterion("produurl <=", value, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlLike(String value) {
            addCriterion("produurl like", value, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlNotLike(String value) {
            addCriterion("produurl not like", value, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlIn(List<String> values) {
            addCriterion("produurl in", values, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlNotIn(List<String> values) {
            addCriterion("produurl not in", values, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlBetween(String value1, String value2) {
            addCriterion("produurl between", value1, value2, "produurl");
            return (Criteria) this;
        }

        public Criteria andProduurlNotBetween(String value1, String value2) {
            addCriterion("produurl not between", value1, value2, "produurl");
            return (Criteria) this;
        }

        public Criteria andProdupicIsNull() {
            addCriterion("produpic is null");
            return (Criteria) this;
        }

        public Criteria andProdupicIsNotNull() {
            addCriterion("produpic is not null");
            return (Criteria) this;
        }

        public Criteria andProdupicEqualTo(String value) {
            addCriterion("produpic =", value, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicNotEqualTo(String value) {
            addCriterion("produpic <>", value, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicGreaterThan(String value) {
            addCriterion("produpic >", value, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicGreaterThanOrEqualTo(String value) {
            addCriterion("produpic >=", value, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicLessThan(String value) {
            addCriterion("produpic <", value, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicLessThanOrEqualTo(String value) {
            addCriterion("produpic <=", value, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicLike(String value) {
            addCriterion("produpic like", value, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicNotLike(String value) {
            addCriterion("produpic not like", value, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicIn(List<String> values) {
            addCriterion("produpic in", values, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicNotIn(List<String> values) {
            addCriterion("produpic not in", values, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicBetween(String value1, String value2) {
            addCriterion("produpic between", value1, value2, "produpic");
            return (Criteria) this;
        }

        public Criteria andProdupicNotBetween(String value1, String value2) {
            addCriterion("produpic not between", value1, value2, "produpic");
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