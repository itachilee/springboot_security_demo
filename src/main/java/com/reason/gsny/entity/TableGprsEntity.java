package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_GPRS", schema = "dbo")
public class TableGprsEntity {
    private int imeiid;
    private String imei;
    private String imeiName;
    private String loginTime;
    private String updateTime;
    private String status;
    private String ip;
    private String port;
    private String sim;
    private String holder;
    private String pass;
    private String address;
    private String service;
    private Timestamp createTime;
    private String includeMeterId;
    private String ip2;
    private String port2;

    @Id
    @Column(name = "IMEIID")
    public int getImeiid() {
        return imeiid;
    }

    public void setImeiid(int imeiid) {
        this.imeiid = imeiid;
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
    @Column(name = "IMEIName")
    public String getImeiName() {
        return imeiName;
    }

    public void setImeiName(String imeiName) {
        this.imeiName = imeiName;
    }

    @Basic
    @Column(name = "LoginTime")
    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "UpdateTime")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
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
    @Column(name = "IP")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Basic
    @Column(name = "Port")
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Basic
    @Column(name = "SIM")
    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    @Basic
    @Column(name = "Holder")
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Basic
    @Column(name = "Pass")
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "Address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Service")
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
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
    @Column(name = "IncludeMeterId")
    public String getIncludeMeterId() {
        return includeMeterId;
    }

    public void setIncludeMeterId(String includeMeterId) {
        this.includeMeterId = includeMeterId;
    }

    @Basic
    @Column(name = "IP2")
    public String getIp2() {
        return ip2;
    }

    public void setIp2(String ip2) {
        this.ip2 = ip2;
    }

    @Basic
    @Column(name = "Port2")
    public String getPort2() {
        return port2;
    }

    public void setPort2(String port2) {
        this.port2 = port2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableGprsEntity that = (TableGprsEntity) o;
        return imeiid == that.imeiid &&
                Objects.equals(imei, that.imei) &&
                Objects.equals(imeiName, that.imeiName) &&
                Objects.equals(loginTime, that.loginTime) &&
                Objects.equals(updateTime, that.updateTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(port, that.port) &&
                Objects.equals(sim, that.sim) &&
                Objects.equals(holder, that.holder) &&
                Objects.equals(pass, that.pass) &&
                Objects.equals(address, that.address) &&
                Objects.equals(service, that.service) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(includeMeterId, that.includeMeterId) &&
                Objects.equals(ip2, that.ip2) &&
                Objects.equals(port2, that.port2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imeiid, imei, imeiName, loginTime, updateTime, status, ip, port, sim, holder, pass, address, service, createTime, includeMeterId, ip2, port2);
    }
}
