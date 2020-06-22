package com.reason.gsny.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.reason.gsny.util.DoubleSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author leon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AreaDeviceGroup2 {
    private int month;
    @JsonProperty("value")
    private long count;
    private String device;
    /**
     * 增长率
     */
    @JsonSerialize(using = DoubleSerialize.class)
    private double growth_rate;
    private long growth_count;
    public AreaDeviceGroup2(int month,long count,String device){
        this.month=month;
        this.count=count;
        this.device=device;
    }
}
