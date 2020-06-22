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
public class AreaWaterUsage2 {
    private String area_guid;
    @JsonProperty("name")
    private String area_name;
    @JsonProperty("value")
    @JsonSerialize(using = DoubleSerialize.class)
    private double water_usage;
    @JsonSerialize(using = DoubleSerialize.class)
    private double cost_amount;
}
