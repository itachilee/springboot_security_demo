package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_ProductType", schema = "dbo")
public class TableProductTypeEntity {
    private int productTypeId;
    private Integer factoryNameId;
    private String factoryCode;
    private String productType;
    private Integer valveInSide;
    private String readFormatTx;
    private String openFormatTx;
    private String closeFormatTx;
    private String noiseFormatTx;
    private String lookCreditFormatTx;
    private String adjustTimeFormatTx;
    private String showIdFormatTx;
    private String remark1FormatTx;
    private String remark2FormatTx;
    private String remark3FormatTx;
    private Timestamp createTime;

    @Id
    @Column(name = "ProductTypeID")
    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    @Basic
    @Column(name = "FactoryNameID")
    public Integer getFactoryNameId() {
        return factoryNameId;
    }

    public void setFactoryNameId(Integer factoryNameId) {
        this.factoryNameId = factoryNameId;
    }

    @Basic
    @Column(name = "FactoryCode")
    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    @Basic
    @Column(name = "ProductType")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "ValveInSide")
    public Integer getValveInSide() {
        return valveInSide;
    }

    public void setValveInSide(Integer valveInSide) {
        this.valveInSide = valveInSide;
    }

    @Basic
    @Column(name = "ReadFormatTX")
    public String getReadFormatTx() {
        return readFormatTx;
    }

    public void setReadFormatTx(String readFormatTx) {
        this.readFormatTx = readFormatTx;
    }

    @Basic
    @Column(name = "OpenFormatTX")
    public String getOpenFormatTx() {
        return openFormatTx;
    }

    public void setOpenFormatTx(String openFormatTx) {
        this.openFormatTx = openFormatTx;
    }

    @Basic
    @Column(name = "CloseFormatTX")
    public String getCloseFormatTx() {
        return closeFormatTx;
    }

    public void setCloseFormatTx(String closeFormatTx) {
        this.closeFormatTx = closeFormatTx;
    }

    @Basic
    @Column(name = "NoiseFormatTX")
    public String getNoiseFormatTx() {
        return noiseFormatTx;
    }

    public void setNoiseFormatTx(String noiseFormatTx) {
        this.noiseFormatTx = noiseFormatTx;
    }

    @Basic
    @Column(name = "LookCreditFormatTX")
    public String getLookCreditFormatTx() {
        return lookCreditFormatTx;
    }

    public void setLookCreditFormatTx(String lookCreditFormatTx) {
        this.lookCreditFormatTx = lookCreditFormatTx;
    }

    @Basic
    @Column(name = "AdjustTimeFormatTX")
    public String getAdjustTimeFormatTx() {
        return adjustTimeFormatTx;
    }

    public void setAdjustTimeFormatTx(String adjustTimeFormatTx) {
        this.adjustTimeFormatTx = adjustTimeFormatTx;
    }

    @Basic
    @Column(name = "ShowIDFormatTX")
    public String getShowIdFormatTx() {
        return showIdFormatTx;
    }

    public void setShowIdFormatTx(String showIdFormatTx) {
        this.showIdFormatTx = showIdFormatTx;
    }

    @Basic
    @Column(name = "Remark1FormatTX")
    public String getRemark1FormatTx() {
        return remark1FormatTx;
    }

    public void setRemark1FormatTx(String remark1FormatTx) {
        this.remark1FormatTx = remark1FormatTx;
    }

    @Basic
    @Column(name = "Remark2FormatTX")
    public String getRemark2FormatTx() {
        return remark2FormatTx;
    }

    public void setRemark2FormatTx(String remark2FormatTx) {
        this.remark2FormatTx = remark2FormatTx;
    }

    @Basic
    @Column(name = "Remark3FormatTX")
    public String getRemark3FormatTx() {
        return remark3FormatTx;
    }

    public void setRemark3FormatTx(String remark3FormatTx) {
        this.remark3FormatTx = remark3FormatTx;
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
        TableProductTypeEntity that = (TableProductTypeEntity) o;
        return productTypeId == that.productTypeId &&
                Objects.equals(factoryNameId, that.factoryNameId) &&
                Objects.equals(factoryCode, that.factoryCode) &&
                Objects.equals(productType, that.productType) &&
                Objects.equals(valveInSide, that.valveInSide) &&
                Objects.equals(readFormatTx, that.readFormatTx) &&
                Objects.equals(openFormatTx, that.openFormatTx) &&
                Objects.equals(closeFormatTx, that.closeFormatTx) &&
                Objects.equals(noiseFormatTx, that.noiseFormatTx) &&
                Objects.equals(lookCreditFormatTx, that.lookCreditFormatTx) &&
                Objects.equals(adjustTimeFormatTx, that.adjustTimeFormatTx) &&
                Objects.equals(showIdFormatTx, that.showIdFormatTx) &&
                Objects.equals(remark1FormatTx, that.remark1FormatTx) &&
                Objects.equals(remark2FormatTx, that.remark2FormatTx) &&
                Objects.equals(remark3FormatTx, that.remark3FormatTx) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productTypeId, factoryNameId, factoryCode, productType, valveInSide, readFormatTx, openFormatTx, closeFormatTx, noiseFormatTx, lookCreditFormatTx, adjustTimeFormatTx, showIdFormatTx, remark1FormatTx, remark2FormatTx, remark3FormatTx, createTime);
    }
}
