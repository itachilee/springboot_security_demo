package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Table_ReCharge", schema = "dbo")
public class TableReChargeEntity {
    private int rechargeId;
    private Integer userId;
    private String imei;
    private String meterId;
    private String valveId;
    private String reChargeType;
    private Double charges;
    private Double proportion;
    private Double buildingArea;
    private Double areaPrice;
    private String areaPriceUnit;
    private Double heatPrice;
    private String heatPriceUnit;
    private Double baseCharge;
    private Double recharge;
    private Double dSumHeat;
    private String creditType;
    private Integer status;
    private String operator;
    private Timestamp createTime;

    @Id
    @Column(name = "RechargeID")
    public int getRechargeId() {
        return rechargeId;
    }

    public void setRechargeId(int rechargeId) {
        this.rechargeId = rechargeId;
    }

    @Basic
    @Column(name = "UserID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "imei")
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Basic
    @Column(name = "meterId")
    public String getMeterId() {
        return meterId;
    }

    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }

    @Basic
    @Column(name = "valveId")
    public String getValveId() {
        return valveId;
    }

    public void setValveId(String valveId) {
        this.valveId = valveId;
    }

    @Basic
    @Column(name = "ReChargeType")
    public String getReChargeType() {
        return reChargeType;
    }

    public void setReChargeType(String reChargeType) {
        this.reChargeType = reChargeType;
    }

    @Basic
    @Column(name = "Charges")
    public Double getCharges() {
        return charges;
    }

    public void setCharges(Double charges) {
        this.charges = charges;
    }

    @Basic
    @Column(name = "Proportion")
    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    @Basic
    @Column(name = "BuildingArea")
    public Double getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(Double buildingArea) {
        this.buildingArea = buildingArea;
    }

    @Basic
    @Column(name = "AreaPrice")
    public Double getAreaPrice() {
        return areaPrice;
    }

    public void setAreaPrice(Double areaPrice) {
        this.areaPrice = areaPrice;
    }

    @Basic
    @Column(name = "AreaPriceUnit")
    public String getAreaPriceUnit() {
        return areaPriceUnit;
    }

    public void setAreaPriceUnit(String areaPriceUnit) {
        this.areaPriceUnit = areaPriceUnit;
    }

    @Basic
    @Column(name = "HeatPrice")
    public Double getHeatPrice() {
        return heatPrice;
    }

    public void setHeatPrice(Double heatPrice) {
        this.heatPrice = heatPrice;
    }

    @Basic
    @Column(name = "HeatPriceUnit")
    public String getHeatPriceUnit() {
        return heatPriceUnit;
    }

    public void setHeatPriceUnit(String heatPriceUnit) {
        this.heatPriceUnit = heatPriceUnit;
    }

    @Basic
    @Column(name = "BaseCharge")
    public Double getBaseCharge() {
        return baseCharge;
    }

    public void setBaseCharge(Double baseCharge) {
        this.baseCharge = baseCharge;
    }

    @Basic
    @Column(name = "Recharge")
    public Double getRecharge() {
        return recharge;
    }

    public void setRecharge(Double recharge) {
        this.recharge = recharge;
    }

    @Basic
    @Column(name = "dSumHeat")
    public Double getdSumHeat() {
        return dSumHeat;
    }

    public void setdSumHeat(Double dSumHeat) {
        this.dSumHeat = dSumHeat;
    }

    @Basic
    @Column(name = "creditType")
    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "operator")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "CreateTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableReChargeEntity that = (TableReChargeEntity) o;
        return rechargeId == that.rechargeId &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(imei, that.imei) &&
                Objects.equals(meterId, that.meterId) &&
                Objects.equals(valveId, that.valveId) &&
                Objects.equals(reChargeType, that.reChargeType) &&
                Objects.equals(charges, that.charges) &&
                Objects.equals(proportion, that.proportion) &&
                Objects.equals(buildingArea, that.buildingArea) &&
                Objects.equals(areaPrice, that.areaPrice) &&
                Objects.equals(areaPriceUnit, that.areaPriceUnit) &&
                Objects.equals(heatPrice, that.heatPrice) &&
                Objects.equals(heatPriceUnit, that.heatPriceUnit) &&
                Objects.equals(baseCharge, that.baseCharge) &&
                Objects.equals(recharge, that.recharge) &&
                Objects.equals(dSumHeat, that.dSumHeat) &&
                Objects.equals(creditType, that.creditType) &&
                Objects.equals(status, that.status) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rechargeId, userId, imei, meterId, valveId, reChargeType, charges, proportion, buildingArea, areaPrice, areaPriceUnit, heatPrice, heatPriceUnit, baseCharge, recharge, dSumHeat, creditType, status, operator, createTime);
    }
}
