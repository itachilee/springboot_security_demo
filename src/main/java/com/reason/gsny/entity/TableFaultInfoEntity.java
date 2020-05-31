package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TABLE_FaultInfo", schema = "dbo")
public class TableFaultInfoEntity {
    private int id;
    private Integer meterId;
    private String faultDetail;
    private String faultCode;
    private String rechargeReading;
    private String waterReading;
    private String difference;
    private Date createTime;
    private Integer isDeal;
    private Integer sendId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "meterId")
    public Integer getMeterId() {
        return meterId;
    }

    public void setMeterId(Integer meterId) {
        this.meterId = meterId;
    }

    @Basic
    @Column(name = "faultDetail")
    public String getFaultDetail() {
        return faultDetail;
    }

    public void setFaultDetail(String faultDetail) {
        this.faultDetail = faultDetail;
    }

    @Basic
    @Column(name = "faultCode")
    public String getFaultCode() {
        return faultCode;
    }

    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    @Basic
    @Column(name = "rechargeReading")
    public String getRechargeReading() {
        return rechargeReading;
    }

    public void setRechargeReading(String rechargeReading) {
        this.rechargeReading = rechargeReading;
    }

    @Basic
    @Column(name = "waterReading")
    public String getWaterReading() {
        return waterReading;
    }

    public void setWaterReading(String waterReading) {
        this.waterReading = waterReading;
    }

    @Basic
    @Column(name = "difference")
    public String getDifference() {
        return difference;
    }

    public void setDifference(String difference) {
        this.difference = difference;
    }

    @Basic
    @Column(name = "createTime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "isDeal")
    public Integer getIsDeal() {
        return isDeal;
    }

    public void setIsDeal(Integer isDeal) {
        this.isDeal = isDeal;
    }

    @Basic
    @Column(name = "sendId")
    public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableFaultInfoEntity that = (TableFaultInfoEntity) o;
        return id == that.id &&
                Objects.equals(meterId, that.meterId) &&
                Objects.equals(faultDetail, that.faultDetail) &&
                Objects.equals(faultCode, that.faultCode) &&
                Objects.equals(rechargeReading, that.rechargeReading) &&
                Objects.equals(waterReading, that.waterReading) &&
                Objects.equals(difference, that.difference) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(isDeal, that.isDeal) &&
                Objects.equals(sendId, that.sendId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, meterId, faultDetail, faultCode, rechargeReading, waterReading, difference, createTime, isDeal, sendId);
    }
}
