package com.ksi.model;

import java.util.ArrayList;
import java.util.List;

public class AuthorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorExample() {
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

        public Criteria andPkAuthorIdIsNull() {
            addCriterion("Pk_Author_Id is null");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdIsNotNull() {
            addCriterion("Pk_Author_Id is not null");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdEqualTo(Integer value) {
            addCriterion("Pk_Author_Id =", value, "pkAuthorId");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdNotEqualTo(Integer value) {
            addCriterion("Pk_Author_Id <>", value, "pkAuthorId");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdGreaterThan(Integer value) {
            addCriterion("Pk_Author_Id >", value, "pkAuthorId");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pk_Author_Id >=", value, "pkAuthorId");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdLessThan(Integer value) {
            addCriterion("Pk_Author_Id <", value, "pkAuthorId");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("Pk_Author_Id <=", value, "pkAuthorId");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdIn(List<Integer> values) {
            addCriterion("Pk_Author_Id in", values, "pkAuthorId");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdNotIn(List<Integer> values) {
            addCriterion("Pk_Author_Id not in", values, "pkAuthorId");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("Pk_Author_Id between", value1, value2, "pkAuthorId");
            return (Criteria) this;
        }

        public Criteria andPkAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Pk_Author_Id not between", value1, value2, "pkAuthorId");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNull() {
            addCriterion("FullName is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("FullName is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("FullName =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("FullName <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("FullName >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("FullName >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("FullName <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("FullName <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("FullName like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("FullName not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("FullName in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("FullName not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("FullName between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("FullName not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNull() {
            addCriterion("MobileNo is null");
            return (Criteria) this;
        }

        public Criteria andMobilenoIsNotNull() {
            addCriterion("MobileNo is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenoEqualTo(String value) {
            addCriterion("MobileNo =", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotEqualTo(String value) {
            addCriterion("MobileNo <>", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThan(String value) {
            addCriterion("MobileNo >", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("MobileNo >=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThan(String value) {
            addCriterion("MobileNo <", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLessThanOrEqualTo(String value) {
            addCriterion("MobileNo <=", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoLike(String value) {
            addCriterion("MobileNo like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotLike(String value) {
            addCriterion("MobileNo not like", value, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoIn(List<String> values) {
            addCriterion("MobileNo in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotIn(List<String> values) {
            addCriterion("MobileNo not in", values, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoBetween(String value1, String value2) {
            addCriterion("MobileNo between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andMobilenoNotBetween(String value1, String value2) {
            addCriterion("MobileNo not between", value1, value2, "mobileno");
            return (Criteria) this;
        }

        public Criteria andFkBookIdIsNull() {
            addCriterion("Fk_Book_Id is null");
            return (Criteria) this;
        }

        public Criteria andFkBookIdIsNotNull() {
            addCriterion("Fk_Book_Id is not null");
            return (Criteria) this;
        }

        public Criteria andFkBookIdEqualTo(Integer value) {
            addCriterion("Fk_Book_Id =", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdNotEqualTo(Integer value) {
            addCriterion("Fk_Book_Id <>", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdGreaterThan(Integer value) {
            addCriterion("Fk_Book_Id >", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Fk_Book_Id >=", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdLessThan(Integer value) {
            addCriterion("Fk_Book_Id <", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("Fk_Book_Id <=", value, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdIn(List<Integer> values) {
            addCriterion("Fk_Book_Id in", values, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdNotIn(List<Integer> values) {
            addCriterion("Fk_Book_Id not in", values, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdBetween(Integer value1, Integer value2) {
            addCriterion("Fk_Book_Id between", value1, value2, "fkBookId");
            return (Criteria) this;
        }

        public Criteria andFkBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Fk_Book_Id not between", value1, value2, "fkBookId");
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