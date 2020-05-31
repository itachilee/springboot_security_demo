package com.reason.gsny.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "TABLE_DAILY", schema = "dbo")
public class TableDailyEntity {
    private int userId;
    private int customerId;
    private String meterId;
    private BigDecimal total;
    private BigDecimal wastage;
    private BigDecimal oldTotal;
    private String changeFlag;
    private Date createTime;
    private int dailyId;

    @Basic
    @Column(name = "USER_ID")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "CUSTOMER_ID")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
    @Column(name = "TOTAL")
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Basic
    @Column(name = "WASTAGE")
    public BigDecimal getWastage() {
        return wastage;
    }

    public void setWastage(BigDecimal wastage) {
        this.wastage = wastage;
    }

    @Basic
    @Column(name = "OLD_TOTAL")
    public BigDecimal getOldTotal() {
        return oldTotal;
    }

    public void setOldTotal(BigDecimal oldTotal) {
        this.oldTotal = oldTotal;
    }

    @Basic
    @Column(name = "CHANGE_FLAG")
    public String getChangeFlag() {
        return changeFlag;
    }

    public void setChangeFlag(String changeFlag) {
        this.changeFlag = changeFlag;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Id
    @Column(name = "DAILY_ID")
    public int getDailyId() {
        return dailyId;
    }

    public void setDailyId(int dailyId) {
        this.dailyId = dailyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableDailyEntity that = (TableDailyEntity) o;
        return userId == that.userId &&
                customerId == that.customerId &&
                dailyId == that.dailyId &&
                Objects.equals(meterId, that.meterId) &&
                Objects.equals(total, that.total) &&
                Objects.equals(wastage, that.wastage) &&
                Objects.equals(oldTotal, that.oldTotal) &&
                Objects.equals(changeFlag, that.changeFlag) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, customerId, meterId, total, wastage, oldTotal, changeFlag, createTime, dailyId);
    }
}
