package com.stock.accelerator.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppActivityInteractQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppActivityInteractQuestionExample() {
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

        public Criteria andCompanySortNameIsNull() {
            addCriterion("company_sort_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameIsNotNull() {
            addCriterion("company_sort_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameEqualTo(String value) {
            addCriterion("company_sort_name =", value, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameNotEqualTo(String value) {
            addCriterion("company_sort_name <>", value, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameGreaterThan(String value) {
            addCriterion("company_sort_name >", value, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_sort_name >=", value, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameLessThan(String value) {
            addCriterion("company_sort_name <", value, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameLessThanOrEqualTo(String value) {
            addCriterion("company_sort_name <=", value, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameLike(String value) {
            addCriterion("company_sort_name like", value, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameNotLike(String value) {
            addCriterion("company_sort_name not like", value, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameIn(List<String> values) {
            addCriterion("company_sort_name in", values, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameNotIn(List<String> values) {
            addCriterion("company_sort_name not in", values, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameBetween(String value1, String value2) {
            addCriterion("company_sort_name between", value1, value2, "companySortName");
            return (Criteria) this;
        }

        public Criteria andCompanySortNameNotBetween(String value1, String value2) {
            addCriterion("company_sort_name not between", value1, value2, "companySortName");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIsNull() {
            addCriterion("question_user is null");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIsNotNull() {
            addCriterion("question_user is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionUserEqualTo(String value) {
            addCriterion("question_user =", value, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserNotEqualTo(String value) {
            addCriterion("question_user <>", value, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserGreaterThan(String value) {
            addCriterion("question_user >", value, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserGreaterThanOrEqualTo(String value) {
            addCriterion("question_user >=", value, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserLessThan(String value) {
            addCriterion("question_user <", value, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserLessThanOrEqualTo(String value) {
            addCriterion("question_user <=", value, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserLike(String value) {
            addCriterion("question_user like", value, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserNotLike(String value) {
            addCriterion("question_user not like", value, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIn(List<String> values) {
            addCriterion("question_user in", values, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserNotIn(List<String> values) {
            addCriterion("question_user not in", values, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserBetween(String value1, String value2) {
            addCriterion("question_user between", value1, value2, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserNotBetween(String value1, String value2) {
            addCriterion("question_user not between", value1, value2, "questionUser");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdIsNull() {
            addCriterion("question_user_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdIsNotNull() {
            addCriterion("question_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdEqualTo(String value) {
            addCriterion("question_user_id =", value, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdNotEqualTo(String value) {
            addCriterion("question_user_id <>", value, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdGreaterThan(String value) {
            addCriterion("question_user_id >", value, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("question_user_id >=", value, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdLessThan(String value) {
            addCriterion("question_user_id <", value, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdLessThanOrEqualTo(String value) {
            addCriterion("question_user_id <=", value, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdLike(String value) {
            addCriterion("question_user_id like", value, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdNotLike(String value) {
            addCriterion("question_user_id not like", value, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdIn(List<String> values) {
            addCriterion("question_user_id in", values, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdNotIn(List<String> values) {
            addCriterion("question_user_id not in", values, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdBetween(String value1, String value2) {
            addCriterion("question_user_id between", value1, value2, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andQuestionUserIdNotBetween(String value1, String value2) {
            addCriterion("question_user_id not between", value1, value2, "questionUserId");
            return (Criteria) this;
        }

        public Criteria andPubDateIsNull() {
            addCriterion("pub_date is null");
            return (Criteria) this;
        }

        public Criteria andPubDateIsNotNull() {
            addCriterion("pub_date is not null");
            return (Criteria) this;
        }

        public Criteria andPubDateEqualTo(Date value) {
            addCriterion("pub_date =", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotEqualTo(Date value) {
            addCriterion("pub_date <>", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateGreaterThan(Date value) {
            addCriterion("pub_date >", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pub_date >=", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLessThan(Date value) {
            addCriterion("pub_date <", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateLessThanOrEqualTo(Date value) {
            addCriterion("pub_date <=", value, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateIn(List<Date> values) {
            addCriterion("pub_date in", values, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotIn(List<Date> values) {
            addCriterion("pub_date not in", values, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateBetween(Date value1, Date value2) {
            addCriterion("pub_date between", value1, value2, "pubDate");
            return (Criteria) this;
        }

        public Criteria andPubDateNotBetween(Date value1, Date value2) {
            addCriterion("pub_date not between", value1, value2, "pubDate");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIsNull() {
            addCriterion("question_time is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIsNotNull() {
            addCriterion("question_time is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeEqualTo(Date value) {
            addCriterion("question_time =", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotEqualTo(Date value) {
            addCriterion("question_time <>", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeGreaterThan(Date value) {
            addCriterion("question_time >", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("question_time >=", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLessThan(Date value) {
            addCriterion("question_time <", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLessThanOrEqualTo(Date value) {
            addCriterion("question_time <=", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIn(List<Date> values) {
            addCriterion("question_time in", values, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotIn(List<Date> values) {
            addCriterion("question_time not in", values, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeBetween(Date value1, Date value2) {
            addCriterion("question_time between", value1, value2, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotBetween(Date value1, Date value2) {
            addCriterion("question_time not between", value1, value2, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdIsNull() {
            addCriterion("question_object_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdIsNotNull() {
            addCriterion("question_object_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdEqualTo(Date value) {
            addCriterion("question_object_id =", value, "questionObjectId");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdNotEqualTo(Date value) {
            addCriterion("question_object_id <>", value, "questionObjectId");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdGreaterThan(Date value) {
            addCriterion("question_object_id >", value, "questionObjectId");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdGreaterThanOrEqualTo(Date value) {
            addCriterion("question_object_id >=", value, "questionObjectId");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdLessThan(Date value) {
            addCriterion("question_object_id <", value, "questionObjectId");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdLessThanOrEqualTo(Date value) {
            addCriterion("question_object_id <=", value, "questionObjectId");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdIn(List<Date> values) {
            addCriterion("question_object_id in", values, "questionObjectId");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdNotIn(List<Date> values) {
            addCriterion("question_object_id not in", values, "questionObjectId");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdBetween(Date value1, Date value2) {
            addCriterion("question_object_id between", value1, value2, "questionObjectId");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdNotBetween(Date value1, Date value2) {
            addCriterion("question_object_id not between", value1, value2, "questionObjectId");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameIsNull() {
            addCriterion("question_object_name is null");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameIsNotNull() {
            addCriterion("question_object_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameEqualTo(Date value) {
            addCriterion("question_object_name =", value, "questionObjectName");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameNotEqualTo(Date value) {
            addCriterion("question_object_name <>", value, "questionObjectName");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameGreaterThan(Date value) {
            addCriterion("question_object_name >", value, "questionObjectName");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameGreaterThanOrEqualTo(Date value) {
            addCriterion("question_object_name >=", value, "questionObjectName");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameLessThan(Date value) {
            addCriterion("question_object_name <", value, "questionObjectName");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameLessThanOrEqualTo(Date value) {
            addCriterion("question_object_name <=", value, "questionObjectName");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameIn(List<Date> values) {
            addCriterion("question_object_name in", values, "questionObjectName");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameNotIn(List<Date> values) {
            addCriterion("question_object_name not in", values, "questionObjectName");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameBetween(Date value1, Date value2) {
            addCriterion("question_object_name between", value1, value2, "questionObjectName");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectNameNotBetween(Date value1, Date value2) {
            addCriterion("question_object_name not between", value1, value2, "questionObjectName");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityIsNull() {
            addCriterion("question_object_identity is null");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityIsNotNull() {
            addCriterion("question_object_identity is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityEqualTo(Date value) {
            addCriterion("question_object_identity =", value, "questionObjectIdentity");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityNotEqualTo(Date value) {
            addCriterion("question_object_identity <>", value, "questionObjectIdentity");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityGreaterThan(Date value) {
            addCriterion("question_object_identity >", value, "questionObjectIdentity");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityGreaterThanOrEqualTo(Date value) {
            addCriterion("question_object_identity >=", value, "questionObjectIdentity");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityLessThan(Date value) {
            addCriterion("question_object_identity <", value, "questionObjectIdentity");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityLessThanOrEqualTo(Date value) {
            addCriterion("question_object_identity <=", value, "questionObjectIdentity");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityIn(List<Date> values) {
            addCriterion("question_object_identity in", values, "questionObjectIdentity");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityNotIn(List<Date> values) {
            addCriterion("question_object_identity not in", values, "questionObjectIdentity");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityBetween(Date value1, Date value2) {
            addCriterion("question_object_identity between", value1, value2, "questionObjectIdentity");
            return (Criteria) this;
        }

        public Criteria andQuestionObjectIdentityNotBetween(Date value1, Date value2) {
            addCriterion("question_object_identity not between", value1, value2, "questionObjectIdentity");
            return (Criteria) this;
        }

        public Criteria andQuestionFromIsNull() {
            addCriterion("question_from is null");
            return (Criteria) this;
        }

        public Criteria andQuestionFromIsNotNull() {
            addCriterion("question_from is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionFromEqualTo(String value) {
            addCriterion("question_from =", value, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromNotEqualTo(String value) {
            addCriterion("question_from <>", value, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromGreaterThan(String value) {
            addCriterion("question_from >", value, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromGreaterThanOrEqualTo(String value) {
            addCriterion("question_from >=", value, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromLessThan(String value) {
            addCriterion("question_from <", value, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromLessThanOrEqualTo(String value) {
            addCriterion("question_from <=", value, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromLike(String value) {
            addCriterion("question_from like", value, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromNotLike(String value) {
            addCriterion("question_from not like", value, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromIn(List<String> values) {
            addCriterion("question_from in", values, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromNotIn(List<String> values) {
            addCriterion("question_from not in", values, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromBetween(String value1, String value2) {
            addCriterion("question_from between", value1, value2, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionFromNotBetween(String value1, String value2) {
            addCriterion("question_from not between", value1, value2, "questionFrom");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNull() {
            addCriterion("question_type is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNotNull() {
            addCriterion("question_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeEqualTo(String value) {
            addCriterion("question_type =", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotEqualTo(String value) {
            addCriterion("question_type <>", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThan(String value) {
            addCriterion("question_type >", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("question_type >=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThan(String value) {
            addCriterion("question_type <", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThanOrEqualTo(String value) {
            addCriterion("question_type <=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLike(String value) {
            addCriterion("question_type like", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotLike(String value) {
            addCriterion("question_type not like", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIn(List<String> values) {
            addCriterion("question_type in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotIn(List<String> values) {
            addCriterion("question_type not in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeBetween(String value1, String value2) {
            addCriterion("question_type between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotBetween(String value1, String value2) {
            addCriterion("question_type not between", value1, value2, "questionType");
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