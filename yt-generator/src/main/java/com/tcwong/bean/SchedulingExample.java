package com.tcwong.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchedulingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchedulingExample() {
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

        public Criteria andSchedulingidIsNull() {
            addCriterion("schedulingID is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingidIsNotNull() {
            addCriterion("schedulingID is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingidEqualTo(Integer value) {
            addCriterion("schedulingID =", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidNotEqualTo(Integer value) {
            addCriterion("schedulingID <>", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidGreaterThan(Integer value) {
            addCriterion("schedulingID >", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedulingID >=", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidLessThan(Integer value) {
            addCriterion("schedulingID <", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidLessThanOrEqualTo(Integer value) {
            addCriterion("schedulingID <=", value, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidIn(List<Integer> values) {
            addCriterion("schedulingID in", values, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidNotIn(List<Integer> values) {
            addCriterion("schedulingID not in", values, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidBetween(Integer value1, Integer value2) {
            addCriterion("schedulingID between", value1, value2, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andSchedulingidNotBetween(Integer value1, Integer value2) {
            addCriterion("schedulingID not between", value1, value2, "schedulingid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidIsNull() {
            addCriterion("fk_carriersID is null");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidIsNotNull() {
            addCriterion("fk_carriersID is not null");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidEqualTo(Integer value) {
            addCriterion("fk_carriersID =", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidNotEqualTo(Integer value) {
            addCriterion("fk_carriersID <>", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidGreaterThan(Integer value) {
            addCriterion("fk_carriersID >", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_carriersID >=", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidLessThan(Integer value) {
            addCriterion("fk_carriersID <", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidLessThanOrEqualTo(Integer value) {
            addCriterion("fk_carriersID <=", value, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidIn(List<Integer> values) {
            addCriterion("fk_carriersID in", values, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidNotIn(List<Integer> values) {
            addCriterion("fk_carriersID not in", values, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidBetween(Integer value1, Integer value2) {
            addCriterion("fk_carriersID between", value1, value2, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkCarriersidNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_carriersID not between", value1, value2, "fkCarriersid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidIsNull() {
            addCriterion("fk_truckID is null");
            return (Criteria) this;
        }

        public Criteria andFkTruckidIsNotNull() {
            addCriterion("fk_truckID is not null");
            return (Criteria) this;
        }

        public Criteria andFkTruckidEqualTo(Integer value) {
            addCriterion("fk_truckID =", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidNotEqualTo(Integer value) {
            addCriterion("fk_truckID <>", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidGreaterThan(Integer value) {
            addCriterion("fk_truckID >", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fk_truckID >=", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidLessThan(Integer value) {
            addCriterion("fk_truckID <", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidLessThanOrEqualTo(Integer value) {
            addCriterion("fk_truckID <=", value, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidIn(List<Integer> values) {
            addCriterion("fk_truckID in", values, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidNotIn(List<Integer> values) {
            addCriterion("fk_truckID not in", values, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidBetween(Integer value1, Integer value2) {
            addCriterion("fk_truckID between", value1, value2, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andFkTruckidNotBetween(Integer value1, Integer value2) {
            addCriterion("fk_truckID not between", value1, value2, "fkTruckid");
            return (Criteria) this;
        }

        public Criteria andOilcostIsNull() {
            addCriterion("oilCost is null");
            return (Criteria) this;
        }

        public Criteria andOilcostIsNotNull() {
            addCriterion("oilCost is not null");
            return (Criteria) this;
        }

        public Criteria andOilcostEqualTo(Float value) {
            addCriterion("oilCost =", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostNotEqualTo(Float value) {
            addCriterion("oilCost <>", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostGreaterThan(Float value) {
            addCriterion("oilCost >", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostGreaterThanOrEqualTo(Float value) {
            addCriterion("oilCost >=", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostLessThan(Float value) {
            addCriterion("oilCost <", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostLessThanOrEqualTo(Float value) {
            addCriterion("oilCost <=", value, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostIn(List<Float> values) {
            addCriterion("oilCost in", values, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostNotIn(List<Float> values) {
            addCriterion("oilCost not in", values, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostBetween(Float value1, Float value2) {
            addCriterion("oilCost between", value1, value2, "oilcost");
            return (Criteria) this;
        }

        public Criteria andOilcostNotBetween(Float value1, Float value2) {
            addCriterion("oilCost not between", value1, value2, "oilcost");
            return (Criteria) this;
        }

        public Criteria andTollIsNull() {
            addCriterion("toll is null");
            return (Criteria) this;
        }

        public Criteria andTollIsNotNull() {
            addCriterion("toll is not null");
            return (Criteria) this;
        }

        public Criteria andTollEqualTo(Float value) {
            addCriterion("toll =", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollNotEqualTo(Float value) {
            addCriterion("toll <>", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollGreaterThan(Float value) {
            addCriterion("toll >", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollGreaterThanOrEqualTo(Float value) {
            addCriterion("toll >=", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollLessThan(Float value) {
            addCriterion("toll <", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollLessThanOrEqualTo(Float value) {
            addCriterion("toll <=", value, "toll");
            return (Criteria) this;
        }

        public Criteria andTollIn(List<Float> values) {
            addCriterion("toll in", values, "toll");
            return (Criteria) this;
        }

        public Criteria andTollNotIn(List<Float> values) {
            addCriterion("toll not in", values, "toll");
            return (Criteria) this;
        }

        public Criteria andTollBetween(Float value1, Float value2) {
            addCriterion("toll between", value1, value2, "toll");
            return (Criteria) this;
        }

        public Criteria andTollNotBetween(Float value1, Float value2) {
            addCriterion("toll not between", value1, value2, "toll");
            return (Criteria) this;
        }

        public Criteria andFineIsNull() {
            addCriterion("fine is null");
            return (Criteria) this;
        }

        public Criteria andFineIsNotNull() {
            addCriterion("fine is not null");
            return (Criteria) this;
        }

        public Criteria andFineEqualTo(Float value) {
            addCriterion("fine =", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotEqualTo(Float value) {
            addCriterion("fine <>", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThan(Float value) {
            addCriterion("fine >", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThanOrEqualTo(Float value) {
            addCriterion("fine >=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThan(Float value) {
            addCriterion("fine <", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThanOrEqualTo(Float value) {
            addCriterion("fine <=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineIn(List<Float> values) {
            addCriterion("fine in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotIn(List<Float> values) {
            addCriterion("fine not in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineBetween(Float value1, Float value2) {
            addCriterion("fine between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotBetween(Float value1, Float value2) {
            addCriterion("fine not between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andOthercostIsNull() {
            addCriterion("otherCost is null");
            return (Criteria) this;
        }

        public Criteria andOthercostIsNotNull() {
            addCriterion("otherCost is not null");
            return (Criteria) this;
        }

        public Criteria andOthercostEqualTo(Float value) {
            addCriterion("otherCost =", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostNotEqualTo(Float value) {
            addCriterion("otherCost <>", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostGreaterThan(Float value) {
            addCriterion("otherCost >", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostGreaterThanOrEqualTo(Float value) {
            addCriterion("otherCost >=", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostLessThan(Float value) {
            addCriterion("otherCost <", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostLessThanOrEqualTo(Float value) {
            addCriterion("otherCost <=", value, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostIn(List<Float> values) {
            addCriterion("otherCost in", values, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostNotIn(List<Float> values) {
            addCriterion("otherCost not in", values, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostBetween(Float value1, Float value2) {
            addCriterion("otherCost between", value1, value2, "othercost");
            return (Criteria) this;
        }

        public Criteria andOthercostNotBetween(Float value1, Float value2) {
            addCriterion("otherCost not between", value1, value2, "othercost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNull() {
            addCriterion("totalCost is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostIsNotNull() {
            addCriterion("totalCost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostEqualTo(Float value) {
            addCriterion("totalCost =", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotEqualTo(Float value) {
            addCriterion("totalCost <>", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThan(Float value) {
            addCriterion("totalCost >", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostGreaterThanOrEqualTo(Float value) {
            addCriterion("totalCost >=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThan(Float value) {
            addCriterion("totalCost <", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostLessThanOrEqualTo(Float value) {
            addCriterion("totalCost <=", value, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostIn(List<Float> values) {
            addCriterion("totalCost in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotIn(List<Float> values) {
            addCriterion("totalCost not in", values, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostBetween(Float value1, Float value2) {
            addCriterion("totalCost between", value1, value2, "totalcost");
            return (Criteria) this;
        }

        public Criteria andTotalcostNotBetween(Float value1, Float value2) {
            addCriterion("totalCost not between", value1, value2, "totalcost");
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