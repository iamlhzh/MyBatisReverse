package com.stock.accelerator.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppActivityGuestPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppActivityGuestPersonExample() {
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

        public Criteria andHeadPortraitUrlIsNull() {
            addCriterion("head_portrait_url is null");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlIsNotNull() {
            addCriterion("head_portrait_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlEqualTo(String value) {
            addCriterion("head_portrait_url =", value, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlNotEqualTo(String value) {
            addCriterion("head_portrait_url <>", value, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlGreaterThan(String value) {
            addCriterion("head_portrait_url >", value, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("head_portrait_url >=", value, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlLessThan(String value) {
            addCriterion("head_portrait_url <", value, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlLessThanOrEqualTo(String value) {
            addCriterion("head_portrait_url <=", value, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlLike(String value) {
            addCriterion("head_portrait_url like", value, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlNotLike(String value) {
            addCriterion("head_portrait_url not like", value, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlIn(List<String> values) {
            addCriterion("head_portrait_url in", values, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlNotIn(List<String> values) {
            addCriterion("head_portrait_url not in", values, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlBetween(String value1, String value2) {
            addCriterion("head_portrait_url between", value1, value2, "headPortraitUrl");
            return (Criteria) this;
        }

        public Criteria andHeadPortraitUrlNotBetween(String value1, String value2) {
            addCriterion("head_portrait_url not between", value1, value2, "headPortraitUrl");
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