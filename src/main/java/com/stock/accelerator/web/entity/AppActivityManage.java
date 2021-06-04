package com.stock.accelerator.web.entity;

import java.io.Serializable;
import java.util.Date;

public class AppActivityManage implements Serializable {
    private String id;

    private String companyInfo;

    private String activityTitle;

    private String businessType;

    private Date conveneDate;

    private Date conveneStart;

    private Date conveneEnd;

    private String activityAddress;

    private String activityJoinType;

    private String h5Type;

    private String cloudMeetingStatus;

    private String cloudMeetingLiveStatus;

    private String interactQaStatus;

    private String guestStatus;

    private String h5InvitationStatus;

    private String fileStatus;

    private String promiseSignStatus;

    private String agendaPromiseStatus;

    private String filePromiseStatus;

    private String companyIntroduceStatus;

    private String agendaStatus;

    private String isPublish;

    private String sendMessageStatus;

    private String meetingStatus;

    private Date agendaStart;

    private String cloudMeetingId;

    private String signatureId;

    private String companyCode;

    private String companyId;

    private String relaCode;

    private String personId;

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

    public String getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(String companyInfo) {
        this.companyInfo = companyInfo == null ? null : companyInfo.trim();
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public Date getConveneDate() {
        return conveneDate;
    }

    public void setConveneDate(Date conveneDate) {
        this.conveneDate = conveneDate;
    }

    public Date getConveneStart() {
        return conveneStart;
    }

    public void setConveneStart(Date conveneStart) {
        this.conveneStart = conveneStart;
    }

    public Date getConveneEnd() {
        return conveneEnd;
    }

    public void setConveneEnd(Date conveneEnd) {
        this.conveneEnd = conveneEnd;
    }

    public String getActivityAddress() {
        return activityAddress;
    }

    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress == null ? null : activityAddress.trim();
    }

    public String getActivityJoinType() {
        return activityJoinType;
    }

    public void setActivityJoinType(String activityJoinType) {
        this.activityJoinType = activityJoinType == null ? null : activityJoinType.trim();
    }

    public String getH5Type() {
        return h5Type;
    }

    public void setH5Type(String h5Type) {
        this.h5Type = h5Type == null ? null : h5Type.trim();
    }

    public String getCloudMeetingStatus() {
        return cloudMeetingStatus;
    }

    public void setCloudMeetingStatus(String cloudMeetingStatus) {
        this.cloudMeetingStatus = cloudMeetingStatus == null ? null : cloudMeetingStatus.trim();
    }

    public String getCloudMeetingLiveStatus() {
        return cloudMeetingLiveStatus;
    }

    public void setCloudMeetingLiveStatus(String cloudMeetingLiveStatus) {
        this.cloudMeetingLiveStatus = cloudMeetingLiveStatus == null ? null : cloudMeetingLiveStatus.trim();
    }

    public String getInteractQaStatus() {
        return interactQaStatus;
    }

    public void setInteractQaStatus(String interactQaStatus) {
        this.interactQaStatus = interactQaStatus == null ? null : interactQaStatus.trim();
    }

    public String getGuestStatus() {
        return guestStatus;
    }

    public void setGuestStatus(String guestStatus) {
        this.guestStatus = guestStatus == null ? null : guestStatus.trim();
    }

    public String getH5InvitationStatus() {
        return h5InvitationStatus;
    }

    public void setH5InvitationStatus(String h5InvitationStatus) {
        this.h5InvitationStatus = h5InvitationStatus == null ? null : h5InvitationStatus.trim();
    }

    public String getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus == null ? null : fileStatus.trim();
    }

    public String getPromiseSignStatus() {
        return promiseSignStatus;
    }

    public void setPromiseSignStatus(String promiseSignStatus) {
        this.promiseSignStatus = promiseSignStatus == null ? null : promiseSignStatus.trim();
    }

    public String getAgendaPromiseStatus() {
        return agendaPromiseStatus;
    }

    public void setAgendaPromiseStatus(String agendaPromiseStatus) {
        this.agendaPromiseStatus = agendaPromiseStatus == null ? null : agendaPromiseStatus.trim();
    }

    public String getFilePromiseStatus() {
        return filePromiseStatus;
    }

    public void setFilePromiseStatus(String filePromiseStatus) {
        this.filePromiseStatus = filePromiseStatus == null ? null : filePromiseStatus.trim();
    }

    public String getCompanyIntroduceStatus() {
        return companyIntroduceStatus;
    }

    public void setCompanyIntroduceStatus(String companyIntroduceStatus) {
        this.companyIntroduceStatus = companyIntroduceStatus == null ? null : companyIntroduceStatus.trim();
    }

    public String getAgendaStatus() {
        return agendaStatus;
    }

    public void setAgendaStatus(String agendaStatus) {
        this.agendaStatus = agendaStatus == null ? null : agendaStatus.trim();
    }

    public String getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(String isPublish) {
        this.isPublish = isPublish == null ? null : isPublish.trim();
    }

    public String getSendMessageStatus() {
        return sendMessageStatus;
    }

    public void setSendMessageStatus(String sendMessageStatus) {
        this.sendMessageStatus = sendMessageStatus == null ? null : sendMessageStatus.trim();
    }

    public String getMeetingStatus() {
        return meetingStatus;
    }

    public void setMeetingStatus(String meetingStatus) {
        this.meetingStatus = meetingStatus == null ? null : meetingStatus.trim();
    }

    public Date getAgendaStart() {
        return agendaStart;
    }

    public void setAgendaStart(Date agendaStart) {
        this.agendaStart = agendaStart;
    }

    public String getCloudMeetingId() {
        return cloudMeetingId;
    }

    public void setCloudMeetingId(String cloudMeetingId) {
        this.cloudMeetingId = cloudMeetingId == null ? null : cloudMeetingId.trim();
    }

    public String getSignatureId() {
        return signatureId;
    }

    public void setSignatureId(String signatureId) {
        this.signatureId = signatureId == null ? null : signatureId.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getRelaCode() {
        return relaCode;
    }

    public void setRelaCode(String relaCode) {
        this.relaCode = relaCode == null ? null : relaCode.trim();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
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