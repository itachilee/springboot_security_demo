package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Table_OpenMeterRecord", schema = "dbo")
public class TableOpenMeterRecordEntity {
    private int recordId;
    private double price;
    private String meUnit;
    private Integer userId;
    private Integer meterId;
    private Integer waterAmount;
    private Date createdTime;
    private Integer expectedMoney;
    private Integer isHydration;

    @Id
    @Column(name = "RecordId")
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "Price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Me_Unit")
    public String getMeUnit() {
        return meUnit;
    }

    public void setMeUnit(String meUnit) {
        this.meUnit = meUnit;
    }

    @Basic
    @Column(name = "UserId")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "MeterId")
    public Integer getMeterId() {
        return meterId;
    }

    public void setMeterId(Integer meterId) {
        this.meterId = meterId;
    }

    @Basic
    @Column(name = "WaterAmount")
    public Integer getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(Integer waterAmount) {
        this.waterAmount = waterAmount;
    }

    @Basic
    @Column(name = "createdTime")
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "ExpectedMoney")
    public Integer getExpectedMoney() {
        return expectedMoney;
    }

    public void setExpectedMoney(Integer expectedMoney) {
        this.expectedMoney = expectedMoney;
    }

    @Basic
    @Column(name = "isHydration")
    public Integer getIsHydration() {
        return isHydration;
    }

    public void setIsHydration(Integer isHydration) {
        this.isHydration = isHydration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableOpenMeterRecordEntity that = (TableOpenMeterRecordEntity) o;
        return recordId == that.recordId &&
                Objects.equals(price, that.price) &&
                Objects.equals(meUnit, that.meUnit) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(meterId, that.meterId) &&
                Objects.equals(waterAmount, that.waterAmount) &&
                Objects.equals(createdTime, that.createdTime) &&
                Objects.equals(expectedMoney, that.expectedMoney) &&
                Objects.equals(isHydration, that.isHydration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, price, meUnit, userId, meterId, waterAmount, createdTime, expectedMoney, isHydration);
    }
}
