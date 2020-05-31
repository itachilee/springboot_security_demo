package com.reason.gsny.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "TABLE_ExchangStation", schema = "dbo")
public class TableExchangStationEntity {
    private int exchangStationId;
    private String exchangStation;
    private Timestamp createTime;

    @Id
    @Column(name = "ExchangStationID")
    public int getExchangStationId() {
        return exchangStationId;
    }

    public void setExchangStationId(int exchangStationId) {
        this.exchangStationId = exchangStationId;
    }

    @Basic
    @Column(name = "ExchangStation")
    public String getExchangStation() {
        return exchangStation;
    }

    public void setExchangStation(String exchangStation) {
        this.exchangStation = exchangStation;
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
        TableExchangStationEntity that = (TableExchangStationEntity) o;
        return exchangStationId == that.exchangStationId &&
                Objects.equals(exchangStation, that.exchangStation) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exchangStationId, exchangStation, createTime);
    }
}
