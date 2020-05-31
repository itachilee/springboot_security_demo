package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Table_ComunicateMode", schema = "dbo")
public class TableComunicateModeEntity {
    private int comunicateModeId;
    private String comunicateMode;
    private Timestamp createTime;

    @Id
    @Column(name = "ComunicateModeId")
    public int getComunicateModeId() {
        return comunicateModeId;
    }

    public void setComunicateModeId(int comunicateModeId) {
        this.comunicateModeId = comunicateModeId;
    }

    @Basic
    @Column(name = "comunicateMode")
    public String getComunicateMode() {
        return comunicateMode;
    }

    public void setComunicateMode(String comunicateMode) {
        this.comunicateMode = comunicateMode;
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
        TableComunicateModeEntity that = (TableComunicateModeEntity) o;
        return comunicateModeId == that.comunicateModeId &&
                Objects.equals(comunicateMode, that.comunicateMode) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comunicateModeId, comunicateMode, createTime);
    }
}
