package com.vo;

import java.util.ArrayList;
import java.util.List;

public class ShouruExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShouruExample() {
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

        public Criteria andRennoIsNull() {
            addCriterion("renno is null");
            return (Criteria) this;
        }

        public Criteria andRennoIsNotNull() {
            addCriterion("renno is not null");
            return (Criteria) this;
        }

        public Criteria andRennoEqualTo(Integer value) {
            addCriterion("renno =", value, "renno");
            return (Criteria) this;
        }

        public Criteria andRennoNotEqualTo(Integer value) {
            addCriterion("renno <>", value, "renno");
            return (Criteria) this;
        }

        public Criteria andRennoGreaterThan(Integer value) {
            addCriterion("renno >", value, "renno");
            return (Criteria) this;
        }

        public Criteria andRennoGreaterThanOrEqualTo(Integer value) {
            addCriterion("renno >=", value, "renno");
            return (Criteria) this;
        }

        public Criteria andRennoLessThan(Integer value) {
            addCriterion("renno <", value, "renno");
            return (Criteria) this;
        }

        public Criteria andRennoLessThanOrEqualTo(Integer value) {
            addCriterion("renno <=", value, "renno");
            return (Criteria) this;
        }

        public Criteria andRennoIn(List<Integer> values) {
            addCriterion("renno in", values, "renno");
            return (Criteria) this;
        }

        public Criteria andRennoNotIn(List<Integer> values) {
            addCriterion("renno not in", values, "renno");
            return (Criteria) this;
        }

        public Criteria andRennoBetween(Integer value1, Integer value2) {
            addCriterion("renno between", value1, value2, "renno");
            return (Criteria) this;
        }

        public Criteria andRennoNotBetween(Integer value1, Integer value2) {
            addCriterion("renno not between", value1, value2, "renno");
            return (Criteria) this;
        }

        public Criteria andDianjiaidIsNull() {
            addCriterion("dianjiaid is null");
            return (Criteria) this;
        }

        public Criteria andDianjiaidIsNotNull() {
            addCriterion("dianjiaid is not null");
            return (Criteria) this;
        }

        public Criteria andDianjiaidEqualTo(Integer value) {
            addCriterion("dianjiaid =", value, "dianjiaid");
            return (Criteria) this;
        }

        public Criteria andDianjiaidNotEqualTo(Integer value) {
            addCriterion("dianjiaid <>", value, "dianjiaid");
            return (Criteria) this;
        }

        public Criteria andDianjiaidGreaterThan(Integer value) {
            addCriterion("dianjiaid >", value, "dianjiaid");
            return (Criteria) this;
        }

        public Criteria andDianjiaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianjiaid >=", value, "dianjiaid");
            return (Criteria) this;
        }

        public Criteria andDianjiaidLessThan(Integer value) {
            addCriterion("dianjiaid <", value, "dianjiaid");
            return (Criteria) this;
        }

        public Criteria andDianjiaidLessThanOrEqualTo(Integer value) {
            addCriterion("dianjiaid <=", value, "dianjiaid");
            return (Criteria) this;
        }

        public Criteria andDianjiaidIn(List<Integer> values) {
            addCriterion("dianjiaid in", values, "dianjiaid");
            return (Criteria) this;
        }

        public Criteria andDianjiaidNotIn(List<Integer> values) {
            addCriterion("dianjiaid not in", values, "dianjiaid");
            return (Criteria) this;
        }

        public Criteria andDianjiaidBetween(Integer value1, Integer value2) {
            addCriterion("dianjiaid between", value1, value2, "dianjiaid");
            return (Criteria) this;
        }

        public Criteria andDianjiaidNotBetween(Integer value1, Integer value2) {
            addCriterion("dianjiaid not between", value1, value2, "dianjiaid");
            return (Criteria) this;
        }

        public Criteria andYuanjiaIsNull() {
            addCriterion("yuanjia is null");
            return (Criteria) this;
        }

        public Criteria andYuanjiaIsNotNull() {
            addCriterion("yuanjia is not null");
            return (Criteria) this;
        }

        public Criteria andYuanjiaEqualTo(Double value) {
            addCriterion("yuanjia =", value, "yuanjia");
            return (Criteria) this;
        }

        public Criteria andYuanjiaNotEqualTo(Double value) {
            addCriterion("yuanjia <>", value, "yuanjia");
            return (Criteria) this;
        }

        public Criteria andYuanjiaGreaterThan(Double value) {
            addCriterion("yuanjia >", value, "yuanjia");
            return (Criteria) this;
        }

        public Criteria andYuanjiaGreaterThanOrEqualTo(Double value) {
            addCriterion("yuanjia >=", value, "yuanjia");
            return (Criteria) this;
        }

        public Criteria andYuanjiaLessThan(Double value) {
            addCriterion("yuanjia <", value, "yuanjia");
            return (Criteria) this;
        }

        public Criteria andYuanjiaLessThanOrEqualTo(Double value) {
            addCriterion("yuanjia <=", value, "yuanjia");
            return (Criteria) this;
        }

        public Criteria andYuanjiaIn(List<Double> values) {
            addCriterion("yuanjia in", values, "yuanjia");
            return (Criteria) this;
        }

        public Criteria andYuanjiaNotIn(List<Double> values) {
            addCriterion("yuanjia not in", values, "yuanjia");
            return (Criteria) this;
        }

        public Criteria andYuanjiaBetween(Double value1, Double value2) {
            addCriterion("yuanjia between", value1, value2, "yuanjia");
            return (Criteria) this;
        }

        public Criteria andYuanjiaNotBetween(Double value1, Double value2) {
            addCriterion("yuanjia not between", value1, value2, "yuanjia");
            return (Criteria) this;
        }

        public Criteria andXianjiaIsNull() {
            addCriterion("xianjia is null");
            return (Criteria) this;
        }

        public Criteria andXianjiaIsNotNull() {
            addCriterion("xianjia is not null");
            return (Criteria) this;
        }

        public Criteria andXianjiaEqualTo(Double value) {
            addCriterion("xianjia =", value, "xianjia");
            return (Criteria) this;
        }

        public Criteria andXianjiaNotEqualTo(Double value) {
            addCriterion("xianjia <>", value, "xianjia");
            return (Criteria) this;
        }

        public Criteria andXianjiaGreaterThan(Double value) {
            addCriterion("xianjia >", value, "xianjia");
            return (Criteria) this;
        }

        public Criteria andXianjiaGreaterThanOrEqualTo(Double value) {
            addCriterion("xianjia >=", value, "xianjia");
            return (Criteria) this;
        }

        public Criteria andXianjiaLessThan(Double value) {
            addCriterion("xianjia <", value, "xianjia");
            return (Criteria) this;
        }

        public Criteria andXianjiaLessThanOrEqualTo(Double value) {
            addCriterion("xianjia <=", value, "xianjia");
            return (Criteria) this;
        }

        public Criteria andXianjiaIn(List<Double> values) {
            addCriterion("xianjia in", values, "xianjia");
            return (Criteria) this;
        }

        public Criteria andXianjiaNotIn(List<Double> values) {
            addCriterion("xianjia not in", values, "xianjia");
            return (Criteria) this;
        }

        public Criteria andXianjiaBetween(Double value1, Double value2) {
            addCriterion("xianjia between", value1, value2, "xianjia");
            return (Criteria) this;
        }

        public Criteria andXianjiaNotBetween(Double value1, Double value2) {
            addCriterion("xianjia not between", value1, value2, "xianjia");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoIsNull() {
            addCriterion("dingdanhao is null");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoIsNotNull() {
            addCriterion("dingdanhao is not null");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoEqualTo(Integer value) {
            addCriterion("dingdanhao =", value, "dingdanhao");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoNotEqualTo(Integer value) {
            addCriterion("dingdanhao <>", value, "dingdanhao");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoGreaterThan(Integer value) {
            addCriterion("dingdanhao >", value, "dingdanhao");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoGreaterThanOrEqualTo(Integer value) {
            addCriterion("dingdanhao >=", value, "dingdanhao");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoLessThan(Integer value) {
            addCriterion("dingdanhao <", value, "dingdanhao");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoLessThanOrEqualTo(Integer value) {
            addCriterion("dingdanhao <=", value, "dingdanhao");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoIn(List<Integer> values) {
            addCriterion("dingdanhao in", values, "dingdanhao");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoNotIn(List<Integer> values) {
            addCriterion("dingdanhao not in", values, "dingdanhao");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoBetween(Integer value1, Integer value2) {
            addCriterion("dingdanhao between", value1, value2, "dingdanhao");
            return (Criteria) this;
        }

        public Criteria andDingdanhaoNotBetween(Integer value1, Integer value2) {
            addCriterion("dingdanhao not between", value1, value2, "dingdanhao");
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