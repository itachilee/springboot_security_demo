package com.reason.gsny.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TABLE_METER_APPRAISAL", schema = "dbo")
public class TableMeterAppraisalEntity {
    private int id;
    private int meteridId;
    private String actualBeginA;
    private String actualEndA;
    private String meterBeginA;
    private String meterEndA;
    private String t1A;
    private String errA;
    private String actualBeginB;
    private String actualEndB;
    private String meterBeginB;
    private String meterEndB;
    private String t1B;
    private String errB;
    private String actualBeginC;
    private String actualEndC;
    private String meterBeginC;
    private String meterEndC;
    private String t1C;
    private String errC;
    private String meterId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "METERID_ID")
    public int getMeteridId() {
        return meteridId;
    }

    public void setMeteridId(int meteridId) {
        this.meteridId = meteridId;
    }

    @Basic
    @Column(name = "ACTUAL_BEGIN_A")
    public String getActualBeginA() {
        return actualBeginA;
    }

    public void setActualBeginA(String actualBeginA) {
        this.actualBeginA = actualBeginA;
    }

    @Basic
    @Column(name = "ACTUAL_END_A")
    public String getActualEndA() {
        return actualEndA;
    }

    public void setActualEndA(String actualEndA) {
        this.actualEndA = actualEndA;
    }

    @Basic
    @Column(name = "METER_BEGIN_A")
    public String getMeterBeginA() {
        return meterBeginA;
    }

    public void setMeterBeginA(String meterBeginA) {
        this.meterBeginA = meterBeginA;
    }

    @Basic
    @Column(name = "METER_END_A")
    public String getMeterEndA() {
        return meterEndA;
    }

    public void setMeterEndA(String meterEndA) {
        this.meterEndA = meterEndA;
    }

    @Basic
    @Column(name = "T1_A")
    public String getT1A() {
        return t1A;
    }

    public void setT1A(String t1A) {
        this.t1A = t1A;
    }

    @Basic
    @Column(name = "ERR_A")
    public String getErrA() {
        return errA;
    }

    public void setErrA(String errA) {
        this.errA = errA;
    }

    @Basic
    @Column(name = "ACTUAL_BEGIN_B")
    public String getActualBeginB() {
        return actualBeginB;
    }

    public void setActualBeginB(String actualBeginB) {
        this.actualBeginB = actualBeginB;
    }

    @Basic
    @Column(name = "ACTUAL_END_B")
    public String getActualEndB() {
        return actualEndB;
    }

    public void setActualEndB(String actualEndB) {
        this.actualEndB = actualEndB;
    }

    @Basic
    @Column(name = "METER_BEGIN_B")
    public String getMeterBeginB() {
        return meterBeginB;
    }

    public void setMeterBeginB(String meterBeginB) {
        this.meterBeginB = meterBeginB;
    }

    @Basic
    @Column(name = "METER_END_B")
    public String getMeterEndB() {
        return meterEndB;
    }

    public void setMeterEndB(String meterEndB) {
        this.meterEndB = meterEndB;
    }

    @Basic
    @Column(name = "T1_B")
    public String getT1B() {
        return t1B;
    }

    public void setT1B(String t1B) {
        this.t1B = t1B;
    }

    @Basic
    @Column(name = "ERR_B")
    public String getErrB() {
        return errB;
    }

    public void setErrB(String errB) {
        this.errB = errB;
    }

    @Basic
    @Column(name = "ACTUAL_BEGIN_C")
    public String getActualBeginC() {
        return actualBeginC;
    }

    public void setActualBeginC(String actualBeginC) {
        this.actualBeginC = actualBeginC;
    }

    @Basic
    @Column(name = "ACTUAL_END_C")
    public String getActualEndC() {
        return actualEndC;
    }

    public void setActualEndC(String actualEndC) {
        this.actualEndC = actualEndC;
    }

    @Basic
    @Column(name = "METER_BEGIN_C")
    public String getMeterBeginC() {
        return meterBeginC;
    }

    public void setMeterBeginC(String meterBeginC) {
        this.meterBeginC = meterBeginC;
    }

    @Basic
    @Column(name = "METER_END_C")
    public String getMeterEndC() {
        return meterEndC;
    }

    public void setMeterEndC(String meterEndC) {
        this.meterEndC = meterEndC;
    }

    @Basic
    @Column(name = "T1_C")
    public String getT1C() {
        return t1C;
    }

    public void setT1C(String t1C) {
        this.t1C = t1C;
    }

    @Basic
    @Column(name = "ERR_C")
    public String getErrC() {
        return errC;
    }

    public void setErrC(String errC) {
        this.errC = errC;
    }

    @Basic
    @Column(name = "MeterID")
    public String getMeterId() {
        return meterId;
    }

    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableMeterAppraisalEntity that = (TableMeterAppraisalEntity) o;
        return id == that.id &&
                meteridId == that.meteridId &&
                Objects.equals(actualBeginA, that.actualBeginA) &&
                Objects.equals(actualEndA, that.actualEndA) &&
                Objects.equals(meterBeginA, that.meterBeginA) &&
                Objects.equals(meterEndA, that.meterEndA) &&
                Objects.equals(t1A, that.t1A) &&
                Objects.equals(errA, that.errA) &&
                Objects.equals(actualBeginB, that.actualBeginB) &&
                Objects.equals(actualEndB, that.actualEndB) &&
                Objects.equals(meterBeginB, that.meterBeginB) &&
                Objects.equals(meterEndB, that.meterEndB) &&
                Objects.equals(t1B, that.t1B) &&
                Objects.equals(errB, that.errB) &&
                Objects.equals(actualBeginC, that.actualBeginC) &&
                Objects.equals(actualEndC, that.actualEndC) &&
                Objects.equals(meterBeginC, that.meterBeginC) &&
                Objects.equals(meterEndC, that.meterEndC) &&
                Objects.equals(t1C, that.t1C) &&
                Objects.equals(errC, that.errC) &&
                Objects.equals(meterId, that.meterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, meteridId, actualBeginA, actualEndA, meterBeginA, meterEndA, t1A, errA, actualBeginB, actualEndB, meterBeginB, meterEndB, t1B, errB, actualBeginC, actualEndC, meterBeginC, meterEndC, t1C, errC, meterId);
    }
}
