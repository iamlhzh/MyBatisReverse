package com.stock.accelerator.web.entity;

import java.io.Serializable;

public class AppActivityNoticeLogWithBLOBs extends AppActivityNoticeLog implements Serializable {
    private String receivePerson;

    private String ccPerson;

    private String content;

    private static final long serialVersionUID = 1L;

    public String getReceivePerson() {
        return receivePerson;
    }

    public void setReceivePerson(String receivePerson) {
        this.receivePerson = receivePerson == null ? null : receivePerson.trim();
    }

    public String getCcPerson() {
        return ccPerson;
    }

    public void setCcPerson(String ccPerson) {
        this.ccPerson = ccPerson == null ? null : ccPerson.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}