package com.tcwong.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TruckteamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TruckteamExample() {
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

        public Criteria andTeamidIsNull() {
            addCriterion("teamID is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("teamID is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(Integer value) {
            addCriterion("teamID =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(Integer value) {
            addCriterion("teamID <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(Integer value) {
            addCriterion("teamID >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("teamID >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(Integer value) {
            addCriterion("teamID <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("teamID <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<Integer> values) {
            addCriterion("teamID in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<Integer> values) {
            addCriterion("teamID not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(Integer value1, Integer value2) {
            addCriterion("teamID between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("teamID not between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNull() {
            addCriterion("teamName is null");
            return (Criteria) this;
        }

        public Criteria andTeamnameIsNotNull() {
            addCriterion("teamName is not null");
            return (Criteria) this;
        }

        public Criteria andTeamnameEqualTo(String value) {
            addCriterion("teamName =", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotEqualTo(String value) {
            addCriterion("teamName <>", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThan(String value) {
            addCriterion("teamName >", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("teamName >=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThan(String value) {
            addCriterion("teamName <", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLessThanOrEqualTo(String value) {
            addCriterion("teamName <=", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameLike(String value) {
            addCriterion("teamName like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotLike(String value) {
            addCriterion("teamName not like", value, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameIn(List<String> values) {
            addCriterion("teamName in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotIn(List<String> values) {
            addCriterion("teamName not in", values, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameBetween(String value1, String value2) {
            addCriterion("teamName between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andTeamnameNotBetween(String value1, String value2) {
            addCriterion("teamName not between", value1, value2, "teamname");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Integer value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Integer value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Integer value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Integer value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Integer value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Integer> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Integer> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Integer value1, Integer value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andAltertimeIsNull() {
            addCriterion("alterTime is null");
            return (Criteria) this;
        }

        public Criteria andAltertimeIsNotNull() {
            addCriterion("alterTime is not null");
            return (Criteria) this;
        }

        public Criteria andAltertimeEqualTo(Date value) {
            addCriterion("alterTime =", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeNotEqualTo(Date value) {
            addCriterion("alterTime <>", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeGreaterThan(Date value) {
            addCriterion("alterTime >", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("alterTime >=", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeLessThan(Date value) {
            addCriterion("alterTime <", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeLessThanOrEqualTo(Date value) {
            addCriterion("alterTime <=", value, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeIn(List<Date> values) {
            addCriterion("alterTime in", values, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeNotIn(List<Date> values) {
            addCriterion("alterTime not in", values, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeBetween(Date value1, Date value2) {
            addCriterion("alterTime between", value1, value2, "altertime");
            return (Criteria) this;
        }

        public Criteria andAltertimeNotBetween(Date value1, Date value2) {
            addCriterion("alterTime not between", value1, value2, "altertime");
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