package com.reason.gsny.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TABLE_USER_AGG_INFO", schema = "dbo")
public class TableUserAggInfoEntity {
    private int id;
    private int userId;
    private BigDecimal remainWater;
    private BigDecimal accumTotal;
    private BigDecimal accumAmount;
    private Date lastPayTime;
    private BigDecimal surplusAmount;
    private Integer supplierId;
    private String meterId;
    private String isClose;
    private String specialType;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USER_ID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "REMAIN_WATER")
    public BigDecimal getRemainWater() {
        return remainWater;
    }

    public void setRemainWater(BigDecimal remainWater) {
        this.remainWater = remainWater;
    }

    @Basic
    @Column(name = "ACCUM_TOTAL")
    public BigDecimal getAccumTotal() {
        return accumTotal;
    }

    public void setAccumTotal(BigDecimal accumTotal) {
        this.accumTotal = accumTotal;
    }

    @Basic
    @Column(name = "ACCUM_AMOUNT")
    public BigDecimal getAccumAmount() {
        return accumAmount;
    }

    public void setAccumAmount(BigDecimal accumAmount) {
        this.accumAmount = accumAmount;
    }

    @Basic
    @Column(name = "LAST_PAY_TIME")
    public Date getLastPayTime() {
        return lastPayTime;
    }

    public void setLastPayTime(Date lastPayTime) {
        this.lastPayTime = lastPayTime;
    }

    @Basic
    @Column(name = "SURPLUS_AMOUNT")
    public BigDecimal getSurplusAmount() {
        return surplusAmount;
    }

    public void setSurplusAmount(BigDecimal surplusAmount) {
        this.surplusAmount = surplusAmount;
    }

    @Basic
    @Column(name = "SUPPLIER_ID")
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "METER_ID")
    public String getMeterId() {
        return meterId;
    }

    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }

    @Basic
    @Column(name = "IS_CLOSE")
    public String getIsClose() {
        return isClose;
    }

    public void setIsClose(String isClose) {
        this.isClose = isClose;
    }

    @Basic
    @Column(name = "SPECIAL_TYPE")
    public String getSpecialType() {
        return specialType;
    }

    public void setSpecialType(String specialType) {
        this.specialType = specialType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableUserAggInfoEntity that = (TableUserAggInfoEntity) o;
        return id == that.id &&
                userId == that.userId &&
                Objects.equals(remainWater, that.remainWater) &&
                Objects.equals(accumTotal, that.accumTotal) &&
                Objects.equals(accumAmount, that.accumAmount) &&
                Objects.equals(lastPayTime, that.lastPayTime) &&
                Objects.equals(surplusAmount, that.surplusAmount) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(meterId, that.meterId) &&
                Objects.equals(isClose, that.isClose) &&
                Objects.equals(specialType, that.specialType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, remainWater, accumTotal, accumAmount, lastPayTime, surplusAmount, supplierId, meterId, isClose, specialType);
    }
}
