package com.maple.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompyExample() {
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

        public Criteria andCompynameIsNull() {
            addCriterion("compyname is null");
            return (Criteria) this;
        }

        public Criteria andCompynameIsNotNull() {
            addCriterion("compyname is not null");
            return (Criteria) this;
        }

        public Criteria andCompynameEqualTo(String value) {
            addCriterion("compyname =", value, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameNotEqualTo(String value) {
            addCriterion("compyname <>", value, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameGreaterThan(String value) {
            addCriterion("compyname >", value, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameGreaterThanOrEqualTo(String value) {
            addCriterion("compyname >=", value, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameLessThan(String value) {
            addCriterion("compyname <", value, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameLessThanOrEqualTo(String value) {
            addCriterion("compyname <=", value, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameLike(String value) {
            addCriterion("compyname like", value, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameNotLike(String value) {
            addCriterion("compyname not like", value, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameIn(List<String> values) {
            addCriterion("compyname in", values, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameNotIn(List<String> values) {
            addCriterion("compyname not in", values, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameBetween(String value1, String value2) {
            addCriterion("compyname between", value1, value2, "compyname");
            return (Criteria) this;
        }

        public Criteria andCompynameNotBetween(String value1, String value2) {
            addCriterion("compyname not between", value1, value2, "compyname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNull() {
            addCriterion("picpath is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("picpath is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("picpath =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("picpath <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("picpath >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("picpath >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("picpath <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("picpath <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("picpath like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("picpath not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(List<String> values) {
            addCriterion("picpath in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(List<String> values) {
            addCriterion("picpath not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("picpath between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("picpath not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andRegaddressIsNull() {
            addCriterion("regaddress is null");
            return (Criteria) this;
        }

        public Criteria andRegaddressIsNotNull() {
            addCriterion("regaddress is not null");
            return (Criteria) this;
        }

        public Criteria andRegaddressEqualTo(String value) {
            addCriterion("regaddress =", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotEqualTo(String value) {
            addCriterion("regaddress <>", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressGreaterThan(String value) {
            addCriterion("regaddress >", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressGreaterThanOrEqualTo(String value) {
            addCriterion("regaddress >=", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressLessThan(String value) {
            addCriterion("regaddress <", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressLessThanOrEqualTo(String value) {
            addCriterion("regaddress <=", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressLike(String value) {
            addCriterion("regaddress like", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotLike(String value) {
            addCriterion("regaddress not like", value, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressIn(List<String> values) {
            addCriterion("regaddress in", values, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotIn(List<String> values) {
            addCriterion("regaddress not in", values, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressBetween(String value1, String value2) {
            addCriterion("regaddress between", value1, value2, "regaddress");
            return (Criteria) this;
        }

        public Criteria andRegaddressNotBetween(String value1, String value2) {
            addCriterion("regaddress not between", value1, value2, "regaddress");
            return (Criteria) this;
        }

        public Criteria andIndustayidIsNull() {
            addCriterion("industayid is null");
            return (Criteria) this;
        }

        public Criteria andIndustayidIsNotNull() {
            addCriterion("industayid is not null");
            return (Criteria) this;
        }

        public Criteria andIndustayidEqualTo(String value) {
            addCriterion("industayid =", value, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidNotEqualTo(String value) {
            addCriterion("industayid <>", value, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidGreaterThan(String value) {
            addCriterion("industayid >", value, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidGreaterThanOrEqualTo(String value) {
            addCriterion("industayid >=", value, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidLessThan(String value) {
            addCriterion("industayid <", value, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidLessThanOrEqualTo(String value) {
            addCriterion("industayid <=", value, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidLike(String value) {
            addCriterion("industayid like", value, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidNotLike(String value) {
            addCriterion("industayid not like", value, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidIn(List<String> values) {
            addCriterion("industayid in", values, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidNotIn(List<String> values) {
            addCriterion("industayid not in", values, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidBetween(String value1, String value2) {
            addCriterion("industayid between", value1, value2, "industayid");
            return (Criteria) this;
        }

        public Criteria andIndustayidNotBetween(String value1, String value2) {
            addCriterion("industayid not between", value1, value2, "industayid");
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

        public Criteria andCreatimeIsNull() {
            addCriterion("creatime is null");
            return (Criteria) this;
        }

        public Criteria andCreatimeIsNotNull() {
            addCriterion("creatime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatimeEqualTo(Date value) {
            addCriterion("creatime =", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeNotEqualTo(Date value) {
            addCriterion("creatime <>", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeGreaterThan(Date value) {
            addCriterion("creatime >", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creatime >=", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeLessThan(Date value) {
            addCriterion("creatime <", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeLessThanOrEqualTo(Date value) {
            addCriterion("creatime <=", value, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeIn(List<Date> values) {
            addCriterion("creatime in", values, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeNotIn(List<Date> values) {
            addCriterion("creatime not in", values, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeBetween(Date value1, Date value2) {
            addCriterion("creatime between", value1, value2, "creatime");
            return (Criteria) this;
        }

        public Criteria andCreatimeNotBetween(Date value1, Date value2) {
            addCriterion("creatime not between", value1, value2, "creatime");
            return (Criteria) this;
        }

        public Criteria andCard1IsNull() {
            addCriterion("card1 is null");
            return (Criteria) this;
        }

        public Criteria andCard1IsNotNull() {
            addCriterion("card1 is not null");
            return (Criteria) this;
        }

        public Criteria andCard1EqualTo(String value) {
            addCriterion("card1 =", value, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1NotEqualTo(String value) {
            addCriterion("card1 <>", value, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1GreaterThan(String value) {
            addCriterion("card1 >", value, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1GreaterThanOrEqualTo(String value) {
            addCriterion("card1 >=", value, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1LessThan(String value) {
            addCriterion("card1 <", value, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1LessThanOrEqualTo(String value) {
            addCriterion("card1 <=", value, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1Like(String value) {
            addCriterion("card1 like", value, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1NotLike(String value) {
            addCriterion("card1 not like", value, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1In(List<String> values) {
            addCriterion("card1 in", values, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1NotIn(List<String> values) {
            addCriterion("card1 not in", values, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1Between(String value1, String value2) {
            addCriterion("card1 between", value1, value2, "card1");
            return (Criteria) this;
        }

        public Criteria andCard1NotBetween(String value1, String value2) {
            addCriterion("card1 not between", value1, value2, "card1");
            return (Criteria) this;
        }

        public Criteria andCard2IsNull() {
            addCriterion("card2 is null");
            return (Criteria) this;
        }

        public Criteria andCard2IsNotNull() {
            addCriterion("card2 is not null");
            return (Criteria) this;
        }

        public Criteria andCard2EqualTo(String value) {
            addCriterion("card2 =", value, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2NotEqualTo(String value) {
            addCriterion("card2 <>", value, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2GreaterThan(String value) {
            addCriterion("card2 >", value, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2GreaterThanOrEqualTo(String value) {
            addCriterion("card2 >=", value, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2LessThan(String value) {
            addCriterion("card2 <", value, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2LessThanOrEqualTo(String value) {
            addCriterion("card2 <=", value, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2Like(String value) {
            addCriterion("card2 like", value, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2NotLike(String value) {
            addCriterion("card2 not like", value, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2In(List<String> values) {
            addCriterion("card2 in", values, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2NotIn(List<String> values) {
            addCriterion("card2 not in", values, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2Between(String value1, String value2) {
            addCriterion("card2 between", value1, value2, "card2");
            return (Criteria) this;
        }

        public Criteria andCard2NotBetween(String value1, String value2) {
            addCriterion("card2 not between", value1, value2, "card2");
            return (Criteria) this;
        }

        public Criteria andRandom1IsNull() {
            addCriterion("random1 is null");
            return (Criteria) this;
        }

        public Criteria andRandom1IsNotNull() {
            addCriterion("random1 is not null");
            return (Criteria) this;
        }

        public Criteria andRandom1EqualTo(String value) {
            addCriterion("random1 =", value, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1NotEqualTo(String value) {
            addCriterion("random1 <>", value, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1GreaterThan(String value) {
            addCriterion("random1 >", value, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1GreaterThanOrEqualTo(String value) {
            addCriterion("random1 >=", value, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1LessThan(String value) {
            addCriterion("random1 <", value, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1LessThanOrEqualTo(String value) {
            addCriterion("random1 <=", value, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1Like(String value) {
            addCriterion("random1 like", value, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1NotLike(String value) {
            addCriterion("random1 not like", value, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1In(List<String> values) {
            addCriterion("random1 in", values, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1NotIn(List<String> values) {
            addCriterion("random1 not in", values, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1Between(String value1, String value2) {
            addCriterion("random1 between", value1, value2, "random1");
            return (Criteria) this;
        }

        public Criteria andRandom1NotBetween(String value1, String value2) {
            addCriterion("random1 not between", value1, value2, "random1");
            return (Criteria) this;
        }

        public Criteria andPersonIsNull() {
            addCriterion("person is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsNotNull() {
            addCriterion("person is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEqualTo(String value) {
            addCriterion("person =", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotEqualTo(String value) {
            addCriterion("person <>", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThan(String value) {
            addCriterion("person >", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThanOrEqualTo(String value) {
            addCriterion("person >=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThan(String value) {
            addCriterion("person <", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThanOrEqualTo(String value) {
            addCriterion("person <=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLike(String value) {
            addCriterion("person like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotLike(String value) {
            addCriterion("person not like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonIn(List<String> values) {
            addCriterion("person in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotIn(List<String> values) {
            addCriterion("person not in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonBetween(String value1, String value2) {
            addCriterion("person between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotBetween(String value1, String value2) {
            addCriterion("person not between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andIntoductionIsNull() {
            addCriterion("intoduction is null");
            return (Criteria) this;
        }

        public Criteria andIntoductionIsNotNull() {
            addCriterion("intoduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntoductionEqualTo(String value) {
            addCriterion("intoduction =", value, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionNotEqualTo(String value) {
            addCriterion("intoduction <>", value, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionGreaterThan(String value) {
            addCriterion("intoduction >", value, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionGreaterThanOrEqualTo(String value) {
            addCriterion("intoduction >=", value, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionLessThan(String value) {
            addCriterion("intoduction <", value, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionLessThanOrEqualTo(String value) {
            addCriterion("intoduction <=", value, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionLike(String value) {
            addCriterion("intoduction like", value, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionNotLike(String value) {
            addCriterion("intoduction not like", value, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionIn(List<String> values) {
            addCriterion("intoduction in", values, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionNotIn(List<String> values) {
            addCriterion("intoduction not in", values, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionBetween(String value1, String value2) {
            addCriterion("intoduction between", value1, value2, "intoduction");
            return (Criteria) this;
        }

        public Criteria andIntoductionNotBetween(String value1, String value2) {
            addCriterion("intoduction not between", value1, value2, "intoduction");
            return (Criteria) this;
        }

        public Criteria andJurisnameIsNull() {
            addCriterion("jurisname is null");
            return (Criteria) this;
        }

        public Criteria andJurisnameIsNotNull() {
            addCriterion("jurisname is not null");
            return (Criteria) this;
        }

        public Criteria andJurisnameEqualTo(String value) {
            addCriterion("jurisname =", value, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameNotEqualTo(String value) {
            addCriterion("jurisname <>", value, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameGreaterThan(String value) {
            addCriterion("jurisname >", value, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameGreaterThanOrEqualTo(String value) {
            addCriterion("jurisname >=", value, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameLessThan(String value) {
            addCriterion("jurisname <", value, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameLessThanOrEqualTo(String value) {
            addCriterion("jurisname <=", value, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameLike(String value) {
            addCriterion("jurisname like", value, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameNotLike(String value) {
            addCriterion("jurisname not like", value, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameIn(List<String> values) {
            addCriterion("jurisname in", values, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameNotIn(List<String> values) {
            addCriterion("jurisname not in", values, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameBetween(String value1, String value2) {
            addCriterion("jurisname between", value1, value2, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJurisnameNotBetween(String value1, String value2) {
            addCriterion("jurisname not between", value1, value2, "jurisname");
            return (Criteria) this;
        }

        public Criteria andJuriscontentIsNull() {
            addCriterion("juriscontent is null");
            return (Criteria) this;
        }

        public Criteria andJuriscontentIsNotNull() {
            addCriterion("juriscontent is not null");
            return (Criteria) this;
        }

        public Criteria andJuriscontentEqualTo(String value) {
            addCriterion("juriscontent =", value, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentNotEqualTo(String value) {
            addCriterion("juriscontent <>", value, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentGreaterThan(String value) {
            addCriterion("juriscontent >", value, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentGreaterThanOrEqualTo(String value) {
            addCriterion("juriscontent >=", value, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentLessThan(String value) {
            addCriterion("juriscontent <", value, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentLessThanOrEqualTo(String value) {
            addCriterion("juriscontent <=", value, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentLike(String value) {
            addCriterion("juriscontent like", value, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentNotLike(String value) {
            addCriterion("juriscontent not like", value, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentIn(List<String> values) {
            addCriterion("juriscontent in", values, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentNotIn(List<String> values) {
            addCriterion("juriscontent not in", values, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentBetween(String value1, String value2) {
            addCriterion("juriscontent between", value1, value2, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJuriscontentNotBetween(String value1, String value2) {
            addCriterion("juriscontent not between", value1, value2, "juriscontent");
            return (Criteria) this;
        }

        public Criteria andJurispicIsNull() {
            addCriterion("jurispic is null");
            return (Criteria) this;
        }

        public Criteria andJurispicIsNotNull() {
            addCriterion("jurispic is not null");
            return (Criteria) this;
        }

        public Criteria andJurispicEqualTo(String value) {
            addCriterion("jurispic =", value, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicNotEqualTo(String value) {
            addCriterion("jurispic <>", value, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicGreaterThan(String value) {
            addCriterion("jurispic >", value, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicGreaterThanOrEqualTo(String value) {
            addCriterion("jurispic >=", value, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicLessThan(String value) {
            addCriterion("jurispic <", value, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicLessThanOrEqualTo(String value) {
            addCriterion("jurispic <=", value, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicLike(String value) {
            addCriterion("jurispic like", value, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicNotLike(String value) {
            addCriterion("jurispic not like", value, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicIn(List<String> values) {
            addCriterion("jurispic in", values, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicNotIn(List<String> values) {
            addCriterion("jurispic not in", values, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicBetween(String value1, String value2) {
            addCriterion("jurispic between", value1, value2, "jurispic");
            return (Criteria) this;
        }

        public Criteria andJurispicNotBetween(String value1, String value2) {
            addCriterion("jurispic not between", value1, value2, "jurispic");
            return (Criteria) this;
        }

        public Criteria andPersontelIsNull() {
            addCriterion("persontel is null");
            return (Criteria) this;
        }

        public Criteria andPersontelIsNotNull() {
            addCriterion("persontel is not null");
            return (Criteria) this;
        }

        public Criteria andPersontelEqualTo(String value) {
            addCriterion("persontel =", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelNotEqualTo(String value) {
            addCriterion("persontel <>", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelGreaterThan(String value) {
            addCriterion("persontel >", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelGreaterThanOrEqualTo(String value) {
            addCriterion("persontel >=", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelLessThan(String value) {
            addCriterion("persontel <", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelLessThanOrEqualTo(String value) {
            addCriterion("persontel <=", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelLike(String value) {
            addCriterion("persontel like", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelNotLike(String value) {
            addCriterion("persontel not like", value, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelIn(List<String> values) {
            addCriterion("persontel in", values, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelNotIn(List<String> values) {
            addCriterion("persontel not in", values, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelBetween(String value1, String value2) {
            addCriterion("persontel between", value1, value2, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersontelNotBetween(String value1, String value2) {
            addCriterion("persontel not between", value1, value2, "persontel");
            return (Criteria) this;
        }

        public Criteria andPersonemailIsNull() {
            addCriterion("personemail is null");
            return (Criteria) this;
        }

        public Criteria andPersonemailIsNotNull() {
            addCriterion("personemail is not null");
            return (Criteria) this;
        }

        public Criteria andPersonemailEqualTo(String value) {
            addCriterion("personemail =", value, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailNotEqualTo(String value) {
            addCriterion("personemail <>", value, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailGreaterThan(String value) {
            addCriterion("personemail >", value, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailGreaterThanOrEqualTo(String value) {
            addCriterion("personemail >=", value, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailLessThan(String value) {
            addCriterion("personemail <", value, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailLessThanOrEqualTo(String value) {
            addCriterion("personemail <=", value, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailLike(String value) {
            addCriterion("personemail like", value, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailNotLike(String value) {
            addCriterion("personemail not like", value, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailIn(List<String> values) {
            addCriterion("personemail in", values, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailNotIn(List<String> values) {
            addCriterion("personemail not in", values, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailBetween(String value1, String value2) {
            addCriterion("personemail between", value1, value2, "personemail");
            return (Criteria) this;
        }

        public Criteria andPersonemailNotBetween(String value1, String value2) {
            addCriterion("personemail not between", value1, value2, "personemail");
            return (Criteria) this;
        }

        public Criteria andCompytelIsNull() {
            addCriterion("compytel is null");
            return (Criteria) this;
        }

        public Criteria andCompytelIsNotNull() {
            addCriterion("compytel is not null");
            return (Criteria) this;
        }

        public Criteria andCompytelEqualTo(String value) {
            addCriterion("compytel =", value, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelNotEqualTo(String value) {
            addCriterion("compytel <>", value, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelGreaterThan(String value) {
            addCriterion("compytel >", value, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelGreaterThanOrEqualTo(String value) {
            addCriterion("compytel >=", value, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelLessThan(String value) {
            addCriterion("compytel <", value, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelLessThanOrEqualTo(String value) {
            addCriterion("compytel <=", value, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelLike(String value) {
            addCriterion("compytel like", value, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelNotLike(String value) {
            addCriterion("compytel not like", value, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelIn(List<String> values) {
            addCriterion("compytel in", values, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelNotIn(List<String> values) {
            addCriterion("compytel not in", values, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelBetween(String value1, String value2) {
            addCriterion("compytel between", value1, value2, "compytel");
            return (Criteria) this;
        }

        public Criteria andCompytelNotBetween(String value1, String value2) {
            addCriterion("compytel not between", value1, value2, "compytel");
            return (Criteria) this;
        }

        public Criteria andJuriscardIsNull() {
            addCriterion("juriscard is null");
            return (Criteria) this;
        }

        public Criteria andJuriscardIsNotNull() {
            addCriterion("juriscard is not null");
            return (Criteria) this;
        }

        public Criteria andJuriscardEqualTo(String value) {
            addCriterion("juriscard =", value, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardNotEqualTo(String value) {
            addCriterion("juriscard <>", value, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardGreaterThan(String value) {
            addCriterion("juriscard >", value, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardGreaterThanOrEqualTo(String value) {
            addCriterion("juriscard >=", value, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardLessThan(String value) {
            addCriterion("juriscard <", value, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardLessThanOrEqualTo(String value) {
            addCriterion("juriscard <=", value, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardLike(String value) {
            addCriterion("juriscard like", value, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardNotLike(String value) {
            addCriterion("juriscard not like", value, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardIn(List<String> values) {
            addCriterion("juriscard in", values, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardNotIn(List<String> values) {
            addCriterion("juriscard not in", values, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardBetween(String value1, String value2) {
            addCriterion("juriscard between", value1, value2, "juriscard");
            return (Criteria) this;
        }

        public Criteria andJuriscardNotBetween(String value1, String value2) {
            addCriterion("juriscard not between", value1, value2, "juriscard");
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