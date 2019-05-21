package com.tcwong.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarriersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarriersExample() {
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

        public Criteria andCarriersidIsNull() {
            addCriterion("carriersID is null");
            return (Criteria) this;
        }

        public Criteria andCarriersidIsNotNull() {
            addCriterion("carriersID is not null");
            return (Criteria) this;
        }

        public Criteria andCarriersidEqualTo(Integer value) {
            addCriterion("carriersID =", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidNotEqualTo(Integer value) {
            addCriterion("carriersID <>", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidGreaterThan(Integer value) {
            addCriterion("carriersID >", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("carriersID >=", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidLessThan(Integer value) {
            addCriterion("carriersID <", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidLessThanOrEqualTo(Integer value) {
            addCriterion("carriersID <=", value, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidIn(List<Integer> values) {
            addCriterion("carriersID in", values, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidNotIn(List<Integer> values) {
            addCriterion("carriersID not in", values, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidBetween(Integer value1, Integer value2) {
            addCriterion("carriersID between", value1, value2, "carriersid");
            return (Criteria) this;
        }

        public Criteria andCarriersidNotBetween(Integer value1, Integer value2) {
            addCriterion("carriersID not between", value1, value2, "carriersid");
            return (Criteria) this;
        }

        public Criteria andSendcompanyIsNull() {
            addCriterion("sendCompany is null");
            return (Criteria) this;
        }

        public Criteria andSendcompanyIsNotNull() {
            addCriterion("sendCompany is not null");
            return (Criteria) this;
        }

        public Criteria andSendcompanyEqualTo(String value) {
            addCriterion("sendCompany =", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotEqualTo(String value) {
            addCriterion("sendCompany <>", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyGreaterThan(String value) {
            addCriterion("sendCompany >", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("sendCompany >=", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyLessThan(String value) {
            addCriterion("sendCompany <", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyLessThanOrEqualTo(String value) {
            addCriterion("sendCompany <=", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyLike(String value) {
            addCriterion("sendCompany like", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotLike(String value) {
            addCriterion("sendCompany not like", value, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyIn(List<String> values) {
            addCriterion("sendCompany in", values, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotIn(List<String> values) {
            addCriterion("sendCompany not in", values, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyBetween(String value1, String value2) {
            addCriterion("sendCompany between", value1, value2, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendcompanyNotBetween(String value1, String value2) {
            addCriterion("sendCompany not between", value1, value2, "sendcompany");
            return (Criteria) this;
        }

        public Criteria andSendaddressIsNull() {
            addCriterion("sendAddress is null");
            return (Criteria) this;
        }

        public Criteria andSendaddressIsNotNull() {
            addCriterion("sendAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSendaddressEqualTo(String value) {
            addCriterion("sendAddress =", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotEqualTo(String value) {
            addCriterion("sendAddress <>", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressGreaterThan(String value) {
            addCriterion("sendAddress >", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressGreaterThanOrEqualTo(String value) {
            addCriterion("sendAddress >=", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLessThan(String value) {
            addCriterion("sendAddress <", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLessThanOrEqualTo(String value) {
            addCriterion("sendAddress <=", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressLike(String value) {
            addCriterion("sendAddress like", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotLike(String value) {
            addCriterion("sendAddress not like", value, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressIn(List<String> values) {
            addCriterion("sendAddress in", values, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotIn(List<String> values) {
            addCriterion("sendAddress not in", values, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressBetween(String value1, String value2) {
            addCriterion("sendAddress between", value1, value2, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendaddressNotBetween(String value1, String value2) {
            addCriterion("sendAddress not between", value1, value2, "sendaddress");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanIsNull() {
            addCriterion("sendLinkMan is null");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanIsNotNull() {
            addCriterion("sendLinkMan is not null");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanEqualTo(String value) {
            addCriterion("sendLinkMan =", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanNotEqualTo(String value) {
            addCriterion("sendLinkMan <>", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanGreaterThan(String value) {
            addCriterion("sendLinkMan >", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("sendLinkMan >=", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanLessThan(String value) {
            addCriterion("sendLinkMan <", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanLessThanOrEqualTo(String value) {
            addCriterion("sendLinkMan <=", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanLike(String value) {
            addCriterion("sendLinkMan like", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanNotLike(String value) {
            addCriterion("sendLinkMan not like", value, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanIn(List<String> values) {
            addCriterion("sendLinkMan in", values, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanNotIn(List<String> values) {
            addCriterion("sendLinkMan not in", values, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanBetween(String value1, String value2) {
            addCriterion("sendLinkMan between", value1, value2, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendlinkmanNotBetween(String value1, String value2) {
            addCriterion("sendLinkMan not between", value1, value2, "sendlinkman");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNull() {
            addCriterion("sendPhone is null");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNotNull() {
            addCriterion("sendPhone is not null");
            return (Criteria) this;
        }

        public Criteria andSendphoneEqualTo(String value) {
            addCriterion("sendPhone =", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotEqualTo(String value) {
            addCriterion("sendPhone <>", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThan(String value) {
            addCriterion("sendPhone >", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sendPhone >=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThan(String value) {
            addCriterion("sendPhone <", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThanOrEqualTo(String value) {
            addCriterion("sendPhone <=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLike(String value) {
            addCriterion("sendPhone like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotLike(String value) {
            addCriterion("sendPhone not like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneIn(List<String> values) {
            addCriterion("sendPhone in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotIn(List<String> values) {
            addCriterion("sendPhone not in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneBetween(String value1, String value2) {
            addCriterion("sendPhone between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotBetween(String value1, String value2) {
            addCriterion("sendPhone not between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyIsNull() {
            addCriterion("receiveCompany is null");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyIsNotNull() {
            addCriterion("receiveCompany is not null");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyEqualTo(String value) {
            addCriterion("receiveCompany =", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyNotEqualTo(String value) {
            addCriterion("receiveCompany <>", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyGreaterThan(String value) {
            addCriterion("receiveCompany >", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("receiveCompany >=", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyLessThan(String value) {
            addCriterion("receiveCompany <", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyLessThanOrEqualTo(String value) {
            addCriterion("receiveCompany <=", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyLike(String value) {
            addCriterion("receiveCompany like", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyNotLike(String value) {
            addCriterion("receiveCompany not like", value, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyIn(List<String> values) {
            addCriterion("receiveCompany in", values, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyNotIn(List<String> values) {
            addCriterion("receiveCompany not in", values, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyBetween(String value1, String value2) {
            addCriterion("receiveCompany between", value1, value2, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andReceivecompanyNotBetween(String value1, String value2) {
            addCriterion("receiveCompany not between", value1, value2, "receivecompany");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressIsNull() {
            addCriterion("fk_receiveAddress is null");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressIsNotNull() {
            addCriterion("fk_receiveAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressEqualTo(String value) {
            addCriterion("fk_receiveAddress =", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressNotEqualTo(String value) {
            addCriterion("fk_receiveAddress <>", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressGreaterThan(String value) {
            addCriterion("fk_receiveAddress >", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("fk_receiveAddress >=", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressLessThan(String value) {
            addCriterion("fk_receiveAddress <", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressLessThanOrEqualTo(String value) {
            addCriterion("fk_receiveAddress <=", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressLike(String value) {
            addCriterion("fk_receiveAddress like", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressNotLike(String value) {
            addCriterion("fk_receiveAddress not like", value, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressIn(List<String> values) {
            addCriterion("fk_receiveAddress in", values, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressNotIn(List<String> values) {
            addCriterion("fk_receiveAddress not in", values, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressBetween(String value1, String value2) {
            addCriterion("fk_receiveAddress between", value1, value2, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andFkReceiveaddressNotBetween(String value1, String value2) {
            addCriterion("fk_receiveAddress not between", value1, value2, "fkReceiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanIsNull() {
            addCriterion("receiveLinkMan is null");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanIsNotNull() {
            addCriterion("receiveLinkMan is not null");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanEqualTo(String value) {
            addCriterion("receiveLinkMan =", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanNotEqualTo(String value) {
            addCriterion("receiveLinkMan <>", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanGreaterThan(String value) {
            addCriterion("receiveLinkMan >", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("receiveLinkMan >=", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanLessThan(String value) {
            addCriterion("receiveLinkMan <", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanLessThanOrEqualTo(String value) {
            addCriterion("receiveLinkMan <=", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanLike(String value) {
            addCriterion("receiveLinkMan like", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanNotLike(String value) {
            addCriterion("receiveLinkMan not like", value, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanIn(List<String> values) {
            addCriterion("receiveLinkMan in", values, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanNotIn(List<String> values) {
            addCriterion("receiveLinkMan not in", values, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanBetween(String value1, String value2) {
            addCriterion("receiveLinkMan between", value1, value2, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivelinkmanNotBetween(String value1, String value2) {
            addCriterion("receiveLinkMan not between", value1, value2, "receivelinkman");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIsNull() {
            addCriterion("receivePhone is null");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIsNotNull() {
            addCriterion("receivePhone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivephoneEqualTo(String value) {
            addCriterion("receivePhone =", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotEqualTo(String value) {
            addCriterion("receivePhone <>", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneGreaterThan(String value) {
            addCriterion("receivePhone >", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneGreaterThanOrEqualTo(String value) {
            addCriterion("receivePhone >=", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLessThan(String value) {
            addCriterion("receivePhone <", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLessThanOrEqualTo(String value) {
            addCriterion("receivePhone <=", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLike(String value) {
            addCriterion("receivePhone like", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotLike(String value) {
            addCriterion("receivePhone not like", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIn(List<String> values) {
            addCriterion("receivePhone in", values, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotIn(List<String> values) {
            addCriterion("receivePhone not in", values, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneBetween(String value1, String value2) {
            addCriterion("receivePhone between", value1, value2, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotBetween(String value1, String value2) {
            addCriterion("receivePhone not between", value1, value2, "receivephone");
            return (Criteria) this;
        }

        public Criteria andLeaverdateIsNull() {
            addCriterion("leaverDate is null");
            return (Criteria) this;
        }

        public Criteria andLeaverdateIsNotNull() {
            addCriterion("leaverDate is not null");
            return (Criteria) this;
        }

        public Criteria andLeaverdateEqualTo(Date value) {
            addCriterion("leaverDate =", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateNotEqualTo(Date value) {
            addCriterion("leaverDate <>", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateGreaterThan(Date value) {
            addCriterion("leaverDate >", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateGreaterThanOrEqualTo(Date value) {
            addCriterion("leaverDate >=", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateLessThan(Date value) {
            addCriterion("leaverDate <", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateLessThanOrEqualTo(Date value) {
            addCriterion("leaverDate <=", value, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateIn(List<Date> values) {
            addCriterion("leaverDate in", values, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateNotIn(List<Date> values) {
            addCriterion("leaverDate not in", values, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateBetween(Date value1, Date value2) {
            addCriterion("leaverDate between", value1, value2, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andLeaverdateNotBetween(Date value1, Date value2) {
            addCriterion("leaverDate not between", value1, value2, "leaverdate");
            return (Criteria) this;
        }

        public Criteria andReceivedateIsNull() {
            addCriterion("receiveDate is null");
            return (Criteria) this;
        }

        public Criteria andReceivedateIsNotNull() {
            addCriterion("receiveDate is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedateEqualTo(Date value) {
            addCriterion("receiveDate =", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotEqualTo(Date value) {
            addCriterion("receiveDate <>", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateGreaterThan(Date value) {
            addCriterion("receiveDate >", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("receiveDate >=", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLessThan(Date value) {
            addCriterion("receiveDate <", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLessThanOrEqualTo(Date value) {
            addCriterion("receiveDate <=", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateIn(List<Date> values) {
            addCriterion("receiveDate in", values, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotIn(List<Date> values) {
            addCriterion("receiveDate not in", values, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateBetween(Date value1, Date value2) {
            addCriterion("receiveDate between", value1, value2, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotBetween(Date value1, Date value2) {
            addCriterion("receiveDate not between", value1, value2, "receivedate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateIsNull() {
            addCriterion("finishedState is null");
            return (Criteria) this;
        }

        public Criteria andFinishedstateIsNotNull() {
            addCriterion("finishedState is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedstateEqualTo(Integer value) {
            addCriterion("finishedState =", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateNotEqualTo(Integer value) {
            addCriterion("finishedState <>", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateGreaterThan(Integer value) {
            addCriterion("finishedState >", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("finishedState >=", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateLessThan(Integer value) {
            addCriterion("finishedState <", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateLessThanOrEqualTo(Integer value) {
            addCriterion("finishedState <=", value, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateIn(List<Integer> values) {
            addCriterion("finishedState in", values, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateNotIn(List<Integer> values) {
            addCriterion("finishedState not in", values, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateBetween(Integer value1, Integer value2) {
            addCriterion("finishedState between", value1, value2, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andFinishedstateNotBetween(Integer value1, Integer value2) {
            addCriterion("finishedState not between", value1, value2, "finishedstate");
            return (Criteria) this;
        }

        public Criteria andInsurancecostIsNull() {
            addCriterion("insuranceCost is null");
            return (Criteria) this;
        }

        public Criteria andInsurancecostIsNotNull() {
            addCriterion("insuranceCost is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancecostEqualTo(Float value) {
            addCriterion("insuranceCost =", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostNotEqualTo(Float value) {
            addCriterion("insuranceCost <>", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostGreaterThan(Float value) {
            addCriterion("insuranceCost >", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostGreaterThanOrEqualTo(Float value) {
            addCriterion("insuranceCost >=", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostLessThan(Float value) {
            addCriterion("insuranceCost <", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostLessThanOrEqualTo(Float value) {
            addCriterion("insuranceCost <=", value, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostIn(List<Float> values) {
            addCriterion("insuranceCost in", values, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostNotIn(List<Float> values) {
            addCriterion("insuranceCost not in", values, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostBetween(Float value1, Float value2) {
            addCriterion("insuranceCost between", value1, value2, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andInsurancecostNotBetween(Float value1, Float value2) {
            addCriterion("insuranceCost not between", value1, value2, "insurancecost");
            return (Criteria) this;
        }

        public Criteria andTransportcostIsNull() {
            addCriterion("transportCost is null");
            return (Criteria) this;
        }

        public Criteria andTransportcostIsNotNull() {
            addCriterion("transportCost is not null");
            return (Criteria) this;
        }

        public Criteria andTransportcostEqualTo(Float value) {
            addCriterion("transportCost =", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostNotEqualTo(Float value) {
            addCriterion("transportCost <>", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostGreaterThan(Float value) {
            addCriterion("transportCost >", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostGreaterThanOrEqualTo(Float value) {
            addCriterion("transportCost >=", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostLessThan(Float value) {
            addCriterion("transportCost <", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostLessThanOrEqualTo(Float value) {
            addCriterion("transportCost <=", value, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostIn(List<Float> values) {
            addCriterion("transportCost in", values, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostNotIn(List<Float> values) {
            addCriterion("transportCost not in", values, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostBetween(Float value1, Float value2) {
            addCriterion("transportCost between", value1, value2, "transportcost");
            return (Criteria) this;
        }

        public Criteria andTransportcostNotBetween(Float value1, Float value2) {
            addCriterion("transportCost not between", value1, value2, "transportcost");
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