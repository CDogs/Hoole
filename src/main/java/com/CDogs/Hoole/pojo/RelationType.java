package com.CDogs.Hoole.pojo;

public class RelationType {
    private Integer id;

    private String description;

    private Double intimacy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Double getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(Double intimacy) {
        this.intimacy = intimacy;
    }
}