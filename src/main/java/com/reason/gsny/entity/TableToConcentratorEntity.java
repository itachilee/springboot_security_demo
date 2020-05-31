package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Table_toConcentrator", schema = "dbo")
public class TableToConcentratorEntity {
    private int sendId;
    private String imei;
    private String meterId;
    private Date genTime;
    private String isOver;
    private String cmdCode;
    private String cmdName;
    private String cmdInfo;
    private String note;
    private String status;
    private String operator;
    private Integer tryTimes;
    private Date sendedTime;
    private Date returnTime;
    private String openPoint;
    private Integer userid;
    private String water;
    private Integer waterId;
    private String collector;
    private Integer actionTime;

    @Id
    @Column(name = "sendId")
    public int getSendId() {
        return sendId;
    }

    public void setSendId(int sendId) {
        this.sendId = sendId;
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
    @Column(name = "genTime")
    public Date getGenTime() {
        return genTime;
    }

    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }

    @Basic
    @Column(name = "isOver")
    public String getIsOver() {
        return isOver;
    }

    public void setIsOver(String isOver) {
        this.isOver = isOver;
    }

    @Basic
    @Column(name = "cmdCode")
    public String getCmdCode() {
        return cmdCode;
    }

    public void setCmdCode(String cmdCode) {
        this.cmdCode = cmdCode;
    }

    @Basic
    @Column(name = "cmdName")
    public String getCmdName() {
        return cmdName;
    }

    public void setCmdName(String cmdName) {
        this.cmdName = cmdName;
    }

    @Basic
    @Column(name = "cmdInfo")
    public String getCmdInfo() {
        return cmdInfo;
    }

    public void setCmdInfo(String cmdInfo) {
        this.cmdInfo = cmdInfo;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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
    @Column(name = "tryTimes")
    public Integer getTryTimes() {
        return tryTimes;
    }

    public void setTryTimes(Integer tryTimes) {
        this.tryTimes = tryTimes;
    }

    @Basic
    @Column(name = "sendedTime")
    public Date getSendedTime() {
        return sendedTime;
    }

    public void setSendedTime(Date sendedTime) {
        this.sendedTime = sendedTime;
    }

    @Basic
    @Column(name = "returnTime")
    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    @Basic
    @Column(name = "openPoint")
    public String getOpenPoint() {
        return openPoint;
    }

    public void setOpenPoint(String openPoint) {
        this.openPoint = openPoint;
    }

    @Basic
    @Column(name = "userid")
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "water")
    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
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
    @Column(name = "collector")
    public String getCollector() {
        return collector;
    }

    public void setCollector(String collector) {
        this.collector = collector;
    }

    @Basic
    @Column(name = "actionTime")
    public Integer getActionTime() {
        return actionTime;
    }

    public void setActionTime(Integer actionTime) {
        this.actionTime = actionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableToConcentratorEntity that = (TableToConcentratorEntity) o;
        return sendId == that.sendId &&
                Objects.equals(imei, that.imei) &&
                Objects.equals(meterId, that.meterId) &&
                Objects.equals(genTime, that.genTime) &&
                Objects.equals(isOver, that.isOver) &&
                Objects.equals(cmdCode, that.cmdCode) &&
                Objects.equals(cmdName, that.cmdName) &&
                Objects.equals(cmdInfo, that.cmdInfo) &&
                Objects.equals(note, that.note) &&
                Objects.equals(status, that.status) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(tryTimes, that.tryTimes) &&
                Objects.equals(sendedTime, that.sendedTime) &&
                Objects.equals(returnTime, that.returnTime) &&
                Objects.equals(openPoint, that.openPoint) &&
                Objects.equals(userid, that.userid) &&
                Objects.equals(water, that.water) &&
                Objects.equals(waterId, that.waterId) &&
                Objects.equals(collector, that.collector) &&
                Objects.equals(actionTime, that.actionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendId, imei, meterId, genTime, isOver, cmdCode, cmdName, cmdInfo, note, status, operator, tryTimes, sendedTime, returnTime, openPoint, userid, water, waterId, collector, actionTime);
    }
}
