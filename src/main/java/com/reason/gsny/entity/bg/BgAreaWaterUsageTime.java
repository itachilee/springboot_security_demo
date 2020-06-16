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
 * 查询一天的用水量
 * @author leon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bg_area_water_usage_time", schema = "dbo")
public class BgAreaWaterUsageTime extends AbstractAuditable implements Serializable {
    private String area_guid;
    private String area_name;
    private double area_time_water_usage_24;
    private double area_time_water_usage_22;
    private double area_time_water_usage_20;
    private double area_time_water_usage_18;
    private double area_time_water_usage_16;
    private double area_time_water_usage_14;
    private double area_time_water_usage_12;
    private double area_time_water_usage_10;
    private double area_time_water_usage_8;
    private double area_time_water_usage_6;
    private double area_time_water_usage_4;
    private double area_time_water_usage_2;
    private double area_time_water_usage_0;
}
