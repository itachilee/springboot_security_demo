package com.reason.gsny.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "TABLE_Meter", schema = "dbo")
public class TableMeterEntity implements Serializable {

    private static final long serialVersionUID = 6222176558369919437L;
    @Id
    private int id;
    @JsonProperty("text")
    private String meterNo;
    private Integer userId;
    private String meterSize;
    private int imeiId;
    private Integer collectorId;
    private Timestamp createdAt;
    private Integer comunicateModeId;
    private String useTime;
    private Double pressure;
    private Double flowRate;
    private Double remainTotal;
    private Double electric;
    private String valveStatus;
    private Timestamp updateAt;
    private String status;
    private String operateValveStatus;
    private String vol;
    private Integer exchangStationId;
    private Integer villageId;
    private Integer buildingId;
    private Integer entranceId;
    private Integer supplierId;


}
