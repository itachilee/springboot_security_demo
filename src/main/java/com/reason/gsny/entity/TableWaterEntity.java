package com.reason.gsny.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Data
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "Table_Water", schema = "dbo")
public class TableWaterEntity {
    @Id
    private int id;
    private Long meterIDid;
    private Long waterId;
    private String waterReading;
    private String lastReading;
    private String currentUsed;
    private String voltage;
    private String inversionReading;
    private String lastInversionReading;
    private String inversionCurrentUsed;
    private String waterStatus;
    private String rechargeWater;
    private String rechargeReading;
    private Date createTime;
    private Date modifyTime;
    private String meterId;
    private Integer exchangStationId;
    private Integer supplierId;
    private Integer buildingId;
    private Integer entranceId;
    private Integer villageId;


}
