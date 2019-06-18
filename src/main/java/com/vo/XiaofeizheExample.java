package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XiaofeizheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XiaofeizheExample() {
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

        public Criteria andXiaofeizhebianhaoIsNull() {
            addCriterion("xiaofeizhebianhao is null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoIsNotNull() {
            addCriterion("xiaofeizhebianhao is not null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoEqualTo(Integer value) {
            addCriterion("xiaofeizhebianhao =", value, "xiaofeizhebianhao");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoNotEqualTo(Integer value) {
            addCriterion("xiaofeizhebianhao <>", value, "xiaofeizhebianhao");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoGreaterThan(Integer value) {
            addCriterion("xiaofeizhebianhao >", value, "xiaofeizhebianhao");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("xiaofeizhebianhao >=", value, "xiaofeizhebianhao");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoLessThan(Integer value) {
            addCriterion("xiaofeizhebianhao <", value, "xiaofeizhebianhao");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoLessThanOrEqualTo(Integer value) {
            addCriterion("xiaofeizhebianhao <=", value, "xiaofeizhebianhao");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoIn(List<Integer> values) {
            addCriterion("xiaofeizhebianhao in", values, "xiaofeizhebianhao");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoNotIn(List<Integer> values) {
            addCriterion("xiaofeizhebianhao not in", values, "xiaofeizhebianhao");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoBetween(Integer value1, Integer value2) {
            addCriterion("xiaofeizhebianhao between", value1, value2, "xiaofeizhebianhao");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhebianhaoNotBetween(Integer value1, Integer value2) {
            addCriterion("xiaofeizhebianhao not between", value1, value2, "xiaofeizhebianhao");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidIsNull() {
            addCriterion("xiaofeizheid is null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidIsNotNull() {
            addCriterion("xiaofeizheid is not null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidEqualTo(String value) {
            addCriterion("xiaofeizheid =", value, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidNotEqualTo(String value) {
            addCriterion("xiaofeizheid <>", value, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidGreaterThan(String value) {
            addCriterion("xiaofeizheid >", value, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidGreaterThanOrEqualTo(String value) {
            addCriterion("xiaofeizheid >=", value, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidLessThan(String value) {
            addCriterion("xiaofeizheid <", value, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidLessThanOrEqualTo(String value) {
            addCriterion("xiaofeizheid <=", value, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidLike(String value) {
            addCriterion("xiaofeizheid like", value, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidNotLike(String value) {
            addCriterion("xiaofeizheid not like", value, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidIn(List<String> values) {
            addCriterion("xiaofeizheid in", values, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidNotIn(List<String> values) {
            addCriterion("xiaofeizheid not in", values, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidBetween(String value1, String value2) {
            addCriterion("xiaofeizheid between", value1, value2, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheidNotBetween(String value1, String value2) {
            addCriterion("xiaofeizheid not between", value1, value2, "xiaofeizheid");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaIsNull() {
            addCriterion("xiaofeizhemima is null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaIsNotNull() {
            addCriterion("xiaofeizhemima is not null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaEqualTo(String value) {
            addCriterion("xiaofeizhemima =", value, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaNotEqualTo(String value) {
            addCriterion("xiaofeizhemima <>", value, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaGreaterThan(String value) {
            addCriterion("xiaofeizhemima >", value, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaGreaterThanOrEqualTo(String value) {
            addCriterion("xiaofeizhemima >=", value, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaLessThan(String value) {
            addCriterion("xiaofeizhemima <", value, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaLessThanOrEqualTo(String value) {
            addCriterion("xiaofeizhemima <=", value, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaLike(String value) {
            addCriterion("xiaofeizhemima like", value, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaNotLike(String value) {
            addCriterion("xiaofeizhemima not like", value, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaIn(List<String> values) {
            addCriterion("xiaofeizhemima in", values, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaNotIn(List<String> values) {
            addCriterion("xiaofeizhemima not in", values, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaBetween(String value1, String value2) {
            addCriterion("xiaofeizhemima between", value1, value2, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhemimaNotBetween(String value1, String value2) {
            addCriterion("xiaofeizhemima not between", value1, value2, "xiaofeizhemima");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangIsNull() {
            addCriterion("xiaofeizheyouxiang is null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangIsNotNull() {
            addCriterion("xiaofeizheyouxiang is not null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangEqualTo(String value) {
            addCriterion("xiaofeizheyouxiang =", value, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangNotEqualTo(String value) {
            addCriterion("xiaofeizheyouxiang <>", value, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangGreaterThan(String value) {
            addCriterion("xiaofeizheyouxiang >", value, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangGreaterThanOrEqualTo(String value) {
            addCriterion("xiaofeizheyouxiang >=", value, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangLessThan(String value) {
            addCriterion("xiaofeizheyouxiang <", value, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangLessThanOrEqualTo(String value) {
            addCriterion("xiaofeizheyouxiang <=", value, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangLike(String value) {
            addCriterion("xiaofeizheyouxiang like", value, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangNotLike(String value) {
            addCriterion("xiaofeizheyouxiang not like", value, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangIn(List<String> values) {
            addCriterion("xiaofeizheyouxiang in", values, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangNotIn(List<String> values) {
            addCriterion("xiaofeizheyouxiang not in", values, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangBetween(String value1, String value2) {
            addCriterion("xiaofeizheyouxiang between", value1, value2, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizheyouxiangNotBetween(String value1, String value2) {
            addCriterion("xiaofeizheyouxiang not between", value1, value2, "xiaofeizheyouxiang");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaIsNull() {
            addCriterion("xiaofeizhedianhua is null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaIsNotNull() {
            addCriterion("xiaofeizhedianhua is not null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaEqualTo(Long value) {
            addCriterion("xiaofeizhedianhua =", value, "xiaofeizhedianhua");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaNotEqualTo(Long value) {
            addCriterion("xiaofeizhedianhua <>", value, "xiaofeizhedianhua");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaGreaterThan(Long value) {
            addCriterion("xiaofeizhedianhua >", value, "xiaofeizhedianhua");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaGreaterThanOrEqualTo(Long value) {
            addCriterion("xiaofeizhedianhua >=", value, "xiaofeizhedianhua");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaLessThan(Long value) {
            addCriterion("xiaofeizhedianhua <", value, "xiaofeizhedianhua");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaLessThanOrEqualTo(Long value) {
            addCriterion("xiaofeizhedianhua <=", value, "xiaofeizhedianhua");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaIn(List<Long> values) {
            addCriterion("xiaofeizhedianhua in", values, "xiaofeizhedianhua");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaNotIn(List<Long> values) {
            addCriterion("xiaofeizhedianhua not in", values, "xiaofeizhedianhua");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaBetween(Long value1, Long value2) {
            addCriterion("xiaofeizhedianhua between", value1, value2, "xiaofeizhedianhua");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhedianhuaNotBetween(Long value1, Long value2) {
            addCriterion("xiaofeizhedianhua not between", value1, value2, "xiaofeizhedianhua");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianIsNull() {
            addCriterion("xiaofeizhezhuceshijian is null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianIsNotNull() {
            addCriterion("xiaofeizhezhuceshijian is not null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianEqualTo(Date value) {
            addCriterion("xiaofeizhezhuceshijian =", value, "xiaofeizhezhuceshijian");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianNotEqualTo(Date value) {
            addCriterion("xiaofeizhezhuceshijian <>", value, "xiaofeizhezhuceshijian");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianGreaterThan(Date value) {
            addCriterion("xiaofeizhezhuceshijian >", value, "xiaofeizhezhuceshijian");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("xiaofeizhezhuceshijian >=", value, "xiaofeizhezhuceshijian");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianLessThan(Date value) {
            addCriterion("xiaofeizhezhuceshijian <", value, "xiaofeizhezhuceshijian");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianLessThanOrEqualTo(Date value) {
            addCriterion("xiaofeizhezhuceshijian <=", value, "xiaofeizhezhuceshijian");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianIn(List<Date> values) {
            addCriterion("xiaofeizhezhuceshijian in", values, "xiaofeizhezhuceshijian");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianNotIn(List<Date> values) {
            addCriterion("xiaofeizhezhuceshijian not in", values, "xiaofeizhezhuceshijian");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianBetween(Date value1, Date value2) {
            addCriterion("xiaofeizhezhuceshijian between", value1, value2, "xiaofeizhezhuceshijian");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhezhuceshijianNotBetween(Date value1, Date value2) {
            addCriterion("xiaofeizhezhuceshijian not between", value1, value2, "xiaofeizhezhuceshijian");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuIsNull() {
            addCriterion("xiaofeizhexiadancishu is null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuIsNotNull() {
            addCriterion("xiaofeizhexiadancishu is not null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuEqualTo(Integer value) {
            addCriterion("xiaofeizhexiadancishu =", value, "xiaofeizhexiadancishu");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuNotEqualTo(Integer value) {
            addCriterion("xiaofeizhexiadancishu <>", value, "xiaofeizhexiadancishu");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuGreaterThan(Integer value) {
            addCriterion("xiaofeizhexiadancishu >", value, "xiaofeizhexiadancishu");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("xiaofeizhexiadancishu >=", value, "xiaofeizhexiadancishu");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuLessThan(Integer value) {
            addCriterion("xiaofeizhexiadancishu <", value, "xiaofeizhexiadancishu");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuLessThanOrEqualTo(Integer value) {
            addCriterion("xiaofeizhexiadancishu <=", value, "xiaofeizhexiadancishu");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuIn(List<Integer> values) {
            addCriterion("xiaofeizhexiadancishu in", values, "xiaofeizhexiadancishu");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuNotIn(List<Integer> values) {
            addCriterion("xiaofeizhexiadancishu not in", values, "xiaofeizhexiadancishu");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuBetween(Integer value1, Integer value2) {
            addCriterion("xiaofeizhexiadancishu between", value1, value2, "xiaofeizhexiadancishu");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhexiadancishuNotBetween(Integer value1, Integer value2) {
            addCriterion("xiaofeizhexiadancishu not between", value1, value2, "xiaofeizhexiadancishu");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineIsNull() {
            addCriterion("xiaofeizhegongjixiaofeijine is null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineIsNotNull() {
            addCriterion("xiaofeizhegongjixiaofeijine is not null");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineEqualTo(Double value) {
            addCriterion("xiaofeizhegongjixiaofeijine =", value, "xiaofeizhegongjixiaofeijine");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineNotEqualTo(Double value) {
            addCriterion("xiaofeizhegongjixiaofeijine <>", value, "xiaofeizhegongjixiaofeijine");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineGreaterThan(Double value) {
            addCriterion("xiaofeizhegongjixiaofeijine >", value, "xiaofeizhegongjixiaofeijine");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineGreaterThanOrEqualTo(Double value) {
            addCriterion("xiaofeizhegongjixiaofeijine >=", value, "xiaofeizhegongjixiaofeijine");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineLessThan(Double value) {
            addCriterion("xiaofeizhegongjixiaofeijine <", value, "xiaofeizhegongjixiaofeijine");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineLessThanOrEqualTo(Double value) {
            addCriterion("xiaofeizhegongjixiaofeijine <=", value, "xiaofeizhegongjixiaofeijine");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineIn(List<Double> values) {
            addCriterion("xiaofeizhegongjixiaofeijine in", values, "xiaofeizhegongjixiaofeijine");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineNotIn(List<Double> values) {
            addCriterion("xiaofeizhegongjixiaofeijine not in", values, "xiaofeizhegongjixiaofeijine");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineBetween(Double value1, Double value2) {
            addCriterion("xiaofeizhegongjixiaofeijine between", value1, value2, "xiaofeizhegongjixiaofeijine");
            return (Criteria) this;
        }

        public Criteria andXiaofeizhegongjixiaofeijineNotBetween(Double value1, Double value2) {
            addCriterion("xiaofeizhegongjixiaofeijine not between", value1, value2, "xiaofeizhegongjixiaofeijine");
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