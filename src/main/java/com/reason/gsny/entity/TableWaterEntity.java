package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Table_Water", schema = "dbo")
public class TableWaterEntity {
    private int id;
    private Integer meterIDid;
    private String waterId;
    private String waterReading;
    private String lastReading;
    private String currentUsed;
    private String voltage;
    private String inversionReading;
    private String lastInversionReading;
    private String inversionCurrentUsed;
    private String waterStatus;
    private String rechargeWater;
    private String rechargeReading;
    private Date createTime;
    private Date modifyTime;
    private String meterId;
    private Integer exchangStationId;
    private Integer supplierId;
    private Integer buildingId;
    private Integer entranceId;
    private Integer villageId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "meterIDid")
    public Integer getMeterIDid() {
        return meterIDid;
    }

    public void setMeterIDid(Integer meterIDid) {
        this.meterIDid = meterIDid;
    }

    @Basic
    @Column(name = "waterId")
    public String getWaterId() {
        return waterId;
    }

    public void setWaterId(String waterId) {
        this.waterId = waterId;
    }

    @Basic
    @Column(name = "waterReading")
    public String getWaterReading() {
        return waterReading;
    }

    public void setWaterReading(String waterReading) {
        this.waterReading = waterReading;
    }

    @Basic
    @Column(name = "lastReading")
    public String getLastReading() {
        return lastReading;
    }

    public void setLastReading(String lastReading) {
        this.lastReading = lastReading;
    }

    @Basic
    @Column(name = "currentUsed")
    public String getCurrentUsed() {
        return currentUsed;
    }

    public void setCurrentUsed(String currentUsed) {
        this.currentUsed = currentUsed;
    }

    @Basic
    @Column(name = "voltage")
    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    @Basic
    @Column(name = "inversionReading")
    public String getInversionReading() {
        return inversionReading;
    }

    public void setInversionReading(String inversionReading) {
        this.inversionReading = inversionReading;
    }

    @Basic
    @Column(name = "lastInversionReading")
    public String getLastInversionReading() {
        return lastInversionReading;
    }

    public void setLastInversionReading(String lastInversionReading) {
        this.lastInversionReading = lastInversionReading;
    }

    @Basic
    @Column(name = "inversionCurrentUsed")
    public String getInversionCurrentUsed() {
        return inversionCurrentUsed;
    }

    public void setInversionCurrentUsed(String inversionCurrentUsed) {
        this.inversionCurrentUsed = inversionCurrentUsed;
    }

    @Basic
    @Column(name = "waterStatus")
    public String getWaterStatus() {
        return waterStatus;
    }

    public void setWaterStatus(String waterStatus) {
        this.waterStatus = waterStatus;
    }

    @Basic
    @Column(name = "RechargeWater")
    public String getRechargeWater() {
        return rechargeWater;
    }

    public void setRechargeWater(String rechargeWater) {
        this.rechargeWater = rechargeWater;
    }

    @Basic
    @Column(name = "RechargeReading")
    public String getRechargeReading() {
        return rechargeReading;
    }

    public void setRechargeReading(String rechargeReading) {
        this.rechargeReading = rechargeReading;
    }

    @Basic
    @Column(name = "createTime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "modifyTime")
    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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
    @Column(name = "exchangStationId")
    public Integer getExchangStationId() {
        return exchangStationId;
    }

    public void setExchangStationId(Integer exchangStationId) {
        this.exchangStationId = exchangStationId;
    }

    @Basic
    @Column(name = "supplierId")
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "buildingId")
    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    @Basic
    @Column(name = "entranceId")
    public Integer getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Integer entranceId) {
        this.entranceId = entranceId;
    }

    @Basic
    @Column(name = "villageId")
    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableWaterEntity that = (TableWaterEntity) o;
        return id == that.id &&
                Objects.equals(meterIDid, that.meterIDid) &&
                Objects.equals(waterId, that.waterId) &&
                Objects.equals(waterReading, that.waterReading) &&
                Objects.equals(lastReading, that.lastReading) &&
                Objects.equals(currentUsed, that.currentUsed) &&
                Objects.equals(voltage, that.voltage) &&
                Objects.equals(inversionReading, that.inversionReading) &&
                Objects.equals(lastInversionReading, that.lastInversionReading) &&
                Objects.equals(inversionCurrentUsed, that.inversionCurrentUsed) &&
                Objects.equals(waterStatus, that.waterStatus) &&
                Objects.equals(rechargeWater, that.rechargeWater) &&
                Objects.equals(rechargeReading, that.rechargeReading) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(meterId, that.meterId) &&
                Objects.equals(exchangStationId, that.exchangStationId) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(buildingId, that.buildingId) &&
                Objects.equals(entranceId, that.entranceId) &&
                Objects.equals(villageId, that.villageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, meterIDid, waterId, waterReading, lastReading, currentUsed, voltage, inversionReading, lastInversionReading, inversionCurrentUsed, waterStatus, rechargeWater, rechargeReading, createTime, modifyTime, meterId, exchangStationId, supplierId, buildingId, entranceId, villageId);
    }
}
