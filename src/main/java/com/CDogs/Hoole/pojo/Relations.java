package com.CDogs.Hoole.pojo;

public class Relations {
    private Long id;

    private Long accountid;

    private Long contactid;

    private Integer relation;

    private Double intimacy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountid() {
        return accountid;
    }

    public void setAccountid(Long accountid) {
        this.accountid = accountid;
    }

    public Long getContactid() {
        return contactid;
    }

    public void setContactid(Long contactid) {
        this.contactid = contactid;
    }

    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
    }

    public Double getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(Double intimacy) {
        this.intimacy = intimacy;
    }
}