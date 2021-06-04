package com.stock.accelerator.web.entity;

import java.io.Serializable;
import java.util.Date;

public class AppActivityInteractQuestion implements Serializable {
    private String id;

    private String activityId;

    private String companyCode;

    private String companySortName;

    private String questionUser;

    private String questionUserId;

    private Date pubDate;

    private Date questionTime;

    private Date questionObjectId;

    private Date questionObjectName;

    private Date questionObjectIdentity;

    private String questionFrom;

    private String questionType;

    private String status;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String question;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId == null ? null : activityId.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getCompanySortName() {
        return companySortName;
    }

    public void setCompanySortName(String companySortName) {
        this.companySortName = companySortName == null ? null : companySortName.trim();
    }

    public String getQuestionUser() {
        return questionUser;
    }

    public void setQuestionUser(String questionUser) {
        this.questionUser = questionUser == null ? null : questionUser.trim();
    }

    public String getQuestionUserId() {
        return questionUserId;
    }

    public void setQuestionUserId(String questionUserId) {
        this.questionUserId = questionUserId == null ? null : questionUserId.trim();
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Date getQuestionTime() {
        return questionTime;
    }

    public void setQuestionTime(Date questionTime) {
        this.questionTime = questionTime;
    }

    public Date getQuestionObjectId() {
        return questionObjectId;
    }

    public void setQuestionObjectId(Date questionObjectId) {
        this.questionObjectId = questionObjectId;
    }

    public Date getQuestionObjectName() {
        return questionObjectName;
    }

    public void setQuestionObjectName(Date questionObjectName) {
        this.questionObjectName = questionObjectName;
    }

    public Date getQuestionObjectIdentity() {
        return questionObjectIdentity;
    }

    public void setQuestionObjectIdentity(Date questionObjectIdentity) {
        this.questionObjectIdentity = questionObjectIdentity;
    }

    public String getQuestionFrom() {
        return questionFrom;
    }

    public void setQuestionFrom(String questionFrom) {
        this.questionFrom = questionFrom == null ? null : questionFrom.trim();
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType == null ? null : questionType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }
}