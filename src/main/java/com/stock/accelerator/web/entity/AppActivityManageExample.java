package com.stock.accelerator.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppActivityManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppActivityManageExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIsNull() {
            addCriterion("company_info is null");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIsNotNull() {
            addCriterion("company_info is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoEqualTo(String value) {
            addCriterion("company_info =", value, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoNotEqualTo(String value) {
            addCriterion("company_info <>", value, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoGreaterThan(String value) {
            addCriterion("company_info >", value, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoGreaterThanOrEqualTo(String value) {
            addCriterion("company_info >=", value, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoLessThan(String value) {
            addCriterion("company_info <", value, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoLessThanOrEqualTo(String value) {
            addCriterion("company_info <=", value, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoLike(String value) {
            addCriterion("company_info like", value, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoNotLike(String value) {
            addCriterion("company_info not like", value, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoIn(List<String> values) {
            addCriterion("company_info in", values, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoNotIn(List<String> values) {
            addCriterion("company_info not in", values, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoBetween(String value1, String value2) {
            addCriterion("company_info between", value1, value2, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyInfoNotBetween(String value1, String value2) {
            addCriterion("company_info not between", value1, value2, "companyInfo");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNull() {
            addCriterion("activity_title is null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNotNull() {
            addCriterion("activity_title is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleEqualTo(String value) {
            addCriterion("activity_title =", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotEqualTo(String value) {
            addCriterion("activity_title <>", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThan(String value) {
            addCriterion("activity_title >", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThanOrEqualTo(String value) {
            addCriterion("activity_title >=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThan(String value) {
            addCriterion("activity_title <", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThanOrEqualTo(String value) {
            addCriterion("activity_title <=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLike(String value) {
            addCriterion("activity_title like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotLike(String value) {
            addCriterion("activity_title not like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIn(List<String> values) {
            addCriterion("activity_title in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotIn(List<String> values) {
            addCriterion("activity_title not in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleBetween(String value1, String value2) {
            addCriterion("activity_title between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotBetween(String value1, String value2) {
            addCriterion("activity_title not between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andConveneDateIsNull() {
            addCriterion("convene_date is null");
            return (Criteria) this;
        }

        public Criteria andConveneDateIsNotNull() {
            addCriterion("convene_date is not null");
            return (Criteria) this;
        }

        public Criteria andConveneDateEqualTo(Date value) {
            addCriterionForJDBCDate("convene_date =", value, "conveneDate");
            return (Criteria) this;
        }

        public Criteria andConveneDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("convene_date <>", value, "conveneDate");
            return (Criteria) this;
        }

        public Criteria andConveneDateGreaterThan(Date value) {
            addCriterionForJDBCDate("convene_date >", value, "conveneDate");
            return (Criteria) this;
        }

        public Criteria andConveneDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("convene_date >=", value, "conveneDate");
            return (Criteria) this;
        }

        public Criteria andConveneDateLessThan(Date value) {
            addCriterionForJDBCDate("convene_date <", value, "conveneDate");
            return (Criteria) this;
        }

        public Criteria andConveneDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("convene_date <=", value, "conveneDate");
            return (Criteria) this;
        }

        public Criteria andConveneDateIn(List<Date> values) {
            addCriterionForJDBCDate("convene_date in", values, "conveneDate");
            return (Criteria) this;
        }

        public Criteria andConveneDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("convene_date not in", values, "conveneDate");
            return (Criteria) this;
        }

        public Criteria andConveneDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("convene_date between", value1, value2, "conveneDate");
            return (Criteria) this;
        }

        public Criteria andConveneDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("convene_date not between", value1, value2, "conveneDate");
            return (Criteria) this;
        }

        public Criteria andConveneStartIsNull() {
            addCriterion("convene_start is null");
            return (Criteria) this;
        }

        public Criteria andConveneStartIsNotNull() {
            addCriterion("convene_start is not null");
            return (Criteria) this;
        }

        public Criteria andConveneStartEqualTo(Date value) {
            addCriterion("convene_start =", value, "conveneStart");
            return (Criteria) this;
        }

        public Criteria andConveneStartNotEqualTo(Date value) {
            addCriterion("convene_start <>", value, "conveneStart");
            return (Criteria) this;
        }

        public Criteria andConveneStartGreaterThan(Date value) {
            addCriterion("convene_start >", value, "conveneStart");
            return (Criteria) this;
        }

        public Criteria andConveneStartGreaterThanOrEqualTo(Date value) {
            addCriterion("convene_start >=", value, "conveneStart");
            return (Criteria) this;
        }

        public Criteria andConveneStartLessThan(Date value) {
            addCriterion("convene_start <", value, "conveneStart");
            return (Criteria) this;
        }

        public Criteria andConveneStartLessThanOrEqualTo(Date value) {
            addCriterion("convene_start <=", value, "conveneStart");
            return (Criteria) this;
        }

        public Criteria andConveneStartIn(List<Date> values) {
            addCriterion("convene_start in", values, "conveneStart");
            return (Criteria) this;
        }

        public Criteria andConveneStartNotIn(List<Date> values) {
            addCriterion("convene_start not in", values, "conveneStart");
            return (Criteria) this;
        }

        public Criteria andConveneStartBetween(Date value1, Date value2) {
            addCriterion("convene_start between", value1, value2, "conveneStart");
            return (Criteria) this;
        }

        public Criteria andConveneStartNotBetween(Date value1, Date value2) {
            addCriterion("convene_start not between", value1, value2, "conveneStart");
            return (Criteria) this;
        }

        public Criteria andConveneEndIsNull() {
            addCriterion("convene_end is null");
            return (Criteria) this;
        }

        public Criteria andConveneEndIsNotNull() {
            addCriterion("convene_end is not null");
            return (Criteria) this;
        }

        public Criteria andConveneEndEqualTo(Date value) {
            addCriterion("convene_end =", value, "conveneEnd");
            return (Criteria) this;
        }

        public Criteria andConveneEndNotEqualTo(Date value) {
            addCriterion("convene_end <>", value, "conveneEnd");
            return (Criteria) this;
        }

        public Criteria andConveneEndGreaterThan(Date value) {
            addCriterion("convene_end >", value, "conveneEnd");
            return (Criteria) this;
        }

        public Criteria andConveneEndGreaterThanOrEqualTo(Date value) {
            addCriterion("convene_end >=", value, "conveneEnd");
            return (Criteria) this;
        }

        public Criteria andConveneEndLessThan(Date value) {
            addCriterion("convene_end <", value, "conveneEnd");
            return (Criteria) this;
        }

        public Criteria andConveneEndLessThanOrEqualTo(Date value) {
            addCriterion("convene_end <=", value, "conveneEnd");
            return (Criteria) this;
        }

        public Criteria andConveneEndIn(List<Date> values) {
            addCriterion("convene_end in", values, "conveneEnd");
            return (Criteria) this;
        }

        public Criteria andConveneEndNotIn(List<Date> values) {
            addCriterion("convene_end not in", values, "conveneEnd");
            return (Criteria) this;
        }

        public Criteria andConveneEndBetween(Date value1, Date value2) {
            addCriterion("convene_end between", value1, value2, "conveneEnd");
            return (Criteria) this;
        }

        public Criteria andConveneEndNotBetween(Date value1, Date value2) {
            addCriterion("convene_end not between", value1, value2, "conveneEnd");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIsNull() {
            addCriterion("activity_address is null");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIsNotNull() {
            addCriterion("activity_address is not null");
            return (Criteria) this;
        }

        public Criteria andActivityAddressEqualTo(String value) {
            addCriterion("activity_address =", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotEqualTo(String value) {
            addCriterion("activity_address <>", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressGreaterThan(String value) {
            addCriterion("activity_address >", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressGreaterThanOrEqualTo(String value) {
            addCriterion("activity_address >=", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLessThan(String value) {
            addCriterion("activity_address <", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLessThanOrEqualTo(String value) {
            addCriterion("activity_address <=", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressLike(String value) {
            addCriterion("activity_address like", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotLike(String value) {
            addCriterion("activity_address not like", value, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressIn(List<String> values) {
            addCriterion("activity_address in", values, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotIn(List<String> values) {
            addCriterion("activity_address not in", values, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressBetween(String value1, String value2) {
            addCriterion("activity_address between", value1, value2, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityAddressNotBetween(String value1, String value2) {
            addCriterion("activity_address not between", value1, value2, "activityAddress");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeIsNull() {
            addCriterion("activity_join_type is null");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeIsNotNull() {
            addCriterion("activity_join_type is not null");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeEqualTo(String value) {
            addCriterion("activity_join_type =", value, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeNotEqualTo(String value) {
            addCriterion("activity_join_type <>", value, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeGreaterThan(String value) {
            addCriterion("activity_join_type >", value, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_join_type >=", value, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeLessThan(String value) {
            addCriterion("activity_join_type <", value, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeLessThanOrEqualTo(String value) {
            addCriterion("activity_join_type <=", value, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeLike(String value) {
            addCriterion("activity_join_type like", value, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeNotLike(String value) {
            addCriterion("activity_join_type not like", value, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeIn(List<String> values) {
            addCriterion("activity_join_type in", values, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeNotIn(List<String> values) {
            addCriterion("activity_join_type not in", values, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeBetween(String value1, String value2) {
            addCriterion("activity_join_type between", value1, value2, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andActivityJoinTypeNotBetween(String value1, String value2) {
            addCriterion("activity_join_type not between", value1, value2, "activityJoinType");
            return (Criteria) this;
        }

        public Criteria andH5TypeIsNull() {
            addCriterion("h5_type is null");
            return (Criteria) this;
        }

        public Criteria andH5TypeIsNotNull() {
            addCriterion("h5_type is not null");
            return (Criteria) this;
        }

        public Criteria andH5TypeEqualTo(String value) {
            addCriterion("h5_type =", value, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeNotEqualTo(String value) {
            addCriterion("h5_type <>", value, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeGreaterThan(String value) {
            addCriterion("h5_type >", value, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeGreaterThanOrEqualTo(String value) {
            addCriterion("h5_type >=", value, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeLessThan(String value) {
            addCriterion("h5_type <", value, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeLessThanOrEqualTo(String value) {
            addCriterion("h5_type <=", value, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeLike(String value) {
            addCriterion("h5_type like", value, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeNotLike(String value) {
            addCriterion("h5_type not like", value, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeIn(List<String> values) {
            addCriterion("h5_type in", values, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeNotIn(List<String> values) {
            addCriterion("h5_type not in", values, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeBetween(String value1, String value2) {
            addCriterion("h5_type between", value1, value2, "h5Type");
            return (Criteria) this;
        }

        public Criteria andH5TypeNotBetween(String value1, String value2) {
            addCriterion("h5_type not between", value1, value2, "h5Type");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusIsNull() {
            addCriterion("cloud_meeting_status is null");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusIsNotNull() {
            addCriterion("cloud_meeting_status is not null");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusEqualTo(String value) {
            addCriterion("cloud_meeting_status =", value, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusNotEqualTo(String value) {
            addCriterion("cloud_meeting_status <>", value, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusGreaterThan(String value) {
            addCriterion("cloud_meeting_status >", value, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cloud_meeting_status >=", value, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusLessThan(String value) {
            addCriterion("cloud_meeting_status <", value, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusLessThanOrEqualTo(String value) {
            addCriterion("cloud_meeting_status <=", value, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusLike(String value) {
            addCriterion("cloud_meeting_status like", value, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusNotLike(String value) {
            addCriterion("cloud_meeting_status not like", value, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusIn(List<String> values) {
            addCriterion("cloud_meeting_status in", values, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusNotIn(List<String> values) {
            addCriterion("cloud_meeting_status not in", values, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusBetween(String value1, String value2) {
            addCriterion("cloud_meeting_status between", value1, value2, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingStatusNotBetween(String value1, String value2) {
            addCriterion("cloud_meeting_status not between", value1, value2, "cloudMeetingStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusIsNull() {
            addCriterion("cloud_meeting_live_status is null");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusIsNotNull() {
            addCriterion("cloud_meeting_live_status is not null");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusEqualTo(String value) {
            addCriterion("cloud_meeting_live_status =", value, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusNotEqualTo(String value) {
            addCriterion("cloud_meeting_live_status <>", value, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusGreaterThan(String value) {
            addCriterion("cloud_meeting_live_status >", value, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cloud_meeting_live_status >=", value, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusLessThan(String value) {
            addCriterion("cloud_meeting_live_status <", value, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusLessThanOrEqualTo(String value) {
            addCriterion("cloud_meeting_live_status <=", value, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusLike(String value) {
            addCriterion("cloud_meeting_live_status like", value, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusNotLike(String value) {
            addCriterion("cloud_meeting_live_status not like", value, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusIn(List<String> values) {
            addCriterion("cloud_meeting_live_status in", values, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusNotIn(List<String> values) {
            addCriterion("cloud_meeting_live_status not in", values, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusBetween(String value1, String value2) {
            addCriterion("cloud_meeting_live_status between", value1, value2, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingLiveStatusNotBetween(String value1, String value2) {
            addCriterion("cloud_meeting_live_status not between", value1, value2, "cloudMeetingLiveStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusIsNull() {
            addCriterion("interact_qa_status is null");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusIsNotNull() {
            addCriterion("interact_qa_status is not null");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusEqualTo(String value) {
            addCriterion("interact_qa_status =", value, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusNotEqualTo(String value) {
            addCriterion("interact_qa_status <>", value, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusGreaterThan(String value) {
            addCriterion("interact_qa_status >", value, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusGreaterThanOrEqualTo(String value) {
            addCriterion("interact_qa_status >=", value, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusLessThan(String value) {
            addCriterion("interact_qa_status <", value, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusLessThanOrEqualTo(String value) {
            addCriterion("interact_qa_status <=", value, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusLike(String value) {
            addCriterion("interact_qa_status like", value, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusNotLike(String value) {
            addCriterion("interact_qa_status not like", value, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusIn(List<String> values) {
            addCriterion("interact_qa_status in", values, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusNotIn(List<String> values) {
            addCriterion("interact_qa_status not in", values, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusBetween(String value1, String value2) {
            addCriterion("interact_qa_status between", value1, value2, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andInteractQaStatusNotBetween(String value1, String value2) {
            addCriterion("interact_qa_status not between", value1, value2, "interactQaStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusIsNull() {
            addCriterion("guest_status is null");
            return (Criteria) this;
        }

        public Criteria andGuestStatusIsNotNull() {
            addCriterion("guest_status is not null");
            return (Criteria) this;
        }

        public Criteria andGuestStatusEqualTo(String value) {
            addCriterion("guest_status =", value, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusNotEqualTo(String value) {
            addCriterion("guest_status <>", value, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusGreaterThan(String value) {
            addCriterion("guest_status >", value, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusGreaterThanOrEqualTo(String value) {
            addCriterion("guest_status >=", value, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusLessThan(String value) {
            addCriterion("guest_status <", value, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusLessThanOrEqualTo(String value) {
            addCriterion("guest_status <=", value, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusLike(String value) {
            addCriterion("guest_status like", value, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusNotLike(String value) {
            addCriterion("guest_status not like", value, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusIn(List<String> values) {
            addCriterion("guest_status in", values, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusNotIn(List<String> values) {
            addCriterion("guest_status not in", values, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusBetween(String value1, String value2) {
            addCriterion("guest_status between", value1, value2, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andGuestStatusNotBetween(String value1, String value2) {
            addCriterion("guest_status not between", value1, value2, "guestStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusIsNull() {
            addCriterion("h5_invitation_status is null");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusIsNotNull() {
            addCriterion("h5_invitation_status is not null");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusEqualTo(String value) {
            addCriterion("h5_invitation_status =", value, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusNotEqualTo(String value) {
            addCriterion("h5_invitation_status <>", value, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusGreaterThan(String value) {
            addCriterion("h5_invitation_status >", value, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("h5_invitation_status >=", value, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusLessThan(String value) {
            addCriterion("h5_invitation_status <", value, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusLessThanOrEqualTo(String value) {
            addCriterion("h5_invitation_status <=", value, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusLike(String value) {
            addCriterion("h5_invitation_status like", value, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusNotLike(String value) {
            addCriterion("h5_invitation_status not like", value, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusIn(List<String> values) {
            addCriterion("h5_invitation_status in", values, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusNotIn(List<String> values) {
            addCriterion("h5_invitation_status not in", values, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusBetween(String value1, String value2) {
            addCriterion("h5_invitation_status between", value1, value2, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andH5InvitationStatusNotBetween(String value1, String value2) {
            addCriterion("h5_invitation_status not between", value1, value2, "h5InvitationStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusIsNull() {
            addCriterion("file_status is null");
            return (Criteria) this;
        }

        public Criteria andFileStatusIsNotNull() {
            addCriterion("file_status is not null");
            return (Criteria) this;
        }

        public Criteria andFileStatusEqualTo(String value) {
            addCriterion("file_status =", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotEqualTo(String value) {
            addCriterion("file_status <>", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusGreaterThan(String value) {
            addCriterion("file_status >", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusGreaterThanOrEqualTo(String value) {
            addCriterion("file_status >=", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLessThan(String value) {
            addCriterion("file_status <", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLessThanOrEqualTo(String value) {
            addCriterion("file_status <=", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLike(String value) {
            addCriterion("file_status like", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotLike(String value) {
            addCriterion("file_status not like", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusIn(List<String> values) {
            addCriterion("file_status in", values, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotIn(List<String> values) {
            addCriterion("file_status not in", values, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusBetween(String value1, String value2) {
            addCriterion("file_status between", value1, value2, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotBetween(String value1, String value2) {
            addCriterion("file_status not between", value1, value2, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusIsNull() {
            addCriterion("promise_sign_status is null");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusIsNotNull() {
            addCriterion("promise_sign_status is not null");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusEqualTo(String value) {
            addCriterion("promise_sign_status =", value, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusNotEqualTo(String value) {
            addCriterion("promise_sign_status <>", value, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusGreaterThan(String value) {
            addCriterion("promise_sign_status >", value, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusGreaterThanOrEqualTo(String value) {
            addCriterion("promise_sign_status >=", value, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusLessThan(String value) {
            addCriterion("promise_sign_status <", value, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusLessThanOrEqualTo(String value) {
            addCriterion("promise_sign_status <=", value, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusLike(String value) {
            addCriterion("promise_sign_status like", value, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusNotLike(String value) {
            addCriterion("promise_sign_status not like", value, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusIn(List<String> values) {
            addCriterion("promise_sign_status in", values, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusNotIn(List<String> values) {
            addCriterion("promise_sign_status not in", values, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusBetween(String value1, String value2) {
            addCriterion("promise_sign_status between", value1, value2, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseSignStatusNotBetween(String value1, String value2) {
            addCriterion("promise_sign_status not between", value1, value2, "promiseSignStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusIsNull() {
            addCriterion("agenda_promise_status is null");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusIsNotNull() {
            addCriterion("agenda_promise_status is not null");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusEqualTo(String value) {
            addCriterion("agenda_promise_status =", value, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusNotEqualTo(String value) {
            addCriterion("agenda_promise_status <>", value, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusGreaterThan(String value) {
            addCriterion("agenda_promise_status >", value, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("agenda_promise_status >=", value, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusLessThan(String value) {
            addCriterion("agenda_promise_status <", value, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusLessThanOrEqualTo(String value) {
            addCriterion("agenda_promise_status <=", value, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusLike(String value) {
            addCriterion("agenda_promise_status like", value, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusNotLike(String value) {
            addCriterion("agenda_promise_status not like", value, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusIn(List<String> values) {
            addCriterion("agenda_promise_status in", values, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusNotIn(List<String> values) {
            addCriterion("agenda_promise_status not in", values, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusBetween(String value1, String value2) {
            addCriterion("agenda_promise_status between", value1, value2, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaPromiseStatusNotBetween(String value1, String value2) {
            addCriterion("agenda_promise_status not between", value1, value2, "agendaPromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusIsNull() {
            addCriterion("file_promise_status is null");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusIsNotNull() {
            addCriterion("file_promise_status is not null");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusEqualTo(String value) {
            addCriterion("file_promise_status =", value, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusNotEqualTo(String value) {
            addCriterion("file_promise_status <>", value, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusGreaterThan(String value) {
            addCriterion("file_promise_status >", value, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("file_promise_status >=", value, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusLessThan(String value) {
            addCriterion("file_promise_status <", value, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusLessThanOrEqualTo(String value) {
            addCriterion("file_promise_status <=", value, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusLike(String value) {
            addCriterion("file_promise_status like", value, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusNotLike(String value) {
            addCriterion("file_promise_status not like", value, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusIn(List<String> values) {
            addCriterion("file_promise_status in", values, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusNotIn(List<String> values) {
            addCriterion("file_promise_status not in", values, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusBetween(String value1, String value2) {
            addCriterion("file_promise_status between", value1, value2, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andFilePromiseStatusNotBetween(String value1, String value2) {
            addCriterion("file_promise_status not between", value1, value2, "filePromiseStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusIsNull() {
            addCriterion("company_introduce_status is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusIsNotNull() {
            addCriterion("company_introduce_status is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusEqualTo(String value) {
            addCriterion("company_introduce_status =", value, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusNotEqualTo(String value) {
            addCriterion("company_introduce_status <>", value, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusGreaterThan(String value) {
            addCriterion("company_introduce_status >", value, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("company_introduce_status >=", value, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusLessThan(String value) {
            addCriterion("company_introduce_status <", value, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusLessThanOrEqualTo(String value) {
            addCriterion("company_introduce_status <=", value, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusLike(String value) {
            addCriterion("company_introduce_status like", value, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusNotLike(String value) {
            addCriterion("company_introduce_status not like", value, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusIn(List<String> values) {
            addCriterion("company_introduce_status in", values, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusNotIn(List<String> values) {
            addCriterion("company_introduce_status not in", values, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusBetween(String value1, String value2) {
            addCriterion("company_introduce_status between", value1, value2, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceStatusNotBetween(String value1, String value2) {
            addCriterion("company_introduce_status not between", value1, value2, "companyIntroduceStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusIsNull() {
            addCriterion("agenda_status is null");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusIsNotNull() {
            addCriterion("agenda_status is not null");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusEqualTo(String value) {
            addCriterion("agenda_status =", value, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusNotEqualTo(String value) {
            addCriterion("agenda_status <>", value, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusGreaterThan(String value) {
            addCriterion("agenda_status >", value, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusGreaterThanOrEqualTo(String value) {
            addCriterion("agenda_status >=", value, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusLessThan(String value) {
            addCriterion("agenda_status <", value, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusLessThanOrEqualTo(String value) {
            addCriterion("agenda_status <=", value, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusLike(String value) {
            addCriterion("agenda_status like", value, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusNotLike(String value) {
            addCriterion("agenda_status not like", value, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusIn(List<String> values) {
            addCriterion("agenda_status in", values, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusNotIn(List<String> values) {
            addCriterion("agenda_status not in", values, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusBetween(String value1, String value2) {
            addCriterion("agenda_status between", value1, value2, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStatusNotBetween(String value1, String value2) {
            addCriterion("agenda_status not between", value1, value2, "agendaStatus");
            return (Criteria) this;
        }

        public Criteria andIsPublishIsNull() {
            addCriterion("is_publish is null");
            return (Criteria) this;
        }

        public Criteria andIsPublishIsNotNull() {
            addCriterion("is_publish is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublishEqualTo(String value) {
            addCriterion("is_publish =", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishNotEqualTo(String value) {
            addCriterion("is_publish <>", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishGreaterThan(String value) {
            addCriterion("is_publish >", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishGreaterThanOrEqualTo(String value) {
            addCriterion("is_publish >=", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishLessThan(String value) {
            addCriterion("is_publish <", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishLessThanOrEqualTo(String value) {
            addCriterion("is_publish <=", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishLike(String value) {
            addCriterion("is_publish like", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishNotLike(String value) {
            addCriterion("is_publish not like", value, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishIn(List<String> values) {
            addCriterion("is_publish in", values, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishNotIn(List<String> values) {
            addCriterion("is_publish not in", values, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishBetween(String value1, String value2) {
            addCriterion("is_publish between", value1, value2, "isPublish");
            return (Criteria) this;
        }

        public Criteria andIsPublishNotBetween(String value1, String value2) {
            addCriterion("is_publish not between", value1, value2, "isPublish");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusIsNull() {
            addCriterion("send_message_status is null");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusIsNotNull() {
            addCriterion("send_message_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusEqualTo(String value) {
            addCriterion("send_message_status =", value, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusNotEqualTo(String value) {
            addCriterion("send_message_status <>", value, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusGreaterThan(String value) {
            addCriterion("send_message_status >", value, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusGreaterThanOrEqualTo(String value) {
            addCriterion("send_message_status >=", value, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusLessThan(String value) {
            addCriterion("send_message_status <", value, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusLessThanOrEqualTo(String value) {
            addCriterion("send_message_status <=", value, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusLike(String value) {
            addCriterion("send_message_status like", value, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusNotLike(String value) {
            addCriterion("send_message_status not like", value, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusIn(List<String> values) {
            addCriterion("send_message_status in", values, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusNotIn(List<String> values) {
            addCriterion("send_message_status not in", values, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusBetween(String value1, String value2) {
            addCriterion("send_message_status between", value1, value2, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andSendMessageStatusNotBetween(String value1, String value2) {
            addCriterion("send_message_status not between", value1, value2, "sendMessageStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusIsNull() {
            addCriterion("meeting_status is null");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusIsNotNull() {
            addCriterion("meeting_status is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusEqualTo(String value) {
            addCriterion("meeting_status =", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusNotEqualTo(String value) {
            addCriterion("meeting_status <>", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusGreaterThan(String value) {
            addCriterion("meeting_status >", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_status >=", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusLessThan(String value) {
            addCriterion("meeting_status <", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusLessThanOrEqualTo(String value) {
            addCriterion("meeting_status <=", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusLike(String value) {
            addCriterion("meeting_status like", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusNotLike(String value) {
            addCriterion("meeting_status not like", value, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusIn(List<String> values) {
            addCriterion("meeting_status in", values, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusNotIn(List<String> values) {
            addCriterion("meeting_status not in", values, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusBetween(String value1, String value2) {
            addCriterion("meeting_status between", value1, value2, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andMeetingStatusNotBetween(String value1, String value2) {
            addCriterion("meeting_status not between", value1, value2, "meetingStatus");
            return (Criteria) this;
        }

        public Criteria andAgendaStartIsNull() {
            addCriterion("agenda_start is null");
            return (Criteria) this;
        }

        public Criteria andAgendaStartIsNotNull() {
            addCriterion("agenda_start is not null");
            return (Criteria) this;
        }

        public Criteria andAgendaStartEqualTo(Date value) {
            addCriterion("agenda_start =", value, "agendaStart");
            return (Criteria) this;
        }

        public Criteria andAgendaStartNotEqualTo(Date value) {
            addCriterion("agenda_start <>", value, "agendaStart");
            return (Criteria) this;
        }

        public Criteria andAgendaStartGreaterThan(Date value) {
            addCriterion("agenda_start >", value, "agendaStart");
            return (Criteria) this;
        }

        public Criteria andAgendaStartGreaterThanOrEqualTo(Date value) {
            addCriterion("agenda_start >=", value, "agendaStart");
            return (Criteria) this;
        }

        public Criteria andAgendaStartLessThan(Date value) {
            addCriterion("agenda_start <", value, "agendaStart");
            return (Criteria) this;
        }

        public Criteria andAgendaStartLessThanOrEqualTo(Date value) {
            addCriterion("agenda_start <=", value, "agendaStart");
            return (Criteria) this;
        }

        public Criteria andAgendaStartIn(List<Date> values) {
            addCriterion("agenda_start in", values, "agendaStart");
            return (Criteria) this;
        }

        public Criteria andAgendaStartNotIn(List<Date> values) {
            addCriterion("agenda_start not in", values, "agendaStart");
            return (Criteria) this;
        }

        public Criteria andAgendaStartBetween(Date value1, Date value2) {
            addCriterion("agenda_start between", value1, value2, "agendaStart");
            return (Criteria) this;
        }

        public Criteria andAgendaStartNotBetween(Date value1, Date value2) {
            addCriterion("agenda_start not between", value1, value2, "agendaStart");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdIsNull() {
            addCriterion("cloud_meeting_id is null");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdIsNotNull() {
            addCriterion("cloud_meeting_id is not null");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdEqualTo(String value) {
            addCriterion("cloud_meeting_id =", value, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdNotEqualTo(String value) {
            addCriterion("cloud_meeting_id <>", value, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdGreaterThan(String value) {
            addCriterion("cloud_meeting_id >", value, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdGreaterThanOrEqualTo(String value) {
            addCriterion("cloud_meeting_id >=", value, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdLessThan(String value) {
            addCriterion("cloud_meeting_id <", value, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdLessThanOrEqualTo(String value) {
            addCriterion("cloud_meeting_id <=", value, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdLike(String value) {
            addCriterion("cloud_meeting_id like", value, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdNotLike(String value) {
            addCriterion("cloud_meeting_id not like", value, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdIn(List<String> values) {
            addCriterion("cloud_meeting_id in", values, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdNotIn(List<String> values) {
            addCriterion("cloud_meeting_id not in", values, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdBetween(String value1, String value2) {
            addCriterion("cloud_meeting_id between", value1, value2, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andCloudMeetingIdNotBetween(String value1, String value2) {
            addCriterion("cloud_meeting_id not between", value1, value2, "cloudMeetingId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdIsNull() {
            addCriterion("signature_id is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIdIsNotNull() {
            addCriterion("signature_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureIdEqualTo(String value) {
            addCriterion("signature_id =", value, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdNotEqualTo(String value) {
            addCriterion("signature_id <>", value, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdGreaterThan(String value) {
            addCriterion("signature_id >", value, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("signature_id >=", value, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdLessThan(String value) {
            addCriterion("signature_id <", value, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdLessThanOrEqualTo(String value) {
            addCriterion("signature_id <=", value, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdLike(String value) {
            addCriterion("signature_id like", value, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdNotLike(String value) {
            addCriterion("signature_id not like", value, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdIn(List<String> values) {
            addCriterion("signature_id in", values, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdNotIn(List<String> values) {
            addCriterion("signature_id not in", values, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdBetween(String value1, String value2) {
            addCriterion("signature_id between", value1, value2, "signatureId");
            return (Criteria) this;
        }

        public Criteria andSignatureIdNotBetween(String value1, String value2) {
            addCriterion("signature_id not between", value1, value2, "signatureId");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andRelaCodeIsNull() {
            addCriterion("rela_code is null");
            return (Criteria) this;
        }

        public Criteria andRelaCodeIsNotNull() {
            addCriterion("rela_code is not null");
            return (Criteria) this;
        }

        public Criteria andRelaCodeEqualTo(String value) {
            addCriterion("rela_code =", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeNotEqualTo(String value) {
            addCriterion("rela_code <>", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeGreaterThan(String value) {
            addCriterion("rela_code >", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rela_code >=", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeLessThan(String value) {
            addCriterion("rela_code <", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeLessThanOrEqualTo(String value) {
            addCriterion("rela_code <=", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeLike(String value) {
            addCriterion("rela_code like", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeNotLike(String value) {
            addCriterion("rela_code not like", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeIn(List<String> values) {
            addCriterion("rela_code in", values, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeNotIn(List<String> values) {
            addCriterion("rela_code not in", values, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeBetween(String value1, String value2) {
            addCriterion("rela_code between", value1, value2, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeNotBetween(String value1, String value2) {
            addCriterion("rela_code not between", value1, value2, "relaCode");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNull() {
            addCriterion("person_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(String value) {
            addCriterion("person_id =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(String value) {
            addCriterion("person_id <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(String value) {
            addCriterion("person_id >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("person_id >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(String value) {
            addCriterion("person_id <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(String value) {
            addCriterion("person_id <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLike(String value) {
            addCriterion("person_id like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotLike(String value) {
            addCriterion("person_id not like", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<String> values) {
            addCriterion("person_id in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<String> values) {
            addCriterion("person_id not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(String value1, String value2) {
            addCriterion("person_id between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(String value1, String value2) {
            addCriterion("person_id not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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