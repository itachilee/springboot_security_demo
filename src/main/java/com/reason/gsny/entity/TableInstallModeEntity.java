package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_InstallMode", schema = "dbo")
public class TableInstallModeEntity {
    private int inStallModeId;
    private String installMode;
    private Timestamp createTime;

    @Id
    @Column(name = "InStallModeID")
    public int getInStallModeId() {
        return inStallModeId;
    }

    public void setInStallModeId(int inStallModeId) {
        this.inStallModeId = inStallModeId;
    }

    @Basic
    @Column(name = "InstallMode")
    public String getInstallMode() {
        return installMode;
    }

    public void setInstallMode(String installMode) {
        this.installMode = installMode;
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
        TableInstallModeEntity that = (TableInstallModeEntity) o;
        return inStallModeId == that.inStallModeId &&
                Objects.equals(installMode, that.installMode) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inStallModeId, installMode, createTime);
    }
}
