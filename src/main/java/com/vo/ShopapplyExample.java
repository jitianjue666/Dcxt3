package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopapplyExample() {
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

        public Criteria andApplynoIsNull() {
            addCriterion("applyno is null");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNotNull() {
            addCriterion("applyno is not null");
            return (Criteria) this;
        }

        public Criteria andApplynoEqualTo(Integer value) {
            addCriterion("applyno =", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotEqualTo(Integer value) {
            addCriterion("applyno <>", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThan(Integer value) {
            addCriterion("applyno >", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThanOrEqualTo(Integer value) {
            addCriterion("applyno >=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThan(Integer value) {
            addCriterion("applyno <", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThanOrEqualTo(Integer value) {
            addCriterion("applyno <=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoIn(List<Integer> values) {
            addCriterion("applyno in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotIn(List<Integer> values) {
            addCriterion("applyno not in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoBetween(Integer value1, Integer value2) {
            addCriterion("applyno between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotBetween(Integer value1, Integer value2) {
            addCriterion("applyno not between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andShopnumberIsNull() {
            addCriterion("shopnumber is null");
            return (Criteria) this;
        }

        public Criteria andShopnumberIsNotNull() {
            addCriterion("shopnumber is not null");
            return (Criteria) this;
        }

        public Criteria andShopnumberEqualTo(Integer value) {
            addCriterion("shopnumber =", value, "shopnumber");
            return (Criteria) this;
        }

        public Criteria andShopnumberNotEqualTo(Integer value) {
            addCriterion("shopnumber <>", value, "shopnumber");
            return (Criteria) this;
        }

        public Criteria andShopnumberGreaterThan(Integer value) {
            addCriterion("shopnumber >", value, "shopnumber");
            return (Criteria) this;
        }

        public Criteria andShopnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopnumber >=", value, "shopnumber");
            return (Criteria) this;
        }

        public Criteria andShopnumberLessThan(Integer value) {
            addCriterion("shopnumber <", value, "shopnumber");
            return (Criteria) this;
        }

        public Criteria andShopnumberLessThanOrEqualTo(Integer value) {
            addCriterion("shopnumber <=", value, "shopnumber");
            return (Criteria) this;
        }

        public Criteria andShopnumberIn(List<Integer> values) {
            addCriterion("shopnumber in", values, "shopnumber");
            return (Criteria) this;
        }

        public Criteria andShopnumberNotIn(List<Integer> values) {
            addCriterion("shopnumber not in", values, "shopnumber");
            return (Criteria) this;
        }

        public Criteria andShopnumberBetween(Integer value1, Integer value2) {
            addCriterion("shopnumber between", value1, value2, "shopnumber");
            return (Criteria) this;
        }

        public Criteria andShopnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("shopnumber not between", value1, value2, "shopnumber");
            return (Criteria) this;
        }

        public Criteria andAdminnoIsNull() {
            addCriterion("adminno is null");
            return (Criteria) this;
        }

        public Criteria andAdminnoIsNotNull() {
            addCriterion("adminno is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnoEqualTo(Integer value) {
            addCriterion("adminno =", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoNotEqualTo(Integer value) {
            addCriterion("adminno <>", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoGreaterThan(Integer value) {
            addCriterion("adminno >", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminno >=", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoLessThan(Integer value) {
            addCriterion("adminno <", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoLessThanOrEqualTo(Integer value) {
            addCriterion("adminno <=", value, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoIn(List<Integer> values) {
            addCriterion("adminno in", values, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoNotIn(List<Integer> values) {
            addCriterion("adminno not in", values, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoBetween(Integer value1, Integer value2) {
            addCriterion("adminno between", value1, value2, "adminno");
            return (Criteria) this;
        }

        public Criteria andAdminnoNotBetween(Integer value1, Integer value2) {
            addCriterion("adminno not between", value1, value2, "adminno");
            return (Criteria) this;
        }

        public Criteria andAptimeIsNull() {
            addCriterion("aptime is null");
            return (Criteria) this;
        }

        public Criteria andAptimeIsNotNull() {
            addCriterion("aptime is not null");
            return (Criteria) this;
        }

        public Criteria andAptimeEqualTo(Date value) {
            addCriterion("aptime =", value, "aptime");
            return (Criteria) this;
        }

        public Criteria andAptimeNotEqualTo(Date value) {
            addCriterion("aptime <>", value, "aptime");
            return (Criteria) this;
        }

        public Criteria andAptimeGreaterThan(Date value) {
            addCriterion("aptime >", value, "aptime");
            return (Criteria) this;
        }

        public Criteria andAptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("aptime >=", value, "aptime");
            return (Criteria) this;
        }

        public Criteria andAptimeLessThan(Date value) {
            addCriterion("aptime <", value, "aptime");
            return (Criteria) this;
        }

        public Criteria andAptimeLessThanOrEqualTo(Date value) {
            addCriterion("aptime <=", value, "aptime");
            return (Criteria) this;
        }

        public Criteria andAptimeIn(List<Date> values) {
            addCriterion("aptime in", values, "aptime");
            return (Criteria) this;
        }

        public Criteria andAptimeNotIn(List<Date> values) {
            addCriterion("aptime not in", values, "aptime");
            return (Criteria) this;
        }

        public Criteria andAptimeBetween(Date value1, Date value2) {
            addCriterion("aptime between", value1, value2, "aptime");
            return (Criteria) this;
        }

        public Criteria andAptimeNotBetween(Date value1, Date value2) {
            addCriterion("aptime not between", value1, value2, "aptime");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNull() {
            addCriterion("dealtime is null");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNotNull() {
            addCriterion("dealtime is not null");
            return (Criteria) this;
        }

        public Criteria andDealtimeEqualTo(Date value) {
            addCriterion("dealtime =", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotEqualTo(Date value) {
            addCriterion("dealtime <>", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThan(Date value) {
            addCriterion("dealtime >", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dealtime >=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThan(Date value) {
            addCriterion("dealtime <", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThanOrEqualTo(Date value) {
            addCriterion("dealtime <=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeIn(List<Date> values) {
            addCriterion("dealtime in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotIn(List<Date> values) {
            addCriterion("dealtime not in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeBetween(Date value1, Date value2) {
            addCriterion("dealtime between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotBetween(Date value1, Date value2) {
            addCriterion("dealtime not between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andApstateIsNull() {
            addCriterion("apstate is null");
            return (Criteria) this;
        }

        public Criteria andApstateIsNotNull() {
            addCriterion("apstate is not null");
            return (Criteria) this;
        }

        public Criteria andApstateEqualTo(Integer value) {
            addCriterion("apstate =", value, "apstate");
            return (Criteria) this;
        }

        public Criteria andApstateNotEqualTo(Integer value) {
            addCriterion("apstate <>", value, "apstate");
            return (Criteria) this;
        }

        public Criteria andApstateGreaterThan(Integer value) {
            addCriterion("apstate >", value, "apstate");
            return (Criteria) this;
        }

        public Criteria andApstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("apstate >=", value, "apstate");
            return (Criteria) this;
        }

        public Criteria andApstateLessThan(Integer value) {
            addCriterion("apstate <", value, "apstate");
            return (Criteria) this;
        }

        public Criteria andApstateLessThanOrEqualTo(Integer value) {
            addCriterion("apstate <=", value, "apstate");
            return (Criteria) this;
        }

        public Criteria andApstateIn(List<Integer> values) {
            addCriterion("apstate in", values, "apstate");
            return (Criteria) this;
        }

        public Criteria andApstateNotIn(List<Integer> values) {
            addCriterion("apstate not in", values, "apstate");
            return (Criteria) this;
        }

        public Criteria andApstateBetween(Integer value1, Integer value2) {
            addCriterion("apstate between", value1, value2, "apstate");
            return (Criteria) this;
        }

        public Criteria andApstateNotBetween(Integer value1, Integer value2) {
            addCriterion("apstate not between", value1, value2, "apstate");
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