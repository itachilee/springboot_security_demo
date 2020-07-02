package com.reason.gsny.entity.bg;

import com.reason.gsny.entity.AbstractAuditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
/**
 * @author leon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "TABLE_GprsHeartRecord", schema = "dbo")
public class TableGprsHeartRecord extends AbstractAuditable implements Serializable {
    private Long imei;
    String imei_name;
    LocalDate heart_time;
    Integer record_type;
    String record_type_name;
    String result_headling;

}
