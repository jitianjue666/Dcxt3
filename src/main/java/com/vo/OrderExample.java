package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(Long value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(Long value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(Long value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(Long value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(Long value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(Long value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<Long> values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<Long> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(Long value1, Long value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(Long value1, Long value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andBuyernoIsNull() {
            addCriterion("buyerno is null");
            return (Criteria) this;
        }

        public Criteria andBuyernoIsNotNull() {
            addCriterion("buyerno is not null");
            return (Criteria) this;
        }

        public Criteria andBuyernoEqualTo(Integer value) {
            addCriterion("buyerno =", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoNotEqualTo(Integer value) {
            addCriterion("buyerno <>", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoGreaterThan(Integer value) {
            addCriterion("buyerno >", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyerno >=", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoLessThan(Integer value) {
            addCriterion("buyerno <", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoLessThanOrEqualTo(Integer value) {
            addCriterion("buyerno <=", value, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoIn(List<Integer> values) {
            addCriterion("buyerno in", values, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoNotIn(List<Integer> values) {
            addCriterion("buyerno not in", values, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoBetween(Integer value1, Integer value2) {
            addCriterion("buyerno between", value1, value2, "buyerno");
            return (Criteria) this;
        }

        public Criteria andBuyernoNotBetween(Integer value1, Integer value2) {
            addCriterion("buyerno not between", value1, value2, "buyerno");
            return (Criteria) this;
        }

        public Criteria andSellernoIsNull() {
            addCriterion("sellerno is null");
            return (Criteria) this;
        }

        public Criteria andSellernoIsNotNull() {
            addCriterion("sellerno is not null");
            return (Criteria) this;
        }

        public Criteria andSellernoEqualTo(Integer value) {
            addCriterion("sellerno =", value, "sellerno");
            return (Criteria) this;
        }

        public Criteria andSellernoNotEqualTo(Integer value) {
            addCriterion("sellerno <>", value, "sellerno");
            return (Criteria) this;
        }

        public Criteria andSellernoGreaterThan(Integer value) {
            addCriterion("sellerno >", value, "sellerno");
            return (Criteria) this;
        }

        public Criteria andSellernoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerno >=", value, "sellerno");
            return (Criteria) this;
        }

        public Criteria andSellernoLessThan(Integer value) {
            addCriterion("sellerno <", value, "sellerno");
            return (Criteria) this;
        }

        public Criteria andSellernoLessThanOrEqualTo(Integer value) {
            addCriterion("sellerno <=", value, "sellerno");
            return (Criteria) this;
        }

        public Criteria andSellernoIn(List<Integer> values) {
            addCriterion("sellerno in", values, "sellerno");
            return (Criteria) this;
        }

        public Criteria andSellernoNotIn(List<Integer> values) {
            addCriterion("sellerno not in", values, "sellerno");
            return (Criteria) this;
        }

        public Criteria andSellernoBetween(Integer value1, Integer value2) {
            addCriterion("sellerno between", value1, value2, "sellerno");
            return (Criteria) this;
        }

        public Criteria andSellernoNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerno not between", value1, value2, "sellerno");
            return (Criteria) this;
        }

        public Criteria andDishnoIsNull() {
            addCriterion("dishno is null");
            return (Criteria) this;
        }

        public Criteria andDishnoIsNotNull() {
            addCriterion("dishno is not null");
            return (Criteria) this;
        }

        public Criteria andDishnoEqualTo(Integer value) {
            addCriterion("dishno =", value, "dishno");
            return (Criteria) this;
        }

        public Criteria andDishnoNotEqualTo(Integer value) {
            addCriterion("dishno <>", value, "dishno");
            return (Criteria) this;
        }

        public Criteria andDishnoGreaterThan(Integer value) {
            addCriterion("dishno >", value, "dishno");
            return (Criteria) this;
        }

        public Criteria andDishnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishno >=", value, "dishno");
            return (Criteria) this;
        }

        public Criteria andDishnoLessThan(Integer value) {
            addCriterion("dishno <", value, "dishno");
            return (Criteria) this;
        }

        public Criteria andDishnoLessThanOrEqualTo(Integer value) {
            addCriterion("dishno <=", value, "dishno");
            return (Criteria) this;
        }

        public Criteria andDishnoIn(List<Integer> values) {
            addCriterion("dishno in", values, "dishno");
            return (Criteria) this;
        }

        public Criteria andDishnoNotIn(List<Integer> values) {
            addCriterion("dishno not in", values, "dishno");
            return (Criteria) this;
        }

        public Criteria andDishnoBetween(Integer value1, Integer value2) {
            addCriterion("dishno between", value1, value2, "dishno");
            return (Criteria) this;
        }

        public Criteria andDishnoNotBetween(Integer value1, Integer value2) {
            addCriterion("dishno not between", value1, value2, "dishno");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("ordertime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("ordertime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("ordertime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("ordertime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("ordertime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ordertime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("ordertime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("ordertime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("ordertime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("ordertime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("ordertime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("ordertime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryIsNull() {
            addCriterion("ordercategory is null");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryIsNotNull() {
            addCriterion("ordercategory is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryEqualTo(Integer value) {
            addCriterion("ordercategory =", value, "ordercategory");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryNotEqualTo(Integer value) {
            addCriterion("ordercategory <>", value, "ordercategory");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryGreaterThan(Integer value) {
            addCriterion("ordercategory >", value, "ordercategory");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordercategory >=", value, "ordercategory");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryLessThan(Integer value) {
            addCriterion("ordercategory <", value, "ordercategory");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryLessThanOrEqualTo(Integer value) {
            addCriterion("ordercategory <=", value, "ordercategory");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryIn(List<Integer> values) {
            addCriterion("ordercategory in", values, "ordercategory");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryNotIn(List<Integer> values) {
            addCriterion("ordercategory not in", values, "ordercategory");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryBetween(Integer value1, Integer value2) {
            addCriterion("ordercategory between", value1, value2, "ordercategory");
            return (Criteria) this;
        }

        public Criteria andOrdercategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("ordercategory not between", value1, value2, "ordercategory");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNull() {
            addCriterion("overtime is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNotNull() {
            addCriterion("overtime is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeEqualTo(Date value) {
            addCriterion("overtime =", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotEqualTo(Date value) {
            addCriterion("overtime <>", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThan(Date value) {
            addCriterion("overtime >", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("overtime >=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThan(Date value) {
            addCriterion("overtime <", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThanOrEqualTo(Date value) {
            addCriterion("overtime <=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn(List<Date> values) {
            addCriterion("overtime in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotIn(List<Date> values) {
            addCriterion("overtime not in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeBetween(Date value1, Date value2) {
            addCriterion("overtime between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotBetween(Date value1, Date value2) {
            addCriterion("overtime not between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andDishmountIsNull() {
            addCriterion("dishmount is null");
            return (Criteria) this;
        }

        public Criteria andDishmountIsNotNull() {
            addCriterion("dishmount is not null");
            return (Criteria) this;
        }

        public Criteria andDishmountEqualTo(Integer value) {
            addCriterion("dishmount =", value, "dishmount");
            return (Criteria) this;
        }

        public Criteria andDishmountNotEqualTo(Integer value) {
            addCriterion("dishmount <>", value, "dishmount");
            return (Criteria) this;
        }

        public Criteria andDishmountGreaterThan(Integer value) {
            addCriterion("dishmount >", value, "dishmount");
            return (Criteria) this;
        }

        public Criteria andDishmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishmount >=", value, "dishmount");
            return (Criteria) this;
        }

        public Criteria andDishmountLessThan(Integer value) {
            addCriterion("dishmount <", value, "dishmount");
            return (Criteria) this;
        }

        public Criteria andDishmountLessThanOrEqualTo(Integer value) {
            addCriterion("dishmount <=", value, "dishmount");
            return (Criteria) this;
        }

        public Criteria andDishmountIn(List<Integer> values) {
            addCriterion("dishmount in", values, "dishmount");
            return (Criteria) this;
        }

        public Criteria andDishmountNotIn(List<Integer> values) {
            addCriterion("dishmount not in", values, "dishmount");
            return (Criteria) this;
        }

        public Criteria andDishmountBetween(Integer value1, Integer value2) {
            addCriterion("dishmount between", value1, value2, "dishmount");
            return (Criteria) this;
        }

        public Criteria andDishmountNotBetween(Integer value1, Integer value2) {
            addCriterion("dishmount not between", value1, value2, "dishmount");
            return (Criteria) this;
        }

        public Criteria andTotalmountIsNull() {
            addCriterion("totalmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalmountIsNotNull() {
            addCriterion("totalmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmountEqualTo(Integer value) {
            addCriterion("totalmount =", value, "totalmount");
            return (Criteria) this;
        }

        public Criteria andTotalmountNotEqualTo(Integer value) {
            addCriterion("totalmount <>", value, "totalmount");
            return (Criteria) this;
        }

        public Criteria andTotalmountGreaterThan(Integer value) {
            addCriterion("totalmount >", value, "totalmount");
            return (Criteria) this;
        }

        public Criteria andTotalmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalmount >=", value, "totalmount");
            return (Criteria) this;
        }

        public Criteria andTotalmountLessThan(Integer value) {
            addCriterion("totalmount <", value, "totalmount");
            return (Criteria) this;
        }

        public Criteria andTotalmountLessThanOrEqualTo(Integer value) {
            addCriterion("totalmount <=", value, "totalmount");
            return (Criteria) this;
        }

        public Criteria andTotalmountIn(List<Integer> values) {
            addCriterion("totalmount in", values, "totalmount");
            return (Criteria) this;
        }

        public Criteria andTotalmountNotIn(List<Integer> values) {
            addCriterion("totalmount not in", values, "totalmount");
            return (Criteria) this;
        }

        public Criteria andTotalmountBetween(Integer value1, Integer value2) {
            addCriterion("totalmount between", value1, value2, "totalmount");
            return (Criteria) this;
        }

        public Criteria andTotalmountNotBetween(Integer value1, Integer value2) {
            addCriterion("totalmount not between", value1, value2, "totalmount");
            return (Criteria) this;
        }

        public Criteria andDishmingziIsNull() {
            addCriterion("dishmingzi is null");
            return (Criteria) this;
        }

        public Criteria andDishmingziIsNotNull() {
            addCriterion("dishmingzi is not null");
            return (Criteria) this;
        }

        public Criteria andDishmingziEqualTo(String value) {
            addCriterion("dishmingzi =", value, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziNotEqualTo(String value) {
            addCriterion("dishmingzi <>", value, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziGreaterThan(String value) {
            addCriterion("dishmingzi >", value, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziGreaterThanOrEqualTo(String value) {
            addCriterion("dishmingzi >=", value, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziLessThan(String value) {
            addCriterion("dishmingzi <", value, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziLessThanOrEqualTo(String value) {
            addCriterion("dishmingzi <=", value, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziLike(String value) {
            addCriterion("dishmingzi like", value, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziNotLike(String value) {
            addCriterion("dishmingzi not like", value, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziIn(List<String> values) {
            addCriterion("dishmingzi in", values, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziNotIn(List<String> values) {
            addCriterion("dishmingzi not in", values, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziBetween(String value1, String value2) {
            addCriterion("dishmingzi between", value1, value2, "dishmingzi");
            return (Criteria) this;
        }

        public Criteria andDishmingziNotBetween(String value1, String value2) {
            addCriterion("dishmingzi not between", value1, value2, "dishmingzi");
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