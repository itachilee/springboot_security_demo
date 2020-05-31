package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_Report", schema = "dbo")
public class TableReportEntity {
    private int reportId;
    private Integer userId;
    private int meterIDid;
    private String imei;
    private String meterId;
    private String productType;
    private Integer mbusAddress;
    private Float electric;
    private Float sumCool;
    private Float creditCool;
    private Float initCool;
    private Float totalCreditCool;
    private Float sumHeat;
    private Float creditHeat;
    private Float initHeat;
    private Float totalCreditHeat;
    private Float total;
    private Float creditTotal;
    private Float initTotal;
    private Float totalCreditTotal;
    private Float powerW;
    private Float flowRate;
    private Float sumOpenValveM;
    private String closeTime;
    private String losePowerTime;
    private Float sumOpenValveH;
    private String loseConTime;
    private Float insideT;
    private String insideTSet;
    private String losePowerTimeSet;
    private String loseConTimeSet;
    private String sumOpenValveS;
    private String permission;
    private String valveStatus;
    private Float t1InP;
    private Float t2InP;
    private Float workTimeInP;
    private String timeInP;
    private Double vol;
    private String status;
    private Integer groupId;
    private Integer errInt;
    private Integer rxType;
    private Timestamp createTime;
    private Double pressure;
    private Double remainTotal;
    private Double inversionVol;
    private Integer waterId;
    private Integer sendId;
    private String waterTemperature;
    private String waterPress;
    private String workingHour;

    @Id
    @Column(name = "ReportID")
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
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
    @Column(name = "MeterIDid")
    public int getMeterIDid() {
        return meterIDid;
    }

    public void setMeterIDid(int meterIDid) {
        this.meterIDid = meterIDid;
    }

    @Basic
    @Column(name = "IMEI")
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Basic
    @Column(name = "MeterID")
    public String getMeterId() {
        return meterId;
    }

    public void setMeterId(String meterId) {
        this.meterId = meterId;
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
    @Column(name = "MBUSAddress")
    public Integer getMbusAddress() {
        return mbusAddress;
    }

    public void setMbusAddress(Integer mbusAddress) {
        this.mbusAddress = mbusAddress;
    }

    @Basic
    @Column(name = "Electric")
    public Float getElectric() {
        return electric;
    }

    public void setElectric(Float electric) {
        this.electric = electric;
    }

    @Basic
    @Column(name = "SumCool")
    public Float getSumCool() {
        return sumCool;
    }

    public void setSumCool(Float sumCool) {
        this.sumCool = sumCool;
    }

    @Basic
    @Column(name = "CreditCool")
    public Float getCreditCool() {
        return creditCool;
    }

    public void setCreditCool(Float creditCool) {
        this.creditCool = creditCool;
    }

    @Basic
    @Column(name = "InitCool")
    public Float getInitCool() {
        return initCool;
    }

    public void setInitCool(Float initCool) {
        this.initCool = initCool;
    }

    @Basic
    @Column(name = "TotalCreditCool")
    public Float getTotalCreditCool() {
        return totalCreditCool;
    }

    public void setTotalCreditCool(Float totalCreditCool) {
        this.totalCreditCool = totalCreditCool;
    }

    @Basic
    @Column(name = "SumHeat")
    public Float getSumHeat() {
        return sumHeat;
    }

    public void setSumHeat(Float sumHeat) {
        this.sumHeat = sumHeat;
    }

    @Basic
    @Column(name = "CreditHeat")
    public Float getCreditHeat() {
        return creditHeat;
    }

    public void setCreditHeat(Float creditHeat) {
        this.creditHeat = creditHeat;
    }

    @Basic
    @Column(name = "InitHeat")
    public Float getInitHeat() {
        return initHeat;
    }

    public void setInitHeat(Float initHeat) {
        this.initHeat = initHeat;
    }

    @Basic
    @Column(name = "TotalCreditHeat")
    public Float getTotalCreditHeat() {
        return totalCreditHeat;
    }

    public void setTotalCreditHeat(Float totalCreditHeat) {
        this.totalCreditHeat = totalCreditHeat;
    }

    @Basic
    @Column(name = "Total")
    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    @Basic
    @Column(name = "CreditTotal")
    public Float getCreditTotal() {
        return creditTotal;
    }

    public void setCreditTotal(Float creditTotal) {
        this.creditTotal = creditTotal;
    }

    @Basic
    @Column(name = "InitTotal")
    public Float getInitTotal() {
        return initTotal;
    }

    public void setInitTotal(Float initTotal) {
        this.initTotal = initTotal;
    }

    @Basic
    @Column(name = "TotalCreditTotal")
    public Float getTotalCreditTotal() {
        return totalCreditTotal;
    }

    public void setTotalCreditTotal(Float totalCreditTotal) {
        this.totalCreditTotal = totalCreditTotal;
    }

    @Basic
    @Column(name = "PowerW")
    public Float getPowerW() {
        return powerW;
    }

    public void setPowerW(Float powerW) {
        this.powerW = powerW;
    }

    @Basic
    @Column(name = "FlowRate")
    public Float getFlowRate() {
        return flowRate;
    }

    public void setFlowRate(Float flowRate) {
        this.flowRate = flowRate;
    }

    @Basic
    @Column(name = "SumOpenValveM")
    public Float getSumOpenValveM() {
        return sumOpenValveM;
    }

    public void setSumOpenValveM(Float sumOpenValveM) {
        this.sumOpenValveM = sumOpenValveM;
    }

    @Basic
    @Column(name = "CloseTime")
    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    @Basic
    @Column(name = "LosePowerTime")
    public String getLosePowerTime() {
        return losePowerTime;
    }

    public void setLosePowerTime(String losePowerTime) {
        this.losePowerTime = losePowerTime;
    }

    @Basic
    @Column(name = "SumOpenValveH")
    public Float getSumOpenValveH() {
        return sumOpenValveH;
    }

    public void setSumOpenValveH(Float sumOpenValveH) {
        this.sumOpenValveH = sumOpenValveH;
    }

    @Basic
    @Column(name = "LoseConTime")
    public String getLoseConTime() {
        return loseConTime;
    }

    public void setLoseConTime(String loseConTime) {
        this.loseConTime = loseConTime;
    }

    @Basic
    @Column(name = "InsideT")
    public Float getInsideT() {
        return insideT;
    }

    public void setInsideT(Float insideT) {
        this.insideT = insideT;
    }

    @Basic
    @Column(name = "InsideTSet")
    public String getInsideTSet() {
        return insideTSet;
    }

    public void setInsideTSet(String insideTSet) {
        this.insideTSet = insideTSet;
    }

    @Basic
    @Column(name = "LosePowerTimeSet")
    public String getLosePowerTimeSet() {
        return losePowerTimeSet;
    }

    public void setLosePowerTimeSet(String losePowerTimeSet) {
        this.losePowerTimeSet = losePowerTimeSet;
    }

    @Basic
    @Column(name = "LoseConTimeSet")
    public String getLoseConTimeSet() {
        return loseConTimeSet;
    }

    public void setLoseConTimeSet(String loseConTimeSet) {
        this.loseConTimeSet = loseConTimeSet;
    }

    @Basic
    @Column(name = "SumOpenValveS")
    public String getSumOpenValveS() {
        return sumOpenValveS;
    }

    public void setSumOpenValveS(String sumOpenValveS) {
        this.sumOpenValveS = sumOpenValveS;
    }

    @Basic
    @Column(name = "Permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Basic
    @Column(name = "ValveStatus")
    public String getValveStatus() {
        return valveStatus;
    }

    public void setValveStatus(String valveStatus) {
        this.valveStatus = valveStatus;
    }

    @Basic
    @Column(name = "T1InP")
    public Float getT1InP() {
        return t1InP;
    }

    public void setT1InP(Float t1InP) {
        this.t1InP = t1InP;
    }

    @Basic
    @Column(name = "T2InP")
    public Float getT2InP() {
        return t2InP;
    }

    public void setT2InP(Float t2InP) {
        this.t2InP = t2InP;
    }

    @Basic
    @Column(name = "WorkTimeInP")
    public Float getWorkTimeInP() {
        return workTimeInP;
    }

    public void setWorkTimeInP(Float workTimeInP) {
        this.workTimeInP = workTimeInP;
    }

    @Basic
    @Column(name = "TimeInP")
    public String getTimeInP() {
        return timeInP;
    }

    public void setTimeInP(String timeInP) {
        this.timeInP = timeInP;
    }

    @Basic
    @Column(name = "Vol")
    public Double getVol() {
        return vol;
    }

    public void setVol(Double vol) {
        this.vol = vol;
    }

    @Basic
    @Column(name = "Status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "GroupID")
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "ErrInt")
    public Integer getErrInt() {
        return errInt;
    }

    public void setErrInt(Integer errInt) {
        this.errInt = errInt;
    }

    @Basic
    @Column(name = "RXType")
    public Integer getRxType() {
        return rxType;
    }

    public void setRxType(Integer rxType) {
        this.rxType = rxType;
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
    @Column(name = "Pressure")
    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    @Basic
    @Column(name = "RemainTotal")
    public Double getRemainTotal() {
        return remainTotal;
    }

    public void setRemainTotal(Double remainTotal) {
        this.remainTotal = remainTotal;
    }

    @Basic
    @Column(name = "inversionVol")
    public Double getInversionVol() {
        return inversionVol;
    }

    public void setInversionVol(Double inversionVol) {
        this.inversionVol = inversionVol;
    }

    @Basic
    @Column(name = "waterId")
    public Integer getWaterId() {
        return waterId;
    }

    public void setWaterId(Integer waterId) {
        this.waterId = waterId;
    }

    @Basic
    @Column(name = "sendID")
    public Integer getSendId() {
        return sendId;
    }

    public void setSendId(Integer sendId) {
        this.sendId = sendId;
    }

    @Basic
    @Column(name = "waterTemperature")
    public String getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(String waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    @Basic
    @Column(name = "waterPress")
    public String getWaterPress() {
        return waterPress;
    }

    public void setWaterPress(String waterPress) {
        this.waterPress = waterPress;
    }

    @Basic
    @Column(name = "workingHour")
    public String getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(String workingHour) {
        this.workingHour = workingHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableReportEntity that = (TableReportEntity) o;
        return reportId == that.reportId &&
                meterIDid == that.meterIDid &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(imei, that.imei) &&
                Objects.equals(meterId, that.meterId) &&
                Objects.equals(productType, that.productType) &&
                Objects.equals(mbusAddress, that.mbusAddress) &&
                Objects.equals(electric, that.electric) &&
                Objects.equals(sumCool, that.sumCool) &&
                Objects.equals(creditCool, that.creditCool) &&
                Objects.equals(initCool, that.initCool) &&
                Objects.equals(totalCreditCool, that.totalCreditCool) &&
                Objects.equals(sumHeat, that.sumHeat) &&
                Objects.equals(creditHeat, that.creditHeat) &&
                Objects.equals(initHeat, that.initHeat) &&
                Objects.equals(totalCreditHeat, that.totalCreditHeat) &&
                Objects.equals(total, that.total) &&
                Objects.equals(creditTotal, that.creditTotal) &&
                Objects.equals(initTotal, that.initTotal) &&
                Objects.equals(totalCreditTotal, that.totalCreditTotal) &&
                Objects.equals(powerW, that.powerW) &&
                Objects.equals(flowRate, that.flowRate) &&
                Objects.equals(sumOpenValveM, that.sumOpenValveM) &&
                Objects.equals(closeTime, that.closeTime) &&
                Objects.equals(losePowerTime, that.losePowerTime) &&
                Objects.equals(sumOpenValveH, that.sumOpenValveH) &&
                Objects.equals(loseConTime, that.loseConTime) &&
                Objects.equals(insideT, that.insideT) &&
                Objects.equals(insideTSet, that.insideTSet) &&
                Objects.equals(losePowerTimeSet, that.losePowerTimeSet) &&
                Objects.equals(loseConTimeSet, that.loseConTimeSet) &&
                Objects.equals(sumOpenValveS, that.sumOpenValveS) &&
                Objects.equals(permission, that.permission) &&
                Objects.equals(valveStatus, that.valveStatus) &&
                Objects.equals(t1InP, that.t1InP) &&
                Objects.equals(t2InP, that.t2InP) &&
                Objects.equals(workTimeInP, that.workTimeInP) &&
                Objects.equals(timeInP, that.timeInP) &&
                Objects.equals(vol, that.vol) &&
                Objects.equals(status, that.status) &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(errInt, that.errInt) &&
                Objects.equals(rxType, that.rxType) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(pressure, that.pressure) &&
                Objects.equals(remainTotal, that.remainTotal) &&
                Objects.equals(inversionVol, that.inversionVol) &&
                Objects.equals(waterId, that.waterId) &&
                Objects.equals(sendId, that.sendId) &&
                Objects.equals(waterTemperature, that.waterTemperature) &&
                Objects.equals(waterPress, that.waterPress) &&
                Objects.equals(workingHour, that.workingHour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId, userId, meterIDid, imei, meterId, productType, mbusAddress, electric, sumCool, creditCool, initCool, totalCreditCool, sumHeat, creditHeat, initHeat, totalCreditHeat, total, creditTotal, initTotal, totalCreditTotal, powerW, flowRate, sumOpenValveM, closeTime, losePowerTime, sumOpenValveH, loseConTime, insideT, insideTSet, losePowerTimeSet, loseConTimeSet, sumOpenValveS, permission, valveStatus, t1InP, t2InP, workTimeInP, timeInP, vol, status, groupId, errInt, rxType, createTime, pressure, remainTotal, inversionVol, waterId, sendId, waterTemperature, waterPress, workingHour);
    }
}
