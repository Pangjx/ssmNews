package com.ssmcrud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class commentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public commentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("commentID is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("commentID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("commentID =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("commentID <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("commentID >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentID >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("commentID <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("commentID <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("commentID in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("commentID not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("commentID between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentID not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommenttitleIsNull() {
            addCriterion("commentTitle is null");
            return (Criteria) this;
        }

        public Criteria andCommenttitleIsNotNull() {
            addCriterion("commentTitle is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttitleEqualTo(String value) {
            addCriterion("commentTitle =", value, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleNotEqualTo(String value) {
            addCriterion("commentTitle <>", value, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleGreaterThan(String value) {
            addCriterion("commentTitle >", value, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleGreaterThanOrEqualTo(String value) {
            addCriterion("commentTitle >=", value, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleLessThan(String value) {
            addCriterion("commentTitle <", value, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleLessThanOrEqualTo(String value) {
            addCriterion("commentTitle <=", value, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleLike(String value) {
            addCriterion("commentTitle like", value, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleNotLike(String value) {
            addCriterion("commentTitle not like", value, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleIn(List<String> values) {
            addCriterion("commentTitle in", values, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleNotIn(List<String> values) {
            addCriterion("commentTitle not in", values, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleBetween(String value1, String value2) {
            addCriterion("commentTitle between", value1, value2, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommenttitleNotBetween(String value1, String value2) {
            addCriterion("commentTitle not between", value1, value2, "commenttitle");
            return (Criteria) this;
        }

        public Criteria andCommentdateIsNull() {
            addCriterion("commentDate is null");
            return (Criteria) this;
        }

        public Criteria andCommentdateIsNotNull() {
            addCriterion("commentDate is not null");
            return (Criteria) this;
        }

        public Criteria andCommentdateEqualTo(Date value) {
            addCriterion("commentDate =", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotEqualTo(Date value) {
            addCriterion("commentDate <>", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateGreaterThan(Date value) {
            addCriterion("commentDate >", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("commentDate >=", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateLessThan(Date value) {
            addCriterion("commentDate <", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateLessThanOrEqualTo(Date value) {
            addCriterion("commentDate <=", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateIn(List<Date> values) {
            addCriterion("commentDate in", values, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotIn(List<Date> values) {
            addCriterion("commentDate not in", values, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateBetween(Date value1, Date value2) {
            addCriterion("commentDate between", value1, value2, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotBetween(Date value1, Date value2) {
            addCriterion("commentDate not between", value1, value2, "commentdate");
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