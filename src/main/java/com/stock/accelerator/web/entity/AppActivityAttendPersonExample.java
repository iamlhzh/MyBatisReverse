package com.stock.accelerator.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppActivityAttendPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppActivityAttendPersonExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("activity_id like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("activity_id not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNull() {
            addCriterion("person_name is null");
            return (Criteria) this;
        }

        public Criteria andPersonNameIsNotNull() {
            addCriterion("person_name is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNameEqualTo(String value) {
            addCriterion("person_name =", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotEqualTo(String value) {
            addCriterion("person_name <>", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThan(String value) {
            addCriterion("person_name >", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("person_name >=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThan(String value) {
            addCriterion("person_name <", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLessThanOrEqualTo(String value) {
            addCriterion("person_name <=", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameLike(String value) {
            addCriterion("person_name like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotLike(String value) {
            addCriterion("person_name not like", value, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameIn(List<String> values) {
            addCriterion("person_name in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotIn(List<String> values) {
            addCriterion("person_name not in", values, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameBetween(String value1, String value2) {
            addCriterion("person_name between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andPersonNameNotBetween(String value1, String value2) {
            addCriterion("person_name not between", value1, value2, "personName");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andPersonSourceIsNull() {
            addCriterion("person_source is null");
            return (Criteria) this;
        }

        public Criteria andPersonSourceIsNotNull() {
            addCriterion("person_source is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSourceEqualTo(String value) {
            addCriterion("person_source =", value, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceNotEqualTo(String value) {
            addCriterion("person_source <>", value, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceGreaterThan(String value) {
            addCriterion("person_source >", value, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceGreaterThanOrEqualTo(String value) {
            addCriterion("person_source >=", value, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceLessThan(String value) {
            addCriterion("person_source <", value, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceLessThanOrEqualTo(String value) {
            addCriterion("person_source <=", value, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceLike(String value) {
            addCriterion("person_source like", value, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceNotLike(String value) {
            addCriterion("person_source not like", value, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceIn(List<String> values) {
            addCriterion("person_source in", values, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceNotIn(List<String> values) {
            addCriterion("person_source not in", values, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceBetween(String value1, String value2) {
            addCriterion("person_source between", value1, value2, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonSourceNotBetween(String value1, String value2) {
            addCriterion("person_source not between", value1, value2, "personSource");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneIsNull() {
            addCriterion("person_telephone is null");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneIsNotNull() {
            addCriterion("person_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneEqualTo(String value) {
            addCriterion("person_telephone =", value, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneNotEqualTo(String value) {
            addCriterion("person_telephone <>", value, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneGreaterThan(String value) {
            addCriterion("person_telephone >", value, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("person_telephone >=", value, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneLessThan(String value) {
            addCriterion("person_telephone <", value, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneLessThanOrEqualTo(String value) {
            addCriterion("person_telephone <=", value, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneLike(String value) {
            addCriterion("person_telephone like", value, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneNotLike(String value) {
            addCriterion("person_telephone not like", value, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneIn(List<String> values) {
            addCriterion("person_telephone in", values, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneNotIn(List<String> values) {
            addCriterion("person_telephone not in", values, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneBetween(String value1, String value2) {
            addCriterion("person_telephone between", value1, value2, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andPersonTelephoneNotBetween(String value1, String value2) {
            addCriterion("person_telephone not between", value1, value2, "personTelephone");
            return (Criteria) this;
        }

        public Criteria andGuestIdIsNull() {
            addCriterion("guest_id is null");
            return (Criteria) this;
        }

        public Criteria andGuestIdIsNotNull() {
            addCriterion("guest_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuestIdEqualTo(String value) {
            addCriterion("guest_id =", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdNotEqualTo(String value) {
            addCriterion("guest_id <>", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdGreaterThan(String value) {
            addCriterion("guest_id >", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdGreaterThanOrEqualTo(String value) {
            addCriterion("guest_id >=", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdLessThan(String value) {
            addCriterion("guest_id <", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdLessThanOrEqualTo(String value) {
            addCriterion("guest_id <=", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdLike(String value) {
            addCriterion("guest_id like", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdNotLike(String value) {
            addCriterion("guest_id not like", value, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdIn(List<String> values) {
            addCriterion("guest_id in", values, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdNotIn(List<String> values) {
            addCriterion("guest_id not in", values, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdBetween(String value1, String value2) {
            addCriterion("guest_id between", value1, value2, "guestId");
            return (Criteria) this;
        }

        public Criteria andGuestIdNotBetween(String value1, String value2) {
            addCriterion("guest_id not between", value1, value2, "guestId");
            return (Criteria) this;
        }

        public Criteria andImformationStatusIsNull() {
            addCriterion("imformation_status is null");
            return (Criteria) this;
        }

        public Criteria andImformationStatusIsNotNull() {
            addCriterion("imformation_status is not null");
            return (Criteria) this;
        }

        public Criteria andImformationStatusEqualTo(String value) {
            addCriterion("imformation_status =", value, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusNotEqualTo(String value) {
            addCriterion("imformation_status <>", value, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusGreaterThan(String value) {
            addCriterion("imformation_status >", value, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("imformation_status >=", value, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusLessThan(String value) {
            addCriterion("imformation_status <", value, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusLessThanOrEqualTo(String value) {
            addCriterion("imformation_status <=", value, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusLike(String value) {
            addCriterion("imformation_status like", value, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusNotLike(String value) {
            addCriterion("imformation_status not like", value, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusIn(List<String> values) {
            addCriterion("imformation_status in", values, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusNotIn(List<String> values) {
            addCriterion("imformation_status not in", values, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusBetween(String value1, String value2) {
            addCriterion("imformation_status between", value1, value2, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andImformationStatusNotBetween(String value1, String value2) {
            addCriterion("imformation_status not between", value1, value2, "imformationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusIsNull() {
            addCriterion("reservation_status is null");
            return (Criteria) this;
        }

        public Criteria andReservationStatusIsNotNull() {
            addCriterion("reservation_status is not null");
            return (Criteria) this;
        }

        public Criteria andReservationStatusEqualTo(String value) {
            addCriterion("reservation_status =", value, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusNotEqualTo(String value) {
            addCriterion("reservation_status <>", value, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusGreaterThan(String value) {
            addCriterion("reservation_status >", value, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("reservation_status >=", value, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusLessThan(String value) {
            addCriterion("reservation_status <", value, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusLessThanOrEqualTo(String value) {
            addCriterion("reservation_status <=", value, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusLike(String value) {
            addCriterion("reservation_status like", value, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusNotLike(String value) {
            addCriterion("reservation_status not like", value, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusIn(List<String> values) {
            addCriterion("reservation_status in", values, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusNotIn(List<String> values) {
            addCriterion("reservation_status not in", values, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusBetween(String value1, String value2) {
            addCriterion("reservation_status between", value1, value2, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andReservationStatusNotBetween(String value1, String value2) {
            addCriterion("reservation_status not between", value1, value2, "reservationStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusIsNull() {
            addCriterion("sign_up_status is null");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusIsNotNull() {
            addCriterion("sign_up_status is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusEqualTo(String value) {
            addCriterion("sign_up_status =", value, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusNotEqualTo(String value) {
            addCriterion("sign_up_status <>", value, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusGreaterThan(String value) {
            addCriterion("sign_up_status >", value, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sign_up_status >=", value, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusLessThan(String value) {
            addCriterion("sign_up_status <", value, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusLessThanOrEqualTo(String value) {
            addCriterion("sign_up_status <=", value, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusLike(String value) {
            addCriterion("sign_up_status like", value, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusNotLike(String value) {
            addCriterion("sign_up_status not like", value, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusIn(List<String> values) {
            addCriterion("sign_up_status in", values, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusNotIn(List<String> values) {
            addCriterion("sign_up_status not in", values, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusBetween(String value1, String value2) {
            addCriterion("sign_up_status between", value1, value2, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andSignUpStatusNotBetween(String value1, String value2) {
            addCriterion("sign_up_status not between", value1, value2, "signUpStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusIsNull() {
            addCriterion("promise_status is null");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusIsNotNull() {
            addCriterion("promise_status is not null");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusEqualTo(String value) {
            addCriterion("promise_status =", value, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusNotEqualTo(String value) {
            addCriterion("promise_status <>", value, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusGreaterThan(String value) {
            addCriterion("promise_status >", value, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("promise_status >=", value, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusLessThan(String value) {
            addCriterion("promise_status <", value, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusLessThanOrEqualTo(String value) {
            addCriterion("promise_status <=", value, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusLike(String value) {
            addCriterion("promise_status like", value, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusNotLike(String value) {
            addCriterion("promise_status not like", value, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusIn(List<String> values) {
            addCriterion("promise_status in", values, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusNotIn(List<String> values) {
            addCriterion("promise_status not in", values, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusBetween(String value1, String value2) {
            addCriterion("promise_status between", value1, value2, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andPromiseStatusNotBetween(String value1, String value2) {
            addCriterion("promise_status not between", value1, value2, "promiseStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusIsNull() {
            addCriterion("attend_status is null");
            return (Criteria) this;
        }

        public Criteria andAttendStatusIsNotNull() {
            addCriterion("attend_status is not null");
            return (Criteria) this;
        }

        public Criteria andAttendStatusEqualTo(String value) {
            addCriterion("attend_status =", value, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusNotEqualTo(String value) {
            addCriterion("attend_status <>", value, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusGreaterThan(String value) {
            addCriterion("attend_status >", value, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("attend_status >=", value, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusLessThan(String value) {
            addCriterion("attend_status <", value, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusLessThanOrEqualTo(String value) {
            addCriterion("attend_status <=", value, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusLike(String value) {
            addCriterion("attend_status like", value, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusNotLike(String value) {
            addCriterion("attend_status not like", value, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusIn(List<String> values) {
            addCriterion("attend_status in", values, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusNotIn(List<String> values) {
            addCriterion("attend_status not in", values, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusBetween(String value1, String value2) {
            addCriterion("attend_status between", value1, value2, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAttendStatusNotBetween(String value1, String value2) {
            addCriterion("attend_status not between", value1, value2, "attendStatus");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonIsNull() {
            addCriterion("absence_reason is null");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonIsNotNull() {
            addCriterion("absence_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonEqualTo(String value) {
            addCriterion("absence_reason =", value, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonNotEqualTo(String value) {
            addCriterion("absence_reason <>", value, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonGreaterThan(String value) {
            addCriterion("absence_reason >", value, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonGreaterThanOrEqualTo(String value) {
            addCriterion("absence_reason >=", value, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonLessThan(String value) {
            addCriterion("absence_reason <", value, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonLessThanOrEqualTo(String value) {
            addCriterion("absence_reason <=", value, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonLike(String value) {
            addCriterion("absence_reason like", value, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonNotLike(String value) {
            addCriterion("absence_reason not like", value, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonIn(List<String> values) {
            addCriterion("absence_reason in", values, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonNotIn(List<String> values) {
            addCriterion("absence_reason not in", values, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonBetween(String value1, String value2) {
            addCriterion("absence_reason between", value1, value2, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAbsenceReasonNotBetween(String value1, String value2) {
            addCriterion("absence_reason not between", value1, value2, "absenceReason");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingIsNull() {
            addCriterion("attend_cloud_meeting is null");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingIsNotNull() {
            addCriterion("attend_cloud_meeting is not null");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingEqualTo(String value) {
            addCriterion("attend_cloud_meeting =", value, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingNotEqualTo(String value) {
            addCriterion("attend_cloud_meeting <>", value, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingGreaterThan(String value) {
            addCriterion("attend_cloud_meeting >", value, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingGreaterThanOrEqualTo(String value) {
            addCriterion("attend_cloud_meeting >=", value, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingLessThan(String value) {
            addCriterion("attend_cloud_meeting <", value, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingLessThanOrEqualTo(String value) {
            addCriterion("attend_cloud_meeting <=", value, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingLike(String value) {
            addCriterion("attend_cloud_meeting like", value, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingNotLike(String value) {
            addCriterion("attend_cloud_meeting not like", value, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingIn(List<String> values) {
            addCriterion("attend_cloud_meeting in", values, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingNotIn(List<String> values) {
            addCriterion("attend_cloud_meeting not in", values, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingBetween(String value1, String value2) {
            addCriterion("attend_cloud_meeting between", value1, value2, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendCloudMeetingNotBetween(String value1, String value2) {
            addCriterion("attend_cloud_meeting not between", value1, value2, "attendCloudMeeting");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaIsNull() {
            addCriterion("attend_interact_qa is null");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaIsNotNull() {
            addCriterion("attend_interact_qa is not null");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaEqualTo(String value) {
            addCriterion("attend_interact_qa =", value, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaNotEqualTo(String value) {
            addCriterion("attend_interact_qa <>", value, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaGreaterThan(String value) {
            addCriterion("attend_interact_qa >", value, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaGreaterThanOrEqualTo(String value) {
            addCriterion("attend_interact_qa >=", value, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaLessThan(String value) {
            addCriterion("attend_interact_qa <", value, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaLessThanOrEqualTo(String value) {
            addCriterion("attend_interact_qa <=", value, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaLike(String value) {
            addCriterion("attend_interact_qa like", value, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaNotLike(String value) {
            addCriterion("attend_interact_qa not like", value, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaIn(List<String> values) {
            addCriterion("attend_interact_qa in", values, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaNotIn(List<String> values) {
            addCriterion("attend_interact_qa not in", values, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaBetween(String value1, String value2) {
            addCriterion("attend_interact_qa between", value1, value2, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andAttendInteractQaNotBetween(String value1, String value2) {
            addCriterion("attend_interact_qa not between", value1, value2, "attendInteractQa");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeIsNull() {
            addCriterion("investor_type is null");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeIsNotNull() {
            addCriterion("investor_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeEqualTo(String value) {
            addCriterion("investor_type =", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeNotEqualTo(String value) {
            addCriterion("investor_type <>", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeGreaterThan(String value) {
            addCriterion("investor_type >", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("investor_type >=", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeLessThan(String value) {
            addCriterion("investor_type <", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeLessThanOrEqualTo(String value) {
            addCriterion("investor_type <=", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeLike(String value) {
            addCriterion("investor_type like", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeNotLike(String value) {
            addCriterion("investor_type not like", value, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeIn(List<String> values) {
            addCriterion("investor_type in", values, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeNotIn(List<String> values) {
            addCriterion("investor_type not in", values, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeBetween(String value1, String value2) {
            addCriterion("investor_type between", value1, value2, "investorType");
            return (Criteria) this;
        }

        public Criteria andInvestorTypeNotBetween(String value1, String value2) {
            addCriterion("investor_type not between", value1, value2, "investorType");
            return (Criteria) this;
        }

        public Criteria andReservationTimeIsNull() {
            addCriterion("reservation_time is null");
            return (Criteria) this;
        }

        public Criteria andReservationTimeIsNotNull() {
            addCriterion("reservation_time is not null");
            return (Criteria) this;
        }

        public Criteria andReservationTimeEqualTo(Date value) {
            addCriterion("reservation_time =", value, "reservationTime");
            return (Criteria) this;
        }

        public Criteria andReservationTimeNotEqualTo(Date value) {
            addCriterion("reservation_time <>", value, "reservationTime");
            return (Criteria) this;
        }

        public Criteria andReservationTimeGreaterThan(Date value) {
            addCriterion("reservation_time >", value, "reservationTime");
            return (Criteria) this;
        }

        public Criteria andReservationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reservation_time >=", value, "reservationTime");
            return (Criteria) this;
        }

        public Criteria andReservationTimeLessThan(Date value) {
            addCriterion("reservation_time <", value, "reservationTime");
            return (Criteria) this;
        }

        public Criteria andReservationTimeLessThanOrEqualTo(Date value) {
            addCriterion("reservation_time <=", value, "reservationTime");
            return (Criteria) this;
        }

        public Criteria andReservationTimeIn(List<Date> values) {
            addCriterion("reservation_time in", values, "reservationTime");
            return (Criteria) this;
        }

        public Criteria andReservationTimeNotIn(List<Date> values) {
            addCriterion("reservation_time not in", values, "reservationTime");
            return (Criteria) this;
        }

        public Criteria andReservationTimeBetween(Date value1, Date value2) {
            addCriterion("reservation_time between", value1, value2, "reservationTime");
            return (Criteria) this;
        }

        public Criteria andReservationTimeNotBetween(Date value1, Date value2) {
            addCriterion("reservation_time not between", value1, value2, "reservationTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeIsNull() {
            addCriterion("sign_up_time is null");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeIsNotNull() {
            addCriterion("sign_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeEqualTo(Date value) {
            addCriterion("sign_up_time =", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeNotEqualTo(Date value) {
            addCriterion("sign_up_time <>", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeGreaterThan(Date value) {
            addCriterion("sign_up_time >", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_up_time >=", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeLessThan(Date value) {
            addCriterion("sign_up_time <", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_up_time <=", value, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeIn(List<Date> values) {
            addCriterion("sign_up_time in", values, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeNotIn(List<Date> values) {
            addCriterion("sign_up_time not in", values, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeBetween(Date value1, Date value2) {
            addCriterion("sign_up_time between", value1, value2, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andSignUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_up_time not between", value1, value2, "signUpTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIsNull() {
            addCriterion("examine_time is null");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIsNotNull() {
            addCriterion("examine_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamineTimeEqualTo(Date value) {
            addCriterion("examine_time =", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotEqualTo(Date value) {
            addCriterion("examine_time <>", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeGreaterThan(Date value) {
            addCriterion("examine_time >", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("examine_time >=", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLessThan(Date value) {
            addCriterion("examine_time <", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLessThanOrEqualTo(Date value) {
            addCriterion("examine_time <=", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIn(List<Date> values) {
            addCriterion("examine_time in", values, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotIn(List<Date> values) {
            addCriterion("examine_time not in", values, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeBetween(Date value1, Date value2) {
            addCriterion("examine_time between", value1, value2, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotBetween(Date value1, Date value2) {
            addCriterion("examine_time not between", value1, value2, "examineTime");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionIsNull() {
            addCriterion("person_introduction is null");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionIsNotNull() {
            addCriterion("person_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionEqualTo(String value) {
            addCriterion("person_introduction =", value, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionNotEqualTo(String value) {
            addCriterion("person_introduction <>", value, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionGreaterThan(String value) {
            addCriterion("person_introduction >", value, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("person_introduction >=", value, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionLessThan(String value) {
            addCriterion("person_introduction <", value, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionLessThanOrEqualTo(String value) {
            addCriterion("person_introduction <=", value, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionLike(String value) {
            addCriterion("person_introduction like", value, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionNotLike(String value) {
            addCriterion("person_introduction not like", value, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionIn(List<String> values) {
            addCriterion("person_introduction in", values, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionNotIn(List<String> values) {
            addCriterion("person_introduction not in", values, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionBetween(String value1, String value2) {
            addCriterion("person_introduction between", value1, value2, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andPersonIntroductionNotBetween(String value1, String value2) {
            addCriterion("person_introduction not between", value1, value2, "personIntroduction");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusIsNull() {
            addCriterion("sms_invitation_status is null");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusIsNotNull() {
            addCriterion("sms_invitation_status is not null");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusEqualTo(String value) {
            addCriterion("sms_invitation_status =", value, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusNotEqualTo(String value) {
            addCriterion("sms_invitation_status <>", value, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusGreaterThan(String value) {
            addCriterion("sms_invitation_status >", value, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sms_invitation_status >=", value, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusLessThan(String value) {
            addCriterion("sms_invitation_status <", value, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusLessThanOrEqualTo(String value) {
            addCriterion("sms_invitation_status <=", value, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusLike(String value) {
            addCriterion("sms_invitation_status like", value, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusNotLike(String value) {
            addCriterion("sms_invitation_status not like", value, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusIn(List<String> values) {
            addCriterion("sms_invitation_status in", values, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusNotIn(List<String> values) {
            addCriterion("sms_invitation_status not in", values, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusBetween(String value1, String value2) {
            addCriterion("sms_invitation_status between", value1, value2, "smsInvitationStatus");
            return (Criteria) this;
        }

        public Criteria andSmsInvitationStatusNotBetween(String value1, String value2) {
            addCriterion("sms_invitation_status not between", value1, value2, "smsInvitationStatus");
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