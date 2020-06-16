package com.reason.gsny.entity;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
/**
 * @author leon
 */
@Data
@Entity
@ToString
@EqualsAndHashCode
@Table(name = "Table_toConcentrator", schema = "dbo")
public class TableToConcentratorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sendId;
    private Long imei;
    private Long meterId;
    @Column(insertable = false, updatable = false)
    private Date genTime;
    private int isOver;
    private String cmdCode;
    private String cmdName;
    private String cmdInfo;
    private String note;
    private String status;
    private String operator;
    private Integer tryTimes;
    @Column(insertable = false, updatable = false)
    private Date sendedTime;
    @Column(insertable = false, updatable = false)
    private Date returnTime;
    private String openPoint;
    private Integer userid;
    private String water;
    private Long waterId;
    @Column(insertable = false, updatable = false)
    private String collector;
    private Integer actionTime;


}
