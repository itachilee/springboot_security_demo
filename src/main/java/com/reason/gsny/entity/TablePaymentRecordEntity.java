package com.reason.gsny.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "TABLE_PAYMENT_RECORD", schema = "dbo")
public class TablePaymentRecordEntity {
    private int recordId;
    private String supplyType;
    private BigDecimal price;
    private String meUnit;
    private BigDecimal quantity;
    private BigDecimal payAmount;
    private Integer payUserid;
    private Date payDatetime;
    private String payType;
    private Integer supplierId;
    private String isThirdParty;
    private String thirdMandator;
    private BigDecimal change;
    private BigDecimal riAmount;
    private BigDecimal thisBalance;
    private String meterId;
    private String isDelete;

    @Id
    @Column(name = "RECORD_ID")
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "SUPPLY_TYPE")
    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    @Basic
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "ME_UNIT")
    public String getMeUnit() {
        return meUnit;
    }

    public void setMeUnit(String meUnit) {
        this.meUnit = meUnit;
    }

    @Basic
    @Column(name = "QUANTITY")
    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "PAY_AMOUNT")
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    @Basic
    @Column(name = "PAY_USERID")
    public Integer getPayUserid() {
        return payUserid;
    }

    public void setPayUserid(Integer payUserid) {
        this.payUserid = payUserid;
    }

    @Basic
    @Column(name = "PAY_DATETIME")
    public Date getPayDatetime() {
        return payDatetime;
    }

    public void setPayDatetime(Date payDatetime) {
        this.payDatetime = payDatetime;
    }

    @Basic
    @Column(name = "PAY_TYPE")
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
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
    @Column(name = "IS_THIRD_PARTY")
    public String getIsThirdParty() {
        return isThirdParty;
    }

    public void setIsThirdParty(String isThirdParty) {
        this.isThirdParty = isThirdParty;
    }

    @Basic
    @Column(name = "THIRD_MANDATOR")
    public String getThirdMandator() {
        return thirdMandator;
    }

    public void setThirdMandator(String thirdMandator) {
        this.thirdMandator = thirdMandator;
    }

    @Basic
    @Column(name = "CHANGE")
    public BigDecimal getChange() {
        return change;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }

    @Basic
    @Column(name = "RI_AMOUNT")
    public BigDecimal getRiAmount() {
        return riAmount;
    }

    public void setRiAmount(BigDecimal riAmount) {
        this.riAmount = riAmount;
    }

    @Basic
    @Column(name = "THIS_BALANCE")
    public BigDecimal getThisBalance() {
        return thisBalance;
    }

    public void setThisBalance(BigDecimal thisBalance) {
        this.thisBalance = thisBalance;
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
    @Column(name = "IS_DELETE")
    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TablePaymentRecordEntity that = (TablePaymentRecordEntity) o;
        return recordId == that.recordId &&
                Objects.equals(supplyType, that.supplyType) &&
                Objects.equals(price, that.price) &&
                Objects.equals(meUnit, that.meUnit) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(payAmount, that.payAmount) &&
                Objects.equals(payUserid, that.payUserid) &&
                Objects.equals(payDatetime, that.payDatetime) &&
                Objects.equals(payType, that.payType) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(isThirdParty, that.isThirdParty) &&
                Objects.equals(thirdMandator, that.thirdMandator) &&
                Objects.equals(change, that.change) &&
                Objects.equals(riAmount, that.riAmount) &&
                Objects.equals(thisBalance, that.thisBalance) &&
                Objects.equals(meterId, that.meterId) &&
                Objects.equals(isDelete, that.isDelete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, supplyType, price, meUnit, quantity, payAmount, payUserid, payDatetime, payType, supplierId, isThirdParty, thirdMandator, change, riAmount, thisBalance, meterId, isDelete);
    }
}
