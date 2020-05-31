package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Table_ChargingModel", schema = "dbo")
public class TableChargingModelEntity {
    private int chargingModelId;
    private String chargingModel;
    private Timestamp createTime;

    @Id
    @Column(name = "chargingModelId")
    public int getChargingModelId() {
        return chargingModelId;
    }

    public void setChargingModelId(int chargingModelId) {
        this.chargingModelId = chargingModelId;
    }

    @Basic
    @Column(name = "chargingModel")
    public String getChargingModel() {
        return chargingModel;
    }

    public void setChargingModel(String chargingModel) {
        this.chargingModel = chargingModel;
    }

    @Basic
    @Column(name = "createTime")
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
        TableChargingModelEntity that = (TableChargingModelEntity) o;
        return chargingModelId == that.chargingModelId &&
                Objects.equals(chargingModel, that.chargingModel) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chargingModelId, chargingModel, createTime);
    }
}
