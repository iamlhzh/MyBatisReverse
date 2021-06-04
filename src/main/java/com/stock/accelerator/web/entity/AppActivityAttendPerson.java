package com.stock.accelerator.web.entity;

import java.io.Serializable;
import java.util.Date;

public class AppActivityAttendPerson implements Serializable {
    private String id;

    private String activityId;

    private String personId;

    private String userId;

    private String personName;

    private String jobName;

    private String companyCode;

    private String companyName;

    private String personSource;

    private String personTelephone;

    private String guestId;

    private String imformationStatus;

    private String reservationStatus;

    private String signUpStatus;

    private String promiseStatus;

    private String attendStatus;

    private String absenceReason;

    private String attendCloudMeeting;

    private String attendInteractQa;

    private String investorType;

    private Date reservationTime;

    private Date signUpTime;

    private Date examineTime;

    private String personIntroduction;

    private String smsInvitationStatus;

    private Integer sort;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String status;

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

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getPersonSource() {
        return personSource;
    }

    public void setPersonSource(String personSource) {
        this.personSource = personSource == null ? null : personSource.trim();
    }

    public String getPersonTelephone() {
        return personTelephone;
    }

    public void setPersonTelephone(String personTelephone) {
        this.personTelephone = personTelephone == null ? null : personTelephone.trim();
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId == null ? null : guestId.trim();
    }

    public String getImformationStatus() {
        return imformationStatus;
    }

    public void setImformationStatus(String imformationStatus) {
        this.imformationStatus = imformationStatus == null ? null : imformationStatus.trim();
    }

    public String getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(String reservationStatus) {
        this.reservationStatus = reservationStatus == null ? null : reservationStatus.trim();
    }

    public String getSignUpStatus() {
        return signUpStatus;
    }

    public void setSignUpStatus(String signUpStatus) {
        this.signUpStatus = signUpStatus == null ? null : signUpStatus.trim();
    }

    public String getPromiseStatus() {
        return promiseStatus;
    }

    public void setPromiseStatus(String promiseStatus) {
        this.promiseStatus = promiseStatus == null ? null : promiseStatus.trim();
    }

    public String getAttendStatus() {
        return attendStatus;
    }

    public void setAttendStatus(String attendStatus) {
        this.attendStatus = attendStatus == null ? null : attendStatus.trim();
    }

    public String getAbsenceReason() {
        return absenceReason;
    }

    public void setAbsenceReason(String absenceReason) {
        this.absenceReason = absenceReason == null ? null : absenceReason.trim();
    }

    public String getAttendCloudMeeting() {
        return attendCloudMeeting;
    }

    public void setAttendCloudMeeting(String attendCloudMeeting) {
        this.attendCloudMeeting = attendCloudMeeting == null ? null : attendCloudMeeting.trim();
    }

    public String getAttendInteractQa() {
        return attendInteractQa;
    }

    public void setAttendInteractQa(String attendInteractQa) {
        this.attendInteractQa = attendInteractQa == null ? null : attendInteractQa.trim();
    }

    public String getInvestorType() {
        return investorType;
    }

    public void setInvestorType(String investorType) {
        this.investorType = investorType == null ? null : investorType.trim();
    }

    public Date getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(Date reservationTime) {
        this.reservationTime = reservationTime;
    }

    public Date getSignUpTime() {
        return signUpTime;
    }

    public void setSignUpTime(Date signUpTime) {
        this.signUpTime = signUpTime;
    }

    public Date getExamineTime() {
        return examineTime;
    }

    public void setExamineTime(Date examineTime) {
        this.examineTime = examineTime;
    }

    public String getPersonIntroduction() {
        return personIntroduction;
    }

    public void setPersonIntroduction(String personIntroduction) {
        this.personIntroduction = personIntroduction == null ? null : personIntroduction.trim();
    }

    public String getSmsInvitationStatus() {
        return smsInvitationStatus;
    }

    public void setSmsInvitationStatus(String smsInvitationStatus) {
        this.smsInvitationStatus = smsInvitationStatus == null ? null : smsInvitationStatus.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}