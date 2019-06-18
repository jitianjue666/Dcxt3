package com.vo;

import java.util.ArrayList;
import java.util.List;

public class ShopphotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopphotoExample() {
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

        public Criteria andSnoIsNull() {
            addCriterion("sno is null");
            return (Criteria) this;
        }

        public Criteria andSnoIsNotNull() {
            addCriterion("sno is not null");
            return (Criteria) this;
        }

        public Criteria andSnoEqualTo(Integer value) {
            addCriterion("sno =", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotEqualTo(Integer value) {
            addCriterion("sno <>", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThan(Integer value) {
            addCriterion("sno >", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sno >=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThan(Integer value) {
            addCriterion("sno <", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoLessThanOrEqualTo(Integer value) {
            addCriterion("sno <=", value, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoIn(List<Integer> values) {
            addCriterion("sno in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotIn(List<Integer> values) {
            addCriterion("sno not in", values, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoBetween(Integer value1, Integer value2) {
            addCriterion("sno between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sno not between", value1, value2, "sno");
            return (Criteria) this;
        }

        public Criteria andSozjnoIsNull() {
            addCriterion("sozjno is null");
            return (Criteria) this;
        }

        public Criteria andSozjnoIsNotNull() {
            addCriterion("sozjno is not null");
            return (Criteria) this;
        }

        public Criteria andSozjnoEqualTo(Integer value) {
            addCriterion("sozjno =", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoNotEqualTo(Integer value) {
            addCriterion("sozjno <>", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoGreaterThan(Integer value) {
            addCriterion("sozjno >", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sozjno >=", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoLessThan(Integer value) {
            addCriterion("sozjno <", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoLessThanOrEqualTo(Integer value) {
            addCriterion("sozjno <=", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoIn(List<Integer> values) {
            addCriterion("sozjno in", values, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoNotIn(List<Integer> values) {
            addCriterion("sozjno not in", values, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoBetween(Integer value1, Integer value2) {
            addCriterion("sozjno between", value1, value2, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sozjno not between", value1, value2, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSonameIsNull() {
            addCriterion("soname is null");
            return (Criteria) this;
        }

        public Criteria andSonameIsNotNull() {
            addCriterion("soname is not null");
            return (Criteria) this;
        }

        public Criteria andSonameEqualTo(String value) {
            addCriterion("soname =", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameNotEqualTo(String value) {
            addCriterion("soname <>", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameGreaterThan(String value) {
            addCriterion("soname >", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameGreaterThanOrEqualTo(String value) {
            addCriterion("soname >=", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameLessThan(String value) {
            addCriterion("soname <", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameLessThanOrEqualTo(String value) {
            addCriterion("soname <=", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameLike(String value) {
            addCriterion("soname like", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameNotLike(String value) {
            addCriterion("soname not like", value, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameIn(List<String> values) {
            addCriterion("soname in", values, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameNotIn(List<String> values) {
            addCriterion("soname not in", values, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameBetween(String value1, String value2) {
            addCriterion("soname between", value1, value2, "soname");
            return (Criteria) this;
        }

        public Criteria andSonameNotBetween(String value1, String value2) {
            addCriterion("soname not between", value1, value2, "soname");
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