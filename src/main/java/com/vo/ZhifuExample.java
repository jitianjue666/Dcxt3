package com.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZhifuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZhifuExample() {
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

        public Criteria andZhifuidIsNull() {
            addCriterion("zhifuid is null");
            return (Criteria) this;
        }

        public Criteria andZhifuidIsNotNull() {
            addCriterion("zhifuid is not null");
            return (Criteria) this;
        }

        public Criteria andZhifuidEqualTo(Integer value) {
            addCriterion("zhifuid =", value, "zhifuid");
            return (Criteria) this;
        }

        public Criteria andZhifuidNotEqualTo(Integer value) {
            addCriterion("zhifuid <>", value, "zhifuid");
            return (Criteria) this;
        }

        public Criteria andZhifuidGreaterThan(Integer value) {
            addCriterion("zhifuid >", value, "zhifuid");
            return (Criteria) this;
        }

        public Criteria andZhifuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhifuid >=", value, "zhifuid");
            return (Criteria) this;
        }

        public Criteria andZhifuidLessThan(Integer value) {
            addCriterion("zhifuid <", value, "zhifuid");
            return (Criteria) this;
        }

        public Criteria andZhifuidLessThanOrEqualTo(Integer value) {
            addCriterion("zhifuid <=", value, "zhifuid");
            return (Criteria) this;
        }

        public Criteria andZhifuidIn(List<Integer> values) {
            addCriterion("zhifuid in", values, "zhifuid");
            return (Criteria) this;
        }

        public Criteria andZhifuidNotIn(List<Integer> values) {
            addCriterion("zhifuid not in", values, "zhifuid");
            return (Criteria) this;
        }

        public Criteria andZhifuidBetween(Integer value1, Integer value2) {
            addCriterion("zhifuid between", value1, value2, "zhifuid");
            return (Criteria) this;
        }

        public Criteria andZhifuidNotBetween(Integer value1, Integer value2) {
            addCriterion("zhifuid not between", value1, value2, "zhifuid");
            return (Criteria) this;
        }

        public Criteria andZhifustateIsNull() {
            addCriterion("zhifustate is null");
            return (Criteria) this;
        }

        public Criteria andZhifustateIsNotNull() {
            addCriterion("zhifustate is not null");
            return (Criteria) this;
        }

        public Criteria andZhifustateEqualTo(Integer value) {
            addCriterion("zhifustate =", value, "zhifustate");
            return (Criteria) this;
        }

        public Criteria andZhifustateNotEqualTo(Integer value) {
            addCriterion("zhifustate <>", value, "zhifustate");
            return (Criteria) this;
        }

        public Criteria andZhifustateGreaterThan(Integer value) {
            addCriterion("zhifustate >", value, "zhifustate");
            return (Criteria) this;
        }

        public Criteria andZhifustateGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhifustate >=", value, "zhifustate");
            return (Criteria) this;
        }

        public Criteria andZhifustateLessThan(Integer value) {
            addCriterion("zhifustate <", value, "zhifustate");
            return (Criteria) this;
        }

        public Criteria andZhifustateLessThanOrEqualTo(Integer value) {
            addCriterion("zhifustate <=", value, "zhifustate");
            return (Criteria) this;
        }

        public Criteria andZhifustateIn(List<Integer> values) {
            addCriterion("zhifustate in", values, "zhifustate");
            return (Criteria) this;
        }

        public Criteria andZhifustateNotIn(List<Integer> values) {
            addCriterion("zhifustate not in", values, "zhifustate");
            return (Criteria) this;
        }

        public Criteria andZhifustateBetween(Integer value1, Integer value2) {
            addCriterion("zhifustate between", value1, value2, "zhifustate");
            return (Criteria) this;
        }

        public Criteria andZhifustateNotBetween(Integer value1, Integer value2) {
            addCriterion("zhifustate not between", value1, value2, "zhifustate");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaIsNull() {
            addCriterion("dingdanyuanjia is null");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaIsNotNull() {
            addCriterion("dingdanyuanjia is not null");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaEqualTo(Double value) {
            addCriterion("dingdanyuanjia =", value, "dingdanyuanjia");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaNotEqualTo(Double value) {
            addCriterion("dingdanyuanjia <>", value, "dingdanyuanjia");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaGreaterThan(Double value) {
            addCriterion("dingdanyuanjia >", value, "dingdanyuanjia");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaGreaterThanOrEqualTo(Double value) {
            addCriterion("dingdanyuanjia >=", value, "dingdanyuanjia");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaLessThan(Double value) {
            addCriterion("dingdanyuanjia <", value, "dingdanyuanjia");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaLessThanOrEqualTo(Double value) {
            addCriterion("dingdanyuanjia <=", value, "dingdanyuanjia");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaIn(List<Double> values) {
            addCriterion("dingdanyuanjia in", values, "dingdanyuanjia");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaNotIn(List<Double> values) {
            addCriterion("dingdanyuanjia not in", values, "dingdanyuanjia");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaBetween(Double value1, Double value2) {
            addCriterion("dingdanyuanjia between", value1, value2, "dingdanyuanjia");
            return (Criteria) this;
        }

        public Criteria andDingdanyuanjiaNotBetween(Double value1, Double value2) {
            addCriterion("dingdanyuanjia not between", value1, value2, "dingdanyuanjia");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaIsNull() {
            addCriterion("dingdanxianjia is null");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaIsNotNull() {
            addCriterion("dingdanxianjia is not null");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaEqualTo(Double value) {
            addCriterion("dingdanxianjia =", value, "dingdanxianjia");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaNotEqualTo(Double value) {
            addCriterion("dingdanxianjia <>", value, "dingdanxianjia");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaGreaterThan(Double value) {
            addCriterion("dingdanxianjia >", value, "dingdanxianjia");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaGreaterThanOrEqualTo(Double value) {
            addCriterion("dingdanxianjia >=", value, "dingdanxianjia");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaLessThan(Double value) {
            addCriterion("dingdanxianjia <", value, "dingdanxianjia");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaLessThanOrEqualTo(Double value) {
            addCriterion("dingdanxianjia <=", value, "dingdanxianjia");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaIn(List<Double> values) {
            addCriterion("dingdanxianjia in", values, "dingdanxianjia");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaNotIn(List<Double> values) {
            addCriterion("dingdanxianjia not in", values, "dingdanxianjia");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaBetween(Double value1, Double value2) {
            addCriterion("dingdanxianjia between", value1, value2, "dingdanxianjia");
            return (Criteria) this;
        }

        public Criteria andDingdanxianjiaNotBetween(Double value1, Double value2) {
            addCriterion("dingdanxianjia not between", value1, value2, "dingdanxianjia");
            return (Criteria) this;
        }

        public Criteria andGoumaizheIsNull() {
            addCriterion("goumaizhe is null");
            return (Criteria) this;
        }

        public Criteria andGoumaizheIsNotNull() {
            addCriterion("goumaizhe is not null");
            return (Criteria) this;
        }

        public Criteria andGoumaizheEqualTo(Integer value) {
            addCriterion("goumaizhe =", value, "goumaizhe");
            return (Criteria) this;
        }

        public Criteria andGoumaizheNotEqualTo(Integer value) {
            addCriterion("goumaizhe <>", value, "goumaizhe");
            return (Criteria) this;
        }

        public Criteria andGoumaizheGreaterThan(Integer value) {
            addCriterion("goumaizhe >", value, "goumaizhe");
            return (Criteria) this;
        }

        public Criteria andGoumaizheGreaterThanOrEqualTo(Integer value) {
            addCriterion("goumaizhe >=", value, "goumaizhe");
            return (Criteria) this;
        }

        public Criteria andGoumaizheLessThan(Integer value) {
            addCriterion("goumaizhe <", value, "goumaizhe");
            return (Criteria) this;
        }

        public Criteria andGoumaizheLessThanOrEqualTo(Integer value) {
            addCriterion("goumaizhe <=", value, "goumaizhe");
            return (Criteria) this;
        }

        public Criteria andGoumaizheIn(List<Integer> values) {
            addCriterion("goumaizhe in", values, "goumaizhe");
            return (Criteria) this;
        }

        public Criteria andGoumaizheNotIn(List<Integer> values) {
            addCriterion("goumaizhe not in", values, "goumaizhe");
            return (Criteria) this;
        }

        public Criteria andGoumaizheBetween(Integer value1, Integer value2) {
            addCriterion("goumaizhe between", value1, value2, "goumaizhe");
            return (Criteria) this;
        }

        public Criteria andGoumaizheNotBetween(Integer value1, Integer value2) {
            addCriterion("goumaizhe not between", value1, value2, "goumaizhe");
            return (Criteria) this;
        }

        public Criteria andDianjiaIsNull() {
            addCriterion("dianjia is null");
            return (Criteria) this;
        }

        public Criteria andDianjiaIsNotNull() {
            addCriterion("dianjia is not null");
            return (Criteria) this;
        }

        public Criteria andDianjiaEqualTo(Integer value) {
            addCriterion("dianjia =", value, "dianjia");
            return (Criteria) this;
        }

        public Criteria andDianjiaNotEqualTo(Integer value) {
            addCriterion("dianjia <>", value, "dianjia");
            return (Criteria) this;
        }

        public Criteria andDianjiaGreaterThan(Integer value) {
            addCriterion("dianjia >", value, "dianjia");
            return (Criteria) this;
        }

        public Criteria andDianjiaGreaterThanOrEqualTo(Integer value) {
            addCriterion("dianjia >=", value, "dianjia");
            return (Criteria) this;
        }

        public Criteria andDianjiaLessThan(Integer value) {
            addCriterion("dianjia <", value, "dianjia");
            return (Criteria) this;
        }

        public Criteria andDianjiaLessThanOrEqualTo(Integer value) {
            addCriterion("dianjia <=", value, "dianjia");
            return (Criteria) this;
        }

        public Criteria andDianjiaIn(List<Integer> values) {
            addCriterion("dianjia in", values, "dianjia");
            return (Criteria) this;
        }

        public Criteria andDianjiaNotIn(List<Integer> values) {
            addCriterion("dianjia not in", values, "dianjia");
            return (Criteria) this;
        }

        public Criteria andDianjiaBetween(Integer value1, Integer value2) {
            addCriterion("dianjia between", value1, value2, "dianjia");
            return (Criteria) this;
        }

        public Criteria andDianjiaNotBetween(Integer value1, Integer value2) {
            addCriterion("dianjia not between", value1, value2, "dianjia");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIsNull() {
            addCriterion("chuangjianshijian is null");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIsNotNull() {
            addCriterion("chuangjianshijian is not null");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianEqualTo(Date value) {
            addCriterion("chuangjianshijian =", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotEqualTo(Date value) {
            addCriterion("chuangjianshijian <>", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianGreaterThan(Date value) {
            addCriterion("chuangjianshijian >", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianGreaterThanOrEqualTo(Date value) {
            addCriterion("chuangjianshijian >=", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianLessThan(Date value) {
            addCriterion("chuangjianshijian <", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianLessThanOrEqualTo(Date value) {
            addCriterion("chuangjianshijian <=", value, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianIn(List<Date> values) {
            addCriterion("chuangjianshijian in", values, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotIn(List<Date> values) {
            addCriterion("chuangjianshijian not in", values, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianBetween(Date value1, Date value2) {
            addCriterion("chuangjianshijian between", value1, value2, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andChuangjianshijianNotBetween(Date value1, Date value2) {
            addCriterion("chuangjianshijian not between", value1, value2, "chuangjianshijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIsNull() {
            addCriterion("jieshushijian is null");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIsNotNull() {
            addCriterion("jieshushijian is not null");
            return (Criteria) this;
        }

        public Criteria andJieshushijianEqualTo(Date value) {
            addCriterion("jieshushijian =", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotEqualTo(Date value) {
            addCriterion("jieshushijian <>", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianGreaterThan(Date value) {
            addCriterion("jieshushijian >", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianGreaterThanOrEqualTo(Date value) {
            addCriterion("jieshushijian >=", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianLessThan(Date value) {
            addCriterion("jieshushijian <", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianLessThanOrEqualTo(Date value) {
            addCriterion("jieshushijian <=", value, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianIn(List<Date> values) {
            addCriterion("jieshushijian in", values, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotIn(List<Date> values) {
            addCriterion("jieshushijian not in", values, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianBetween(Date value1, Date value2) {
            addCriterion("jieshushijian between", value1, value2, "jieshushijian");
            return (Criteria) this;
        }

        public Criteria andJieshushijianNotBetween(Date value1, Date value2) {
            addCriterion("jieshushijian not between", value1, value2, "jieshushijian");
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