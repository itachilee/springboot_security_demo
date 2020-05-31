package com.reason.gsny.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Table_Charge_Record", schema = "dbo")
public class TableChargeRecordEntity {
    private long meterId;
    private int userId;
    private double heatPrice;
    private Double realCharge;
    private String status;
    private String expectedPay;
    private String remark2;
    private BigDecimal extraHeat;
    private String heatingTime;
    private Timestamp timeInp;
    private String userType;
    private int id;

    @Basic
    @Column(name = "MeterID")
    public long getMeterId() {
        return meterId;
    }

    public void setMeterId(long meterId) {
        this.meterId = meterId;
    }

    @Basic
    @Column(name = "UserID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "HeatPrice")
    public double getHeatPrice() {
        return heatPrice;
    }

    public void setHeatPrice(double heatPrice) {
        this.heatPrice = heatPrice;
    }

    @Basic
    @Column(name = "RealCharge")
    public Double getRealCharge() {
        return realCharge;
    }

    public void setRealCharge(Double realCharge) {
        this.realCharge = realCharge;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "expectedPay")
    public String getExpectedPay() {
        return expectedPay;
    }

    public void setExpectedPay(String expectedPay) {
        this.expectedPay = expectedPay;
    }

    @Basic
    @Column(name = "Remark2")
    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    @Basic
    @Column(name = "extraHeat")
    public BigDecimal getExtraHeat() {
        return extraHeat;
    }

    public void setExtraHeat(BigDecimal extraHeat) {
        this.extraHeat = extraHeat;
    }

    @Basic
    @Column(name = "heatingTime")
    public String getHeatingTime() {
        return heatingTime;
    }

    public void setHeatingTime(String heatingTime) {
        this.heatingTime = heatingTime;
    }

    @Basic
    @Column(name = "TimeInp")
    public Timestamp getTimeInp() {
        return timeInp;
    }

    public void setTimeInp(Timestamp timeInp) {
        this.timeInp = timeInp;
    }

    @Basic
    @Column(name = "UserType")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableChargeRecordEntity that = (TableChargeRecordEntity) o;
        return meterId == that.meterId &&
                userId == that.userId &&
                Double.compare(that.heatPrice, heatPrice) == 0 &&
                id == that.id &&
                Objects.equals(realCharge, that.realCharge) &&
                Objects.equals(status, that.status) &&
                Objects.equals(expectedPay, that.expectedPay) &&
                Objects.equals(remark2, that.remark2) &&
                Objects.equals(extraHeat, that.extraHeat) &&
                Objects.equals(heatingTime, that.heatingTime) &&
                Objects.equals(timeInp, that.timeInp) &&
                Objects.equals(userType, that.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meterId, userId, heatPrice, realCharge, status, expectedPay, remark2, extraHeat, heatingTime, timeInp, userType, id);
    }
}
