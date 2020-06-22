package com.reason.gsny.entity.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.reason.gsny.util.DoubleSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 封装区域每日/月/年用水量与用户充值金额
 * @author leon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AreaWaterUsage3 {
    /**
     * 小时
     */
    private int hour;
    /**
     * 充值金额
     */
    @JsonSerialize(using = DoubleSerialize.class)
    private double cost_amount;
    /**
     * 用水量
     */
    @JsonSerialize(using = DoubleSerialize.class)
    private double water_usage;
    /**
     * 区域主键
     */
    private String area_guid;
    /**
     * 区域名称
     */
    private String area_name;
}
