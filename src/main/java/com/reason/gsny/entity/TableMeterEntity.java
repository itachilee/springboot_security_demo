package com.reason.gsny.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author leon
 */
@Data
@EqualsAndHashCode
@Entity
@ToString
@Table(name = "TABLE_Meter", schema = "dbo")
public class TableMeterEntity implements Serializable {

    private static final long serialVersionUID = 6222176558369919437L;
    @Id
    private Long meterIDid;
    @JsonProperty("text")
    private Long meterID;
    private Integer userID;
    private String meterSize;
    private Long imeiId;
    private Integer collectorId;
    private Timestamp createTime;
    private Integer comunicateModeId;
    private String useTime;
    private Double pressure;
    private Double flowRate;
    private Double remainTotal;
    private Double electric;
    private String valveStatus;
    private Timestamp updateTime;
    private String status;
    private String operate_ValveStatus;
    private String vol;
    private Integer exchangStationId;
    private Integer villageId;
    private Integer buildingId;
    private Integer entranceId;
    private Integer supplierId;


}
