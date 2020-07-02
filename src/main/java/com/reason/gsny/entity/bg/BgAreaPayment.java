package com.reason.gsny.entity.bg;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.reason.gsny.entity.AbstractAuditable;
import com.reason.gsny.util.DoubleSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@Table(name = "bg_area_payment", schema = "dbo")
@ApiModel
public class BgAreaPayment extends AbstractAuditable implements Serializable {

    @ApiModelProperty(value = "区域主键")
    private String area_guid;

    @ApiModelProperty(value = "区域名称")
    private String area_name;

    @ApiModelProperty(value = "充值金额")
    @JsonSerialize(using = DoubleSerialize.class)
    private double pay_amount;
}
