package com.CDogs.Hoole.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HooleAccountTExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HooleAccountTExample() {
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

        public Criteria andPersonIdIsNull() {
            addCriterion("person_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersonIdIsNotNull() {
            addCriterion("person_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIdEqualTo(Integer value) {
            addCriterion("person_ID =", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotEqualTo(Integer value) {
            addCriterion("person_ID <>", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThan(Integer value) {
            addCriterion("person_ID >", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_ID >=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThan(Integer value) {
            addCriterion("person_ID <", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("person_ID <=", value, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdIn(List<Integer> values) {
            addCriterion("person_ID in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotIn(List<Integer> values) {
            addCriterion("person_ID not in", values, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdBetween(Integer value1, Integer value2) {
            addCriterion("person_ID between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("person_ID not between", value1, value2, "personId");
            return (Criteria) this;
        }

        public Criteria andPersonEmailIsNull() {
            addCriterion("person_email is null");
            return (Criteria) this;
        }

        public Criteria andPersonEmailIsNotNull() {
            addCriterion("person_email is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEmailEqualTo(String value) {
            addCriterion("person_email =", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailNotEqualTo(String value) {
            addCriterion("person_email <>", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailGreaterThan(String value) {
            addCriterion("person_email >", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailGreaterThanOrEqualTo(String value) {
            addCriterion("person_email >=", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailLessThan(String value) {
            addCriterion("person_email <", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailLessThanOrEqualTo(String value) {
            addCriterion("person_email <=", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailLike(String value) {
            addCriterion("person_email like", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailNotLike(String value) {
            addCriterion("person_email not like", value, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailIn(List<String> values) {
            addCriterion("person_email in", values, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailNotIn(List<String> values) {
            addCriterion("person_email not in", values, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailBetween(String value1, String value2) {
            addCriterion("person_email between", value1, value2, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonEmailNotBetween(String value1, String value2) {
            addCriterion("person_email not between", value1, value2, "personEmail");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNull() {
            addCriterion("person_phone is null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNotNull() {
            addCriterion("person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneEqualTo(String value) {
            addCriterion("person_phone =", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotEqualTo(String value) {
            addCriterion("person_phone <>", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThan(String value) {
            addCriterion("person_phone >", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("person_phone >=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThan(String value) {
            addCriterion("person_phone <", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("person_phone <=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLike(String value) {
            addCriterion("person_phone like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotLike(String value) {
            addCriterion("person_phone not like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIn(List<String> values) {
            addCriterion("person_phone in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotIn(List<String> values) {
            addCriterion("person_phone not in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneBetween(String value1, String value2) {
            addCriterion("person_phone between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("person_phone not between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonStateIsNull() {
            addCriterion("person_state is null");
            return (Criteria) this;
        }

        public Criteria andPersonStateIsNotNull() {
            addCriterion("person_state is not null");
            return (Criteria) this;
        }

        public Criteria andPersonStateEqualTo(String value) {
            addCriterion("person_state =", value, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateNotEqualTo(String value) {
            addCriterion("person_state <>", value, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateGreaterThan(String value) {
            addCriterion("person_state >", value, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateGreaterThanOrEqualTo(String value) {
            addCriterion("person_state >=", value, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateLessThan(String value) {
            addCriterion("person_state <", value, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateLessThanOrEqualTo(String value) {
            addCriterion("person_state <=", value, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateLike(String value) {
            addCriterion("person_state like", value, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateNotLike(String value) {
            addCriterion("person_state not like", value, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateIn(List<String> values) {
            addCriterion("person_state in", values, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateNotIn(List<String> values) {
            addCriterion("person_state not in", values, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateBetween(String value1, String value2) {
            addCriterion("person_state between", value1, value2, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonStateNotBetween(String value1, String value2) {
            addCriterion("person_state not between", value1, value2, "personState");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeIsNull() {
            addCriterion("person_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeIsNotNull() {
            addCriterion("person_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeEqualTo(Date value) {
            addCriterion("person_create_time =", value, "personCreateTime");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeNotEqualTo(Date value) {
            addCriterion("person_create_time <>", value, "personCreateTime");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeGreaterThan(Date value) {
            addCriterion("person_create_time >", value, "personCreateTime");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("person_create_time >=", value, "personCreateTime");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeLessThan(Date value) {
            addCriterion("person_create_time <", value, "personCreateTime");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("person_create_time <=", value, "personCreateTime");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeIn(List<Date> values) {
            addCriterion("person_create_time in", values, "personCreateTime");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeNotIn(List<Date> values) {
            addCriterion("person_create_time not in", values, "personCreateTime");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeBetween(Date value1, Date value2) {
            addCriterion("person_create_time between", value1, value2, "personCreateTime");
            return (Criteria) this;
        }

        public Criteria andPersonCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("person_create_time not between", value1, value2, "personCreateTime");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeIsNull() {
            addCriterion("person_last_time is null");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeIsNotNull() {
            addCriterion("person_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeEqualTo(Date value) {
            addCriterion("person_last_time =", value, "personLastTime");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeNotEqualTo(Date value) {
            addCriterion("person_last_time <>", value, "personLastTime");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeGreaterThan(Date value) {
            addCriterion("person_last_time >", value, "personLastTime");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("person_last_time >=", value, "personLastTime");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeLessThan(Date value) {
            addCriterion("person_last_time <", value, "personLastTime");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("person_last_time <=", value, "personLastTime");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeIn(List<Date> values) {
            addCriterion("person_last_time in", values, "personLastTime");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeNotIn(List<Date> values) {
            addCriterion("person_last_time not in", values, "personLastTime");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeBetween(Date value1, Date value2) {
            addCriterion("person_last_time between", value1, value2, "personLastTime");
            return (Criteria) this;
        }

        public Criteria andPersonLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("person_last_time not between", value1, value2, "personLastTime");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolIsNull() {
            addCriterion("person_school is null");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolIsNotNull() {
            addCriterion("person_school is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolEqualTo(String value) {
            addCriterion("person_school =", value, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolNotEqualTo(String value) {
            addCriterion("person_school <>", value, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolGreaterThan(String value) {
            addCriterion("person_school >", value, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("person_school >=", value, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolLessThan(String value) {
            addCriterion("person_school <", value, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolLessThanOrEqualTo(String value) {
            addCriterion("person_school <=", value, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolLike(String value) {
            addCriterion("person_school like", value, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolNotLike(String value) {
            addCriterion("person_school not like", value, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolIn(List<String> values) {
            addCriterion("person_school in", values, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolNotIn(List<String> values) {
            addCriterion("person_school not in", values, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolBetween(String value1, String value2) {
            addCriterion("person_school between", value1, value2, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonSchoolNotBetween(String value1, String value2) {
            addCriterion("person_school not between", value1, value2, "personSchool");
            return (Criteria) this;
        }

        public Criteria andPersonAddressIsNull() {
            addCriterion("person_address is null");
            return (Criteria) this;
        }

        public Criteria andPersonAddressIsNotNull() {
            addCriterion("person_address is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAddressEqualTo(String value) {
            addCriterion("person_address =", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressNotEqualTo(String value) {
            addCriterion("person_address <>", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressGreaterThan(String value) {
            addCriterion("person_address >", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressGreaterThanOrEqualTo(String value) {
            addCriterion("person_address >=", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressLessThan(String value) {
            addCriterion("person_address <", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressLessThanOrEqualTo(String value) {
            addCriterion("person_address <=", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressLike(String value) {
            addCriterion("person_address like", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressNotLike(String value) {
            addCriterion("person_address not like", value, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressIn(List<String> values) {
            addCriterion("person_address in", values, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressNotIn(List<String> values) {
            addCriterion("person_address not in", values, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressBetween(String value1, String value2) {
            addCriterion("person_address between", value1, value2, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonAddressNotBetween(String value1, String value2) {
            addCriterion("person_address not between", value1, value2, "personAddress");
            return (Criteria) this;
        }

        public Criteria andPersonSexIsNull() {
            addCriterion("person_sex is null");
            return (Criteria) this;
        }

        public Criteria andPersonSexIsNotNull() {
            addCriterion("person_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSexEqualTo(String value) {
            addCriterion("person_sex =", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotEqualTo(String value) {
            addCriterion("person_sex <>", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexGreaterThan(String value) {
            addCriterion("person_sex >", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexGreaterThanOrEqualTo(String value) {
            addCriterion("person_sex >=", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLessThan(String value) {
            addCriterion("person_sex <", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLessThanOrEqualTo(String value) {
            addCriterion("person_sex <=", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexLike(String value) {
            addCriterion("person_sex like", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotLike(String value) {
            addCriterion("person_sex not like", value, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexIn(List<String> values) {
            addCriterion("person_sex in", values, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotIn(List<String> values) {
            addCriterion("person_sex not in", values, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexBetween(String value1, String value2) {
            addCriterion("person_sex between", value1, value2, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonSexNotBetween(String value1, String value2) {
            addCriterion("person_sex not between", value1, value2, "personSex");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayIsNull() {
            addCriterion("person_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayIsNotNull() {
            addCriterion("person_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayEqualTo(Date value) {
            addCriterion("person_birthday =", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayNotEqualTo(Date value) {
            addCriterion("person_birthday <>", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayGreaterThan(Date value) {
            addCriterion("person_birthday >", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("person_birthday >=", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayLessThan(Date value) {
            addCriterion("person_birthday <", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("person_birthday <=", value, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayIn(List<Date> values) {
            addCriterion("person_birthday in", values, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayNotIn(List<Date> values) {
            addCriterion("person_birthday not in", values, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayBetween(Date value1, Date value2) {
            addCriterion("person_birthday between", value1, value2, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("person_birthday not between", value1, value2, "personBirthday");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationIsNull() {
            addCriterion("person_constellation is null");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationIsNotNull() {
            addCriterion("person_constellation is not null");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationEqualTo(String value) {
            addCriterion("person_constellation =", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationNotEqualTo(String value) {
            addCriterion("person_constellation <>", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationGreaterThan(String value) {
            addCriterion("person_constellation >", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("person_constellation >=", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationLessThan(String value) {
            addCriterion("person_constellation <", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationLessThanOrEqualTo(String value) {
            addCriterion("person_constellation <=", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationLike(String value) {
            addCriterion("person_constellation like", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationNotLike(String value) {
            addCriterion("person_constellation not like", value, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationIn(List<String> values) {
            addCriterion("person_constellation in", values, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationNotIn(List<String> values) {
            addCriterion("person_constellation not in", values, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationBetween(String value1, String value2) {
            addCriterion("person_constellation between", value1, value2, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonConstellationNotBetween(String value1, String value2) {
            addCriterion("person_constellation not between", value1, value2, "personConstellation");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureIsNull() {
            addCriterion("person_signature is null");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureIsNotNull() {
            addCriterion("person_signature is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureEqualTo(String value) {
            addCriterion("person_signature =", value, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureNotEqualTo(String value) {
            addCriterion("person_signature <>", value, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureGreaterThan(String value) {
            addCriterion("person_signature >", value, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("person_signature >=", value, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureLessThan(String value) {
            addCriterion("person_signature <", value, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureLessThanOrEqualTo(String value) {
            addCriterion("person_signature <=", value, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureLike(String value) {
            addCriterion("person_signature like", value, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureNotLike(String value) {
            addCriterion("person_signature not like", value, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureIn(List<String> values) {
            addCriterion("person_signature in", values, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureNotIn(List<String> values) {
            addCriterion("person_signature not in", values, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureBetween(String value1, String value2) {
            addCriterion("person_signature between", value1, value2, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonSignatureNotBetween(String value1, String value2) {
            addCriterion("person_signature not between", value1, value2, "personSignature");
            return (Criteria) this;
        }

        public Criteria andPersonAgeIsNull() {
            addCriterion("person_age is null");
            return (Criteria) this;
        }

        public Criteria andPersonAgeIsNotNull() {
            addCriterion("person_age is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAgeEqualTo(Short value) {
            addCriterion("person_age =", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeNotEqualTo(Short value) {
            addCriterion("person_age <>", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeGreaterThan(Short value) {
            addCriterion("person_age >", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("person_age >=", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeLessThan(Short value) {
            addCriterion("person_age <", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeLessThanOrEqualTo(Short value) {
            addCriterion("person_age <=", value, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeIn(List<Short> values) {
            addCriterion("person_age in", values, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeNotIn(List<Short> values) {
            addCriterion("person_age not in", values, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeBetween(Short value1, Short value2) {
            addCriterion("person_age between", value1, value2, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonAgeNotBetween(Short value1, Short value2) {
            addCriterion("person_age not between", value1, value2, "personAge");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIsNull() {
            addCriterion("person_company is null");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIsNotNull() {
            addCriterion("person_company is not null");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyEqualTo(String value) {
            addCriterion("person_company =", value, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNotEqualTo(String value) {
            addCriterion("person_company <>", value, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyGreaterThan(String value) {
            addCriterion("person_company >", value, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("person_company >=", value, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyLessThan(String value) {
            addCriterion("person_company <", value, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyLessThanOrEqualTo(String value) {
            addCriterion("person_company <=", value, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyLike(String value) {
            addCriterion("person_company like", value, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNotLike(String value) {
            addCriterion("person_company not like", value, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyIn(List<String> values) {
            addCriterion("person_company in", values, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNotIn(List<String> values) {
            addCriterion("person_company not in", values, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyBetween(String value1, String value2) {
            addCriterion("person_company between", value1, value2, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonCompanyNotBetween(String value1, String value2) {
            addCriterion("person_company not between", value1, value2, "personCompany");
            return (Criteria) this;
        }

        public Criteria andPersonGradeIsNull() {
            addCriterion("person_grade is null");
            return (Criteria) this;
        }

        public Criteria andPersonGradeIsNotNull() {
            addCriterion("person_grade is not null");
            return (Criteria) this;
        }

        public Criteria andPersonGradeEqualTo(Integer value) {
            addCriterion("person_grade =", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeNotEqualTo(Integer value) {
            addCriterion("person_grade <>", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeGreaterThan(Integer value) {
            addCriterion("person_grade >", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_grade >=", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeLessThan(Integer value) {
            addCriterion("person_grade <", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeLessThanOrEqualTo(Integer value) {
            addCriterion("person_grade <=", value, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeIn(List<Integer> values) {
            addCriterion("person_grade in", values, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeNotIn(List<Integer> values) {
            addCriterion("person_grade not in", values, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeBetween(Integer value1, Integer value2) {
            addCriterion("person_grade between", value1, value2, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("person_grade not between", value1, value2, "personGrade");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationIsNull() {
            addCriterion("person_integration is null");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationIsNotNull() {
            addCriterion("person_integration is not null");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationEqualTo(Integer value) {
            addCriterion("person_integration =", value, "personIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationNotEqualTo(Integer value) {
            addCriterion("person_integration <>", value, "personIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationGreaterThan(Integer value) {
            addCriterion("person_integration >", value, "personIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_integration >=", value, "personIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationLessThan(Integer value) {
            addCriterion("person_integration <", value, "personIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationLessThanOrEqualTo(Integer value) {
            addCriterion("person_integration <=", value, "personIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationIn(List<Integer> values) {
            addCriterion("person_integration in", values, "personIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationNotIn(List<Integer> values) {
            addCriterion("person_integration not in", values, "personIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationBetween(Integer value1, Integer value2) {
            addCriterion("person_integration between", value1, value2, "personIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonIntegrationNotBetween(Integer value1, Integer value2) {
            addCriterion("person_integration not between", value1, value2, "personIntegration");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeIsNull() {
            addCriterion("person_postcode is null");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeIsNotNull() {
            addCriterion("person_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeEqualTo(String value) {
            addCriterion("person_postcode =", value, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeNotEqualTo(String value) {
            addCriterion("person_postcode <>", value, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeGreaterThan(String value) {
            addCriterion("person_postcode >", value, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("person_postcode >=", value, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeLessThan(String value) {
            addCriterion("person_postcode <", value, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeLessThanOrEqualTo(String value) {
            addCriterion("person_postcode <=", value, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeLike(String value) {
            addCriterion("person_postcode like", value, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeNotLike(String value) {
            addCriterion("person_postcode not like", value, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeIn(List<String> values) {
            addCriterion("person_postcode in", values, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeNotIn(List<String> values) {
            addCriterion("person_postcode not in", values, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeBetween(String value1, String value2) {
            addCriterion("person_postcode between", value1, value2, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonPostcodeNotBetween(String value1, String value2) {
            addCriterion("person_postcode not between", value1, value2, "personPostcode");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameIsNull() {
            addCriterion("person_nickname is null");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameIsNotNull() {
            addCriterion("person_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameEqualTo(String value) {
            addCriterion("person_nickname =", value, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameNotEqualTo(String value) {
            addCriterion("person_nickname <>", value, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameGreaterThan(String value) {
            addCriterion("person_nickname >", value, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("person_nickname >=", value, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameLessThan(String value) {
            addCriterion("person_nickname <", value, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameLessThanOrEqualTo(String value) {
            addCriterion("person_nickname <=", value, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameLike(String value) {
            addCriterion("person_nickname like", value, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameNotLike(String value) {
            addCriterion("person_nickname not like", value, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameIn(List<String> values) {
            addCriterion("person_nickname in", values, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameNotIn(List<String> values) {
            addCriterion("person_nickname not in", values, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameBetween(String value1, String value2) {
            addCriterion("person_nickname between", value1, value2, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonNicknameNotBetween(String value1, String value2) {
            addCriterion("person_nickname not between", value1, value2, "personNickname");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitIsNull() {
            addCriterion("person_portrait is null");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitIsNotNull() {
            addCriterion("person_portrait is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitEqualTo(String value) {
            addCriterion("person_portrait =", value, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitNotEqualTo(String value) {
            addCriterion("person_portrait <>", value, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitGreaterThan(String value) {
            addCriterion("person_portrait >", value, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("person_portrait >=", value, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitLessThan(String value) {
            addCriterion("person_portrait <", value, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitLessThanOrEqualTo(String value) {
            addCriterion("person_portrait <=", value, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitLike(String value) {
            addCriterion("person_portrait like", value, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitNotLike(String value) {
            addCriterion("person_portrait not like", value, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitIn(List<String> values) {
            addCriterion("person_portrait in", values, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitNotIn(List<String> values) {
            addCriterion("person_portrait not in", values, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitBetween(String value1, String value2) {
            addCriterion("person_portrait between", value1, value2, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPortraitNotBetween(String value1, String value2) {
            addCriterion("person_portrait not between", value1, value2, "personPortrait");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordIsNull() {
            addCriterion("person_password is null");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordIsNotNull() {
            addCriterion("person_password is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordEqualTo(String value) {
            addCriterion("person_password =", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordNotEqualTo(String value) {
            addCriterion("person_password <>", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordGreaterThan(String value) {
            addCriterion("person_password >", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("person_password >=", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordLessThan(String value) {
            addCriterion("person_password <", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordLessThanOrEqualTo(String value) {
            addCriterion("person_password <=", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordLike(String value) {
            addCriterion("person_password like", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordNotLike(String value) {
            addCriterion("person_password not like", value, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordIn(List<String> values) {
            addCriterion("person_password in", values, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordNotIn(List<String> values) {
            addCriterion("person_password not in", values, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordBetween(String value1, String value2) {
            addCriterion("person_password between", value1, value2, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonPasswordNotBetween(String value1, String value2) {
            addCriterion("person_password not between", value1, value2, "personPassword");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumIsNull() {
            addCriterion("person_account_num is null");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumIsNotNull() {
            addCriterion("person_account_num is not null");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumEqualTo(String value) {
            addCriterion("person_account_num =", value, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumNotEqualTo(String value) {
            addCriterion("person_account_num <>", value, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumGreaterThan(String value) {
            addCriterion("person_account_num >", value, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumGreaterThanOrEqualTo(String value) {
            addCriterion("person_account_num >=", value, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumLessThan(String value) {
            addCriterion("person_account_num <", value, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumLessThanOrEqualTo(String value) {
            addCriterion("person_account_num <=", value, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumLike(String value) {
            addCriterion("person_account_num like", value, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumNotLike(String value) {
            addCriterion("person_account_num not like", value, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumIn(List<String> values) {
            addCriterion("person_account_num in", values, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumNotIn(List<String> values) {
            addCriterion("person_account_num not in", values, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumBetween(String value1, String value2) {
            addCriterion("person_account_num between", value1, value2, "personAccountNum");
            return (Criteria) this;
        }

        public Criteria andPersonAccountNumNotBetween(String value1, String value2) {
            addCriterion("person_account_num not between", value1, value2, "personAccountNum");
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