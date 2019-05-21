package com.tcwong.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TruckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TruckExample() {
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

        public Criteria andTruckidIsNull() {
            addCriterion("truckID is null");
            return (Criteria) this;
        }

        public Criteria andTruckidIsNotNull() {
            addCriterion("truckID is not null");
            return (Criteria) this;
        }

        public Criteria andTruckidEqualTo(Integer value) {
            addCriterion("truckID =", value, "truckid");
            return (Criteria) this;
        }

        public Criteria andTruckidNotEqualTo(Integer value) {
            addCriterion("truckID <>", value, "truckid");
            return (Criteria) this;
        }

        public Criteria andTruckidGreaterThan(Integer value) {
            addCriterion("truckID >", value, "truckid");
            return (Criteria) this;
        }

        public Criteria andTruckidGreaterThanOrEqualTo(Integer value) {
            addCriterion("truckID >=", value, "truckid");
            return (Criteria) this;
        }

        public Criteria andTruckidLessThan(Integer value) {
            addCriterion("truckID <", value, "truckid");
            return (Criteria) this;
        }

        public Criteria andTruckidLessThanOrEqualTo(Integer value) {
            addCriterion("truckID <=", value, "truckid");
            return (Criteria) this;
        }

        public Criteria andTruckidIn(List<Integer> values) {
            addCriterion("truckID in", values, "truckid");
            return (Criteria) this;
        }

        public Criteria andTruckidNotIn(List<Integer> values) {
            addCriterion("truckID not in", values, "truckid");
            return (Criteria) this;
        }

        public Criteria andTruckidBetween(Integer value1, Integer value2) {
            addCriterion("truckID between", value1, value2, "truckid");
            return (Criteria) this;
        }

        public Criteria andTruckidNotBetween(Integer value1, Integer value2) {
            addCriterion("truckID not between", value1, value2, "truckid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNull() {
            addCriterion("buyDate is null");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNotNull() {
            addCriterion("buyDate is not null");
            return (Criteria) this;
        }

        public Criteria andBuydateEqualTo(Date value) {
            addCriterion("buyDate =", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotEqualTo(Date value) {
            addCriterion("buyDate <>", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThan(Date value) {
            addCriterion("buyDate >", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThanOrEqualTo(Date value) {
            addCriterion("buyDate >=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThan(Date value) {
            addCriterion("buyDate <", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThanOrEqualTo(Date value) {
            addCriterion("buyDate <=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateIn(List<Date> values) {
            addCriterion("buyDate in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotIn(List<Date> values) {
            addCriterion("buyDate not in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateBetween(Date value1, Date value2) {
            addCriterion("buyDate between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotBetween(Date value1, Date value2) {
            addCriterion("buyDate not between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(String value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(String value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(String value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(String value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(String value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(String value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLike(String value) {
            addCriterion("length like", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotLike(String value) {
            addCriterion("length not like", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<String> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<String> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(String value1, String value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(String value1, String value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNull() {
            addCriterion("tonnage is null");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNotNull() {
            addCriterion("tonnage is not null");
            return (Criteria) this;
        }

        public Criteria andTonnageEqualTo(Integer value) {
            addCriterion("tonnage =", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotEqualTo(Integer value) {
            addCriterion("tonnage <>", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThan(Integer value) {
            addCriterion("tonnage >", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThanOrEqualTo(Integer value) {
            addCriterion("tonnage >=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThan(Integer value) {
            addCriterion("tonnage <", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThanOrEqualTo(Integer value) {
            addCriterion("tonnage <=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageIn(List<Integer> values) {
            addCriterion("tonnage in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotIn(List<Integer> values) {
            addCriterion("tonnage not in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageBetween(Integer value1, Integer value2) {
            addCriterion("tonnage between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotBetween(Integer value1, Integer value2) {
            addCriterion("tonnage not between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andFkTeamidIsNull() {
            addCriterion("fk_teamID is null");
            return (Criteria) this;
        }

        public Criteria andFkTeamidIsNotNull() {
            addCriterion("fk_teamID is not null");
            return (Criteria) this;
        }

        public Criteria andFkTeamidEqualTo(Integer value) {
            addCriterion("fk_teamID =", value, "fkTeamid");
            return (Criteria) this;
        }

        public Criteria andFkTeamidNotEqualTo(Integer value) {
            addCriterion("fk_teamID <>", value, "fkTeamid");
            return (Criteria) this;
        }

        public Criteria andFkTeamidGreaterThan(Integer value) {
            addCriterion("fk_teamID >", value, "fkTeamid");
            return (Criteria) this;
        }

        public Criteria andFkTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_teamID >=", value, "fkTeamid");
            return (Criteria) this;
        }

        public Criteria andFkTeamidLessThan(Integer value) {
            addCriterion("fk_teamID <", value, "fkTeamid");
            return (Criteria) this;
        }

        public Criteria andFkTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("fk_teamID <=", value, "fkTeamid");
            return (Criteria) this;
        }

        public Criteria andFkTeamidIn(List<Integer> values) {
            addCriterion("fk_teamID in", values, "fkTeamid");
            return (Criteria) this;
        }

        public Criteria andFkTeamidNotIn(List<Integer> values) {
            addCriterion("fk_teamID not in", values, "fkTeamid");
            return (Criteria) this;
        }

        public Criteria andFkTeamidBetween(Integer value1, Integer value2) {
            addCriterion("fk_teamID between", value1, value2, "fkTeamid");
            return (Criteria) this;
        }

        public Criteria andFkTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_teamID not between", value1, value2, "fkTeamid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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