package com.stock.accelerator.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppActivityMeetingAgendaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppActivityMeetingAgendaExample() {
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

        public Criteria andAgendaNameIsNull() {
            addCriterion("agenda_name is null");
            return (Criteria) this;
        }

        public Criteria andAgendaNameIsNotNull() {
            addCriterion("agenda_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgendaNameEqualTo(String value) {
            addCriterion("agenda_name =", value, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameNotEqualTo(String value) {
            addCriterion("agenda_name <>", value, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameGreaterThan(String value) {
            addCriterion("agenda_name >", value, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameGreaterThanOrEqualTo(String value) {
            addCriterion("agenda_name >=", value, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameLessThan(String value) {
            addCriterion("agenda_name <", value, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameLessThanOrEqualTo(String value) {
            addCriterion("agenda_name <=", value, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameLike(String value) {
            addCriterion("agenda_name like", value, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameNotLike(String value) {
            addCriterion("agenda_name not like", value, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameIn(List<String> values) {
            addCriterion("agenda_name in", values, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameNotIn(List<String> values) {
            addCriterion("agenda_name not in", values, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameBetween(String value1, String value2) {
            addCriterion("agenda_name between", value1, value2, "agendaName");
            return (Criteria) this;
        }

        public Criteria andAgendaNameNotBetween(String value1, String value2) {
            addCriterion("agenda_name not between", value1, value2, "agendaName");
            return (Criteria) this;
        }

        public Criteria andPlanStartIsNull() {
            addCriterion("plan_start is null");
            return (Criteria) this;
        }

        public Criteria andPlanStartIsNotNull() {
            addCriterion("plan_start is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStartEqualTo(Date value) {
            addCriterion("plan_start =", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartNotEqualTo(Date value) {
            addCriterion("plan_start <>", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartGreaterThan(Date value) {
            addCriterion("plan_start >", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_start >=", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartLessThan(Date value) {
            addCriterion("plan_start <", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartLessThanOrEqualTo(Date value) {
            addCriterion("plan_start <=", value, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartIn(List<Date> values) {
            addCriterion("plan_start in", values, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartNotIn(List<Date> values) {
            addCriterion("plan_start not in", values, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartBetween(Date value1, Date value2) {
            addCriterion("plan_start between", value1, value2, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanStartNotBetween(Date value1, Date value2) {
            addCriterion("plan_start not between", value1, value2, "planStart");
            return (Criteria) this;
        }

        public Criteria andPlanEndIsNull() {
            addCriterion("plan_end is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndIsNotNull() {
            addCriterion("plan_end is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndEqualTo(Date value) {
            addCriterion("plan_end =", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndNotEqualTo(Date value) {
            addCriterion("plan_end <>", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndGreaterThan(Date value) {
            addCriterion("plan_end >", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_end >=", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndLessThan(Date value) {
            addCriterion("plan_end <", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndLessThanOrEqualTo(Date value) {
            addCriterion("plan_end <=", value, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndIn(List<Date> values) {
            addCriterion("plan_end in", values, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndNotIn(List<Date> values) {
            addCriterion("plan_end not in", values, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndBetween(Date value1, Date value2) {
            addCriterion("plan_end between", value1, value2, "planEnd");
            return (Criteria) this;
        }

        public Criteria andPlanEndNotBetween(Date value1, Date value2) {
            addCriterion("plan_end not between", value1, value2, "planEnd");
            return (Criteria) this;
        }

        public Criteria andReportPersonIsNull() {
            addCriterion("report_person is null");
            return (Criteria) this;
        }

        public Criteria andReportPersonIsNotNull() {
            addCriterion("report_person is not null");
            return (Criteria) this;
        }

        public Criteria andReportPersonEqualTo(String value) {
            addCriterion("report_person =", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonNotEqualTo(String value) {
            addCriterion("report_person <>", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonGreaterThan(String value) {
            addCriterion("report_person >", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonGreaterThanOrEqualTo(String value) {
            addCriterion("report_person >=", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonLessThan(String value) {
            addCriterion("report_person <", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonLessThanOrEqualTo(String value) {
            addCriterion("report_person <=", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonLike(String value) {
            addCriterion("report_person like", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonNotLike(String value) {
            addCriterion("report_person not like", value, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonIn(List<String> values) {
            addCriterion("report_person in", values, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonNotIn(List<String> values) {
            addCriterion("report_person not in", values, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonBetween(String value1, String value2) {
            addCriterion("report_person between", value1, value2, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andReportPersonNotBetween(String value1, String value2) {
            addCriterion("report_person not between", value1, value2, "reportPerson");
            return (Criteria) this;
        }

        public Criteria andEndFlagIsNull() {
            addCriterion("end_flag is null");
            return (Criteria) this;
        }

        public Criteria andEndFlagIsNotNull() {
            addCriterion("end_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEndFlagEqualTo(String value) {
            addCriterion("end_flag =", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagNotEqualTo(String value) {
            addCriterion("end_flag <>", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagGreaterThan(String value) {
            addCriterion("end_flag >", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagGreaterThanOrEqualTo(String value) {
            addCriterion("end_flag >=", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagLessThan(String value) {
            addCriterion("end_flag <", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagLessThanOrEqualTo(String value) {
            addCriterion("end_flag <=", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagLike(String value) {
            addCriterion("end_flag like", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagNotLike(String value) {
            addCriterion("end_flag not like", value, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagIn(List<String> values) {
            addCriterion("end_flag in", values, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagNotIn(List<String> values) {
            addCriterion("end_flag not in", values, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagBetween(String value1, String value2) {
            addCriterion("end_flag between", value1, value2, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndFlagNotBetween(String value1, String value2) {
            addCriterion("end_flag not between", value1, value2, "endFlag");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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