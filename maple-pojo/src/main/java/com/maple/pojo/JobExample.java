package com.maple.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExample() {
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

        public Criteria andCompidIsNull() {
            addCriterion("compid is null");
            return (Criteria) this;
        }

        public Criteria andCompidIsNotNull() {
            addCriterion("compid is not null");
            return (Criteria) this;
        }

        public Criteria andCompidEqualTo(String value) {
            addCriterion("compid =", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidNotEqualTo(String value) {
            addCriterion("compid <>", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidGreaterThan(String value) {
            addCriterion("compid >", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidGreaterThanOrEqualTo(String value) {
            addCriterion("compid >=", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidLessThan(String value) {
            addCriterion("compid <", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidLessThanOrEqualTo(String value) {
            addCriterion("compid <=", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidLike(String value) {
            addCriterion("compid like", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidNotLike(String value) {
            addCriterion("compid not like", value, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidIn(List<String> values) {
            addCriterion("compid in", values, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidNotIn(List<String> values) {
            addCriterion("compid not in", values, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidBetween(String value1, String value2) {
            addCriterion("compid between", value1, value2, "compid");
            return (Criteria) this;
        }

        public Criteria andCompidNotBetween(String value1, String value2) {
            addCriterion("compid not between", value1, value2, "compid");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andSkillIsNull() {
            addCriterion("skill is null");
            return (Criteria) this;
        }

        public Criteria andSkillIsNotNull() {
            addCriterion("skill is not null");
            return (Criteria) this;
        }

        public Criteria andSkillEqualTo(Integer value) {
            addCriterion("skill =", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotEqualTo(Integer value) {
            addCriterion("skill <>", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThan(Integer value) {
            addCriterion("skill >", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThanOrEqualTo(Integer value) {
            addCriterion("skill >=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThan(Integer value) {
            addCriterion("skill <", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThanOrEqualTo(Integer value) {
            addCriterion("skill <=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillIn(List<Integer> values) {
            addCriterion("skill in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotIn(List<Integer> values) {
            addCriterion("skill not in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillBetween(Integer value1, Integer value2) {
            addCriterion("skill between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotBetween(Integer value1, Integer value2) {
            addCriterion("skill not between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andJobreqIsNull() {
            addCriterion("jobreq is null");
            return (Criteria) this;
        }

        public Criteria andJobreqIsNotNull() {
            addCriterion("jobreq is not null");
            return (Criteria) this;
        }

        public Criteria andJobreqEqualTo(String value) {
            addCriterion("jobreq =", value, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqNotEqualTo(String value) {
            addCriterion("jobreq <>", value, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqGreaterThan(String value) {
            addCriterion("jobreq >", value, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqGreaterThanOrEqualTo(String value) {
            addCriterion("jobreq >=", value, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqLessThan(String value) {
            addCriterion("jobreq <", value, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqLessThanOrEqualTo(String value) {
            addCriterion("jobreq <=", value, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqLike(String value) {
            addCriterion("jobreq like", value, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqNotLike(String value) {
            addCriterion("jobreq not like", value, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqIn(List<String> values) {
            addCriterion("jobreq in", values, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqNotIn(List<String> values) {
            addCriterion("jobreq not in", values, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqBetween(String value1, String value2) {
            addCriterion("jobreq between", value1, value2, "jobreq");
            return (Criteria) this;
        }

        public Criteria andJobreqNotBetween(String value1, String value2) {
            addCriterion("jobreq not between", value1, value2, "jobreq");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("nature like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("nature not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andExpIsNull() {
            addCriterion("exp is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("exp is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(String value) {
            addCriterion("exp =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(String value) {
            addCriterion("exp <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(String value) {
            addCriterion("exp >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(String value) {
            addCriterion("exp >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(String value) {
            addCriterion("exp <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(String value) {
            addCriterion("exp <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLike(String value) {
            addCriterion("exp like", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotLike(String value) {
            addCriterion("exp not like", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<String> values) {
            addCriterion("exp in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<String> values) {
            addCriterion("exp not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(String value1, String value2) {
            addCriterion("exp between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(String value1, String value2) {
            addCriterion("exp not between", value1, value2, "exp");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatineIsNull() {
            addCriterion("creatine is null");
            return (Criteria) this;
        }

        public Criteria andCreatineIsNotNull() {
            addCriterion("creatine is not null");
            return (Criteria) this;
        }

        public Criteria andCreatineEqualTo(Date value) {
            addCriterion("creatine =", value, "creatine");
            return (Criteria) this;
        }

        public Criteria andCreatineNotEqualTo(Date value) {
            addCriterion("creatine <>", value, "creatine");
            return (Criteria) this;
        }

        public Criteria andCreatineGreaterThan(Date value) {
            addCriterion("creatine >", value, "creatine");
            return (Criteria) this;
        }

        public Criteria andCreatineGreaterThanOrEqualTo(Date value) {
            addCriterion("creatine >=", value, "creatine");
            return (Criteria) this;
        }

        public Criteria andCreatineLessThan(Date value) {
            addCriterion("creatine <", value, "creatine");
            return (Criteria) this;
        }

        public Criteria andCreatineLessThanOrEqualTo(Date value) {
            addCriterion("creatine <=", value, "creatine");
            return (Criteria) this;
        }

        public Criteria andCreatineIn(List<Date> values) {
            addCriterion("creatine in", values, "creatine");
            return (Criteria) this;
        }

        public Criteria andCreatineNotIn(List<Date> values) {
            addCriterion("creatine not in", values, "creatine");
            return (Criteria) this;
        }

        public Criteria andCreatineBetween(Date value1, Date value2) {
            addCriterion("creatine between", value1, value2, "creatine");
            return (Criteria) this;
        }

        public Criteria andCreatineNotBetween(Date value1, Date value2) {
            addCriterion("creatine not between", value1, value2, "creatine");
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