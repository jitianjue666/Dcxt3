package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SqExample() {
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

        public Criteria andShopnameIsNull() {
            addCriterion("shopname is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopname is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopname =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopname <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopname >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopname >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopname <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopname <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopname like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopname not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopname in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopname not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopname between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopname not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeIsNull() {
            addCriterion("shopapplytime is null");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeIsNotNull() {
            addCriterion("shopapplytime is not null");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeEqualTo(Date value) {
            addCriterion("shopapplytime =", value, "shopapplytime");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeNotEqualTo(Date value) {
            addCriterion("shopapplytime <>", value, "shopapplytime");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeGreaterThan(Date value) {
            addCriterion("shopapplytime >", value, "shopapplytime");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shopapplytime >=", value, "shopapplytime");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeLessThan(Date value) {
            addCriterion("shopapplytime <", value, "shopapplytime");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeLessThanOrEqualTo(Date value) {
            addCriterion("shopapplytime <=", value, "shopapplytime");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeIn(List<Date> values) {
            addCriterion("shopapplytime in", values, "shopapplytime");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeNotIn(List<Date> values) {
            addCriterion("shopapplytime not in", values, "shopapplytime");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeBetween(Date value1, Date value2) {
            addCriterion("shopapplytime between", value1, value2, "shopapplytime");
            return (Criteria) this;
        }

        public Criteria andShopapplytimeNotBetween(Date value1, Date value2) {
            addCriterion("shopapplytime not between", value1, value2, "shopapplytime");
            return (Criteria) this;
        }

        public Criteria andDcategoryIsNull() {
            addCriterion("dcategory is null");
            return (Criteria) this;
        }

        public Criteria andDcategoryIsNotNull() {
            addCriterion("dcategory is not null");
            return (Criteria) this;
        }

        public Criteria andDcategoryEqualTo(String value) {
            addCriterion("dcategory =", value, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryNotEqualTo(String value) {
            addCriterion("dcategory <>", value, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryGreaterThan(String value) {
            addCriterion("dcategory >", value, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("dcategory >=", value, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryLessThan(String value) {
            addCriterion("dcategory <", value, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryLessThanOrEqualTo(String value) {
            addCriterion("dcategory <=", value, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryLike(String value) {
            addCriterion("dcategory like", value, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryNotLike(String value) {
            addCriterion("dcategory not like", value, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryIn(List<String> values) {
            addCriterion("dcategory in", values, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryNotIn(List<String> values) {
            addCriterion("dcategory not in", values, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryBetween(String value1, String value2) {
            addCriterion("dcategory between", value1, value2, "dcategory");
            return (Criteria) this;
        }

        public Criteria andDcategoryNotBetween(String value1, String value2) {
            addCriterion("dcategory not between", value1, value2, "dcategory");
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

        public Criteria andSozjnoEqualTo(Long value) {
            addCriterion("sozjno =", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoNotEqualTo(Long value) {
            addCriterion("sozjno <>", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoGreaterThan(Long value) {
            addCriterion("sozjno >", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoGreaterThanOrEqualTo(Long value) {
            addCriterion("sozjno >=", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoLessThan(Long value) {
            addCriterion("sozjno <", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoLessThanOrEqualTo(Long value) {
            addCriterion("sozjno <=", value, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoIn(List<Long> values) {
            addCriterion("sozjno in", values, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoNotIn(List<Long> values) {
            addCriterion("sozjno not in", values, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoBetween(Long value1, Long value2) {
            addCriterion("sozjno between", value1, value2, "sozjno");
            return (Criteria) this;
        }

        public Criteria andSozjnoNotBetween(Long value1, Long value2) {
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