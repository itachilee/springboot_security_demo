package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_Direction", schema = "dbo")
public class TableDirectionEntity {
    private int directionId;
    private String direction;
    private Timestamp createTime;

    @Id
    @Column(name = "DirectionID")
    public int getDirectionId() {
        return directionId;
    }

    public void setDirectionId(int directionId) {
        this.directionId = directionId;
    }

    @Basic
    @Column(name = "Direction")
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
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
        TableDirectionEntity that = (TableDirectionEntity) o;
        return directionId == that.directionId &&
                Objects.equals(direction, that.direction) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directionId, direction, createTime);
    }
}
