package com.vo;

import java.util.ArrayList;
import java.util.List;

public class CouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponExample() {
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

        public Criteria andCouponidIsNull() {
            addCriterion("couponid is null");
            return (Criteria) this;
        }

        public Criteria andCouponidIsNotNull() {
            addCriterion("couponid is not null");
            return (Criteria) this;
        }

        public Criteria andCouponidEqualTo(Integer value) {
            addCriterion("couponid =", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotEqualTo(Integer value) {
            addCriterion("couponid <>", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidGreaterThan(Integer value) {
            addCriterion("couponid >", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidGreaterThanOrEqualTo(Integer value) {
            addCriterion("couponid >=", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLessThan(Integer value) {
            addCriterion("couponid <", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidLessThanOrEqualTo(Integer value) {
            addCriterion("couponid <=", value, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidIn(List<Integer> values) {
            addCriterion("couponid in", values, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotIn(List<Integer> values) {
            addCriterion("couponid not in", values, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidBetween(Integer value1, Integer value2) {
            addCriterion("couponid between", value1, value2, "couponid");
            return (Criteria) this;
        }

        public Criteria andCouponidNotBetween(Integer value1, Integer value2) {
            addCriterion("couponid not between", value1, value2, "couponid");
            return (Criteria) this;
        }

        public Criteria andSpidIsNull() {
            addCriterion("spid is null");
            return (Criteria) this;
        }

        public Criteria andSpidIsNotNull() {
            addCriterion("spid is not null");
            return (Criteria) this;
        }

        public Criteria andSpidEqualTo(Integer value) {
            addCriterion("spid =", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotEqualTo(Integer value) {
            addCriterion("spid <>", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThan(Integer value) {
            addCriterion("spid >", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("spid >=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThan(Integer value) {
            addCriterion("spid <", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThanOrEqualTo(Integer value) {
            addCriterion("spid <=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidIn(List<Integer> values) {
            addCriterion("spid in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotIn(List<Integer> values) {
            addCriterion("spid not in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidBetween(Integer value1, Integer value2) {
            addCriterion("spid between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotBetween(Integer value1, Integer value2) {
            addCriterion("spid not between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andFrommoneyIsNull() {
            addCriterion("frommoney is null");
            return (Criteria) this;
        }

        public Criteria andFrommoneyIsNotNull() {
            addCriterion("frommoney is not null");
            return (Criteria) this;
        }

        public Criteria andFrommoneyEqualTo(Double value) {
            addCriterion("frommoney =", value, "frommoney");
            return (Criteria) this;
        }

        public Criteria andFrommoneyNotEqualTo(Double value) {
            addCriterion("frommoney <>", value, "frommoney");
            return (Criteria) this;
        }

        public Criteria andFrommoneyGreaterThan(Double value) {
            addCriterion("frommoney >", value, "frommoney");
            return (Criteria) this;
        }

        public Criteria andFrommoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("frommoney >=", value, "frommoney");
            return (Criteria) this;
        }

        public Criteria andFrommoneyLessThan(Double value) {
            addCriterion("frommoney <", value, "frommoney");
            return (Criteria) this;
        }

        public Criteria andFrommoneyLessThanOrEqualTo(Double value) {
            addCriterion("frommoney <=", value, "frommoney");
            return (Criteria) this;
        }

        public Criteria andFrommoneyIn(List<Double> values) {
            addCriterion("frommoney in", values, "frommoney");
            return (Criteria) this;
        }

        public Criteria andFrommoneyNotIn(List<Double> values) {
            addCriterion("frommoney not in", values, "frommoney");
            return (Criteria) this;
        }

        public Criteria andFrommoneyBetween(Double value1, Double value2) {
            addCriterion("frommoney between", value1, value2, "frommoney");
            return (Criteria) this;
        }

        public Criteria andFrommoneyNotBetween(Double value1, Double value2) {
            addCriterion("frommoney not between", value1, value2, "frommoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyIsNull() {
            addCriterion("minusmoney is null");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyIsNotNull() {
            addCriterion("minusmoney is not null");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyEqualTo(Double value) {
            addCriterion("minusmoney =", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyNotEqualTo(Double value) {
            addCriterion("minusmoney <>", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyGreaterThan(Double value) {
            addCriterion("minusmoney >", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("minusmoney >=", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyLessThan(Double value) {
            addCriterion("minusmoney <", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyLessThanOrEqualTo(Double value) {
            addCriterion("minusmoney <=", value, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyIn(List<Double> values) {
            addCriterion("minusmoney in", values, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyNotIn(List<Double> values) {
            addCriterion("minusmoney not in", values, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyBetween(Double value1, Double value2) {
            addCriterion("minusmoney between", value1, value2, "minusmoney");
            return (Criteria) this;
        }

        public Criteria andMinusmoneyNotBetween(Double value1, Double value2) {
            addCriterion("minusmoney not between", value1, value2, "minusmoney");
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