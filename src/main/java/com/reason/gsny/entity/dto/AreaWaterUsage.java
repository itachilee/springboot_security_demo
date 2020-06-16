package com.reason.gsny.entity.dto;

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
public class AreaWaterUsage implements Serializable {
    /**
     * 年
     */
    private int year;
    /**
     * 月
     */
    private int month;
    /**
     * 充值金额
     */
    private double cost_amount;
    /**
     * 用水量
     */
    private double water_usage;
}
