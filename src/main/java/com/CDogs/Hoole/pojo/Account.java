package com.CDogs.Hoole.pojo;

import com.CDogs.Hoole.Util.JsonDateFormat;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.Date;

public class Account {
    private Long id;

    private String email;

    private String phone;

    private String nickname;

    @JsonSerialize(using = JsonDateFormat.class)
    private Date createTime;

    @JsonSerialize(using = JsonDateFormat.class)
    private Date lastLoginTime;

    private String gender;

    private String state;

    private String school;

    private String bindEmail;

    private String bindPhone;

    private String accountNum;

    private String password;

    private String portrait;

    private String address;

    @JsonSerialize(using = JsonDateFormat.class)
    private Date birthday;

    private String postcode;

    private Integer grade;

    private Integer integration;

    private String company;

    private String signature;

    private String constellation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getBindEmail() {
        return bindEmail;
    }

    public void setBindEmail(String bindEmail) {
        this.bindEmail = bindEmail == null ? null : bindEmail.trim();
    }

    public String getBindPhone() {
        return bindPhone;
    }

    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone == null ? null : bindPhone.trim();
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum == null ? null : accountNum.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? null : constellation.trim();
    }

    public String toString(){
        return "account [id=" + id + ", email=" + email + ", phone" + phone + ", nickname" + nickname + ", createTime" + createTime
                + ", lastLoginTime" + lastLoginTime + ", gender" + gender + ", state" + state + ", school" + school + ", bindEmail"
                + bindEmail + ", bindPhone" + bindPhone + ", accountNum" + accountNum + ", portrait" + portrait + ", address" + address
                + ", birthday" + birthday + ", postcode" + postcode + ", grade" + grade + ", integration" + integration
                + ", company" + company + ", signature" + signature + ", constellation" + constellation + "]";
    }
}