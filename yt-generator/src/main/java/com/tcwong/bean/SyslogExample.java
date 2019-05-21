package com.tcwong.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SyslogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyslogExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logID is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logID is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(Integer value) {
            addCriterion("logID =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(Integer value) {
            addCriterion("logID <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(Integer value) {
            addCriterion("logID >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logID >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(Integer value) {
            addCriterion("logID <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(Integer value) {
            addCriterion("logID <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<Integer> values) {
            addCriterion("logID in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<Integer> values) {
            addCriterion("logID not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(Integer value1, Integer value2) {
            addCriterion("logID between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("logID not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andFkTypeidIsNull() {
            addCriterion("fk_typeID is null");
            return (Criteria) this;
        }

        public Criteria andFkTypeidIsNotNull() {
            addCriterion("fk_typeID is not null");
            return (Criteria) this;
        }

        public Criteria andFkTypeidEqualTo(Integer value) {
            addCriterion("fk_typeID =", value, "fkTypeid");
            return (Criteria) this;
        }

        public Criteria andFkTypeidNotEqualTo(Integer value) {
            addCriterion("fk_typeID <>", value, "fkTypeid");
            return (Criteria) this;
        }

        public Criteria andFkTypeidGreaterThan(Integer value) {
            addCriterion("fk_typeID >", value, "fkTypeid");
            return (Criteria) this;
        }

        public Criteria andFkTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_typeID >=", value, "fkTypeid");
            return (Criteria) this;
        }

        public Criteria andFkTypeidLessThan(Integer value) {
            addCriterion("fk_typeID <", value, "fkTypeid");
            return (Criteria) this;
        }

        public Criteria andFkTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("fk_typeID <=", value, "fkTypeid");
            return (Criteria) this;
        }

        public Criteria andFkTypeidIn(List<Integer> values) {
            addCriterion("fk_typeID in", values, "fkTypeid");
            return (Criteria) this;
        }

        public Criteria andFkTypeidNotIn(List<Integer> values) {
            addCriterion("fk_typeID not in", values, "fkTypeid");
            return (Criteria) this;
        }

        public Criteria andFkTypeidBetween(Integer value1, Integer value2) {
            addCriterion("fk_typeID between", value1, value2, "fkTypeid");
            return (Criteria) this;
        }

        public Criteria andFkTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_typeID not between", value1, value2, "fkTypeid");
            return (Criteria) this;
        }

        public Criteria andFkUseridIsNull() {
            addCriterion("fk_userID is null");
            return (Criteria) this;
        }

        public Criteria andFkUseridIsNotNull() {
            addCriterion("fk_userID is not null");
            return (Criteria) this;
        }

        public Criteria andFkUseridEqualTo(Integer value) {
            addCriterion("fk_userID =", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridNotEqualTo(Integer value) {
            addCriterion("fk_userID <>", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridGreaterThan(Integer value) {
            addCriterion("fk_userID >", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_userID >=", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridLessThan(Integer value) {
            addCriterion("fk_userID <", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridLessThanOrEqualTo(Integer value) {
            addCriterion("fk_userID <=", value, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridIn(List<Integer> values) {
            addCriterion("fk_userID in", values, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridNotIn(List<Integer> values) {
            addCriterion("fk_userID not in", values, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridBetween(Integer value1, Integer value2) {
            addCriterion("fk_userID between", value1, value2, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andFkUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_userID not between", value1, value2, "fkUserid");
            return (Criteria) this;
        }

        public Criteria andProcnameIsNull() {
            addCriterion("procName is null");
            return (Criteria) this;
        }

        public Criteria andProcnameIsNotNull() {
            addCriterion("procName is not null");
            return (Criteria) this;
        }

        public Criteria andProcnameEqualTo(String value) {
            addCriterion("procName =", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameNotEqualTo(String value) {
            addCriterion("procName <>", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameGreaterThan(String value) {
            addCriterion("procName >", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameGreaterThanOrEqualTo(String value) {
            addCriterion("procName >=", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameLessThan(String value) {
            addCriterion("procName <", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameLessThanOrEqualTo(String value) {
            addCriterion("procName <=", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameLike(String value) {
            addCriterion("procName like", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameNotLike(String value) {
            addCriterion("procName not like", value, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameIn(List<String> values) {
            addCriterion("procName in", values, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameNotIn(List<String> values) {
            addCriterion("procName not in", values, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameBetween(String value1, String value2) {
            addCriterion("procName between", value1, value2, "procname");
            return (Criteria) this;
        }

        public Criteria andProcnameNotBetween(String value1, String value2) {
            addCriterion("procName not between", value1, value2, "procname");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIsNull() {
            addCriterion("checkInTime is null");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIsNotNull() {
            addCriterion("checkInTime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckintimeEqualTo(Date value) {
            addCriterion("checkInTime =", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotEqualTo(Date value) {
            addCriterion("checkInTime <>", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeGreaterThan(Date value) {
            addCriterion("checkInTime >", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkInTime >=", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeLessThan(Date value) {
            addCriterion("checkInTime <", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeLessThanOrEqualTo(Date value) {
            addCriterion("checkInTime <=", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIn(List<Date> values) {
            addCriterion("checkInTime in", values, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotIn(List<Date> values) {
            addCriterion("checkInTime not in", values, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeBetween(Date value1, Date value2) {
            addCriterion("checkInTime between", value1, value2, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotBetween(Date value1, Date value2) {
            addCriterion("checkInTime not between", value1, value2, "checkintime");
            return (Criteria) this;
        }

        public Criteria andIsexceptionIsNull() {
            addCriterion("isException is null");
            return (Criteria) this;
        }

        public Criteria andIsexceptionIsNotNull() {
            addCriterion("isException is not null");
            return (Criteria) this;
        }

        public Criteria andIsexceptionEqualTo(Integer value) {
            addCriterion("isException =", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionNotEqualTo(Integer value) {
            addCriterion("isException <>", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionGreaterThan(Integer value) {
            addCriterion("isException >", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("isException >=", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionLessThan(Integer value) {
            addCriterion("isException <", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionLessThanOrEqualTo(Integer value) {
            addCriterion("isException <=", value, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionIn(List<Integer> values) {
            addCriterion("isException in", values, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionNotIn(List<Integer> values) {
            addCriterion("isException not in", values, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionBetween(Integer value1, Integer value2) {
            addCriterion("isException between", value1, value2, "isexception");
            return (Criteria) this;
        }

        public Criteria andIsexceptionNotBetween(Integer value1, Integer value2) {
            addCriterion("isException not between", value1, value2, "isexception");
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