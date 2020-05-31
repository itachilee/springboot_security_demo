package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_Charges", schema = "dbo")
public class TableChargesEntity {
    private int chargesId;
    private String charges;
    private Double proportion;
    private Double areaPrice;
    private String areaPriceUnit;
    private Double heatPrice;
    private String heatPriceUnit;
    private Double heatPriceGj;
    private String heatPriceGjUnit;
    private Double cancelPrice;
    private String cancelPriceUnit;
    private Timestamp createTime;
    private Integer supplierid;
    private String isenable;
    private String chargeType;

    @Id
    @Column(name = "ChargesID")
    public int getChargesId() {
        return chargesId;
    }

    public void setChargesId(int chargesId) {
        this.chargesId = chargesId;
    }

    @Basic
    @Column(name = "Charges")
    public String getCharges() {
        return charges;
    }

    public void setCharges(String charges) {
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
    @Column(name = "HeatPriceGJ")
    public Double getHeatPriceGj() {
        return heatPriceGj;
    }

    public void setHeatPriceGj(Double heatPriceGj) {
        this.heatPriceGj = heatPriceGj;
    }

    @Basic
    @Column(name = "HeatPriceGJUnit")
    public String getHeatPriceGjUnit() {
        return heatPriceGjUnit;
    }

    public void setHeatPriceGjUnit(String heatPriceGjUnit) {
        this.heatPriceGjUnit = heatPriceGjUnit;
    }

    @Basic
    @Column(name = "CancelPrice")
    public Double getCancelPrice() {
        return cancelPrice;
    }

    public void setCancelPrice(Double cancelPrice) {
        this.cancelPrice = cancelPrice;
    }

    @Basic
    @Column(name = "CancelPriceUnit")
    public String getCancelPriceUnit() {
        return cancelPriceUnit;
    }

    public void setCancelPriceUnit(String cancelPriceUnit) {
        this.cancelPriceUnit = cancelPriceUnit;
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

    @Basic
    @Column(name = "ISENABLE")
    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable;
    }

    @Basic
    @Column(name = "chargeType")
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableChargesEntity that = (TableChargesEntity) o;
        return chargesId == that.chargesId &&
                Objects.equals(charges, that.charges) &&
                Objects.equals(proportion, that.proportion) &&
                Objects.equals(areaPrice, that.areaPrice) &&
                Objects.equals(areaPriceUnit, that.areaPriceUnit) &&
                Objects.equals(heatPrice, that.heatPrice) &&
                Objects.equals(heatPriceUnit, that.heatPriceUnit) &&
                Objects.equals(heatPriceGj, that.heatPriceGj) &&
                Objects.equals(heatPriceGjUnit, that.heatPriceGjUnit) &&
                Objects.equals(cancelPrice, that.cancelPrice) &&
                Objects.equals(cancelPriceUnit, that.cancelPriceUnit) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(supplierid, that.supplierid) &&
                Objects.equals(isenable, that.isenable) &&
                Objects.equals(chargeType, that.chargeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargesId, charges, proportion, areaPrice, areaPriceUnit, heatPrice, heatPriceUnit, heatPriceGj, heatPriceGjUnit, cancelPrice, cancelPriceUnit, createTime, supplierid, isenable, chargeType);
    }
}
