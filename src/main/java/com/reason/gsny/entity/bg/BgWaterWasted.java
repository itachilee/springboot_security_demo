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
 * 区域已开阀用水量
 * @author leon
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "bg_water_wasted", schema = "dbo")
public class BgWaterWasted extends AbstractAuditable implements Serializable {
    /**
     * 区域主键
     */
    private String area_guid;
    /**
     * 区域名称
     */
    private String area_name;
    /**
     * 已用水量
     */
    private double used_water;
    /**
     * 总充值水量
     */
    private double cost_amount;
}
