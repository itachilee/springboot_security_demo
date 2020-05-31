package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Table_Collector", schema = "dbo")
public class TableCollectorEntity {
    private int collectorId;
    private int imeiid;
    private Integer collector;
    private Timestamp createTime;
    private Integer battery;
    private int id;

    @Basic
    @Column(name = "CollectorID")
    public int getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(int collectorId) {
        this.collectorId = collectorId;
    }

    @Basic
    @Column(name = "IMEIID")
    public int getImeiid() {
        return imeiid;
    }

    public void setImeiid(int imeiid) {
        this.imeiid = imeiid;
    }

    @Basic
    @Column(name = "Collector")
    public Integer getCollector() {
        return collector;
    }

    public void setCollector(Integer collector) {
        this.collector = collector;
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
    @Column(name = "battery")
    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableCollectorEntity that = (TableCollectorEntity) o;
        return collectorId == that.collectorId &&
                imeiid == that.imeiid &&
                id == that.id &&
                Objects.equals(collector, that.collector) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(battery, that.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectorId, imeiid, collector, createTime, battery, id);
    }
}
