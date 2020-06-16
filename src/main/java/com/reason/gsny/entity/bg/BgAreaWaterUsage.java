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
 * 区域用水量与区域充值金额
 * @author leon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bg_area_water_usage", schema = "dbo")
public class BgAreaWaterUsage extends AbstractAuditable implements Serializable {
    /**
     * 区域主键
     */
    private String area_guid;
    /**
     * 区域名称
     */
    private String area_name;
    /**
     * 区域用水量
     */
    private double area_water_usage;
    /**
     * 月份
     */
    private int month;
    /**
     * 区域充值金额
     */
    private double cost_amount;

}
