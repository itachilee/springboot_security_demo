package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_InstallEnvironment", schema = "dbo")
public class TableInstallEnvironmentEntity {
    private int installEnvironmentId;
    private String installEnvironment;
    private Timestamp createTime;

    @Id
    @Column(name = "InstallEnvironmentID")
    public int getInstallEnvironmentId() {
        return installEnvironmentId;
    }

    public void setInstallEnvironmentId(int installEnvironmentId) {
        this.installEnvironmentId = installEnvironmentId;
    }

    @Basic
    @Column(name = "InstallEnvironment")
    public String getInstallEnvironment() {
        return installEnvironment;
    }

    public void setInstallEnvironment(String installEnvironment) {
        this.installEnvironment = installEnvironment;
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
        TableInstallEnvironmentEntity that = (TableInstallEnvironmentEntity) o;
        return installEnvironmentId == that.installEnvironmentId &&
                Objects.equals(installEnvironment, that.installEnvironment) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(installEnvironmentId, installEnvironment, createTime);
    }
}
