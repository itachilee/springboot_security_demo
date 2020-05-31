package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Table_Pay", schema = "dbo")
public class TablePayEntity {
    private int payId;
    private Integer userId;
    private String payMode;
    private String yearArea;
    private String condition;
    private Double buildingArea;
    private Double price;
    private Integer dec1Int;
    private Double dec1;
    private Integer dec2Int;
    private Double dec2;
    private Integer add1Int;
    private Double add1;
    private Integer add2Int;
    private Double add2;
    private Double penalty;
    private Double money;
    private String remark;
    private String operator;
    private Timestamp createTime;

    @Id
    @Column(name = "PayID")
    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
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
    @Column(name = "PayMode")
    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    @Basic
    @Column(name = "YearArea")
    public String getYearArea() {
        return yearArea;
    }

    public void setYearArea(String yearArea) {
        this.yearArea = yearArea;
    }

    @Basic
    @Column(name = "Condition")
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
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
    @Column(name = "Price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Dec1Int")
    public Integer getDec1Int() {
        return dec1Int;
    }

    public void setDec1Int(Integer dec1Int) {
        this.dec1Int = dec1Int;
    }

    @Basic
    @Column(name = "Dec1")
    public Double getDec1() {
        return dec1;
    }

    public void setDec1(Double dec1) {
        this.dec1 = dec1;
    }

    @Basic
    @Column(name = "Dec2Int")
    public Integer getDec2Int() {
        return dec2Int;
    }

    public void setDec2Int(Integer dec2Int) {
        this.dec2Int = dec2Int;
    }

    @Basic
    @Column(name = "Dec2")
    public Double getDec2() {
        return dec2;
    }

    public void setDec2(Double dec2) {
        this.dec2 = dec2;
    }

    @Basic
    @Column(name = "Add1Int")
    public Integer getAdd1Int() {
        return add1Int;
    }

    public void setAdd1Int(Integer add1Int) {
        this.add1Int = add1Int;
    }

    @Basic
    @Column(name = "Add1")
    public Double getAdd1() {
        return add1;
    }

    public void setAdd1(Double add1) {
        this.add1 = add1;
    }

    @Basic
    @Column(name = "Add2Int")
    public Integer getAdd2Int() {
        return add2Int;
    }

    public void setAdd2Int(Integer add2Int) {
        this.add2Int = add2Int;
    }

    @Basic
    @Column(name = "Add2")
    public Double getAdd2() {
        return add2;
    }

    public void setAdd2(Double add2) {
        this.add2 = add2;
    }

    @Basic
    @Column(name = "Penalty")
    public Double getPenalty() {
        return penalty;
    }

    public void setPenalty(Double penalty) {
        this.penalty = penalty;
    }

    @Basic
    @Column(name = "Money")
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Basic
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "Operator")
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
        TablePayEntity that = (TablePayEntity) o;
        return payId == that.payId &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(payMode, that.payMode) &&
                Objects.equals(yearArea, that.yearArea) &&
                Objects.equals(condition, that.condition) &&
                Objects.equals(buildingArea, that.buildingArea) &&
                Objects.equals(price, that.price) &&
                Objects.equals(dec1Int, that.dec1Int) &&
                Objects.equals(dec1, that.dec1) &&
                Objects.equals(dec2Int, that.dec2Int) &&
                Objects.equals(dec2, that.dec2) &&
                Objects.equals(add1Int, that.add1Int) &&
                Objects.equals(add1, that.add1) &&
                Objects.equals(add2Int, that.add2Int) &&
                Objects.equals(add2, that.add2) &&
                Objects.equals(penalty, that.penalty) &&
                Objects.equals(money, that.money) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payId, userId, payMode, yearArea, condition, buildingArea, price, dec1Int, dec1, dec2Int, dec2, add1Int, add1, add2Int, add2, penalty, money, remark, operator, createTime);
    }
}
