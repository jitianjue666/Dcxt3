package com.vo;

import java.util.ArrayList;
import java.util.List;

public class CouponlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponlistExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andUuieIsNull() {
            addCriterion("uuie is null");
            return (Criteria) this;
        }

        public Criteria andUuieIsNotNull() {
            addCriterion("uuie is not null");
            return (Criteria) this;
        }

        public Criteria andUuieEqualTo(Integer value) {
            addCriterion("uuie =", value, "uuie");
            return (Criteria) this;
        }

        public Criteria andUuieNotEqualTo(Integer value) {
            addCriterion("uuie <>", value, "uuie");
            return (Criteria) this;
        }

        public Criteria andUuieGreaterThan(Integer value) {
            addCriterion("uuie >", value, "uuie");
            return (Criteria) this;
        }

        public Criteria andUuieGreaterThanOrEqualTo(Integer value) {
            addCriterion("uuie >=", value, "uuie");
            return (Criteria) this;
        }

        public Criteria andUuieLessThan(Integer value) {
            addCriterion("uuie <", value, "uuie");
            return (Criteria) this;
        }

        public Criteria andUuieLessThanOrEqualTo(Integer value) {
            addCriterion("uuie <=", value, "uuie");
            return (Criteria) this;
        }

        public Criteria andUuieIn(List<Integer> values) {
            addCriterion("uuie in", values, "uuie");
            return (Criteria) this;
        }

        public Criteria andUuieNotIn(List<Integer> values) {
            addCriterion("uuie not in", values, "uuie");
            return (Criteria) this;
        }

        public Criteria andUuieBetween(Integer value1, Integer value2) {
            addCriterion("uuie between", value1, value2, "uuie");
            return (Criteria) this;
        }

        public Criteria andUuieNotBetween(Integer value1, Integer value2) {
            addCriterion("uuie not between", value1, value2, "uuie");
            return (Criteria) this;
        }

        public Criteria andFmIsNull() {
            addCriterion("fm is null");
            return (Criteria) this;
        }

        public Criteria andFmIsNotNull() {
            addCriterion("fm is not null");
            return (Criteria) this;
        }

        public Criteria andFmEqualTo(Double value) {
            addCriterion("fm =", value, "fm");
            return (Criteria) this;
        }

        public Criteria andFmNotEqualTo(Double value) {
            addCriterion("fm <>", value, "fm");
            return (Criteria) this;
        }

        public Criteria andFmGreaterThan(Double value) {
            addCriterion("fm >", value, "fm");
            return (Criteria) this;
        }

        public Criteria andFmGreaterThanOrEqualTo(Double value) {
            addCriterion("fm >=", value, "fm");
            return (Criteria) this;
        }

        public Criteria andFmLessThan(Double value) {
            addCriterion("fm <", value, "fm");
            return (Criteria) this;
        }

        public Criteria andFmLessThanOrEqualTo(Double value) {
            addCriterion("fm <=", value, "fm");
            return (Criteria) this;
        }

        public Criteria andFmIn(List<Double> values) {
            addCriterion("fm in", values, "fm");
            return (Criteria) this;
        }

        public Criteria andFmNotIn(List<Double> values) {
            addCriterion("fm not in", values, "fm");
            return (Criteria) this;
        }

        public Criteria andFmBetween(Double value1, Double value2) {
            addCriterion("fm between", value1, value2, "fm");
            return (Criteria) this;
        }

        public Criteria andFmNotBetween(Double value1, Double value2) {
            addCriterion("fm not between", value1, value2, "fm");
            return (Criteria) this;
        }

        public Criteria andMmIsNull() {
            addCriterion("mm is null");
            return (Criteria) this;
        }

        public Criteria andMmIsNotNull() {
            addCriterion("mm is not null");
            return (Criteria) this;
        }

        public Criteria andMmEqualTo(Double value) {
            addCriterion("mm =", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotEqualTo(Double value) {
            addCriterion("mm <>", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmGreaterThan(Double value) {
            addCriterion("mm >", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmGreaterThanOrEqualTo(Double value) {
            addCriterion("mm >=", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLessThan(Double value) {
            addCriterion("mm <", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmLessThanOrEqualTo(Double value) {
            addCriterion("mm <=", value, "mm");
            return (Criteria) this;
        }

        public Criteria andMmIn(List<Double> values) {
            addCriterion("mm in", values, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotIn(List<Double> values) {
            addCriterion("mm not in", values, "mm");
            return (Criteria) this;
        }

        public Criteria andMmBetween(Double value1, Double value2) {
            addCriterion("mm between", value1, value2, "mm");
            return (Criteria) this;
        }

        public Criteria andMmNotBetween(Double value1, Double value2) {
            addCriterion("mm not between", value1, value2, "mm");
            return (Criteria) this;
        }

        public Criteria andSnaIsNull() {
            addCriterion("sna is null");
            return (Criteria) this;
        }

        public Criteria andSnaIsNotNull() {
            addCriterion("sna is not null");
            return (Criteria) this;
        }

        public Criteria andSnaEqualTo(String value) {
            addCriterion("sna =", value, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaNotEqualTo(String value) {
            addCriterion("sna <>", value, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaGreaterThan(String value) {
            addCriterion("sna >", value, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaGreaterThanOrEqualTo(String value) {
            addCriterion("sna >=", value, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaLessThan(String value) {
            addCriterion("sna <", value, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaLessThanOrEqualTo(String value) {
            addCriterion("sna <=", value, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaLike(String value) {
            addCriterion("sna like", value, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaNotLike(String value) {
            addCriterion("sna not like", value, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaIn(List<String> values) {
            addCriterion("sna in", values, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaNotIn(List<String> values) {
            addCriterion("sna not in", values, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaBetween(String value1, String value2) {
            addCriterion("sna between", value1, value2, "sna");
            return (Criteria) this;
        }

        public Criteria andSnaNotBetween(String value1, String value2) {
            addCriterion("sna not between", value1, value2, "sna");
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