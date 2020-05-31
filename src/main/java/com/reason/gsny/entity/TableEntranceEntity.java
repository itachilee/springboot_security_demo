package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_Entrance", schema = "dbo")
public class TableEntranceEntity {
    private int entranceId;
    private String entrance;
    private Timestamp createTime;

    @Id
    @Column(name = "EntranceID")
    public int getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(int entranceId) {
        this.entranceId = entranceId;
    }

    @Basic
    @Column(name = "Entrance")
    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
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
        TableEntranceEntity that = (TableEntranceEntity) o;
        return entranceId == that.entranceId &&
                Objects.equals(entrance, that.entrance) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entranceId, entrance, createTime);
    }
}
