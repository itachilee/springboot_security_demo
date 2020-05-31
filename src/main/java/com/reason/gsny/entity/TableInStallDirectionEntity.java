package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_InStallDirection", schema = "dbo")
public class TableInStallDirectionEntity {
    private int inStallDirectionId;
    private String inStallDirection;
    private Timestamp createTime;

    @Id
    @Column(name = "InStallDirectionID")
    public int getInStallDirectionId() {
        return inStallDirectionId;
    }

    public void setInStallDirectionId(int inStallDirectionId) {
        this.inStallDirectionId = inStallDirectionId;
    }

    @Basic
    @Column(name = "InStallDirection")
    public String getInStallDirection() {
        return inStallDirection;
    }

    public void setInStallDirection(String inStallDirection) {
        this.inStallDirection = inStallDirection;
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
        TableInStallDirectionEntity that = (TableInStallDirectionEntity) o;
        return inStallDirectionId == that.inStallDirectionId &&
                Objects.equals(inStallDirection, that.inStallDirection) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inStallDirectionId, inStallDirection, createTime);
    }
}
