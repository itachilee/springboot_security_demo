package com.reason.gsny.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "TABLE_GPRS", schema = "dbo")
public class TableGprsEntity implements Serializable {
    @Id
    private Long imeiid;
    private long imei;
    private String imeiName;
    private String loginTime;
    private String updateTime;
    private String status;
    private String ip;
    private String port;
    private String sim;
    private String holder;
    private String pass;
    private String address;
    private String service;
//    @Getter(onMethod_={@Column(name="createTime")}) //JDK8
    private Timestamp createTime;
//    @Getter(onMethod_={@Column(name="IncludeMeterId")}) //JDK8
    private String includeMeterId;


}
