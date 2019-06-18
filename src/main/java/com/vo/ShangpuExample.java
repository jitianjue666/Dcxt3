package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShangpuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShangpuExample() {
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

        public Criteria andShangjiabianhaoIsNull() {
            addCriterion("shangjiabianhao is null");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoIsNotNull() {
            addCriterion("shangjiabianhao is not null");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoEqualTo(Integer value) {
            addCriterion("shangjiabianhao =", value, "shangjiabianhao");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoNotEqualTo(Integer value) {
            addCriterion("shangjiabianhao <>", value, "shangjiabianhao");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoGreaterThan(Integer value) {
            addCriterion("shangjiabianhao >", value, "shangjiabianhao");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("shangjiabianhao >=", value, "shangjiabianhao");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoLessThan(Integer value) {
            addCriterion("shangjiabianhao <", value, "shangjiabianhao");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoLessThanOrEqualTo(Integer value) {
            addCriterion("shangjiabianhao <=", value, "shangjiabianhao");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoIn(List<Integer> values) {
            addCriterion("shangjiabianhao in", values, "shangjiabianhao");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoNotIn(List<Integer> values) {
            addCriterion("shangjiabianhao not in", values, "shangjiabianhao");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoBetween(Integer value1, Integer value2) {
            addCriterion("shangjiabianhao between", value1, value2, "shangjiabianhao");
            return (Criteria) this;
        }

        public Criteria andShangjiabianhaoNotBetween(Integer value1, Integer value2) {
            addCriterion("shangjiabianhao not between", value1, value2, "shangjiabianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoIsNull() {
            addCriterion("shangpuyongyouzhebianhao is null");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoIsNotNull() {
            addCriterion("shangpuyongyouzhebianhao is not null");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoEqualTo(Integer value) {
            addCriterion("shangpuyongyouzhebianhao =", value, "shangpuyongyouzhebianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoNotEqualTo(Integer value) {
            addCriterion("shangpuyongyouzhebianhao <>", value, "shangpuyongyouzhebianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoGreaterThan(Integer value) {
            addCriterion("shangpuyongyouzhebianhao >", value, "shangpuyongyouzhebianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("shangpuyongyouzhebianhao >=", value, "shangpuyongyouzhebianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoLessThan(Integer value) {
            addCriterion("shangpuyongyouzhebianhao <", value, "shangpuyongyouzhebianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoLessThanOrEqualTo(Integer value) {
            addCriterion("shangpuyongyouzhebianhao <=", value, "shangpuyongyouzhebianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoIn(List<Integer> values) {
            addCriterion("shangpuyongyouzhebianhao in", values, "shangpuyongyouzhebianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoNotIn(List<Integer> values) {
            addCriterion("shangpuyongyouzhebianhao not in", values, "shangpuyongyouzhebianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoBetween(Integer value1, Integer value2) {
            addCriterion("shangpuyongyouzhebianhao between", value1, value2, "shangpuyongyouzhebianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzhebianhaoNotBetween(Integer value1, Integer value2) {
            addCriterion("shangpuyongyouzhebianhao not between", value1, value2, "shangpuyongyouzhebianhao");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidIsNull() {
            addCriterion("shangpuyongyouzheid is null");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidIsNotNull() {
            addCriterion("shangpuyongyouzheid is not null");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidEqualTo(String value) {
            addCriterion("shangpuyongyouzheid =", value, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidNotEqualTo(String value) {
            addCriterion("shangpuyongyouzheid <>", value, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidGreaterThan(String value) {
            addCriterion("shangpuyongyouzheid >", value, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidGreaterThanOrEqualTo(String value) {
            addCriterion("shangpuyongyouzheid >=", value, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidLessThan(String value) {
            addCriterion("shangpuyongyouzheid <", value, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidLessThanOrEqualTo(String value) {
            addCriterion("shangpuyongyouzheid <=", value, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidLike(String value) {
            addCriterion("shangpuyongyouzheid like", value, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidNotLike(String value) {
            addCriterion("shangpuyongyouzheid not like", value, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidIn(List<String> values) {
            addCriterion("shangpuyongyouzheid in", values, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidNotIn(List<String> values) {
            addCriterion("shangpuyongyouzheid not in", values, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidBetween(String value1, String value2) {
            addCriterion("shangpuyongyouzheid between", value1, value2, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpuyongyouzheidNotBetween(String value1, String value2) {
            addCriterion("shangpuyongyouzheid not between", value1, value2, "shangpuyongyouzheid");
            return (Criteria) this;
        }

        public Criteria andShangpumingziIsNull() {
            addCriterion("shangpumingzi is null");
            return (Criteria) this;
        }

        public Criteria andShangpumingziIsNotNull() {
            addCriterion("shangpumingzi is not null");
            return (Criteria) this;
        }

        public Criteria andShangpumingziEqualTo(String value) {
            addCriterion("shangpumingzi =", value, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziNotEqualTo(String value) {
            addCriterion("shangpumingzi <>", value, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziGreaterThan(String value) {
            addCriterion("shangpumingzi >", value, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziGreaterThanOrEqualTo(String value) {
            addCriterion("shangpumingzi >=", value, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziLessThan(String value) {
            addCriterion("shangpumingzi <", value, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziLessThanOrEqualTo(String value) {
            addCriterion("shangpumingzi <=", value, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziLike(String value) {
            addCriterion("shangpumingzi like", value, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziNotLike(String value) {
            addCriterion("shangpumingzi not like", value, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziIn(List<String> values) {
            addCriterion("shangpumingzi in", values, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziNotIn(List<String> values) {
            addCriterion("shangpumingzi not in", values, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziBetween(String value1, String value2) {
            addCriterion("shangpumingzi between", value1, value2, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpumingziNotBetween(String value1, String value2) {
            addCriterion("shangpumingzi not between", value1, value2, "shangpumingzi");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianIsNull() {
            addCriterion("shangpushenqingshijian is null");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianIsNotNull() {
            addCriterion("shangpushenqingshijian is not null");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianEqualTo(Date value) {
            addCriterion("shangpushenqingshijian =", value, "shangpushenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianNotEqualTo(Date value) {
            addCriterion("shangpushenqingshijian <>", value, "shangpushenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianGreaterThan(Date value) {
            addCriterion("shangpushenqingshijian >", value, "shangpushenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("shangpushenqingshijian >=", value, "shangpushenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianLessThan(Date value) {
            addCriterion("shangpushenqingshijian <", value, "shangpushenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianLessThanOrEqualTo(Date value) {
            addCriterion("shangpushenqingshijian <=", value, "shangpushenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianIn(List<Date> values) {
            addCriterion("shangpushenqingshijian in", values, "shangpushenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianNotIn(List<Date> values) {
            addCriterion("shangpushenqingshijian not in", values, "shangpushenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianBetween(Date value1, Date value2) {
            addCriterion("shangpushenqingshijian between", value1, value2, "shangpushenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShangpushenqingshijianNotBetween(Date value1, Date value2) {
            addCriterion("shangpushenqingshijian not between", value1, value2, "shangpushenqingshijian");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianIsNull() {
            addCriterion("chulishenqingshijian is null");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianIsNotNull() {
            addCriterion("chulishenqingshijian is not null");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianEqualTo(Date value) {
            addCriterion("chulishenqingshijian =", value, "chulishenqingshijian");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianNotEqualTo(Date value) {
            addCriterion("chulishenqingshijian <>", value, "chulishenqingshijian");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianGreaterThan(Date value) {
            addCriterion("chulishenqingshijian >", value, "chulishenqingshijian");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("chulishenqingshijian >=", value, "chulishenqingshijian");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianLessThan(Date value) {
            addCriterion("chulishenqingshijian <", value, "chulishenqingshijian");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianLessThanOrEqualTo(Date value) {
            addCriterion("chulishenqingshijian <=", value, "chulishenqingshijian");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianIn(List<Date> values) {
            addCriterion("chulishenqingshijian in", values, "chulishenqingshijian");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianNotIn(List<Date> values) {
            addCriterion("chulishenqingshijian not in", values, "chulishenqingshijian");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianBetween(Date value1, Date value2) {
            addCriterion("chulishenqingshijian between", value1, value2, "chulishenqingshijian");
            return (Criteria) this;
        }

        public Criteria andChulishenqingshijianNotBetween(Date value1, Date value2) {
            addCriterion("chulishenqingshijian not between", value1, value2, "chulishenqingshijian");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiIsNull() {
            addCriterion("shangpuzhuangtai is null");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiIsNotNull() {
            addCriterion("shangpuzhuangtai is not null");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiEqualTo(String value) {
            addCriterion("shangpuzhuangtai =", value, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiNotEqualTo(String value) {
            addCriterion("shangpuzhuangtai <>", value, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiGreaterThan(String value) {
            addCriterion("shangpuzhuangtai >", value, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("shangpuzhuangtai >=", value, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiLessThan(String value) {
            addCriterion("shangpuzhuangtai <", value, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("shangpuzhuangtai <=", value, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiLike(String value) {
            addCriterion("shangpuzhuangtai like", value, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiNotLike(String value) {
            addCriterion("shangpuzhuangtai not like", value, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiIn(List<String> values) {
            addCriterion("shangpuzhuangtai in", values, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiNotIn(List<String> values) {
            addCriterion("shangpuzhuangtai not in", values, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiBetween(String value1, String value2) {
            addCriterion("shangpuzhuangtai between", value1, value2, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzhuangtaiNotBetween(String value1, String value2) {
            addCriterion("shangpuzhuangtai not between", value1, value2, "shangpuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangIsNull() {
            addCriterion("shangpuzongxiaoliang is null");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangIsNotNull() {
            addCriterion("shangpuzongxiaoliang is not null");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangEqualTo(Integer value) {
            addCriterion("shangpuzongxiaoliang =", value, "shangpuzongxiaoliang");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangNotEqualTo(Integer value) {
            addCriterion("shangpuzongxiaoliang <>", value, "shangpuzongxiaoliang");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangGreaterThan(Integer value) {
            addCriterion("shangpuzongxiaoliang >", value, "shangpuzongxiaoliang");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangGreaterThanOrEqualTo(Integer value) {
            addCriterion("shangpuzongxiaoliang >=", value, "shangpuzongxiaoliang");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangLessThan(Integer value) {
            addCriterion("shangpuzongxiaoliang <", value, "shangpuzongxiaoliang");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangLessThanOrEqualTo(Integer value) {
            addCriterion("shangpuzongxiaoliang <=", value, "shangpuzongxiaoliang");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangIn(List<Integer> values) {
            addCriterion("shangpuzongxiaoliang in", values, "shangpuzongxiaoliang");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangNotIn(List<Integer> values) {
            addCriterion("shangpuzongxiaoliang not in", values, "shangpuzongxiaoliang");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangBetween(Integer value1, Integer value2) {
            addCriterion("shangpuzongxiaoliang between", value1, value2, "shangpuzongxiaoliang");
            return (Criteria) this;
        }

        public Criteria andShangpuzongxiaoliangNotBetween(Integer value1, Integer value2) {
            addCriterion("shangpuzongxiaoliang not between", value1, value2, "shangpuzongxiaoliang");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruIsNull() {
            addCriterion("shangpuzongshouru is null");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruIsNotNull() {
            addCriterion("shangpuzongshouru is not null");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruEqualTo(Double value) {
            addCriterion("shangpuzongshouru =", value, "shangpuzongshouru");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruNotEqualTo(Double value) {
            addCriterion("shangpuzongshouru <>", value, "shangpuzongshouru");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruGreaterThan(Double value) {
            addCriterion("shangpuzongshouru >", value, "shangpuzongshouru");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruGreaterThanOrEqualTo(Double value) {
            addCriterion("shangpuzongshouru >=", value, "shangpuzongshouru");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruLessThan(Double value) {
            addCriterion("shangpuzongshouru <", value, "shangpuzongshouru");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruLessThanOrEqualTo(Double value) {
            addCriterion("shangpuzongshouru <=", value, "shangpuzongshouru");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruIn(List<Double> values) {
            addCriterion("shangpuzongshouru in", values, "shangpuzongshouru");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruNotIn(List<Double> values) {
            addCriterion("shangpuzongshouru not in", values, "shangpuzongshouru");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruBetween(Double value1, Double value2) {
            addCriterion("shangpuzongshouru between", value1, value2, "shangpuzongshouru");
            return (Criteria) this;
        }

        public Criteria andShangpuzongshouruNotBetween(Double value1, Double value2) {
            addCriterion("shangpuzongshouru not between", value1, value2, "shangpuzongshouru");
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