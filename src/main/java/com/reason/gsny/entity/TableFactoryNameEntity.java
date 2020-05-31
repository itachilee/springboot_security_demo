package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_FactoryName", schema = "dbo")
public class TableFactoryNameEntity {
    private int factoryNameId;
    private String factoryName;
    private Timestamp createTime;

    @Id
    @Column(name = "FactoryNameID")
    public int getFactoryNameId() {
        return factoryNameId;
    }

    public void setFactoryNameId(int factoryNameId) {
        this.factoryNameId = factoryNameId;
    }

    @Basic
    @Column(name = "FactoryName")
    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
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
        TableFactoryNameEntity that = (TableFactoryNameEntity) o;
        return factoryNameId == that.factoryNameId &&
                Objects.equals(factoryName, that.factoryName) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factoryNameId, factoryName, createTime);
    }
}
