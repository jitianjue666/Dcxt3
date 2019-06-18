package com.vo;

import java.util.ArrayList;
import java.util.List;

public class DishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishExample() {
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

        public Criteria andDishidIsNull() {
            addCriterion("dishid is null");
            return (Criteria) this;
        }

        public Criteria andDishidIsNotNull() {
            addCriterion("dishid is not null");
            return (Criteria) this;
        }

        public Criteria andDishidEqualTo(Integer value) {
            addCriterion("dishid =", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotEqualTo(Integer value) {
            addCriterion("dishid <>", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidGreaterThan(Integer value) {
            addCriterion("dishid >", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishid >=", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLessThan(Integer value) {
            addCriterion("dishid <", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidLessThanOrEqualTo(Integer value) {
            addCriterion("dishid <=", value, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidIn(List<Integer> values) {
            addCriterion("dishid in", values, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotIn(List<Integer> values) {
            addCriterion("dishid not in", values, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidBetween(Integer value1, Integer value2) {
            addCriterion("dishid between", value1, value2, "dishid");
            return (Criteria) this;
        }

        public Criteria andDishidNotBetween(Integer value1, Integer value2) {
            addCriterion("dishid not between", value1, value2, "dishid");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andDishnameIsNull() {
            addCriterion("dishname is null");
            return (Criteria) this;
        }

        public Criteria andDishnameIsNotNull() {
            addCriterion("dishname is not null");
            return (Criteria) this;
        }

        public Criteria andDishnameEqualTo(String value) {
            addCriterion("dishname =", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotEqualTo(String value) {
            addCriterion("dishname <>", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameGreaterThan(String value) {
            addCriterion("dishname >", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameGreaterThanOrEqualTo(String value) {
            addCriterion("dishname >=", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameLessThan(String value) {
            addCriterion("dishname <", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameLessThanOrEqualTo(String value) {
            addCriterion("dishname <=", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameLike(String value) {
            addCriterion("dishname like", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotLike(String value) {
            addCriterion("dishname not like", value, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameIn(List<String> values) {
            addCriterion("dishname in", values, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotIn(List<String> values) {
            addCriterion("dishname not in", values, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameBetween(String value1, String value2) {
            addCriterion("dishname between", value1, value2, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishnameNotBetween(String value1, String value2) {
            addCriterion("dishname not between", value1, value2, "dishname");
            return (Criteria) this;
        }

        public Criteria andDishphotoIsNull() {
            addCriterion("dishphoto is null");
            return (Criteria) this;
        }

        public Criteria andDishphotoIsNotNull() {
            addCriterion("dishphoto is not null");
            return (Criteria) this;
        }

        public Criteria andDishphotoEqualTo(String value) {
            addCriterion("dishphoto =", value, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoNotEqualTo(String value) {
            addCriterion("dishphoto <>", value, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoGreaterThan(String value) {
            addCriterion("dishphoto >", value, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoGreaterThanOrEqualTo(String value) {
            addCriterion("dishphoto >=", value, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoLessThan(String value) {
            addCriterion("dishphoto <", value, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoLessThanOrEqualTo(String value) {
            addCriterion("dishphoto <=", value, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoLike(String value) {
            addCriterion("dishphoto like", value, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoNotLike(String value) {
            addCriterion("dishphoto not like", value, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoIn(List<String> values) {
            addCriterion("dishphoto in", values, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoNotIn(List<String> values) {
            addCriterion("dishphoto not in", values, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoBetween(String value1, String value2) {
            addCriterion("dishphoto between", value1, value2, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishphotoNotBetween(String value1, String value2) {
            addCriterion("dishphoto not between", value1, value2, "dishphoto");
            return (Criteria) this;
        }

        public Criteria andDishpriceIsNull() {
            addCriterion("dishprice is null");
            return (Criteria) this;
        }

        public Criteria andDishpriceIsNotNull() {
            addCriterion("dishprice is not null");
            return (Criteria) this;
        }

        public Criteria andDishpriceEqualTo(Double value) {
            addCriterion("dishprice =", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceNotEqualTo(Double value) {
            addCriterion("dishprice <>", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceGreaterThan(Double value) {
            addCriterion("dishprice >", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("dishprice >=", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceLessThan(Double value) {
            addCriterion("dishprice <", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceLessThanOrEqualTo(Double value) {
            addCriterion("dishprice <=", value, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceIn(List<Double> values) {
            addCriterion("dishprice in", values, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceNotIn(List<Double> values) {
            addCriterion("dishprice not in", values, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceBetween(Double value1, Double value2) {
            addCriterion("dishprice between", value1, value2, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishpriceNotBetween(Double value1, Double value2) {
            addCriterion("dishprice not between", value1, value2, "dishprice");
            return (Criteria) this;
        }

        public Criteria andDishintroductionIsNull() {
            addCriterion("dishintroduction is null");
            return (Criteria) this;
        }

        public Criteria andDishintroductionIsNotNull() {
            addCriterion("dishintroduction is not null");
            return (Criteria) this;
        }

        public Criteria andDishintroductionEqualTo(String value) {
            addCriterion("dishintroduction =", value, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionNotEqualTo(String value) {
            addCriterion("dishintroduction <>", value, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionGreaterThan(String value) {
            addCriterion("dishintroduction >", value, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("dishintroduction >=", value, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionLessThan(String value) {
            addCriterion("dishintroduction <", value, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionLessThanOrEqualTo(String value) {
            addCriterion("dishintroduction <=", value, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionLike(String value) {
            addCriterion("dishintroduction like", value, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionNotLike(String value) {
            addCriterion("dishintroduction not like", value, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionIn(List<String> values) {
            addCriterion("dishintroduction in", values, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionNotIn(List<String> values) {
            addCriterion("dishintroduction not in", values, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionBetween(String value1, String value2) {
            addCriterion("dishintroduction between", value1, value2, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishintroductionNotBetween(String value1, String value2) {
            addCriterion("dishintroduction not between", value1, value2, "dishintroduction");
            return (Criteria) this;
        }

        public Criteria andDishcategoryIsNull() {
            addCriterion("dishcategory is null");
            return (Criteria) this;
        }

        public Criteria andDishcategoryIsNotNull() {
            addCriterion("dishcategory is not null");
            return (Criteria) this;
        }

        public Criteria andDishcategoryEqualTo(String value) {
            addCriterion("dishcategory =", value, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryNotEqualTo(String value) {
            addCriterion("dishcategory <>", value, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryGreaterThan(String value) {
            addCriterion("dishcategory >", value, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("dishcategory >=", value, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryLessThan(String value) {
            addCriterion("dishcategory <", value, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryLessThanOrEqualTo(String value) {
            addCriterion("dishcategory <=", value, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryLike(String value) {
            addCriterion("dishcategory like", value, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryNotLike(String value) {
            addCriterion("dishcategory not like", value, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryIn(List<String> values) {
            addCriterion("dishcategory in", values, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryNotIn(List<String> values) {
            addCriterion("dishcategory not in", values, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryBetween(String value1, String value2) {
            addCriterion("dishcategory between", value1, value2, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishcategoryNotBetween(String value1, String value2) {
            addCriterion("dishcategory not between", value1, value2, "dishcategory");
            return (Criteria) this;
        }

        public Criteria andDishlevelIsNull() {
            addCriterion("dishlevel is null");
            return (Criteria) this;
        }

        public Criteria andDishlevelIsNotNull() {
            addCriterion("dishlevel is not null");
            return (Criteria) this;
        }

        public Criteria andDishlevelEqualTo(Integer value) {
            addCriterion("dishlevel =", value, "dishlevel");
            return (Criteria) this;
        }

        public Criteria andDishlevelNotEqualTo(Integer value) {
            addCriterion("dishlevel <>", value, "dishlevel");
            return (Criteria) this;
        }

        public Criteria andDishlevelGreaterThan(Integer value) {
            addCriterion("dishlevel >", value, "dishlevel");
            return (Criteria) this;
        }

        public Criteria andDishlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishlevel >=", value, "dishlevel");
            return (Criteria) this;
        }

        public Criteria andDishlevelLessThan(Integer value) {
            addCriterion("dishlevel <", value, "dishlevel");
            return (Criteria) this;
        }

        public Criteria andDishlevelLessThanOrEqualTo(Integer value) {
            addCriterion("dishlevel <=", value, "dishlevel");
            return (Criteria) this;
        }

        public Criteria andDishlevelIn(List<Integer> values) {
            addCriterion("dishlevel in", values, "dishlevel");
            return (Criteria) this;
        }

        public Criteria andDishlevelNotIn(List<Integer> values) {
            addCriterion("dishlevel not in", values, "dishlevel");
            return (Criteria) this;
        }

        public Criteria andDishlevelBetween(Integer value1, Integer value2) {
            addCriterion("dishlevel between", value1, value2, "dishlevel");
            return (Criteria) this;
        }

        public Criteria andDishlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("dishlevel not between", value1, value2, "dishlevel");
            return (Criteria) this;
        }

        public Criteria andDishsalesIsNull() {
            addCriterion("dishsales is null");
            return (Criteria) this;
        }

        public Criteria andDishsalesIsNotNull() {
            addCriterion("dishsales is not null");
            return (Criteria) this;
        }

        public Criteria andDishsalesEqualTo(Integer value) {
            addCriterion("dishsales =", value, "dishsales");
            return (Criteria) this;
        }

        public Criteria andDishsalesNotEqualTo(Integer value) {
            addCriterion("dishsales <>", value, "dishsales");
            return (Criteria) this;
        }

        public Criteria andDishsalesGreaterThan(Integer value) {
            addCriterion("dishsales >", value, "dishsales");
            return (Criteria) this;
        }

        public Criteria andDishsalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishsales >=", value, "dishsales");
            return (Criteria) this;
        }

        public Criteria andDishsalesLessThan(Integer value) {
            addCriterion("dishsales <", value, "dishsales");
            return (Criteria) this;
        }

        public Criteria andDishsalesLessThanOrEqualTo(Integer value) {
            addCriterion("dishsales <=", value, "dishsales");
            return (Criteria) this;
        }

        public Criteria andDishsalesIn(List<Integer> values) {
            addCriterion("dishsales in", values, "dishsales");
            return (Criteria) this;
        }

        public Criteria andDishsalesNotIn(List<Integer> values) {
            addCriterion("dishsales not in", values, "dishsales");
            return (Criteria) this;
        }

        public Criteria andDishsalesBetween(Integer value1, Integer value2) {
            addCriterion("dishsales between", value1, value2, "dishsales");
            return (Criteria) this;
        }

        public Criteria andDishsalesNotBetween(Integer value1, Integer value2) {
            addCriterion("dishsales not between", value1, value2, "dishsales");
            return (Criteria) this;
        }

        public Criteria andDishstockIsNull() {
            addCriterion("dishstock is null");
            return (Criteria) this;
        }

        public Criteria andDishstockIsNotNull() {
            addCriterion("dishstock is not null");
            return (Criteria) this;
        }

        public Criteria andDishstockEqualTo(Integer value) {
            addCriterion("dishstock =", value, "dishstock");
            return (Criteria) this;
        }

        public Criteria andDishstockNotEqualTo(Integer value) {
            addCriterion("dishstock <>", value, "dishstock");
            return (Criteria) this;
        }

        public Criteria andDishstockGreaterThan(Integer value) {
            addCriterion("dishstock >", value, "dishstock");
            return (Criteria) this;
        }

        public Criteria andDishstockGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishstock >=", value, "dishstock");
            return (Criteria) this;
        }

        public Criteria andDishstockLessThan(Integer value) {
            addCriterion("dishstock <", value, "dishstock");
            return (Criteria) this;
        }

        public Criteria andDishstockLessThanOrEqualTo(Integer value) {
            addCriterion("dishstock <=", value, "dishstock");
            return (Criteria) this;
        }

        public Criteria andDishstockIn(List<Integer> values) {
            addCriterion("dishstock in", values, "dishstock");
            return (Criteria) this;
        }

        public Criteria andDishstockNotIn(List<Integer> values) {
            addCriterion("dishstock not in", values, "dishstock");
            return (Criteria) this;
        }

        public Criteria andDishstockBetween(Integer value1, Integer value2) {
            addCriterion("dishstock between", value1, value2, "dishstock");
            return (Criteria) this;
        }

        public Criteria andDishstockNotBetween(Integer value1, Integer value2) {
            addCriterion("dishstock not between", value1, value2, "dishstock");
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