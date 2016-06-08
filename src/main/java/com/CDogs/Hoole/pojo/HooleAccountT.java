package com.CDogs.Hoole.pojo;

import java.util.Date;

public class HooleAccountT {
    private Integer personId;

    private String personEmail;

    private String personPhone;

    private String personState;

    private Date personCreateTime;

    private Date personLastTime;

    private String personSchool;

    private String personAddress;

    private String personSex;

    private Date personBirthdate;

    private String personConstellation;

    private String personSignature;

    private Short personAge;

    private String personCompany;

    private Integer personGrade;

    private Integer personIntegration;

    private String personPostcode;

    private String personNickname;

    private String personPortrait;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail == null ? null : personEmail.trim();
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone == null ? null : personPhone.trim();
    }

    public String getPersonState() {
        return personState;
    }

    public void setPersonState(String personState) {
        this.personState = personState == null ? null : personState.trim();
    }

    public Date getPersonCreateTime() {
        return personCreateTime;
    }

    public void setPersonCreateTime(Date personCreateTime) {
        this.personCreateTime = personCreateTime;
    }

    public Date getPersonLastTime() {
        return personLastTime;
    }

    public void setPersonLastTime(Date personLastTime) {
        this.personLastTime = personLastTime;
    }

    public String getPersonSchool() {
        return personSchool;
    }

    public void setPersonSchool(String personSchool) {
        this.personSchool = personSchool == null ? null : personSchool.trim();
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress == null ? null : personAddress.trim();
    }

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex == null ? null : personSex.trim();
    }

    public Date getPersonBirthdate() {
        return personBirthdate;
    }

    public void setPersonBirthdate(Date personBirthdate) {
        this.personBirthdate = personBirthdate;
    }

    public String getPersonConstellation() {
        return personConstellation;
    }

    public void setPersonConstellation(String personConstellation) {
        this.personConstellation = personConstellation == null ? null : personConstellation.trim();
    }

    public String getPersonSignature() {
        return personSignature;
    }

    public void setPersonSignature(String personSignature) {
        this.personSignature = personSignature == null ? null : personSignature.trim();
    }

    public Short getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Short personAge) {
        this.personAge = personAge;
    }

    public String getPersonCompany() {
        return personCompany;
    }

    public void setPersonCompany(String personCompany) {
        this.personCompany = personCompany == null ? null : personCompany.trim();
    }

    public Integer getPersonGrade() {
        return personGrade;
    }

    public void setPersonGrade(Integer personGrade) {
        this.personGrade = personGrade;
    }

    public Integer getPersonIntegration() {
        return personIntegration;
    }

    public void setPersonIntegration(Integer personIntegration) {
        this.personIntegration = personIntegration;
    }

    public String getPersonPostcode() {
        return personPostcode;
    }

    public void setPersonPostcode(String personPostcode) {
        this.personPostcode = personPostcode == null ? null : personPostcode.trim();
    }

    public String getPersonNickname() {
        return personNickname;
    }

    public void setPersonNickname(String personNickname) {
        this.personNickname = personNickname == null ? null : personNickname.trim();
    }

    public String getPersonPortrait() {
        return personPortrait;
    }

    public void setPersonPortrait(String personPortrait) {
        this.personPortrait = personPortrait == null ? null : personPortrait.trim();
    }
}