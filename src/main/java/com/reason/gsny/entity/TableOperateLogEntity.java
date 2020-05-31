package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_OPERATE_LOG", schema = "dbo")
public class TableOperateLogEntity {
    private int operateId;
    private String operateType;
    private String businessName;
    private String behaviorName;
    private Integer loginId;
    private Integer supplierId;
    private Timestamp createTime;
    private String businessNameEn;
    private String behaviorNameEn;
    private String businessFinish;
    private String behaviorFinish;
    private String remark;

    @Id
    @Column(name = "OPERATE_ID")
    public int getOperateId() {
        return operateId;
    }

    public void setOperateId(int operateId) {
        this.operateId = operateId;
    }

    @Basic
    @Column(name = "OPERATE_TYPE")
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    @Basic
    @Column(name = "BUSINESS_NAME")
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Basic
    @Column(name = "BEHAVIOR_NAME")
    public String getBehaviorName() {
        return behaviorName;
    }

    public void setBehaviorName(String behaviorName) {
        this.behaviorName = behaviorName;
    }

    @Basic
    @Column(name = "LOGIN_ID")
    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
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
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "BUSINESS_NAME_EN")
    public String getBusinessNameEn() {
        return businessNameEn;
    }

    public void setBusinessNameEn(String businessNameEn) {
        this.businessNameEn = businessNameEn;
    }

    @Basic
    @Column(name = "BEHAVIOR_NAME_EN")
    public String getBehaviorNameEn() {
        return behaviorNameEn;
    }

    public void setBehaviorNameEn(String behaviorNameEn) {
        this.behaviorNameEn = behaviorNameEn;
    }

    @Basic
    @Column(name = "BUSINESS_FINISH")
    public String getBusinessFinish() {
        return businessFinish;
    }

    public void setBusinessFinish(String businessFinish) {
        this.businessFinish = businessFinish;
    }

    @Basic
    @Column(name = "BEHAVIOR_FINISH")
    public String getBehaviorFinish() {
        return behaviorFinish;
    }

    public void setBehaviorFinish(String behaviorFinish) {
        this.behaviorFinish = behaviorFinish;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableOperateLogEntity that = (TableOperateLogEntity) o;
        return operateId == that.operateId &&
                Objects.equals(operateType, that.operateType) &&
                Objects.equals(businessName, that.businessName) &&
                Objects.equals(behaviorName, that.behaviorName) &&
                Objects.equals(loginId, that.loginId) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(businessNameEn, that.businessNameEn) &&
                Objects.equals(behaviorNameEn, that.behaviorNameEn) &&
                Objects.equals(businessFinish, that.businessFinish) &&
                Objects.equals(behaviorFinish, that.behaviorFinish) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateId, operateType, businessName, behaviorName, loginId, supplierId, createTime, businessNameEn, behaviorNameEn, businessFinish, behaviorFinish, remark);
    }
}
