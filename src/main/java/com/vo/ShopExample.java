package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopnoIsNull() {
            addCriterion("shopno is null");
            return (Criteria) this;
        }

        public Criteria andShopnoIsNotNull() {
            addCriterion("shopno is not null");
            return (Criteria) this;
        }

        public Criteria andShopnoEqualTo(Integer value) {
            addCriterion("shopno =", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoNotEqualTo(Integer value) {
            addCriterion("shopno <>", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoGreaterThan(Integer value) {
            addCriterion("shopno >", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopno >=", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoLessThan(Integer value) {
            addCriterion("shopno <", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoLessThanOrEqualTo(Integer value) {
            addCriterion("shopno <=", value, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoIn(List<Integer> values) {
            addCriterion("shopno in", values, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoNotIn(List<Integer> values) {
            addCriterion("shopno not in", values, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoBetween(Integer value1, Integer value2) {
            addCriterion("shopno between", value1, value2, "shopno");
            return (Criteria) this;
        }

        public Criteria andShopnoNotBetween(Integer value1, Integer value2) {
            addCriterion("shopno not between", value1, value2, "shopno");
            return (Criteria) this;
        }

        public Criteria andOwnernoIsNull() {
            addCriterion("ownerno is null");
            return (Criteria) this;
        }

        public Criteria andOwnernoIsNotNull() {
            addCriterion("ownerno is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernoEqualTo(Integer value) {
            addCriterion("ownerno =", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoNotEqualTo(Integer value) {
            addCriterion("ownerno <>", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoGreaterThan(Integer value) {
            addCriterion("ownerno >", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ownerno >=", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoLessThan(Integer value) {
            addCriterion("ownerno <", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoLessThanOrEqualTo(Integer value) {
            addCriterion("ownerno <=", value, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoIn(List<Integer> values) {
            addCriterion("ownerno in", values, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoNotIn(List<Integer> values) {
            addCriterion("ownerno not in", values, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoBetween(Integer value1, Integer value2) {
            addCriterion("ownerno between", value1, value2, "ownerno");
            return (Criteria) this;
        }

        public Criteria andOwnernoNotBetween(Integer value1, Integer value2) {
            addCriterion("ownerno not between", value1, value2, "ownerno");
            return (Criteria) this;
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

        public Criteria andShopstateIsNull() {
            addCriterion("shopstate is null");
            return (Criteria) this;
        }

        public Criteria andShopstateIsNotNull() {
            addCriterion("shopstate is not null");
            return (Criteria) this;
        }

        public Criteria andShopstateEqualTo(Integer value) {
            addCriterion("shopstate =", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateNotEqualTo(Integer value) {
            addCriterion("shopstate <>", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateGreaterThan(Integer value) {
            addCriterion("shopstate >", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopstate >=", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateLessThan(Integer value) {
            addCriterion("shopstate <", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateLessThanOrEqualTo(Integer value) {
            addCriterion("shopstate <=", value, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateIn(List<Integer> values) {
            addCriterion("shopstate in", values, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateNotIn(List<Integer> values) {
            addCriterion("shopstate not in", values, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateBetween(Integer value1, Integer value2) {
            addCriterion("shopstate between", value1, value2, "shopstate");
            return (Criteria) this;
        }

        public Criteria andShopstateNotBetween(Integer value1, Integer value2) {
            addCriterion("shopstate not between", value1, value2, "shopstate");
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

        public Criteria andShopadopttimeIsNull() {
            addCriterion("shopadopttime is null");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeIsNotNull() {
            addCriterion("shopadopttime is not null");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeEqualTo(Date value) {
            addCriterion("shopadopttime =", value, "shopadopttime");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeNotEqualTo(Date value) {
            addCriterion("shopadopttime <>", value, "shopadopttime");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeGreaterThan(Date value) {
            addCriterion("shopadopttime >", value, "shopadopttime");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shopadopttime >=", value, "shopadopttime");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeLessThan(Date value) {
            addCriterion("shopadopttime <", value, "shopadopttime");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeLessThanOrEqualTo(Date value) {
            addCriterion("shopadopttime <=", value, "shopadopttime");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeIn(List<Date> values) {
            addCriterion("shopadopttime in", values, "shopadopttime");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeNotIn(List<Date> values) {
            addCriterion("shopadopttime not in", values, "shopadopttime");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeBetween(Date value1, Date value2) {
            addCriterion("shopadopttime between", value1, value2, "shopadopttime");
            return (Criteria) this;
        }

        public Criteria andShopadopttimeNotBetween(Date value1, Date value2) {
            addCriterion("shopadopttime not between", value1, value2, "shopadopttime");
            return (Criteria) this;
        }

        public Criteria andShopvolumeIsNull() {
            addCriterion("shopvolume is null");
            return (Criteria) this;
        }

        public Criteria andShopvolumeIsNotNull() {
            addCriterion("shopvolume is not null");
            return (Criteria) this;
        }

        public Criteria andShopvolumeEqualTo(Integer value) {
            addCriterion("shopvolume =", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeNotEqualTo(Integer value) {
            addCriterion("shopvolume <>", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeGreaterThan(Integer value) {
            addCriterion("shopvolume >", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopvolume >=", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeLessThan(Integer value) {
            addCriterion("shopvolume <", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("shopvolume <=", value, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeIn(List<Integer> values) {
            addCriterion("shopvolume in", values, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeNotIn(List<Integer> values) {
            addCriterion("shopvolume not in", values, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeBetween(Integer value1, Integer value2) {
            addCriterion("shopvolume between", value1, value2, "shopvolume");
            return (Criteria) this;
        }

        public Criteria andShopvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("shopvolume not between", value1, value2, "shopvolume");
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