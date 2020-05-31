package com.reason.gsny.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_BILL", schema = "dbo")
public class TableBillEntity {
    private int billId;
    private Integer userId;
    private String meterId;
    private String supplierId;
    private String total;
    private String sum;
    private String price;
    private String priceunit;
    private String year;
    private String month;
    private String status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String step1Price;
    private String step1Total;
    private String step2Price;
    private String step2Total;
    private String step3Price;
    private String step3Total;
    private Integer lastTotal;
    private Timestamp lastDatetime;
    private String payMethod;
    private BigDecimal cost;
    private BigDecimal cost1;
    private BigDecimal cost2;
    private BigDecimal cost3;
    private BigDecimal cost4;
    private Integer usage;

    @Id
    @Column(name = "BILL_ID")
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    @Basic
    @Column(name = "USER_ID")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @Column(name = "SUPPLIER_ID")
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "TOTAL")
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Basic
    @Column(name = "SUM")
    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Basic
    @Column(name = "PRICE")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "PRICEUNIT")
    public String getPriceunit() {
        return priceunit;
    }

    public void setPriceunit(String priceunit) {
        this.priceunit = priceunit;
    }

    @Basic
    @Column(name = "YEAR")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Basic
    @Column(name = "MONTH")
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "UPDATE_TIME")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "STEP1_PRICE")
    public String getStep1Price() {
        return step1Price;
    }

    public void setStep1Price(String step1Price) {
        this.step1Price = step1Price;
    }

    @Basic
    @Column(name = "STEP1_TOTAL")
    public String getStep1Total() {
        return step1Total;
    }

    public void setStep1Total(String step1Total) {
        this.step1Total = step1Total;
    }

    @Basic
    @Column(name = "STEP2_PRICE")
    public String getStep2Price() {
        return step2Price;
    }

    public void setStep2Price(String step2Price) {
        this.step2Price = step2Price;
    }

    @Basic
    @Column(name = "STEP2_TOTAL")
    public String getStep2Total() {
        return step2Total;
    }

    public void setStep2Total(String step2Total) {
        this.step2Total = step2Total;
    }

    @Basic
    @Column(name = "STEP3_PRICE")
    public String getStep3Price() {
        return step3Price;
    }

    public void setStep3Price(String step3Price) {
        this.step3Price = step3Price;
    }

    @Basic
    @Column(name = "STEP3_TOTAL")
    public String getStep3Total() {
        return step3Total;
    }

    public void setStep3Total(String step3Total) {
        this.step3Total = step3Total;
    }

    @Basic
    @Column(name = "LAST_TOTAL")
    public Integer getLastTotal() {
        return lastTotal;
    }

    public void setLastTotal(Integer lastTotal) {
        this.lastTotal = lastTotal;
    }

    @Basic
    @Column(name = "LAST_DATETIME")
    public Timestamp getLastDatetime() {
        return lastDatetime;
    }

    public void setLastDatetime(Timestamp lastDatetime) {
        this.lastDatetime = lastDatetime;
    }

    @Basic
    @Column(name = "PAY_METHOD")
    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    @Basic
    @Column(name = "COST")
    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "COST1")
    public BigDecimal getCost1() {
        return cost1;
    }

    public void setCost1(BigDecimal cost1) {
        this.cost1 = cost1;
    }

    @Basic
    @Column(name = "COST2")
    public BigDecimal getCost2() {
        return cost2;
    }

    public void setCost2(BigDecimal cost2) {
        this.cost2 = cost2;
    }

    @Basic
    @Column(name = "COST3")
    public BigDecimal getCost3() {
        return cost3;
    }

    public void setCost3(BigDecimal cost3) {
        this.cost3 = cost3;
    }

    @Basic
    @Column(name = "COST4")
    public BigDecimal getCost4() {
        return cost4;
    }

    public void setCost4(BigDecimal cost4) {
        this.cost4 = cost4;
    }

    @Basic
    @Column(name = "USAGE")
    public Integer getUsage() {
        return usage;
    }

    public void setUsage(Integer usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableBillEntity that = (TableBillEntity) o;
        return billId == that.billId &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(meterId, that.meterId) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(total, that.total) &&
                Objects.equals(sum, that.sum) &&
                Objects.equals(price, that.price) &&
                Objects.equals(priceunit, that.priceunit) &&
                Objects.equals(year, that.year) &&
                Objects.equals(month, that.month) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(step1Price, that.step1Price) &&
                Objects.equals(step1Total, that.step1Total) &&
                Objects.equals(step2Price, that.step2Price) &&
                Objects.equals(step2Total, that.step2Total) &&
                Objects.equals(step3Price, that.step3Price) &&
                Objects.equals(step3Total, that.step3Total) &&
                Objects.equals(lastTotal, that.lastTotal) &&
                Objects.equals(lastDatetime, that.lastDatetime) &&
                Objects.equals(payMethod, that.payMethod) &&
                Objects.equals(cost, that.cost) &&
                Objects.equals(cost1, that.cost1) &&
                Objects.equals(cost2, that.cost2) &&
                Objects.equals(cost3, that.cost3) &&
                Objects.equals(cost4, that.cost4) &&
                Objects.equals(usage, that.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billId, userId, meterId, supplierId, total, sum, price, priceunit, year, month, status, createTime, updateTime, step1Price, step1Total, step2Price, step2Total, step3Price, step3Total, lastTotal, lastDatetime, payMethod, cost, cost1, cost2, cost3, cost4, usage);
    }
}
