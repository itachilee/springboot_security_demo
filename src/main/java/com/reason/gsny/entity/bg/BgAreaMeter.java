package com.reason.gsny.entity.bg;

import com.reason.gsny.entity.AbstractAuditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * @author leon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bg_area_meter", schema = "dbo")
public class BgAreaMeter extends AbstractAuditable implements Serializable {
    private String area_guid;
    private String area_name;
    private long meter_no;
    private String meter_guid;
}
