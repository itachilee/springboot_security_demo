package com.reason.gsny.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.reason.gsny.util.DoubleSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 封装区域每日/月/年用水量与用户充值金额
 * @author leon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AreaWaterUsage4 implements Serializable {
    @JsonSerialize(using = DoubleSerialize.class)
    private double cost_amount;
    @JsonSerialize(using = DoubleSerialize.class)
    private double water_usage;
    @ApiModelProperty(value = "区域主键")
    private String area_guid;
    private String area_name;
    /**
     * 损耗
     */
    @JsonSerialize(using = DoubleSerialize.class)
    private double loss;
    /**
     * 月份
     */
    private int month;
    public AreaWaterUsage4(double cost_amount, double water_usage) {
        this.cost_amount = cost_amount;
        this.water_usage = water_usage;
    }

    public AreaWaterUsage4( int month,double cost_amount, double water_usage) {
        this.cost_amount = cost_amount;
        this.water_usage = water_usage;
        this.month = month;
    }
}
