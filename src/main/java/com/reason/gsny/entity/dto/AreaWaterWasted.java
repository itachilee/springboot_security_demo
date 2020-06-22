package com.reason.gsny.entity.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.reason.gsny.util.DoubleSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 封装区域开阀用水量
 * @author leon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AreaWaterWasted {
    @JsonSerialize(using = DoubleSerialize.class)
    private double used_water;
    @JsonSerialize(using = DoubleSerialize.class)
    private double cost_amount;
    private String area_guid;
    private String area_name;
}
