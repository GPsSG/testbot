package com.openbot.testbot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    private short triglycerides;
    private short LDL;
    private  short cholesterol;
    private short HDL;
    private  short glycemia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public short getTriglycerides() {
        return triglycerides;
    }

    public void setTriglycerides(short triglycerides) {
        this.triglycerides = triglycerides;
    }

    public short getLDL() {
        return LDL;
    }

    public void setLDL(short LDL) {
        this.LDL = LDL;
    }

    public short getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(short cholesterol) {
        this.cholesterol = cholesterol;
    }

    public short getHDL() {
        return HDL;
    }

    public void setHDL(short HDL) {
        this.HDL = HDL;
    }

    public short getGlycemia() {
        return glycemia;
    }

    public void setGlycemia(short glycemia) {
        this.glycemia = glycemia;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", date=" + date +
                ", triglycerides=" + triglycerides +
                ", LDL=" + LDL +
                ", cholesterol=" + cholesterol +
                ", HDL=" + HDL +
                ", glycemia=" + glycemia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test test)) return false;

        return getId() != null ? getId().equals(test.getId()) : test.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}

