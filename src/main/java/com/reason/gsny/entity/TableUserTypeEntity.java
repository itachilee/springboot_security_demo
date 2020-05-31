package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_UserType", schema = "dbo")
public class TableUserTypeEntity {
    private int userTypeId;
    private String userType;
    private Timestamp createTime;
    private Integer supplierid;

    @Id
    @Column(name = "UserTypeID")
    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Basic
    @Column(name = "UserType")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "Supplierid")
    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableUserTypeEntity that = (TableUserTypeEntity) o;
        return userTypeId == that.userTypeId &&
                Objects.equals(userType, that.userType) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(supplierid, that.supplierid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userTypeId, userType, createTime, supplierid);
    }
}
